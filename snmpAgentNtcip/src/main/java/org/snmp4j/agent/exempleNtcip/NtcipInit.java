package org.snmp4j.agent.exempleNtcip;

import java.text.MessageFormat;

import org.snmp4j.agent.exempleNtcip.listener.MessageEntryListener;
import org.snmp4j.agent.exempleNtcip.ntcip.TypeEquip;
import org.snmp4j.agent.exempleNtcip.ui.MaMatrice;
import org.snmp4j.agent.exempleNtcip.ui.MonPanneau;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

public class NtcipInit {
	static private MonPanneau matrice=null;

	public static MonPanneau init(TypeEquip type,Ntcip12032005 ntcip) {
		switch (type) {
		default:
		case SAV_MIXTE:
			initSavMixte(ntcip);
			break;
		case PMV:
			initPmv(ntcip);
			break;
		case TYPE1:
			initType1(ntcip);
			break;
		case TYPE2:
			initType2(ntcip);
			break;
		case TYPE3:
			initType3(ntcip);
			break;
		case TYPE4:
		case PANNONCEAU:
			initType4(ntcip);
			break;
		case PMV2:
			initPmv2(ntcip);
			break;
		case PMV3:
			initPmv3(ntcip);
			break;
		case B14:
			initB14(ntcip);
			break;
		case SAV:
			initSav(ntcip);
			break;
		case INFO:
			initInfo(ntcip);
			break;
		}
		return matrice;

	}
	private static void initGraphics(Ntcip12032005 ntcip,String prefixe,int width,int height) {
		for(int indice=1;indice<256;indice++) {
			initGraphic(ntcip,prefixe,indice,indice,width,height);
		}
	}
	private static void initMessages(Ntcip12032005 ntcip) {
		ntcip.getDmsNumChangeableMsg().setValue(new Integer32(4));
		initMessage(ntcip,1,1,Ntcip12032005.DmsMessageStatusEnum.valid);
		initMessage(ntcip,2,2,Ntcip12032005.DmsMessageStatusEnum.valid);
		initMessage(ntcip,3,3,Ntcip12032005.DmsMessageStatusEnum.valid);
		initMessage(ntcip,4,4,Ntcip12032005.DmsMessageStatusEnum.notUsed);
		initMessageType(ntcip,Ntcip12032005.DmsMessageMemoryTypeEnum.blank,1,1,Ntcip12032005.DmsMessageStatusEnum.valid);
		initMessageType(ntcip,Ntcip12032005.DmsMessageMemoryTypeEnum.currentBuffer,1,1,Ntcip12032005.DmsMessageStatusEnum.valid);
		ntcip.getDmsMessageEntry().addMOChangeListener(new MessageEntryListener(ntcip) );
	}
	private static void initAlims(Ntcip12032005 ntcip,int nbAlims) {
		ntcip.getDmsPowerNumRows().setValue(new Integer32(nbAlims));
		for(int numAlim=1;numAlim<=nbAlims; numAlim++) {
			initAlim(ntcip, numAlim);
		}
	}

	private static void initClimates(Ntcip12032005 ntcip,int nbAlims) {
		ntcip.getDmsClimateCtrlNumRows().setValue(new Integer32(2*nbAlims));
		for(int numAlim=0;numAlim<nbAlims; numAlim++) {
			initClimate(ntcip, 1+numAlim*2,2);
			initClimate(ntcip, 2+numAlim*2,5);
		}
	}

	private static void initTempSensors(Ntcip12032005 ntcip,int nbSensors) {
		ntcip.getDmsTempSensorNumRows().setValue(new Integer32(nbSensors));
		for(int numSensor=1;numSensor<=nbSensors; numSensor++) {
			initTempSensor(ntcip, numSensor);
		}
	}
	
