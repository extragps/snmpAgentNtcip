package org.snmp4j.agent.exempleNtcip.ntcip;

import org.snmp4j.agent.mo.MOTableRowFactory;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;

public class CharacterEntryRowFactory 
        implements MOTableRowFactory<CharacterEntryRow>
  {
    public synchronized CharacterEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      CharacterEntryRow row = 
        new CharacterEntryRow(index, values);
    //--AgentGen BEGIN=characterEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(CharacterEntryRow row) {
    //--AgentGen BEGIN=characterEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=characterEntry::RowFactory
    //--AgentGen END
  }