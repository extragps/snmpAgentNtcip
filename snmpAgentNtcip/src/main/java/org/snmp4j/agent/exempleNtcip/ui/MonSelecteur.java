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
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsClimateCtrlStatusEntryRow;
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsPowerStatusEntryRow;
import org.snmp4j.agent.mo.MOTableRowEvent;
import org.snmp4j.agent.mo.MOTableRowListener;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;

public class MonSelecteur extends JPanel implements MOTableRowListener<DmsClimateCtrlStatusEntryRow> {
	private JLabel textLabel;
	private Ntcip12032005 ntcip = null;
	private int numero;
	private JDialog dialog;
	
	private int type;
	private int status;
	private int on;
	private int force;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getOn() {
		return on;
	}

	public void setOn(int on) {
		this.on = on;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public MonSelecteur(Ntcip12032005 ntcip, int numRow) {
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
						ClimatePanel defaults = new ClimatePanel(MonSelecteur.this);
						dialog.setLocation(e.getLocationOnScreen());
						dialog.getRootPane().setContentPane(defaults);
						dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
						dialog.pack();
					}
					dialog.setIconImage(getIcon(getType(), 2, 2,0).getImage());
					switch(getType()) {
					case 2:
					case 3:
						dialog.setTitle("Ventilateur " + getNumero());
						break;
					case 5:
					case 6:
					case 7:
						dialog.setTitle("Chauffage " + getNumero());
						break;
						default:
						dialog.setTitle("Inconnu " + getNumero());
							break;
					}
					dialog.setVisible(true);				
				}
			}
		});
		add(textLabel);

		initialize();
	}
	protected MonSelecteur getThis() {
		return this;
	}
	private void checkError( ) {
		int status=0;
		int error=10;
		int shortError=ntcip.getShortErrorStatus().getValue().toInt();
		for(int numRow=1;numRow<=ntcip.getDmsClimateCtrlNumRows().getValue().toInt();numRow++) {
			DmsClimateCtrlStatusEntryRow row = ntcip.getDmsClimateCtrlStatusEntry().getModel() .getRow(new OID().append(numRow));
			if(2!=row.getDmsClimateCtrlErrorStatus().getValue()) {
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
		DmsClimateCtrlStatusEntryRow row = ntcip.getDmsClimateCtrlStatusEntry().getModel() .getRow(new OID().append(getNumero()));
		row.setDmsClimateCtrlErrorStatus(new Integer32(getStatus()));
		row.setDmsClimateCtrlOnStatus(new Integer32(getOn()));
		row.setDmsClimateCtrlTestActivation(new Integer32(getForce()));
		checkError();
		rowChanged(row);

	}
	private ImageIcon getIcon(int type, int status, int force, int on) {
		ImageIcon icone = null;
		switch (type) {
		case 2:
		case 3:
			switch (status) {
			case 1:
				icone = new ImageIcon(MonSelecteur.class.getResource("/images/ventiloInconnu.png"));
				break;
			case 2:
				switch (force) {
				case 3:
					icone = new ImageIcon(MonSelecteur.class.getResource("/images/ventiloForce.png"));
					break;
				default:
					if(0==on) {
						icone = new ImageIcon(MonSelecteur.class.getResource("/images/ventilo.png"));
					} else {
						icone = new ImageIcon(MonSelecteur.class.getResource("/images/ventiloOn.png"));
					}
					break;
				}
				break;
			case 3:
				icone = new ImageIcon(MonSelecteur.class.getResource("/images/ventiloCasse.png"));
				break;
			case 4:
				icone = new ImageIcon(MonSelecteur.class.getResource("/images/ventilo.png"));
				break;
			}
			break;
		case 5:
		case 6:
		case 7:
			switch (status) {
			case 1:
				icone = new ImageIcon(MonSelecteur.class.getResource("/images/chauffageInconnu.png"));
				break;
			case 2:
				switch (force) {
				case 3:
					icone = new ImageIcon(MonSelecteur.class.getResource("/images/chauffageForce.png"));
					break;
				default:
					if(0==on) {
						icone = new ImageIcon(MonSelecteur.class.getResource("/images/chauffage.png"));
					} else {
						icone = new ImageIcon(MonSelecteur.class.getResource("/images/chauffageOn.png"));
					}
					break;
				}

				break;
			case 3:
				icone = new ImageIcon(MonSelecteur.class.getResource("/images/chauffageCasse.png"));
				break;
			case 4:
				icone = new ImageIcon(MonSelecteur.class.getResource("/images/chauffage.png"));
				break;
			}
			break;
		default:
			icone = new ImageIcon(MonSelecteur.class.getResource("/images/ventiloInconnu.png"));
			break;

		}
		return icone;

	}

	private void rowChanged(DmsClimateCtrlStatusEntryRow row) {
		int type = row.getDmsClimateCtrlType().getValue();
		int info = row.getDmsClimateCtrlTestActivation().getValue();
		int status = row.getDmsClimateCtrlErrorStatus().getValue();
		int index = row.getDmsClimateCtrlIndex().getValue();
		int on = row.getDmsClimateCtrlOnStatus().getValue();
		if (index == numero) {
			switch (status) {
			case 1:
				this.setBorder(new LineBorder(Color.yellow, 1));
				break;
			case 2:
				this.setBorder(new LineBorder(Color.green, 1));
				break;
			case 3:
				this.setBorder(new LineBorder(Color.red, 1));
				break;
			case 4:
				this.setBorder(new LineBorder(Color.gray, 1));
				break;

			}
			textLabel.setIcon(getIcon(type, status, info,on));
		}

	}

	private void initialize() {
		DmsClimateCtrlStatusEntryRow row = ntcip.getDmsClimateCtrlStatusEntry().getModel()
				.getRow(new OID().append(numero));
		String nom = "Inconnu " + numero;
		int type = row.getDmsClimateCtrlType().getValue();
		int status =row.getDmsClimateCtrlErrorStatus().getValue();
		setOn(row.getDmsClimateCtrlOnStatus().getValue());
		setForce(row.getDmsClimateCtrlTestActivation().getValue());
		setStatus(status);
		setType(type);
		switch (type) {
		case 2:
			/* Ventilateur */
			nom = "Ventilo " + numero;
			break;
		case 5:
			/* Chauffage */
			nom = "Chauffage " + numero;
			break;
		}
		rowChanged(row);
		ntcip.getDmsClimateCtrlStatusEntry().addMOTableRowListener(this);
	}

	@Override
	public void rowChanged(MOTableRowEvent<DmsClimateCtrlStatusEntryRow> event) {
		// TODO Auto-generated method stub
		DmsClimateCtrlStatusEntryRow row = event.getRow();
		rowChanged(row);

	}

}