	private static void initFonts(Ntcip12032005 ntcip,int fontSize) {
		ntcip.getNumFonts().setValue(new Integer32(4));
		initFont(ntcip,1,16,16);
		initFont(ntcip,1,10,10);
		initFont(ntcip,1,8,8);
		initFont(ntcip,2,7,7);
		ntcip.getDefaultFont().setValue(new Integer32(fontSize));
	}
	private static void initGraphics(Ntcip12032005 ntcip,int blockSize,int nbGraphics) {
		ntcip.getDmsGraphicBlockSize().setValue(new Integer32(blockSize));
		ntcip.getDmsGraphicMaxEntries().setValue(new Integer32(nbGraphics));
	}
	private static void initSize(Ntcip12032005 ntcip,int width,int height) {
		ntcip.getVmsSignHeightPixels().setValue(new Integer32(height));
		ntcip.getVmsSignWidthPixels().setValue(new Integer32(width));
		matrice=new MonPanneau(ntcip);
	}
	private static void initSav(Ntcip12032005 ntcip) {
		initSize(ntcip,32,24);
		initGraphics(ntcip,10000,255);
		initFonts(ntcip,7);
		initMessages(ntcip);
		ntcip.getDmsNumChangeableMsg().setValue(new Integer32(4));
		initGraphics(ntcip,"ax",32,24);

	}

	private static void initPmv2(Ntcip12032005 ntcip) {
		initFonts(ntcip,16);
		initGraphics(ntcip,10000,255);
		initAlims(ntcip,16);
		initClimates(ntcip,8);
		initTempSensors(ntcip,8);
		initTempSensors(ntcip,8);
		initMessages(ntcip);
		initGraphics(ntcip,"fx",72,72);
		initSize(ntcip,384,72);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}
	private static void initPmv3(Ntcip12032005 ntcip) {
		initFonts(ntcip,16);
		initGraphics(ntcip,10000,255);
		initAlims(ntcip,12);
		initClimates(ntcip,6);
		initTempSensors(ntcip,6);
		initTempSensors(ntcip,6);
		initMessages(ntcip);
		initGraphics(ntcip,"fx",72,72);
		initSize(ntcip,288,72);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}

	private static void initPmv(Ntcip12032005 ntcip) {
		initSize(ntcip,384,72);
		initGraphics(ntcip,10000,255);
		initFonts(ntcip,16);
		initMessages(ntcip);
		initGraphics(ntcip,"fx",72,72);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}
	private static void initType1(Ntcip12032005 ntcip) {
		initAlims(ntcip,4);
		initClimates(ntcip,1);
		initTempSensors(ntcip,2);
		initSize(ntcip,80,104);
		initGraphics(ntcip,10000,255);
		initFonts(ntcip,10);
		initMessages(ntcip);
		initGraphics(ntcip,"cx",72,72);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}
	private static void initType2(Ntcip12032005 ntcip) {
		initAlims(ntcip,3);
		initClimates(ntcip,1);
		initTempSensors(ntcip,2);
		initSize(ntcip,80,80);
		initGraphics(ntcip,10000,255);
		initFonts(ntcip,10);
		initMessages(ntcip);
		initGraphics(ntcip,"cx",72,72);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}
	private static void initType3(Ntcip12032005 ntcip) {
		initAlims(ntcip,3);
		initClimates(ntcip,1);
		initTempSensors(ntcip,2);
		initSize(ntcip,80,88);
		initGraphics(ntcip,10000,255);
		initFonts(ntcip,10);
		initMessages(ntcip);
		initGraphics(ntcip,"cx",72,72);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}

	private static void initType4(Ntcip12032005 ntcip) {
		initAlims(ntcip,2);
		initClimates(ntcip,1);
		initTempSensors(ntcip,2);
		initSize(ntcip,56,72);
		initGraphics(ntcip,10000,255);
		initFonts(ntcip,8);
		initMessages(ntcip);
		initGraphics(ntcip,"cx",56,56);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}
	private static void initB14(Ntcip12032005 ntcip) {
		initSize(ntcip,80,80);
		initGraphics(ntcip,10000,255);
		initFonts(ntcip,10);
		initMessages(ntcip);
		initGraphics(ntcip,"fx",72,72);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}
	private static void initInfo(Ntcip12032005 ntcip) {
		initSize(ntcip,80,40);
		initGraphics(ntcip,10000,255);
		initFonts(ntcip,7);
		initMessages(ntcip);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}


	private static void initSavMixte(Ntcip12032005 ntcip) {
		initSize(ntcip,48,32);
		initGraphics(ntcip,10000,255);
		initFonts(ntcip,8);
		initMessages(ntcip);
		initGraphics(ntcip,"ax",48,32);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}

