module snmpAgentNtcip {
	exports org.snmp4j.agent.exempleNtcip.listener;
	exports org.snmp4j.agent.exempleNtcip.ntcip;
	exports org.snmp4j.agent.exempleNtcip;
	exports org.snmp4j.agent.exempleNtcip.ui;

	requires java.desktop;
	requires snmp4j;
	requires snmp4j.agent;
}