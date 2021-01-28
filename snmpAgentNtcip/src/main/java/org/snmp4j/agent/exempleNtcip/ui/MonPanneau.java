package org.snmp4j.agent.exempleNtcip.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.snmp4j.agent.exempleNtcip.Ntcip12032005;
import org.snmp4j.agent.exempleNtcip.ntcip.DmsMessageEntryRow;
import org.snmp4j.agent.mo.MOChangeEvent;
import org.snmp4j.agent.mo.MOChangeListener;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;

public class MonPanneau extends JPanel implements MOChangeListener {
	private MaMatrice matrice=null;
	private Ntcip12032005 ntcip=null;
	public MonPanneau(Ntcip12032005 ntcip) {
		this.ntcip=ntcip;
		this.setLayout(new BorderLayout());
		matrice=new MaMatrice(ntcip);
		this.add(matrice,BorderLayout.NORTH);
		if(null!=ntcip) {
			int nbClimate=ntcip.getDmsClimateCtrlNumRows().getValue().toInt();
			int nbAlims=ntcip.getDmsPowerNumRows().getValue().toInt();
			int nbTemp=ntcip.getDmsTempSensorNumRows().getValue().toInt();
			int nbLines=0;
			JPanel panelClimate=null;
			JPanel panelTemp=null;
			JPanel panelAlims=null;
			if(0!=nbClimate) {
				nbLines++;
				panelClimate=new JPanel(new GridLayout(1,0));
				for(int num=0;num<nbClimate/2;num++) {
					JPanel temp=new JPanel(new GridLayout(1,2));
					temp.add(new MonSelecteur(ntcip,1+2*num));
					temp.add(new MonSelecteur(ntcip,1+2*num+1));
					panelClimate.add(temp);
				}
			}
			if(0!=nbTemp) {
				nbLines++;
				panelTemp=new JPanel(new GridLayout(1,0));
				for(int num=0;num<nbTemp;num++) {
					panelTemp.add(new MaJauge(ntcip,1+num));
				}
			}
			if(0!=nbAlims) {
				nbLines++;
				panelAlims=new JPanel(new GridLayout(1,0));
				for(int num=0;num<nbAlims;num++) {
					panelAlims.add(new MonAlim(ntcip,1+num));
				}
			}
			if(0!=nbLines) {
				JPanel panel=new JPanel(new GridLayout(nbLines,1));
				if(null!=panelAlims) {
					panel.add(panelClimate);
				}
				if(null!=panelClimate) {
					panel.add(panelAlims);
				}
				if(null!=panelTemp) {
					panel.add(panelTemp);
				}
				this.add(panel,BorderLayout.CENTER);
			}
		}
	}
	public MaMatrice getMaMatrice() {
		return matrice;
	}
	@Override
	public void beforePrepareMOChange(MOChangeEvent changeEvent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterPrepareMOChange(MOChangeEvent changeEvent) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void beforeMOChange(MOChangeEvent changeEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterMOChange(MOChangeEvent changeEvent) {
		// TODO Auto-generated method stub
		if (changeEvent.getNewValue() instanceof OctetString) {
			OctetString actMess = (OctetString) changeEvent.getNewValue();

			if (null != ntcip) {
				int typeMessage = (int) actMess.get(3);
				int numMessage = (int) actMess.get(5);
				DmsMessageEntryRow row = ntcip.getDmsMessageEntry().getModel()
						.getRow(new OID().append(typeMessage).append(numMessage));
				if (null != row) {
					String chaineAAfficher = row.getDmsMessageMultiString().toString();
//					aAfficher = chaineAAfficher;
					DmsMessageEntryRow currentMessage = ntcip.getDmsMessageEntry().getModel()
							.getRow(new OID().append(Ntcip12032005.DmsMessageMemoryTypeEnum.currentBuffer).append(1));
					if (null != currentMessage) {
						currentMessage.setDmsMessageCRC(row.getDmsMessageCRC());
						currentMessage.setDmsMessageMultiString(row.getDmsMessageMultiString());
						currentMessage.setDmsMessageRunTimePriority(row.getDmsMessageRunTimePriority());
					}
					ntcip.getDmsActivateMsgError().setValue(new Integer32(Ntcip12032005.DmsActivateMsgErrorEnum.none));
					matrice.processChaineAffichee(chaineAAfficher);
				}
			}

			repaint();
		}
	}


}