	public static void initMessageType(Ntcip12032005 ntcip,int messageType,  int messageIndex,int messageNumber,int messageStatus) {
		Variable tableau[]= {
				new Integer32(messageType),
				new Integer32(messageNumber),
				new OctetString(""),
				new OctetString("FARECO"),
				new Integer32(30000),
				new Integer32(0),
				new Integer32(0),
				new Integer32(1),
				new Integer32(messageStatus)
			};
			ntcip.getDmsMessageEntry().addNewRow(new OID().append(messageType).append(messageIndex),tableau);
//			ntcip.getDmsMessageEntry().addNewRow(new OID().append(messageIndex),tableau);
			
		}

	public static void initAlim(Ntcip12032005 ntcip,int alimIndex) {
		Variable initialValues[]= {
				new Integer32(alimIndex),
				new OctetString("Alimentation "+alimIndex),
				new OctetString("FARECO"),
				new Integer32(2),
				new Integer32(40),
				new Integer32(2),
			};
			ntcip.getDmsPowerStatusEntry().addNewRow(new OID().append(alimIndex), initialValues);
		
		}
	public static void initClimate(Ntcip12032005 ntcip,int alimIndex,int type) {
		Variable initialValues[]= {
				new Integer32(alimIndex),
				new OctetString("Climatisation "+alimIndex),
				new OctetString("FARECO"),
				new Integer32(2),
				new Integer32(0),
				new Integer32(2),
				new OctetString("None"),
				new Integer32(type)
			};
			ntcip.getDmsClimateCtrlStatusEntry().addNewRow(new OID().append(alimIndex), initialValues);
		
		}
	public static void initTempSensor(Ntcip12032005 ntcip,int alimIndex) {
		Variable initialValues[]= {
				new Integer32(alimIndex),
				new OctetString("Sonde de temp "+alimIndex),
				new Integer32(40+alimIndex),
				new Integer32(55),
				new Integer32(-10),
				new Integer32(75),
				new Integer32(-30),
				new Integer32(2)
			};
			ntcip.getDmsTempSensorStatusEntry().addNewRow(new OID().append(alimIndex), initialValues);
		
		}

	public static void initMessage(Ntcip12032005 ntcip,int messageIndex,int messageNumber,int messageStatus) {
		Variable tableau[]= {
				new Integer32(Ntcip12032005.DmsMessageMemoryTypeEnum.changeable),
				new Integer32(messageNumber),
				new OctetString("Message "+messageNumber),
				new OctetString("FARECO"),
				new Integer32(30000),
				new Integer32(0),
				new Integer32(0),
				new Integer32(1),
				new Integer32(messageStatus)
			};
			ntcip.getDmsMessageEntry().addNewRow(new OID().append(Ntcip12032005.DmsMessageMemoryTypeEnum.changeable).append(messageIndex),tableau);
//			ntcip.getDmsMessageEntry().addNewRow(new OID().append(messageIndex),tableau);
			
		}
	public static void initFont(Ntcip12032005 ntcip,int fontIndex,int number,int height) {
		Variable tableau[]= {
				new Integer32(fontIndex),
				new Integer32(number),
				new OctetString("Fonte"+height),
				new Integer32(height),
				new Integer32(0),
				new Integer32(0),
				new Integer32(100),
				new Integer32(1)
		};
		ntcip.getFontEntry().addNewRow(new OID().append(fontIndex),tableau);
		
	}
	public static void initGraphic(Ntcip12032005 ntcip,String prefixe,int graphicIndex,int number,int width,int height) {
		MessageFormat mf=new MessageFormat(
				"{0}_{1,number,000}.bmp");
		String nomImage=MessageFormat.format("{0,number}x{1,number}/{2}_{3,number,000}.bmp",width,height,prefixe,number);
		byte couleur[]= {0,0,0};
		Variable tableau[]= {
				new Integer32(graphicIndex),
				new Integer32(number),
				new OctetString(nomImage),
				new Integer32(height),
				new Integer32(width),
				new Integer32(4),
				new Integer32(number),
				new Integer32(0),
				new OctetString(couleur),
				new Integer32(Ntcip12032005.DmsGraphicStatusEnum.readyForUse)
		};
		ntcip.getDmsGraphicEntry().addNewRow(new OID().append(graphicIndex),tableau);
		
	}

}
