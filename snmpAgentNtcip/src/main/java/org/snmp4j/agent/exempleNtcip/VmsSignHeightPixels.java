package org.snmp4j.agent.exempleNtcip;

import org.snmp4j.agent.MOAccess;
import org.snmp4j.agent.mo.MOScalar;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;

public class VmsSignHeightPixels extends MOScalar<Integer32> {

	public VmsSignHeightPixels(OID oidvmssignheightpixels, MOAccess createAccess, Integer32 integer32) {
		// TODO Auto-generated constructor stub
		super(oidvmssignheightpixels,createAccess,integer32);
	}

	@Override
	public int setValue(Integer32 value) {
		// TODO Auto-generated method stub
		return super.setValue(value);
	}
	

}
