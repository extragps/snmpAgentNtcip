package org.snmp4j.agent.exempleNtcip.listener;

import org.snmp4j.agent.exempleNtcip.Ntcip12032005;
import org.snmp4j.agent.exempleNtcip.ntcip.DmsMessageEntryRow;
import org.snmp4j.agent.mo.MOChangeEvent;
import org.snmp4j.agent.mo.MOChangeListener;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;

public class MessageEntryListener implements MOChangeListener {

	Ntcip12032005 ntcip=null;
	public MessageEntryListener(Ntcip12032005 ntcip2) {
		ntcip=ntcip2;
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
		System.out.println("La valeur a changé "+changeEvent.getOID());
		OID oid=changeEvent.getOID();
		int length=oid.size();
		if(length>=3) {
		int numMessage=oid.get(length-1);
		int typeMessage=oid.get(length-2);
		int info=oid.get(length-3);
		/* Si c'est une question de status... */
		switch(info) {
		case 9:
			/* notUsed (1),
			modifying (2),
			validating (3),
			valid (4),
			error (5),
			modifyReq (6),
			validateReq (7),
			notUsedReq (8) */

			System.out.println("La valeur est "+changeEvent.getNewValue().toInt());
			switch(changeEvent.getNewValue().toInt()) {
			case Ntcip12032005.DmsMessageStatusEnum.modifyReq:
				/* Passer la valeur a modifying */
				DmsMessageEntryRow row=ntcip.getDmsMessageEntry().getModel().getRow(new OID().append(typeMessage).append(numMessage));
				DmsMessageEntryRow rowBis=ntcip.getDmsMessageEntry().getModel().getRow(changeEvent.getOID());
				row.setDmsMessageStatus(new Integer32(Ntcip12032005.DmsMessageStatusEnum.modifying));
			
				break;
			case 7:
				/* Passer la valeur a valid */
				break;
			}
			break;
		}
		}

	}

}
