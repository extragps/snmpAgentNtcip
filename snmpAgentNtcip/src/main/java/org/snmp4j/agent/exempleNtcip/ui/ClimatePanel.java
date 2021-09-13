package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsClimateCtrlStatusEntryRow;
import org.snmp4j.smi.OID;

public class ClimatePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JCheckBox cbDefaut;
	private JCheckBox cbOn;
	private JCheckBox cbForce;
	private MonSelecteur sel;

	public ClimatePanel(MonSelecteur selecteur) {
		sel=selecteur;
		initialize();
	}

	private void initialize() {
		
		this.setLayout(new GridLayout(4,1));
		cbForce = new JCheckBox("Force");
		add(cbForce);
		cbForce.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == cbForce) {
					if (cbForce.isSelected()) {
						if (3 != sel.getForce()) {
							sel.setForce(3);
							sel.changeValeur();
						}
					} else {
						if (2 != sel.getForce()) {
							sel.setForce(2);
							sel.changeValeur();
						}
					}
				}
			}
		});

		cbOn = new JCheckBox("On");
		add(cbOn);
		cbOn.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == cbOn) {
					if (!cbOn.isSelected()) {
						if(0!=sel.getOn()) {
							sel.setOn(0);
							sel.changeValeur();
						}
					} else {
						if(1!=sel.getOn()) {
							sel.setOn(1);
							sel.changeValeur();
						}
					}

				}

			}
		});
		cbDefaut = new JCheckBox("Defaut");
		cbDefaut.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == cbDefaut) {

					if (cbDefaut.isSelected()) {
						if (3 != sel.getStatus()) {
							sel.setStatus(3);
							sel.changeValeur();
						}
					} else {
						if (2 != sel.getStatus()) {
							sel.setStatus(2);
							sel.changeValeur();
						}
					}

				}

			}
		});
		add(cbDefaut);
		
	}
}
