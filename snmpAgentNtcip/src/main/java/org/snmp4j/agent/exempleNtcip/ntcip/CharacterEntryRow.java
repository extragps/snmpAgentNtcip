package org.snmp4j.agent.exempleNtcip.ntcip;

import org.snmp4j.agent.exempleNtcip.Ntcip12032005;
import org.snmp4j.agent.mo.DefaultMOMutableRow2PC;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

public class CharacterEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=characterEntry::RowMembers
    //--AgentGen END

    public CharacterEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=characterEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getCharacterNumber() {
    //--AgentGen BEGIN=characterEntry::getCharacterNumber
    //--AgentGen END
      return (Integer32) super.getValue(Ntcip12032005.idxCharacterNumber);
    }  
    
    public void setCharacterNumber(Integer32 newColValue) {
    //--AgentGen BEGIN=characterEntry::setCharacterNumber
    //--AgentGen END
      super.setValue(Ntcip12032005.idxCharacterNumber, newColValue);
    }
    
    public Integer32 getCharacterWidth() {
    //--AgentGen BEGIN=characterEntry::getCharacterWidth
    //--AgentGen END
      return (Integer32) super.getValue(Ntcip12032005.idxCharacterWidth);
    }  
    
    public void setCharacterWidth(Integer32 newColValue) {
    //--AgentGen BEGIN=characterEntry::setCharacterWidth
    //--AgentGen END
      super.setValue(Ntcip12032005.idxCharacterWidth, newColValue);
    }
    
    public OctetString getCharacterBitmap() {
    //--AgentGen BEGIN=characterEntry::getCharacterBitmap
    //--AgentGen END
      return (OctetString) super.getValue(Ntcip12032005.idxCharacterBitmap);
    }  
    
    public void setCharacterBitmap(OctetString newColValue) {
    //--AgentGen BEGIN=characterEntry::setCharacterBitmap
    //--AgentGen END
      super.setValue(Ntcip12032005.idxCharacterBitmap, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=characterEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case Ntcip12032005.idxCharacterNumber: 
        	return getCharacterNumber();
        case Ntcip12032005.idxCharacterWidth: 
        	return getCharacterWidth();
        case Ntcip12032005.idxCharacterBitmap: 
        	return getCharacterBitmap();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=characterEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case Ntcip12032005.idxCharacterNumber: 
        	setCharacterNumber((Integer32)value);
        	break;
        case Ntcip12032005.idxCharacterWidth: 
        	setCharacterWidth((Integer32)value);
        	break;
        case Ntcip12032005.idxCharacterBitmap: 
        	setCharacterBitmap((OctetString)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=characterEntry::Row
    //--AgentGen END
  }