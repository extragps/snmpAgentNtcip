package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsClimateCtrlStatusEntryRow;
import org.snmp4j.smi.OID;
import javax.swing.JSlider;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;

public class TemperaturePanel extends JPanel {
	private MaJauge sel;
	private JSlider sliderCurrent;
	private JSlider sliderMinWarning;
	private JSlider sliderMaxWarning;
	private JSlider sliderMinCritical;
	private JSlider sliderMaxCritical;
	private JTextField labelCurrent;
	private JTextField labelMinWarning;
	private JTextField labelMaxWarning;
	private JTextField labelMinCritical;
	private JTextField labelMaxCritical;
	private JCheckBox  cbStatus;

	public TemperaturePanel(MaJauge selecteur) {
		sel=selecteur;
		initialize();
		sliderCurrent.setValue(sel.getCurrent());
		sliderMinWarning.setValue(sel.getMinWarning());
		sliderMaxWarning.setValue(sel.getMaxWarning());
		sliderMinCritical.setValue(sel.getMinCritical());
		sliderMaxCritical.setValue(sel.getMaxCritical());
	}

	private void initialize() {
		
		this.setLayout(new GridLayout(6,1));
		JPanel panelTemp;	
		
		{
		labelCurrent = new JTextField("Current temp "+30+"°");
		labelCurrent.setColumns(10);
		labelCurrent.setEditable(false);
		sliderCurrent = new JSlider();
		sliderCurrent.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int nouvelle =((JSlider)e.getSource()).getValue();
				if(nouvelle!=sel.getMinWarning()) {
					sel.setCurrent(nouvelle);
					labelCurrent.setText("Current temp "+nouvelle+"°");
					sel.changeValeur();
				}
			}
		});
		sliderCurrent.setValue(20);
		sliderCurrent.setMinimum(-128);
		sliderCurrent.setMaximum(127);
		panelTemp=new JPanel(new BorderLayout());
		panelTemp.add(labelCurrent,BorderLayout.WEST);
		panelTemp.add(sliderCurrent,BorderLayout.CENTER);
		add(panelTemp);
		}

		labelMinWarning = new JTextField("Min critical "+30+"°");
		labelMinWarning.setColumns(10);
		labelMinWarning.setEditable(false);
		sliderMinWarning = new JSlider();
		sliderMinWarning.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int nouvelle =((JSlider)e.getSource()).getValue();
				if(nouvelle!=sel.getMinWarning()) {
					sel.setMinWarning(nouvelle);
					labelMinWarning.setText("Min warning "+nouvelle+"°");
					sel.changeValeur();
//					sel.changer();
				}
			}
		});
		sliderMinWarning.setBackground(Color.yellow);
		sliderMinWarning.setValue(-20);
		sliderMinWarning.setMinimum(-128);
		sliderMinWarning.setMaximum(127);
		panelTemp=new JPanel(new BorderLayout());
		panelTemp.add(labelMinWarning,BorderLayout.WEST);
		panelTemp.add(sliderMinWarning,BorderLayout.CENTER);
		add(panelTemp);

		labelMaxWarning = new JTextField("Max warining "+30+"°");
		labelMaxWarning.setColumns(10);
		labelMaxWarning.setEditable(false);
		sliderMaxWarning = new JSlider();
		sliderMaxWarning.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int nouvelle =((JSlider)e.getSource()).getValue();
				if(nouvelle!=sel.getMaxWarning()) {
					sel.setMaxWarning(nouvelle);
					labelMaxWarning.setText("Max warning "+nouvelle+"°");
					sel.changeValeur();
//					sel.changer();
				}
			}
		});
		sliderMaxWarning.setBackground(Color.yellow);
		sliderMaxWarning.setValue(10);
		sliderMaxWarning.setMinimum(-128);
		sliderMaxWarning.setMaximum(127);
		panelTemp=new JPanel(new BorderLayout());
		panelTemp.add(labelMaxWarning,BorderLayout.WEST);
		panelTemp.add(sliderMaxWarning,BorderLayout.CENTER);
		add(panelTemp);

		{
		labelMinCritical = new JTextField("Min critical "+ (-50)+"°");
		labelMinCritical.setColumns(10);
		labelMinCritical.setEditable(false);
		sliderMinCritical = new JSlider();
		sliderMinCritical.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int nouvelle =((JSlider)e.getSource()).getValue();
				if(nouvelle!=sel.getMaxWarning()) {
					sel.setMinCritical(nouvelle);
					labelMinCritical.setText("Min critical "+nouvelle+"°");
					sel.changeValeur();
//					sel.changer();
				}
			}
		});
		sliderMinCritical.setBackground(Color.orange);
		sliderMinCritical.setValue(-50);
		sliderMinCritical.setMinimum(-128);
		sliderMinCritical.setMaximum(127);
		panelTemp=new JPanel(new BorderLayout());
		panelTemp.add(labelMinCritical,BorderLayout.WEST);
		panelTemp.add(sliderMinCritical,BorderLayout.CENTER);
		add(panelTemp);
		}
		{
		labelMaxCritical = new JTextField("Max critical "+ 90+"°");
		labelMaxCritical.setColumns(10);
		labelMaxCritical.setEditable(false);
		sliderMaxCritical = new JSlider();
		sliderMaxCritical.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int nouvelle =((JSlider)e.getSource()).getValue();
				if(nouvelle!=sel.getMaxWarning()) {
					sel.setMaxCritical(nouvelle);
					labelMaxCritical.setText("Max critical "+nouvelle+"°");
					sel.changeValeur();
//					sel.changer();
				}
			}
		});
		sliderMaxCritical.setBackground(Color.orange);
		sliderMaxCritical.setValue(90);
		sliderMaxCritical.setMinimum(-128);
		sliderMaxCritical.setMaximum(127);
		panelTemp=new JPanel(new BorderLayout());
		panelTemp.add(labelMaxCritical,BorderLayout.WEST);
		panelTemp.add(sliderMaxCritical,BorderLayout.CENTER);
		add(panelTemp);
		}
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
		add(cbStatus);
		
	}
	public static void main(String args[]) {
		JFrame maFrame=new JFrame();
		maFrame.setTitle("Temperature "+1);
		maFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFrame.getContentPane().add(new TemperaturePanel(new MaJauge()));
		maFrame.setSize(new Dimension(300,200));
		maFrame.setVisible(true);
		
	}
}
