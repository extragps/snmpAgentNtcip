package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JTextPane;

public class AlimPanel extends JPanel {
	private MonAlim sel;
	private JCheckBox  cbStatus;
	private JTextField textPane;
	private JSlider slider;

	public AlimPanel(MonAlim selecteur) {
		sel=selecteur;
		initialize();
	}

	private void initialize() {
		
		this.setLayout(new GridLayout(2,1));
		
		cbStatus=new JCheckBox("Status OK");
		cbStatus.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				if (e.getSource() == cbStatus) {
					if (cbStatus.isSelected()) {
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
		
		textPane = new JTextField();

		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int nouvelle =((JSlider)e.getSource()).getValue();
				if(nouvelle!=(sel.getVoltage()/100)) {
					sel.setVoltage(nouvelle*100);
					textPane.setText("Tension "+nouvelle+"V");
					sel.changeValeur();
//					sel.changer();
				}
			}
		});
		slider.setMaximum(250);
		panel.add(slider);
		
		textPane.setEditable(false);
		textPane.setColumns(10);
		panel.add(textPane, BorderLayout.WEST);
		add(cbStatus);
		
	}
	public static void main(String args[]) {
		JFrame maFrame=new JFrame();
		maFrame.setTitle("Alimentation "+1);
		maFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFrame.getContentPane().add(new AlimPanel(new MonAlim()));
		maFrame.setSize(new Dimension(300,200));
		maFrame.setVisible(true);
		
	}
}
