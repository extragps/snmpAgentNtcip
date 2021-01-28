package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.font.TextLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.snmp4j.agent.exempleNtcip.Ntcip12032005;
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsClimateCtrlStatusEntryRow;
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsTempSensorStatusEntryRow;
import org.snmp4j.agent.mo.MOTableRowEvent;
import org.snmp4j.agent.mo.MOTableRowListener;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;

public class MaJauge extends JPanel  implements MOTableRowListener<DmsTempSensorStatusEntryRow> {
	private int maxCritical=80;
	public int getMaxCritical() {
		return maxCritical;
	}
	public void setMaxCritical(int maxCritical) {
		this.maxCritical = maxCritical;
	}
	public int getMinCritical() {
		return minCritical;
	}
	public void setMinCritical(int minCritical) {
		this.minCritical = minCritical;
	}
	public int getMaxWarning() {
		return maxWarning;
	}
	public void setMaxWarning(int maxWarning) {
		this.maxWarning = maxWarning;
	}
	public int getMinWarning() {
		return minWarning;
	}
	public void setMinWarning(int minWarning) {
		this.minWarning = minWarning;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public Ntcip12032005 getNtcip() {
		return ntcip;
	}
	public void setNtcip(Ntcip12032005 ntcip) {
		this.ntcip = ntcip;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	private int minCritical=-50;
	private int maxWarning=60;
	private int minWarning=-25;
	private int current=45;
	private int status=2;
	private Ntcip12032005 ntcip = null;
	private int numero;
	private JDialog dialog;

	public MaJauge() {
	}
	public MaJauge(Ntcip12032005 ntcip, int numRow) {
		this.ntcip = ntcip;
		numero = numRow;
		if(null!=getNtcip()) {
			initialize();
			this.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(e.getButton()==MouseEvent.BUTTON3) {
						if (null == dialog) {
							dialog = new JDialog((JFrame)null,true); 
							TemperaturePanel defaults = new TemperaturePanel(MaJauge.this);
							dialog.setLocation(e.getLocationOnScreen());
							dialog.getRootPane().setContentPane(defaults);
							dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
							dialog.setTitle("Temp "+getNumero());
							dialog.pack();
						}
						dialog.setVisible(true);				
					}
				}
			});

		}
	}
	private void checkError( ) {
		int status=0;
		int error=11;
		int shortError=ntcip.getShortErrorStatus().getValue().toInt();
		for(int numRow=0;numRow<ntcip.getDmsTempSensorNumRows().getValue().toInt();numRow++) {
			DmsTempSensorStatusEntryRow row = ntcip.getDmsTempSensorStatusEntry().getModel() .getRow(new OID().append(numRow));
			if(2!=row.getDmsTempSensorStatus().getValue()) {
				 status|=(1<<error);
				 break;
			}
		}
		if(0==status) {
			ntcip.getShortErrorStatus().setValue(new Integer32(shortError&(~(1<<error))));
		} else {
			ntcip.getShortErrorStatus().setValue(new Integer32(shortError|((1<<error))));
		}
	
		DmsTempSensorStatusEntryRow row = ntcip.getDmsTempSensorStatusEntry().getModel() .getRow(new OID().append(getNumero()));
	}
	protected void changeValeur() {
		if(null!=ntcip) {
		DmsTempSensorStatusEntryRow row = ntcip.getDmsTempSensorStatusEntry().getModel() .getRow(new OID().append(getNumero()));
		row.setDmsTempSensorCurrentReading(new Integer32(getCurrent()));
		row.setDmsTempSensorLowWarningTemperature(new Integer32(getMinWarning()));
		row.setDmsTempSensorHighWarningTemperature(new Integer32(getMaxWarning()));
		row.setDmsTempSensorLowCriticalTemperature(new Integer32(getMinCritical()));
		row.setDmsTempSensorHighCriticalTemperature(new Integer32(getMaxCritical()));
		row.setDmsTempSensorStatus(new Integer32(getStatus()));
		rowChanged(row);
		checkError();
		repaint();
		}

	}

	private void initialize() {
		DmsTempSensorStatusEntryRow row = ntcip.getDmsTempSensorStatusEntry().getModel()
				.getRow(new OID().append(numero));
		if(null!=row) {
			rowChanged(row);
		}

	}
	private void rowChanged(DmsTempSensorStatusEntryRow row)  {
			setMinCritical(row.getDmsTempSensorLowCriticalTemperature().getValue());
			setMaxCritical(row.getDmsTempSensorHighCriticalTemperature().getValue());
			setMinWarning(row.getDmsTempSensorLowWarningTemperature().getValue());
			setMaxWarning(row.getDmsTempSensorHighWarningTemperature().getValue());
			setCurrent(row.getDmsTempSensorCurrentReading().getValue());
			setStatus(row.getDmsTempSensorStatus().getValue());
	}
	private int getAngle(int temp) {
		int valeur= Math.min(180, Math.max(0,((127-temp)*180)/256));
		return valeur;
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		int largeur=this.getWidth();
		int hauteur=this.getHeight();
		int bordureL=15;
		int bordureH=15;
		int min=20;

		bordureL=Math.min((largeur-min)/2,bordureL);
		bordureH=Math.min((hauteur-min)/2,bordureH);
		Graphics2D g2=(Graphics2D) g;

		switch(getStatus()) {
		case 1:
		{
			g2.setColor(Color.black);
			TextLayout lay = new TextLayout("capteur "+getNumero()+"indisponible",g2.getFont(), g2.getFontRenderContext());
			lay.draw(g2,bordureL,hauteur/2);
		g2.setColor(Color.yellow);
		g2.drawRect(0,0,largeur,largeur);
		}
			break;
		case 2:
		{
		g2.setColor(Color.red);
		g2.fillArc(bordureL,bordureH, largeur-2*bordureL, 2* hauteur-4*bordureH,0,180);

		g2.setColor(Color.orange);
		g2.fillArc(bordureL,bordureH, largeur-2*bordureL, 2* hauteur-4*bordureH,getAngle(maxCritical),getAngle(minCritical)-getAngle(maxCritical));
		g2.setColor(Color.green);
		g2.fillArc(bordureL,bordureH, largeur-2*bordureL, 2* hauteur-4*bordureH,getAngle(maxWarning),getAngle(minWarning)-getAngle(maxWarning));
		
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(largeur/2, hauteur-bordureH, (int)(largeur/2+(largeur/2-bordureL)*Math.cos(Math.PI*(getAngle(current)/180.))), (int)(hauteur-bordureH/2-(hauteur-bordureH)*Math.sin(Math.PI*(getAngle(current)/180.))));

		TextLayout lay = new TextLayout("" + current+"°",g2.getFont(), g2.getFontRenderContext());
		lay.draw(g2,(int)(largeur/2+(largeur/2-bordureL)*Math.cos(Math.PI*(getAngle(current)/180.))), (int)(hauteur-bordureH/2-(hauteur-bordureH)*Math.sin(Math.PI*(getAngle(current)/180.))));
		g2.setColor(Color.green);
		g2.drawRect(0,0,largeur,largeur);
		}
		break;

		case 3:
		{
		g2.setColor(Color.darkGray);
		g2.fillArc(bordureL,bordureH, largeur-2*bordureL, 2* hauteur-4*bordureH,0,180);

		g2.setColor(Color.gray);
		g2.fillArc(bordureL,bordureH, largeur-2*bordureL, 2* hauteur-4*bordureH,getAngle(maxCritical),getAngle(minCritical)-getAngle(maxCritical));
		g2.setColor(Color.lightGray);
		g2.fillArc(bordureL,bordureH, largeur-2*bordureL, 2* hauteur-4*bordureH,getAngle(maxWarning),getAngle(minWarning)-getAngle(maxWarning));
		
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(largeur/2, hauteur-bordureH, (int)(largeur/2+(largeur/2-bordureL)*Math.cos(Math.PI*(getAngle(current)/180.))), (int)(hauteur-bordureH/2-(hauteur-bordureH)*Math.sin(Math.PI*(getAngle(current)/180.))));

		TextLayout lay = new TextLayout("" + current+"°",g2.getFont(), g2.getFontRenderContext());
		lay.draw(g2,(int)(largeur/2+(largeur/2-bordureL)*Math.cos(Math.PI*(getAngle(current)/180.))), (int)(hauteur-bordureH/2-(hauteur-bordureH)*Math.sin(Math.PI*(getAngle(current)/180.))));
		g2.setColor(Color.red);
		g2.drawRect(0,0,largeur,largeur);
		g2.drawLine(0,0,largeur,hauteur);
		g2.drawLine(0,hauteur,largeur,0);
		}
		break;
		}



	}

	public static void main(String args[]) {
		JFrame frame=new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(200,200));
		frame.getContentPane().add(new MaJauge());
		frame.setVisible(true);
	}
	@Override
	public void rowChanged(MOTableRowEvent<DmsTempSensorStatusEntryRow> event) {
		DmsTempSensorStatusEntryRow row = event.getRow();
		if(getNumero()==row.getDmsTempSensorIndex().getValue()) {
			rowChanged(row);
			repaint();
		}
		
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
