package org.snmp4j.agent.exempleNtcip.ntcip;

import org.snmp4j.agent.MOAccess;
import org.snmp4j.agent.mo.MOScalar;
import org.snmp4j.agent.request.SubRequest;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

public class DmsActivateMessage extends MOScalar<OctetString> {
    public DmsActivateMessage(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=dmsActivateMessage
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 12) && (os.length() <= 12)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_LENGTH;
      }
    //--AgentGen BEGIN=dmsActivateMessage::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=dmsActivateMessage::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=dmsActivateMessage::setValue
    //--AgentGen END
    	
    	/* Afficher le message... */
    	
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsActivateMessage::_METHODS
    //--AgentGen END

  }