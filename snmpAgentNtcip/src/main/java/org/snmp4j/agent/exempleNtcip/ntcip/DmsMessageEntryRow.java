package org.snmp4j.agent.exempleNtcip.ntcip;

import org.snmp4j.agent.exempleNtcip.Ntcip12032005;
import org.snmp4j.agent.exempleNtcip.Ntcip12032005.DmsMessageStatusEnum;
import org.snmp4j.agent.mo.DefaultMOMutableRow2PC;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

public class DmsMessageEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsMessageEntry::RowMembers
    //--AgentGen END

    public DmsMessageEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsMessageEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsMessageMemoryType() {
    //--AgentGen BEGIN=dmsMessageEntry::getDmsMessageMemoryType
    //--AgentGen END
      return (Integer32) super.getValue(Ntcip12032005.idxDmsMessageMemoryType);
    }  
    
    public void setDmsMessageMemoryType(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsMessageEntry::setDmsMessageMemoryType
    //--AgentGen END
      super.setValue(Ntcip12032005.idxDmsMessageMemoryType, newColValue);
    }
    
    public Integer32 getDmsMessageNumber() {
    //--AgentGen BEGIN=dmsMessageEntry::getDmsMessageNumber
    //--AgentGen END
      return (Integer32) super.getValue(Ntcip12032005.idxDmsMessageNumber);
    }  
    
    public void setDmsMessageNumber(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsMessageEntry::setDmsMessageNumber
    //--AgentGen END
      super.setValue(Ntcip12032005.idxDmsMessageNumber, newColValue);
    }
    
    public OctetString getDmsMessageMultiString() {
    //--AgentGen BEGIN=dmsMessageEntry::getDmsMessageMultiString
    //--AgentGen END
      return (OctetString) super.getValue(Ntcip12032005.idxDmsMessageMultiString);
    }  
    
    public void setDmsMessageMultiString(OctetString newColValue) {
    //--AgentGen BEGIN=dmsMessageEntry::setDmsMessageMultiString
    //--AgentGen END
      super.setValue(Ntcip12032005.idxDmsMessageMultiString, newColValue);
    }
    
    public OctetString getDmsMessageOwner() {
    //--AgentGen BEGIN=dmsMessageEntry::getDmsMessageOwner
    //--AgentGen END
      return (OctetString) super.getValue(Ntcip12032005.idxDmsMessageOwner);
    }  
    
    public void setDmsMessageOwner(OctetString newColValue) {
    //--AgentGen BEGIN=dmsMessageEntry::setDmsMessageOwner
    //--AgentGen END
      super.setValue(Ntcip12032005.idxDmsMessageOwner, newColValue);
    }
    
    public Integer32 getDmsMessageCRC() {
    //--AgentGen BEGIN=dmsMessageEntry::getDmsMessageCRC
    //--AgentGen END
      return (Integer32) super.getValue(Ntcip12032005.idxDmsMessageCRC);
    }  
    
    public void setDmsMessageCRC(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsMessageEntry::setDmsMessageCRC
    //--AgentGen END
      super.setValue(Ntcip12032005.idxDmsMessageCRC, newColValue);
    }
    
    public Integer32 getDmsMessageBeacon() {
    //--AgentGen BEGIN=dmsMessageEntry::getDmsMessageBeacon
    //--AgentGen END
      return (Integer32) super.getValue(Ntcip12032005.idxDmsMessageBeacon);
    }  
    
    public void setDmsMessageBeacon(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsMessageEntry::setDmsMessageBeacon
    //--AgentGen END
      super.setValue(Ntcip12032005.idxDmsMessageBeacon, newColValue);
    }
    
    public Integer32 getDmsMessagePixelService() {
    //--AgentGen BEGIN=dmsMessageEntry::getDmsMessagePixelService
    //--AgentGen END
      return (Integer32) super.getValue(Ntcip12032005.idxDmsMessagePixelService);
    }  
    
    public void setDmsMessagePixelService(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsMessageEntry::setDmsMessagePixelService
    //--AgentGen END
      super.setValue(Ntcip12032005.idxDmsMessagePixelService, newColValue);
    }
    
    public Integer32 getDmsMessageRunTimePriority() {
    //--AgentGen BEGIN=dmsMessageEntry::getDmsMessageRunTimePriority
    //--AgentGen END
      return (Integer32) super.getValue(Ntcip12032005.idxDmsMessageRunTimePriority);
    }  
    
    public void setDmsMessageRunTimePriority(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsMessageEntry::setDmsMessageRunTimePriority
    //--AgentGen END
      super.setValue(Ntcip12032005.idxDmsMessageRunTimePriority, newColValue);
    }
    
    public Integer32 getDmsMessageStatus() {
    //--AgentGen BEGIN=dmsMessageEntry::getDmsMessageStatus
    //--AgentGen END
      return (Integer32) super.getValue(Ntcip12032005.idxDmsMessageStatus);
    }  
    
    public void setDmsMessageStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsMessageEntry::setDmsMessageStatus
    //--AgentGen END
   		switch(newColValue.toInt()) {
   		case DmsMessageStatusEnum.validateReq:
   			switch(getValue(Ntcip12032005.idxDmsMessageStatus).toInt()) {
   				case DmsMessageStatusEnum.modifying:
   					super.setValue(Ntcip12032005.idxDmsMessageStatus, new Integer32(DmsMessageStatusEnum.valid));
   					break;
   			}
   			break;
   		case DmsMessageStatusEnum.modifyReq:
   			switch(getValue(Ntcip12032005.idxDmsMessageStatus).toInt()) {
   			case DmsMessageStatusEnum.notUsed:
   			case DmsMessageStatusEnum.valid:
   			case DmsMessageStatusEnum.modifying:
				super.setValue(Ntcip12032005.idxDmsMessageStatus, new Integer32(DmsMessageStatusEnum.modifying));
   				break;
   			}
   			break;
   		case DmsMessageStatusEnum.notUsed:
   			switch(getValue(Ntcip12032005.idxDmsMessageStatus).toInt()) {
   			case DmsMessageStatusEnum.notUsed:
   			case DmsMessageStatusEnum.valid:
				super.setValue(Ntcip12032005.idxDmsMessageStatus, newColValue);
   				break;
   			}
   			break;
   		}
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsMessageEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case Ntcip12032005.idxDmsMessageMemoryType: 
        	return getDmsMessageMemoryType();
        case Ntcip12032005.idxDmsMessageNumber: 
        	return getDmsMessageNumber();
        case Ntcip12032005.idxDmsMessageMultiString: 
        	return getDmsMessageMultiString();
        case Ntcip12032005.idxDmsMessageOwner: 
        	return getDmsMessageOwner();
        case Ntcip12032005.idxDmsMessageCRC: 
        	return getDmsMessageCRC();
        case Ntcip12032005.idxDmsMessageBeacon: 
        	return getDmsMessageBeacon();
        case Ntcip12032005.idxDmsMessagePixelService: 
        	return getDmsMessagePixelService();
        case Ntcip12032005.idxDmsMessageRunTimePriority: 
        	return getDmsMessageRunTimePriority();
        case Ntcip12032005.idxDmsMessageStatus: 
        	return getDmsMessageStatus();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsMessageEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case Ntcip12032005.idxDmsMessageMemoryType: 
        	setDmsMessageMemoryType((Integer32)value);
        	break;
        case Ntcip12032005.idxDmsMessageNumber: 
        	setDmsMessageNumber((Integer32)value);
        	break;
        case Ntcip12032005.idxDmsMessageMultiString: 
        	setDmsMessageMultiString((OctetString)value);
        	int crc=0;
        	for(char valeur:value.toString().toCharArray()) {
        		crc+=(int)valeur;
        	}
        	setDmsMessageCRC(new Integer32(crc));
        	break;
        case Ntcip12032005.idxDmsMessageOwner: 
        	setDmsMessageOwner((OctetString)value);
        	break;
        case Ntcip12032005.idxDmsMessageCRC: 
        	setDmsMessageCRC((Integer32)value);
        	break;
        case Ntcip12032005.idxDmsMessageBeacon: 
        	setDmsMessageBeacon((Integer32)value);
        	break;
        case Ntcip12032005.idxDmsMessagePixelService: 
        	setDmsMessagePixelService((Integer32)value);
        	break;
        case Ntcip12032005.idxDmsMessageRunTimePriority: 
        	setDmsMessageRunTimePriority((Integer32)value);
        	break;
        case Ntcip12032005.idxDmsMessageStatus: 
        	setDmsMessageStatus((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsMessageEntry::Row
    //--AgentGen END
  }