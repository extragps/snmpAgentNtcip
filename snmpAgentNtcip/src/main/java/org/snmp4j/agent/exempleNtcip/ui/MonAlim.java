package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.snmp4j.agent.exempleNtcip.Ntcip12032005;
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsPowerStatusEntryRow;
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsTempSensorStatusEntryRow;
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsPowerStatusEntryRow;
import org.snmp4j.agent.mo.MOTableRowEvent;
import org.snmp4j.agent.mo.MOTableRowListener;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;

public class MonAlim extends JPanel implements MOTableRowListener<DmsPowerStatusEntryRow> {
	private JLabel textLabel;
	private Ntcip12032005 ntcip = null;
	private int numero;
	private int voltage=0;
	private JDialog dialog;
	
	private int status;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public MonAlim() {
		this(null,0);
	}
	public MonAlim(Ntcip12032005 ntcip, int numRow) {
		setLayout(new BorderLayout(0, 0));
		this.ntcip = ntcip;
		numero = numRow;

		JPanel panelPlus = new JPanel(new GridLayout(2, 1));
		add(panelPlus, BorderLayout.WEST);


		textLabel = new JLabel();
		textLabel.setHorizontalAlignment(JLabel.CENTER);

		textLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==MouseEvent.BUTTON3) {
					if (null == dialog) {
						dialog = new JDialog((JFrame)null,true); 
						AlimPanel defaults = new AlimPanel(MonAlim.this);
						dialog.setLocation(e.getLocationOnScreen());
						dialog.getRootPane().setContentPane(defaults);
						dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
						dialog.setTitle("Alim "+getNumero());
						dialog.pack();
					}
					dialog.setIconImage(getIcon( 2).getImage());
					dialog.setVisible(true);				
				}
			}
		});
		textLabel.setIcon(new ImageIcon(MonAlim.class.getResource("/images/alim.png")));
		add(textLabel);

		initialize();
	}
	private void checkError( ) {
		int status=0;
		int error=2;
		int shortError=ntcip.getShortErrorStatus().getValue().toInt();
		for(int numRow=1;numRow<=ntcip.getDmsPowerNumRows().getValue().toInt();numRow++) {
			DmsPowerStatusEntryRow row = ntcip.getDmsPowerStatusEntry().getModel() .getRow(new OID().append(numRow));
			if(2!=row.getDmsPowerStatus().getValue()) {
				 status|=(1<<error);
				 break;
			}
		}
		if(0==status) {
			ntcip.getShortErrorStatus().setValue(new Integer32(shortError&(~(1<<error))));
		} else {
			ntcip.getShortErrorStatus().setValue(new Integer32(shortError|((1<<error))));
		}
	
	}
	protected void changeValeur() {
		if(null!=ntcip) {
		DmsPowerStatusEntryRow row = ntcip.getDmsPowerStatusEntry().getModel() .getRow(new OID().append(getNumero()));
		row.setDmsPowerStatus(new Integer32(getStatus()));
		row.setDmsPowerVoltage(new Integer32(getVoltage()));
		checkError();
		rowChanged(row);
		}

	}
	private ImageIcon getIcon(int status) {
		ImageIcon icone = null;
			switch (status) {
			case 1:
				icone = new ImageIcon(MonAlim.class.getResource("/images/alimInconnu.png"));
				break;
			case 2:
				icone = new ImageIcon(MonAlim.class.getResource("/images/alimOn.png"));
				break;
			case 3:
				icone = new ImageIcon(MonAlim.class.getResource("/images/alimCasse.png"));
				break;
			case 4:
				icone = new ImageIcon(MonAlim.class.getResource("/images/alim.png"));
				break;
		}
		return icone;

	}

	private void rowChanged(DmsPowerStatusEntryRow row) {
		int status = row.getDmsPowerStatus().getValue();
		int voltage = row.getDmsPowerVoltage().getValue();
		textLabel.setIcon(getIcon(status));
		textLabel.setText(""+(int)(voltage/100)+"V");
	}

	private void initialize() {
		DmsPowerStatusEntryRow row = ntcip.getDmsPowerStatusEntry().getModel()
				.getRow(new OID().append(numero));
		String nom = "Inconnu " + numero;
		int status =row.getDmsPowerStatus().getValue();
		int voltage=row.getDmsPowerVoltage().getValue();
		setStatus(status);
		setVoltage(voltage);
		rowChanged(row);
		ntcip.getDmsPowerStatusEntry().addMOTableRowListener(this);
	}

	@Override
	public void rowChanged(MOTableRowEvent<DmsPowerStatusEntryRow> event) {
		// TODO Auto-generated method stub
		DmsPowerStatusEntryRow row = event.getRow();
		rowChanged(row);

	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

}
