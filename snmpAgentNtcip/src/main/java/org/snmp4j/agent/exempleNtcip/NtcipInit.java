package org.snmp4j.agent.exempleNtcip;

import java.text.MessageFormat;

import org.snmp4j.agent.exempleNtcip.listener.MessageEntryListener;
import org.snmp4j.agent.exempleNtcip.ntcip.TypeEquip;
import org.snmp4j.agent.exempleNtcip.ui.MaMatrice;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

public class NtcipInit {
	static private MaMatrice matrice=null;

	public static MaMatrice init(TypeEquip type,Ntcip12032005 ntcip) {
		switch (type) {
		default:
		case SAV_MIXTE:
			initSavMixte(ntcip);
			break;
		case PMV:
			initPmv(ntcip);
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
	
	private static void initFonts(Ntcip12032005 ntcip) {
		ntcip.getNumFonts().setValue(new Integer32(2));
		initFont(ntcip,1,20,16);
		initFont(ntcip,2,21,7);
		ntcip.getDefaultFont().setValue(new Integer32(20));
	}
	private static void initSize(Ntcip12032005 ntcip,int width,int height) {
		ntcip.getVmsSignHeightPixels().setValue(new Integer32(height));
		ntcip.getVmsSignWidthPixels().setValue(new Integer32(width));
		matrice=new MaMatrice(ntcip);
	}
	private static void initSav(Ntcip12032005 ntcip) {
		initSize(ntcip,32,24);
		initFonts(ntcip);
		initMessages(ntcip);
		ntcip.getDmsNumChangeableMsg().setValue(new Integer32(4));
		initGraphics(ntcip,"ax",32,24);

	}

	private static void initPmv(Ntcip12032005 ntcip) {
		initSize(ntcip,384,72);
		initFonts(ntcip);
		initMessages(ntcip);
		initGraphics(ntcip,"fx",72,72);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}
	private static void initB14(Ntcip12032005 ntcip) {
		initSize(ntcip,80,80);
		initFonts(ntcip);
		initMessages(ntcip);
		initGraphics(ntcip,"fx",72,72);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}
	private static void initInfo(Ntcip12032005 ntcip) {
		initSize(ntcip,80,40);
		initFonts(ntcip);
		initMessages(ntcip);
		ntcip.getDmsActivateMessage().addMOChangeListener(matrice);
	}


	private static void initSavMixte(Ntcip12032005 ntcip) {
		initSize(ntcip,48,32);
		initFonts(ntcip);
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
