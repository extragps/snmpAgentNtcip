 
/**
 * Copyright Text
 */ 
package org.snmp4j.agent.exempleNtcip;
//--AgentGen BEGIN=_BEGIN
//--AgentGen END

import org.snmp4j.smi.*;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.agent.*;
import org.snmp4j.agent.exempleNtcip.ntcip.CharacterEntryRow;
import org.snmp4j.agent.exempleNtcip.ntcip.CharacterEntryRowFactory;
import org.snmp4j.agent.exempleNtcip.ntcip.DmsActivateMessage;
import org.snmp4j.agent.exempleNtcip.ntcip.DmsMessageEntryRow;
import org.snmp4j.agent.mo.*;
import org.snmp4j.agent.mo.snmp.*;
import org.snmp4j.agent.mo.snmp.smi.*;
import org.snmp4j.agent.request.*;
import org.snmp4j.log.LogFactory;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.agent.mo.snmp.tc.*;



//--AgentGen BEGIN=_IMPORT
//--AgentGen END

public class Ntcip12032005 
//--AgentGen BEGIN=_EXTENDS
//--AgentGen END
implements MOGroup 
//--AgentGen BEGIN=_IMPLEMENTS
//--AgentGen END
{

  private static final LogAdapter LOGGER = 
      LogFactory.getLogger(Ntcip12032005.class);

//--AgentGen BEGIN=_STATIC
//--AgentGen END

  // Factory
  private MOFactory moFactory = 
    DefaultMOFactory.getInstance();

  // Constants 

  /**
   * OID of this MIB module for usage which can be 
   * used for its identification.
   */
  public static final OID oidNtcip12032005 =
    new OID(new int[] {  });

  // Identities
  // Scalars
  public static final OID oidDmsSignAccess = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,1,1,0 });
  public static final OID oidDmsSignType = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,1,2,0 });
  public static final OID oidDmsSignHeight = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,1,3,0 });
  public static final OID oidDmsSignWidth = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,1,4,0 });
  public static final OID oidDmsHorizontalBorder = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,1,5,0 });
  public static final OID oidDmsVerticalBorder = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,1,6,0 });
  public static final OID oidDmsLegend = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,1,7,0 });
  public static final OID oidDmsBeaconType = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,1,8,0 });
  public static final OID oidDmsSignTechnology = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,1,9,0 });
  public static final OID oidVmsCharacterHeightPixels = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,2,1,0 });
  public static final OID oidVmsCharacterWidthPixels = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,2,2,0 });
  public static final OID oidVmsSignHeightPixels = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,2,3,0 });
  public static final OID oidVmsSignWidthPixels = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,2,4,0 });
  public static final OID oidVmsHorizontalPitch = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,2,5,0 });
  public static final OID oidVmsVerticalPitch = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,2,6,0 });
  public static final OID oidMonochromeColor = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,2,7,0 });
  public static final OID oidNumFonts = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,3,1,0 });
  public static final OID oidMaxFontCharacters = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,3,3,0 });
  public static final OID oidFontMaxCharacterSize = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,3,5,0 });
  public static final OID oidDefaultBackgroundColor = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,1,0 });
  public static final OID oidDefaultForegroundColor = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,2,0 });
  public static final OID oidDefaultFlashOn = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,3,0 });
  public static final OID oidDefaultFlashOff = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,4,0 });
  public static final OID oidDefaultFont = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,5,0 });
  public static final OID oidDefaultJustificationLine = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,6,0 });
  public static final OID oidDefaultJustificationPage = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,7,0 });
  public static final OID oidDefaultPageOnTime = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,8,0 });
  public static final OID oidDefaultPageOffTime = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,9,0 });
  public static final OID oidDefaultCharacterSet = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,10,0 });
  public static final OID oidDmsColorScheme = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,11,0 });
  public static final OID oidDefaultBackgroundRGB = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,12,0 });
  public static final OID oidDefaultForegroundRGB = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,13,0 });
  public static final OID oidDmsSupportedMultiTags = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,14,0 });
  public static final OID oidDmsMaxNumberPages = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,15,0 });
  public static final OID oidDmsMaxMultiStringLength = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,16,0 });
  public static final OID oidDefaultFlashOnActivate = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,17,0 });
  public static final OID oidDefaultFlashOffActivate = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,18,0 });
  public static final OID oidDefaultFontActivate = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,19,0 });
  public static final OID oidDefaultJustificationLineActivate = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,20,0 });
  public static final OID oidDefaultJustificationPageActivate = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,21,0 });
  public static final OID oidDefaultPageOnTimeActivate = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,22,0 });
  public static final OID oidDefaultPageOffTimeActivate = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,23,0 });
  public static final OID oidDefaultBackgroundRGBActivate = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,24,0 });
  public static final OID oidDefaultForegroundRGBActivate = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,4,25,0 });
  public static final OID oidDmsNumPermanentMsg = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,1,0 });
  public static final OID oidDmsNumChangeableMsg = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,2,0 });
  public static final OID oidDmsMaxChangeableMsg = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,3,0 });
  public static final OID oidDmsFreeChangeableMemory = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,4,0 });
  public static final OID oidDmsNumVolatileMsg = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,5,0 });
  public static final OID oidDmsMaxVolatileMsg = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,6,0 });
  public static final OID oidDmsFreeVolatileMemory = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,7,0 });
  public static final OID oidDmsValidateMessageError = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,9,0 });
  public static final OID oidDmsControlMode = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,1,0 });
  public static final OID oidDmsSWReset = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,2,0 });
  public static final OID oidDmsActivateMessage = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,3,0 });
  public static final OID oidDmsMessageTimeRemaining = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,4,0 });
  public static final OID oidDmsMsgTableSource = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,5,0 });
  public static final OID oidDmsMsgRequesterID = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,6,0 });
  public static final OID oidDmsMsgSourceMode = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,7,0 });
  public static final OID oidDmsShortPowerRecoveryMessage = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,8,0 });
  public static final OID oidDmsLongPowerRecoveryMessage = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,9,0 });
  public static final OID oidDmsShortPowerLossTime = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,10,0 });
  public static final OID oidDmsResetMessage = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,11,0 });
  public static final OID oidDmsCommunicationsLossMessage = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,12,0 });
  public static final OID oidDmsTimeCommLoss = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,13,0 });
  public static final OID oidDmsPowerLossMessage = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,14,0 });
  public static final OID oidDmsEndDurationMessage = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,15,0 });
  public static final OID oidDmsMemoryMgmt = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,16,0 });
  public static final OID oidDmsActivateMsgError = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,17,0 });
  public static final OID oidDmsMultiSyntaxError = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,18,0 });
  public static final OID oidDmsMultiSyntaxErrorPosition = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,19,0 });
  public static final OID oidDmsMultiOtherErrorDescription = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,20,0 });
  public static final OID oidVmsPixelServiceDuration = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,21,0 });
  public static final OID oidVmsPixelServiceFrequency = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,22,0 });
  public static final OID oidVmsPixelServiceTime = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,23,0 });
  public static final OID oidDmsActivateErrorMsgCode = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,24,0 });
  public static final OID oidDmsActivateMessageState = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,6,25,0 });
  public static final OID oidDmsIllumControl = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,7,1,0 });
  public static final OID oidDmsIllumMaxPhotocellLevel = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,7,2,0 });
  public static final OID oidDmsIllumPhotocellLevelStatus = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,7,3,0 });
  public static final OID oidDmsIllumNumBrightLevels = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,7,4,0 });
  public static final OID oidDmsIllumBrightLevelStatus = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,7,5,0 });
  public static final OID oidDmsIllumManLevel = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,7,6,0 });
  public static final OID oidDmsIllumBrightnessValues = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,7,7,0 });
  public static final OID oidDmsIllumBrightnessValuesError = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,7,8,0 });
  public static final OID oidDmsIllumLightOutputStatus = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,7,9,0 });
  public static final OID oidNumActionTableEntries = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,8,1,0 });
  public static final OID oidStatMultiFieldRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,1,0 });
  public static final OID oidDmsCurrentSpeed = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,3,0 });
  public static final OID oidDmsCurrentSpeedLimit = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,4,0 });
  public static final OID oidWatchdogFailureCount = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,5,0 });
  public static final OID oidDmsStatDoorOpen = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,6,0 });
  public static final OID oidShortErrorStatus = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,1,0 });
  public static final OID oidPixelFailureTableNumRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,2,0 });
  public static final OID oidPixelTestActivation = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,4,0 });
  public static final OID oidLampFailureStuckOn = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,5,0 });
  public static final OID oidLampFailureStuckOff = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,6,0 });
  public static final OID oidLampTestActivation = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,7,0 });
  public static final OID oidFanFailures = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,8,0 });
  public static final OID oidFanTestActivation = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,9,0 });
  public static final OID oidControllerErrorStatus = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,10,0 });
  public static final OID oidDmsPowerFailureStatusMap = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,11,0 });
  public static final OID oidDmsPowerNumRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,12,0 });
  public static final OID oidDmsClimateCtrlStatusMap = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,14,0 });
  public static final OID oidDmsClimateCtrlNumRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,16,0 });
  public static final OID oidDmsPixelFailureTestRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,19,0 });
  public static final OID oidDmsPixelFailureMessageRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,20,0 });
  public static final OID oidDmsLampNumRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,23,0 });
  public static final OID oidDmsDrumStatusMap = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,25,0 });
  public static final OID oidDmsDrumNumRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,26,0 });
  public static final OID oidDmsLightSensorStatusMap = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,28,0 });
  public static final OID oidDmsLightSensorNumRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,29,0 });
  public static final OID oidDmsHumiditySensorStatusMap = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,31,0 });
  public static final OID oidDmsHumiditySensorNumRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,32,0 });
  public static final OID oidDmsTempSensorStatusMap = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,34,0 });
  public static final OID oidDmsTempSensorNumRows = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,35,0 });
  public static final OID oidDmsTempSensorHighestCriticalTempThreshold = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,37,0 });
  public static final OID oidDmsTempSensorLowestCriticalTempThreshold = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,38,0 });
  public static final OID oidSignVolts = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,8,1,0 });
  public static final OID oidLowFuelThreshold = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,8,2,0 });
  public static final OID oidFuelLevel = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,8,3,0 });
  public static final OID oidEngineRPM = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,8,4,0 });
  public static final OID oidLineVolts = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,8,5,0 });
  public static final OID oidPowerSource = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,8,6,0 });
  public static final OID oidTempMinCtrlCabinet = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,9,1,0 });
  public static final OID oidTempMaxCtrlCabinet = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,9,2,0 });
  public static final OID oidTempMinAmbient = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,9,3,0 });
  public static final OID oidTempMaxAmbient = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,9,4,0 });
  public static final OID oidTempMinSignHousing = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,9,5,0 });
  public static final OID oidTempMaxSignHousing = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,9,6,0 });
  public static final OID oidTempSensorWarningMap = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,9,7,0 });
  public static final OID oidTempSensorCriticalTempMap = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,9,8,0 });
  public static final OID oidDmsGraphicMaxEntries = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,1,0 });
  public static final OID oidDmsGraphicNumEntries = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,2,0 });
  public static final OID oidDmsGraphicMaxSize = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,3,0 });
  public static final OID oidAvailableGraphicMemory = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,4,0 });
  public static final OID oidDmsGraphicBlockSize = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,5,0 });
  // Tables

  // Notifications

  // Enumerations
  public static final class DmsSignTypeEnum {
    public static final int other = 1;
    public static final int bos = 2;
    public static final int cms = 3;
    public static final int vmsChar = 4;
    public static final int vmsLine = 5;
    public static final int vmsFull = 6;
    public static final int portableOther = 129;
    public static final int portableBOS = 130;
    public static final int portableCMS = 131;
    public static final int portableVMSChar = 132;
    public static final int portableVMSLine = 133;
    public static final int portableVMSFull = 134;
  }
  public static final class DmsLegendEnum {
    public static final int noLegend = 2;
    public static final int legendExists = 3;
  }
  public static final class DmsBeaconTypeEnum {
    public static final int other = 1;
    public static final int none = 2;
    public static final int oneBeacon = 3;
    public static final int twoBeaconSyncFlash = 4;
    public static final int twoBeaconsOppFlash = 5;
    public static final int fourBeaconSyncFlash = 6;
    public static final int fourBeaconAltRowFlash = 7;
    public static final int fourBeaconAltColumnFlash = 8;
    public static final int fourBeaconAltDiagonalFlash = 9;
    public static final int fourBeaconNoSyncFlash = 10;
    public static final int oneBeaconStrobe = 11;
    public static final int twoBeaconStrobe = 12;
    public static final int fourBeaconStrobe = 13;
  }
  public static final class DefaultJustificationLineEnum {
    public static final int left = 2;
    public static final int center = 3;
    public static final int right = 4;
    public static final int full = 5;
  }
  public static final class DefaultJustificationPageEnum {
    public static final int top = 2;
    public static final int middle = 3;
    public static final int bottom = 4;
  }
  public static final class DefaultCharacterSetEnum {
    public static final int other = 1;
    public static final int eightBit = 2;
  }
  public static final class DmsColorSchemeEnum {
    public static final int monochrome1bit = 1;
    public static final int monochrome8bit = 2;
    public static final int colorClassic = 3;
    public static final int color24bit = 4;
  }
  public static final class DefaultJustificationLineActivateEnum {
    public static final int left = 2;
    public static final int center = 3;
    public static final int right = 4;
    public static final int full = 5;
  }
  public static final class DefaultJustificationPageActivateEnum {
    public static final int top = 2;
    public static final int middle = 3;
    public static final int bottom = 4;
  }
  public static final class DmsValidateMessageErrorEnum {
    public static final int other = 1;
    public static final int none = 2;
    public static final int beacons = 3;
    public static final int pixelService = 4;
    public static final int syntaxMULTI = 5;
  }
  public static final class DmsControlModeEnum {
    /* --external (3), -retired */
    public static final int local = 2;
    public static final int central = 4;
    /* --simulation (6)    -retired */
    public static final int centralOverride = 5;
  }
  public static final class DmsMsgSourceModeEnum {
    public static final int other = 1;
    public static final int local = 2;
    /* --otherCom1( 4), -retired
--otherCom2 (5), -retired
--otherCom3 (6), -retired
--otherCom4 (7), -retired */
    public static final int external = 3;
    public static final int central = 8;
    public static final int timebasedScheduler = 9;
    public static final int powerRecovery = 10;
    public static final int reset = 11;
    public static final int commLoss = 12;
    public static final int powerLoss = 13;
    public static final int endDuration = 14;
  }
  public static final class DmsMemoryMgmtEnum {
    public static final int normal = 2;
    public static final int clearChangeableMessages = 3;
    public static final int clearVolatileMessages = 4;
  }
  public static final class DmsActivateMsgErrorEnum {
    public static final int other = 1;
    public static final int none = 2;
    public static final int priority = 3;
    public static final int messageStatus = 4;
    public static final int messageMemoryType = 5;
    public static final int messageNumber = 6;
    public static final int messageCRC = 7;
    public static final int syntaxMULTI = 8;
    public static final int localMode = 9;
    public static final int centralMode = 10;
    public static final int centralOverrideMode = 11;
  }
  public static final class DmsMultiSyntaxErrorEnum {
    public static final int other = 1;
    public static final int none = 2;
    public static final int unsupportedTag = 3;
    public static final int unsupportedTagValue = 4;
    public static final int textTooBig = 5;
    public static final int fontNotDefined = 6;
    public static final int characterNotDefined = 7;
    public static final int fieldDeviceNotExist = 8;
    public static final int fieldDeviceError = 9;
    public static final int flashRegionError = 10;
    public static final int tagConflict = 11;
    public static final int tooManyPages = 12;
    public static final int fontVersionID = 13;
    public static final int graphicID = 14;
    public static final int graphicNotDefined = 15;
  }
  public static final class DmsActivateMessageStateEnum {
    public static final int fastActivationSign = 1;
    public static final int slowActivatedOK = 2;
    public static final int slowActivatedError = 3;
    public static final int slowActivating = 4;
  }
  public static final class DmsIllumControlEnum {
    public static final int other = 1;
    public static final int photocell = 2;
    public static final int timer = 3;
    /* -- retired */
    public static final int manual = 4;
    public static final int manualDirect = 5;
    public static final int manualIndexed = 6;
  }
  public static final class DmsIllumBrightnessValuesErrorEnum {
    public static final int other = 1;
    public static final int none = 2;
    public static final int photocellGap = 3;
    public static final int negativeSlope = 4;
    public static final int tooManyLevels = 5;
    public static final int invalidData = 6;
  }
  public static final class PixelTestActivationEnum {
    public static final int noTest = 2;
    public static final int test = 3;
    public static final int clearTable = 4;
  }
  public static final class LampTestActivationEnum {
    public static final int noTest = 2;
    public static final int test = 3;
  }
  public static final class FanTestActivationEnum {
    public static final int noTest = 2;
    public static final int test = 3;
  }
  public static final class PowerSourceEnum {
    public static final int other = 1;
    public static final int powerShutdown = 2;
    public static final int noSignPower = 3;
    public static final int acLine = 4;
    public static final int generator = 5;
    public static final int solar = 6;
    public static final int battery_UPS = 7;
  }

  public static final class FontStatusEnum {
    public static final int notUsed = 1;
    public static final int modifying = 2;
    public static final int calculatingID = 3;
    public static final int readyForUse = 4;
    public static final int inUse = 5;
    public static final int permanent = 6;
    public static final int modifyReq = 7;
    public static final int readyForUseReq = 8;
    public static final int notUsedReq = 9;
    public static final int unmanagedReq = 10;
    public static final int unmanaged = 11;
  }
  public static final class DmsMessageMemoryTypeEnum {
    public static final int permanent = 2;
    public static final int changeable = 3;
    public static final int _volatile = 4;
    public static final int currentBuffer = 5;
    public static final int schedule = 6;
    public static final int blank = 7;
  }
  public static final class DmsMessageStatusEnum {
    public static final int notUsed = 1;
    public static final int modifying = 2;
    public static final int validating = 3;
    public static final int valid = 4;
    public static final int error = 5;
    public static final int modifyReq = 6;
    public static final int validateReq = 7;
    public static final int notUsedReq = 8;
  }
  public static final class PixelFailureDetectionTypeEnum {
    public static final int pixelTest = 2;
    public static final int messageDisplay = 3;
  }
  public static final class DmsPowerStatusEnum {
    public static final int noError = 2;
    /* -- The power supply is producing no output. */
    public static final int powerFail = 3;
    /* -- The power supply is producing voltage outside 
-- the vendor specification */
    public static final int voltageOutOfSpec = 4;
    public static final int currentOutOfSpec = 5;
  }
  public static final class DmsPowerTypeEnum {
    public static final int other = 1;
    public static final int acLine = 2;
    public static final int generator = 3;
    public static final int solar = 4;
    public static final int battery_UPS = 5;
    public static final int ledSupply = 6;
    public static final int lampSupply = 7;
  }
  public static final class DmsClimateCtrlErrorStatusEnum {
    public static final int noError = 2;
    public static final int fail = 3;
    public static final int notMonitored = 4;
  }
  public static final class DmsClimateCtrlTestActivationEnum {
    public static final int noTest = 2;
    public static final int test = 3;
    public static final int testAborted = 4;
  }
  public static final class DmsClimateCtrlTypeEnum {
    public static final int other = 1;
    public static final int fansVentilation = 2;
    public static final int fansSignFace = 3;
    public static final int dehumidifier = 4;
    public static final int heatCabinet = 5;
    public static final int heatHousing = 6;
    public static final int heatSignFace = 7;
    public static final int airConditioningCabinet = 8;
    public static final int airConditioningHousing = 9;
  }
  public static final class DmsLampStatusEnum {
    public static final int noError = 2;
    public static final int stuckOff = 3;
    public static final int stuckOn = 4;
  }
  public static final class DmsDrumStatusEnum {
    public static final int other = 1;
    public static final int noError = 2;
    public static final int interlockError = 3;
    public static final int stuckError = 4;
    public static final int positionError = 5;
    public static final int positionUnknownError = 6;
  }
  public static final class DmsLightSensorStatusEnum {
    public static final int noError = 2;
    public static final int fail = 3;
  }
  public static final class DmsHumiditySensorStatusEnum {
    public static final int noError = 2;
    public static final int fail = 3;
  }
  public static final class DmsTempSensorStatusEnum {
    public static final int other = 1;
    public static final int noError = 2;
    public static final int fail = 3;
  }
  public static final class DmsGraphicTypeEnum {
    public static final int monochrome1bit = 1;
    public static final int monochrome8bit = 2;
    public static final int colorClassic = 3;
    public static final int color24bit = 4;
  }
  public static final class DmsGraphicStatusEnum {
    public static final int notUsed = 1;
    public static final int modifying = 2;
    public static final int calculatingID = 3;
    public static final int readyForUse = 4;
    public static final int inUse = 5;
    public static final int permanent = 6;
    public static final int modifyReq = 7;
    public static final int readyForUseReq = 8;
    public static final int notUsedReq = 9;
  }



  // TextualConventions
  private static final String TC_MODULE_NTCIP8004_2008 = "NTCIP8004-2008";
  private static final String TC_MODULE_RFC1213_MIB = "RFC1213-MIB";
  private static final String TC_MODULE_NTCIP1203_2005 = "NTCIP1203-2005";
  private static final String TC_MESSAGEACTIVATIONCODE = "MessageActivationCode";
  private static final String TC_OWNERSTRING = "OwnerString";
  private static final String TC_DISPLAYSTRING = "DisplayString";
  private static final String TC_MESSAGEIDCODE = "MessageIDCode";

  // Scalars
  private MOScalar<Integer32> dmsSignAccess;
  private MOScalar<Integer32> dmsSignType;
  private MOScalar<Integer32> dmsSignHeight;
  private MOScalar<Integer32> dmsSignWidth;
  private MOScalar<Integer32> dmsHorizontalBorder;
  private MOScalar<Integer32> dmsVerticalBorder;
  private MOScalar<Integer32> dmsLegend;
  private MOScalar<Integer32> dmsBeaconType;
  private MOScalar<Integer32> dmsSignTechnology;
  private MOScalar<Integer32> vmsCharacterHeightPixels;
  private MOScalar<Integer32> vmsCharacterWidthPixels;
  private MOScalar<Integer32> vmsSignHeightPixels;
  private MOScalar<Integer32> vmsSignWidthPixels;
  private MOScalar<Integer32> vmsHorizontalPitch;
  private MOScalar<Integer32> vmsVerticalPitch;
  private MOScalar<OctetString> monochromeColor;
  private MOScalar<Integer32> numFonts;
  private MOScalar<Integer32> maxFontCharacters;
  private MOScalar<Integer32> fontMaxCharacterSize;
  private MOScalar<Integer32>  defaultBackgroundColor;
  private MOScalar<Integer32>  defaultForegroundColor;
  private MOScalar defaultFlashOn;
  private MOScalar defaultFlashOff;
  private MOScalar<Integer32>  defaultFont;
  private EnumeratedScalar defaultJustificationLine;
  private EnumeratedScalar defaultJustificationPage;
  private MOScalar defaultPageOnTime;
  private MOScalar defaultPageOffTime;
  private EnumeratedScalar defaultCharacterSet;
  private MOScalar<Integer32> dmsColorScheme;
  private MOScalar<OctetString> defaultBackgroundRGB;
  private MOScalar<OctetString> defaultForegroundRGB;
  private MOScalar<OctetString> dmsSupportedMultiTags;
  private MOScalar<Integer32> dmsMaxNumberPages;
  private MOScalar<Integer32> dmsMaxMultiStringLength;
  private MOScalar<Integer32> defaultFlashOnActivate;
  private MOScalar<Integer32> defaultFlashOffActivate;
  private MOScalar<Integer32> defaultFontActivate;
  private MOScalar<Integer32> defaultJustificationLineActivate;
  private MOScalar<Integer32> defaultJustificationPageActivate;
  private MOScalar<Integer32> defaultPageOnTimeActivate;
  private MOScalar<Integer32> defaultPageOffTimeActivate;
  private MOScalar<OctetString> defaultBackgroundRGBActivate;
  private MOScalar<OctetString> defaultForegroundRGBActivate;
  private MOScalar<Integer32> dmsNumPermanentMsg;
  private MOScalar<Integer32> dmsNumChangeableMsg;
  private MOScalar<Integer32> dmsMaxChangeableMsg;
  private MOScalar<Integer32> dmsFreeChangeableMemory;
  private MOScalar<Integer32> dmsNumVolatileMsg;
  private MOScalar<Integer32> dmsMaxVolatileMsg;
  private MOScalar<Integer32> dmsFreeVolatileMemory;
  private MOScalar<Integer32> dmsValidateMessageError;
  private EnumeratedScalar dmsControlMode;
  private MOScalar<Integer32> dmsSWReset;
  private MOScalar<OctetString> dmsActivateMessage;
  private MOScalar<Integer32> dmsMessageTimeRemaining;
  private MOScalar<OctetString> dmsMsgTableSource;
  private MOScalar<IpAddress> dmsMsgRequesterID;
  private MOScalar<Integer32> dmsMsgSourceMode;
  private MOScalar dmsShortPowerRecoveryMessage;
  private MOScalar dmsLongPowerRecoveryMessage;
  private MOScalar dmsShortPowerLossTime;
  private MOScalar dmsResetMessage;
  private MOScalar dmsCommunicationsLossMessage;
  private MOScalar dmsTimeCommLoss;
  private MOScalar dmsPowerLossMessage;
  private MOScalar dmsEndDurationMessage;
  private EnumeratedScalar dmsMemoryMgmt;
  private MOScalar<Integer32> dmsActivateMsgError;
  private MOScalar<Integer32> dmsMultiSyntaxError;
  private MOScalar<Integer32> dmsMultiSyntaxErrorPosition;
  private MOScalar<OctetString> dmsMultiOtherErrorDescription;
  private MOScalar vmsPixelServiceDuration;
  private MOScalar vmsPixelServiceFrequency;
  private MOScalar vmsPixelServiceTime;
  private MOScalar<OctetString> dmsActivateErrorMsgCode;
  private MOScalar<Integer32> dmsActivateMessageState;
  private EnumeratedScalar dmsIllumControl;
  private MOScalar<Integer32> dmsIllumMaxPhotocellLevel;
  private MOScalar<Integer32> dmsIllumPhotocellLevelStatus;
  private MOScalar<Integer32> dmsIllumNumBrightLevels;
  private MOScalar<Integer32> dmsIllumBrightLevelStatus;
  private MOScalar dmsIllumManLevel;
  private MOScalar dmsIllumBrightnessValues;
  private MOScalar<Integer32> dmsIllumBrightnessValuesError;
  private MOScalar<Integer32> dmsIllumLightOutputStatus;
  private MOScalar<Integer32> numActionTableEntries;
  private MOScalar<Integer32> statMultiFieldRows;
  private MOScalar<Integer32> dmsCurrentSpeed;
  private MOScalar dmsCurrentSpeedLimit;
  private MOScalar<Counter32> watchdogFailureCount;
  private MOScalar<Integer32> dmsStatDoorOpen;
  private MOScalar<Integer32> shortErrorStatus;
  private MOScalar<Integer32> pixelFailureTableNumRows;
  private EnumeratedScalar pixelTestActivation;
  private MOScalar<OctetString> lampFailureStuckOn;
  private MOScalar<OctetString> lampFailureStuckOff;
  private EnumeratedScalar lampTestActivation;
  private MOScalar<OctetString> fanFailures;
  private EnumeratedScalar fanTestActivation;
  private MOScalar<Integer32> controllerErrorStatus;
  private MOScalar<OctetString> dmsPowerFailureStatusMap;
  private MOScalar<Integer32> dmsPowerNumRows;
  private MOScalar<OctetString> dmsClimateCtrlStatusMap;
  private MOScalar<Integer32> dmsClimateCtrlNumRows;
  private MOScalar<Integer32> dmsPixelFailureTestRows;
  private MOScalar<Integer32> dmsPixelFailureMessageRows;
  private MOScalar<Integer32> dmsLampNumRows;
  private MOScalar<OctetString> dmsDrumStatusMap;
  private MOScalar<Integer32> dmsDrumNumRows;
  private MOScalar<OctetString> dmsLightSensorStatusMap;
  private MOScalar<Integer32> dmsLightSensorNumRows;
  private MOScalar<OctetString> dmsHumiditySensorStatusMap;
  private MOScalar<Integer32> dmsHumiditySensorNumRows;
  private MOScalar<OctetString> dmsTempSensorStatusMap;
  private MOScalar<Integer32> dmsTempSensorNumRows;
  private MOScalar<Integer32> dmsTempSensorHighestCriticalTempThreshold;
  private MOScalar<Integer32> dmsTempSensorLowestCriticalTempThreshold;
  private MOScalar<Integer32> signVolts;
  private MOScalar lowFuelThreshold;
  private MOScalar<Integer32> fuelLevel;
  private MOScalar<Integer32> engineRPM;
  private MOScalar<Integer32> lineVolts;
  private MOScalar<Integer32> powerSource;
  private MOScalar<Integer32> tempMinCtrlCabinet;
  private MOScalar<Integer32> tempMaxCtrlCabinet;
  private MOScalar<Integer32> tempMinAmbient;
  private MOScalar<Integer32> tempMaxAmbient;
  private MOScalar<Integer32> tempMinSignHousing;
  private MOScalar<Integer32> tempMaxSignHousing;
  private MOScalar<OctetString> tempSensorWarningMap;
  private MOScalar<OctetString> tempSensorCriticalTempMap;
  private MOScalar<Integer32> dmsGraphicMaxEntries;
  private MOScalar<Integer32> dmsGraphicNumEntries;
  private MOScalar<Integer32> dmsGraphicMaxSize;
  private MOScalar<Counter32> availableGraphicMemory;
  private MOScalar<Integer32> dmsGraphicBlockSize;

  // Tables
  public static final OID oidFontEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,3,2,1 });

  // Index OID definitions
  public static final OID oidFontIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,3,2,1,1 });

  // Column TC definitions for fontEntry:
  public static final String tcModuleRfc1213Mib = "RFC1213-MIB";
  public static final String tcDefDisplayString = "DisplayString";
    
  // Column sub-identifier definitions for fontEntry:
  public static final int colFontIndex = 1;
  public static final int colFontNumber = 2;
  public static final int colFontName = 3;
  public static final int colFontHeight = 4;
  public static final int colFontCharSpacing = 5;
  public static final int colFontLineSpacing = 6;
  public static final int colFontVersionID = 7;
  public static final int colFontStatus = 8;

  // Column index definitions for fontEntry:
  public static final int idxFontIndex = 0;
  public static final int idxFontNumber = 1;
  public static final int idxFontName = 2;
  public static final int idxFontHeight = 3;
  public static final int idxFontCharSpacing = 4;
  public static final int idxFontLineSpacing = 5;
  public static final int idxFontVersionID = 6;
  public static final int idxFontStatus = 7;

  private MOTableSubIndex[] fontEntryIndexes;
  private MOTableIndex fontEntryIndex;
  
  private MOTable<FontEntryRow,
                  MOColumn,
                  MOTableModel<FontEntryRow>> fontEntry;
  private MOTableModel<FontEntryRow> fontEntryModel;
  public static final OID oidCharacterEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,3,4,1 });

  // Index OID definitions
  //public static final OID oidFontIndex =
  //  new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,3,2,1,1 });
  public static final OID oidCharacterNumber =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,3,4,1,1 });

  // Column TC definitions for characterEntry:
    
  // Column sub-identifier definitions for characterEntry:
  public static final int colCharacterNumber = 1;
  public static final int colCharacterWidth = 2;
  public static final int colCharacterBitmap = 3;

  // Column index definitions for characterEntry:
  public static final int idxCharacterNumber = 0;
  public static final int idxCharacterWidth = 1;
  public static final int idxCharacterBitmap = 2;

  private MOTableSubIndex[] characterEntryIndexes;
  private MOTableIndex characterEntryIndex;
  
  private MOTable<CharacterEntryRow,
                  MOColumn,
                  MOTableModel<CharacterEntryRow>> characterEntry;
  private MOTableModel<CharacterEntryRow> characterEntryModel;
  public static final OID oidDmsMessageEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,8,1 });

  // Index OID definitions
  public static final OID oidDmsMessageMemoryType =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,8,1,1 });
  public static final OID oidDmsMessageNumber =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,5,8,1,2 });

  // Column TC definitions for dmsMessageEntry:
  public static final String tcModuleNtcip80042008 = "NTCIP8004-2008";
  public static final String tcDefOwnerString = "OwnerString";
    
  // Column sub-identifier definitions for dmsMessageEntry:
  public static final int colDmsMessageMemoryType = 1;
  public static final int colDmsMessageNumber = 2;
  public static final int colDmsMessageMultiString = 3;
  public static final int colDmsMessageOwner = 4;
  public static final int colDmsMessageCRC = 5;
  public static final int colDmsMessageBeacon = 6;
  public static final int colDmsMessagePixelService = 7;
  public static final int colDmsMessageRunTimePriority = 8;
  public static final int colDmsMessageStatus = 9;

  // Column index definitions for dmsMessageEntry:
  public static final int idxDmsMessageMemoryType = 0;
  public static final int idxDmsMessageNumber = 1;
  public static final int idxDmsMessageMultiString = 2;
  public static final int idxDmsMessageOwner = 3;
  public static final int idxDmsMessageCRC = 4;
  public static final int idxDmsMessageBeacon = 5;
  public static final int idxDmsMessagePixelService = 6;
  public static final int idxDmsMessageRunTimePriority = 7;
  public static final int idxDmsMessageStatus = 8;

  private MOTableSubIndex[] dmsMessageEntryIndexes;
  private MOTableIndex dmsMessageEntryIndex;
  
  private MOTable<DmsMessageEntryRow,
                  MOColumn,
                  MOTableModel<DmsMessageEntryRow>> dmsMessageEntry;
  private MOTableModel<DmsMessageEntryRow> dmsMessageEntryModel;
  public static final OID oidDmsActionEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,8,2,1 });

  // Index OID definitions
  public static final OID oidDmsActionIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,8,2,1,1 });

  // Column TC definitions for dmsActionEntry:
  public static final String tcModuleNtcip12032005 = "NTCIP1203-2005";
  public static final String tcDefMessageIDCode = "MessageIDCode";
    
  // Column sub-identifier definitions for dmsActionEntry:
  public static final int colDmsActionIndex = 1;
  public static final int colDmsActionMsgCode = 2;

  // Column index definitions for dmsActionEntry:
  public static final int idxDmsActionIndex = 0;
  public static final int idxDmsActionMsgCode = 1;

  private MOTableSubIndex[] dmsActionEntryIndexes;
  private MOTableIndex dmsActionEntryIndex;
  
  private MOTable<DmsActionEntryRow,
                  MOColumn,
                  MOTableModel<DmsActionEntryRow>> dmsActionEntry;
  private MOTableModel<DmsActionEntryRow> dmsActionEntryModel;
  public static final OID oidStatMultiFieldEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,2,1 });

  // Index OID definitions
  public static final OID oidStatMultiFieldIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,2,1,1 });

  // Column TC definitions for statMultiFieldEntry:
    
  // Column sub-identifier definitions for statMultiFieldEntry:
  public static final int colStatMultiFieldIndex = 1;
  public static final int colStatMultiFieldCode = 2;
  public static final int colStatMultiCurrentFieldValue = 3;

  // Column index definitions for statMultiFieldEntry:
  public static final int idxStatMultiFieldIndex = 0;
  public static final int idxStatMultiFieldCode = 1;
  public static final int idxStatMultiCurrentFieldValue = 2;

  private MOTableSubIndex[] statMultiFieldEntryIndexes;
  private MOTableIndex statMultiFieldEntryIndex;
  
  private MOTable<StatMultiFieldEntryRow,
                  MOColumn,
                  MOTableModel<StatMultiFieldEntryRow>> statMultiFieldEntry;
  private MOTableModel<StatMultiFieldEntryRow> statMultiFieldEntryModel;
  public static final OID oidPixelFailureEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,3,1 });

  // Index OID definitions
  public static final OID oidPixelFailureDetectionType =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,3,1,1 });
  public static final OID oidPixelFailureIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,3,1,2 });

  // Column TC definitions for pixelFailureEntry:
    
  // Column sub-identifier definitions for pixelFailureEntry:
  public static final int colPixelFailureDetectionType = 1;
  public static final int colPixelFailureIndex = 2;
  public static final int colPixelFailureXLocation = 3;
  public static final int colPixelFailureYLocation = 4;
  public static final int colPixelFailureStatus = 5;

  // Column index definitions for pixelFailureEntry:
  public static final int idxPixelFailureDetectionType = 0;
  public static final int idxPixelFailureIndex = 1;
  public static final int idxPixelFailureXLocation = 2;
  public static final int idxPixelFailureYLocation = 3;
  public static final int idxPixelFailureStatus = 4;

  private MOTableSubIndex[] pixelFailureEntryIndexes;
  private MOTableIndex pixelFailureEntryIndex;
  
  private MOTable<PixelFailureEntryRow,
                  MOColumn,
                  MOTableModel<PixelFailureEntryRow>> pixelFailureEntry;
  private MOTableModel<PixelFailureEntryRow> pixelFailureEntryModel;
  public static final OID oidDmsPowerStatusEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,13,1 });

  // Index OID definitions
  public static final OID oidDmsPowerIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,13,1,1 });

  // Column TC definitions for dmsPowerStatusEntry:
    
  // Column sub-identifier definitions for dmsPowerStatusEntry:
  public static final int colDmsPowerIndex = 1;
  public static final int colDmsPowerDescription = 2;
  public static final int colDmsPowerMfrStatus = 3;
  public static final int colDmsPowerStatus = 4;
  public static final int colDmsPowerVoltage = 5;
  public static final int colDmsPowerType = 6;

  // Column index definitions for dmsPowerStatusEntry:
  public static final int idxDmsPowerIndex = 0;
  public static final int idxDmsPowerDescription = 1;
  public static final int idxDmsPowerMfrStatus = 2;
  public static final int idxDmsPowerStatus = 3;
  public static final int idxDmsPowerVoltage = 4;
  public static final int idxDmsPowerType = 5;

  private MOTableSubIndex[] dmsPowerStatusEntryIndexes;
  private MOTableIndex dmsPowerStatusEntryIndex;
  
  private MOTable<DmsPowerStatusEntryRow,
                  MOColumn,
                  MOTableModel<DmsPowerStatusEntryRow>> dmsPowerStatusEntry;
  private MOTableModel<DmsPowerStatusEntryRow> dmsPowerStatusEntryModel;
  public static final OID oidDmsClimateCtrlStatusEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,17,1 });

  // Index OID definitions
  public static final OID oidDmsClimateCtrlIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,17,1,1 });

  // Column TC definitions for dmsClimateCtrlStatusEntry:
    
  // Column sub-identifier definitions for dmsClimateCtrlStatusEntry:
  public static final int colDmsClimateCtrlIndex = 1;
  public static final int colDmsClimateCtrlDescription = 2;
  public static final int colDmsClimateCtrlMfrStatus = 3;
  public static final int colDmsClimateCtrlErrorStatus = 4;
  public static final int colDmsClimateCtrlOnStatus = 5;
  public static final int colDmsClimateCtrlTestActivation = 6;
  public static final int colDmsClimateCtrlAbortReason = 7;
  public static final int colDmsClimateCtrlType = 8;

  // Column index definitions for dmsClimateCtrlStatusEntry:
  public static final int idxDmsClimateCtrlIndex = 0;
  public static final int idxDmsClimateCtrlDescription = 1;
  public static final int idxDmsClimateCtrlMfrStatus = 2;
  public static final int idxDmsClimateCtrlErrorStatus = 3;
  public static final int idxDmsClimateCtrlOnStatus = 4;
  public static final int idxDmsClimateCtrlTestActivation = 5;
  public static final int idxDmsClimateCtrlAbortReason = 6;
  public static final int idxDmsClimateCtrlType = 7;

  private MOTableSubIndex[] dmsClimateCtrlStatusEntryIndexes;
  private MOTableIndex dmsClimateCtrlStatusEntryIndex;
  
  private MOTable<DmsClimateCtrlStatusEntryRow,
                  MOColumn,
                  MOTableModel<DmsClimateCtrlStatusEntryRow>> dmsClimateCtrlStatusEntry;
  private MOTableModel<DmsClimateCtrlStatusEntryRow> dmsClimateCtrlStatusEntryModel;
  public static final OID oidPixelStatusEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,18,1 });

  // Index OID definitions
  public static final OID oidDmsPixelStatusIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,18,1,1 });

  // Column TC definitions for pixelStatusEntry:
    
  // Column sub-identifier definitions for pixelStatusEntry:
  public static final int colDmsPixelStatusIndex = 1;
  public static final int colDmsPixelStatus = 2;

  // Column index definitions for pixelStatusEntry:
  public static final int idxDmsPixelStatusIndex = 0;
  public static final int idxDmsPixelStatus = 1;

  private MOTableSubIndex[] pixelStatusEntryIndexes;
  private MOTableIndex pixelStatusEntryIndex;
  
  private MOTable<PixelStatusEntryRow,
                  MOColumn,
                  MOTableModel<PixelStatusEntryRow>> pixelStatusEntry;
  private MOTableModel<PixelStatusEntryRow> pixelStatusEntryModel;
  public static final OID oidDmsLampStatusEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,24,1 });

  // Index OID definitions
  public static final OID oidDmsLampIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,24,1,1 });

  // Column TC definitions for dmsLampStatusEntry:
    
  // Column sub-identifier definitions for dmsLampStatusEntry:
  public static final int colDmsLampIndex = 1;
  public static final int colDmsLampDescription = 2;
  public static final int colDmsLampMfrStatus = 3;
  public static final int colDmsLampStatus = 4;
  public static final int colDmsLampPixelTop = 5;
  public static final int colDmsLampPixelLeft = 6;
  public static final int colDmsLampPixelBottom = 7;
  public static final int colDmsLampPixelRight = 8;

  // Column index definitions for dmsLampStatusEntry:
  public static final int idxDmsLampIndex = 0;
  public static final int idxDmsLampDescription = 1;
  public static final int idxDmsLampMfrStatus = 2;
  public static final int idxDmsLampStatus = 3;
  public static final int idxDmsLampPixelTop = 4;
  public static final int idxDmsLampPixelLeft = 5;
  public static final int idxDmsLampPixelBottom = 6;
  public static final int idxDmsLampPixelRight = 7;

  private MOTableSubIndex[] dmsLampStatusEntryIndexes;
  private MOTableIndex dmsLampStatusEntryIndex;
  
  private MOTable<DmsLampStatusEntryRow,
                  MOColumn,
                  MOTableModel<DmsLampStatusEntryRow>> dmsLampStatusEntry;
  private MOTableModel<DmsLampStatusEntryRow> dmsLampStatusEntryModel;
  public static final OID oidDmsDrumStatusEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,27,1 });

  // Index OID definitions
  public static final OID oidDmsDrumIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,27,1,1 });

  // Column TC definitions for dmsDrumStatusEntry:
    
  // Column sub-identifier definitions for dmsDrumStatusEntry:
  public static final int colDmsDrumIndex = 1;
  public static final int colDmsDrumDescription = 2;
  public static final int colDmsDrumMfrStatus = 3;
  public static final int colDmsDrumStatus = 4;

  // Column index definitions for dmsDrumStatusEntry:
  public static final int idxDmsDrumIndex = 0;
  public static final int idxDmsDrumDescription = 1;
  public static final int idxDmsDrumMfrStatus = 2;
  public static final int idxDmsDrumStatus = 3;

  private MOTableSubIndex[] dmsDrumStatusEntryIndexes;
  private MOTableIndex dmsDrumStatusEntryIndex;
  
  private MOTable<DmsDrumStatusEntryRow,
                  MOColumn,
                  MOTableModel<DmsDrumStatusEntryRow>> dmsDrumStatusEntry;
  private MOTableModel<DmsDrumStatusEntryRow> dmsDrumStatusEntryModel;
  public static final OID oidDmsLightSensorStatusEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,30,1 });

  // Index OID definitions
  public static final OID oidDmsLightSensorIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,30,1,1 });

  // Column TC definitions for dmsLightSensorStatusEntry:
    
  // Column sub-identifier definitions for dmsLightSensorStatusEntry:
  public static final int colDmsLightSensorIndex = 1;
  public static final int colDmsLightSensorDescription = 2;
  public static final int colDmsLightSensorCurrentReading = 3;
  public static final int colDmsLightSensorStatus = 4;

  // Column index definitions for dmsLightSensorStatusEntry:
  public static final int idxDmsLightSensorIndex = 0;
  public static final int idxDmsLightSensorDescription = 1;
  public static final int idxDmsLightSensorCurrentReading = 2;
  public static final int idxDmsLightSensorStatus = 3;

  private MOTableSubIndex[] dmsLightSensorStatusEntryIndexes;
  private MOTableIndex dmsLightSensorStatusEntryIndex;
  
  private MOTable<DmsLightSensorStatusEntryRow,
                  MOColumn,
                  MOTableModel<DmsLightSensorStatusEntryRow>> dmsLightSensorStatusEntry;
  private MOTableModel<DmsLightSensorStatusEntryRow> dmsLightSensorStatusEntryModel;
  public static final OID oidDmsHumiditySensorStatusEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,33,1 });

  // Index OID definitions
  public static final OID oidDmsHumiditySensorIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,33,1,1 });

  // Column TC definitions for dmsHumiditySensorStatusEntry:
    
  // Column sub-identifier definitions for dmsHumiditySensorStatusEntry:
  public static final int colDmsHumiditySensorIndex = 1;
  public static final int colDmsHumiditySensorDescription = 2;
  public static final int colDmsHumiditySensorCurrentReading = 3;
  public static final int colDmsHumiditySensorStatus = 4;

  // Column index definitions for dmsHumiditySensorStatusEntry:
  public static final int idxDmsHumiditySensorIndex = 0;
  public static final int idxDmsHumiditySensorDescription = 1;
  public static final int idxDmsHumiditySensorCurrentReading = 2;
  public static final int idxDmsHumiditySensorStatus = 3;

  private MOTableSubIndex[] dmsHumiditySensorStatusEntryIndexes;
  private MOTableIndex dmsHumiditySensorStatusEntryIndex;
  
  private MOTable<DmsHumiditySensorStatusEntryRow,
                  MOColumn,
                  MOTableModel<DmsHumiditySensorStatusEntryRow>> dmsHumiditySensorStatusEntry;
  private MOTableModel<DmsHumiditySensorStatusEntryRow> dmsHumiditySensorStatusEntryModel;
  public static final OID oidDmsTempSensorStatusEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,36,1 });

  // Index OID definitions
  public static final OID oidDmsTempSensorIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,9,7,36,1,1 });

  // Column TC definitions for dmsTempSensorStatusEntry:
    
  // Column sub-identifier definitions for dmsTempSensorStatusEntry:
  public static final int colDmsTempSensorIndex = 1;
  public static final int colDmsTempSensorDescription = 2;
  public static final int colDmsTempSensorCurrentReading = 3;
  public static final int colDmsTempSensorHighWarningTemperature = 4;
  public static final int colDmsTempSensorLowWarningTemperature = 5;
  public static final int colDmsTempSensorHighCriticalTemperature = 6;
  public static final int colDmsTempSensorLowCriticalTemperature = 7;
  public static final int colDmsTempSensorStatus = 8;

  // Column index definitions for dmsTempSensorStatusEntry:
  public static final int idxDmsTempSensorIndex = 0;
  public static final int idxDmsTempSensorDescription = 1;
  public static final int idxDmsTempSensorCurrentReading = 2;
  public static final int idxDmsTempSensorHighWarningTemperature = 3;
  public static final int idxDmsTempSensorLowWarningTemperature = 4;
  public static final int idxDmsTempSensorHighCriticalTemperature = 5;
  public static final int idxDmsTempSensorLowCriticalTemperature = 6;
  public static final int idxDmsTempSensorStatus = 7;

  private MOTableSubIndex[] dmsTempSensorStatusEntryIndexes;
  private MOTableIndex dmsTempSensorStatusEntryIndex;
  
  private MOTable<DmsTempSensorStatusEntryRow,
                  MOColumn,
                  MOTableModel<DmsTempSensorStatusEntryRow>> dmsTempSensorStatusEntry;
  private MOTableModel<DmsTempSensorStatusEntryRow> dmsTempSensorStatusEntryModel;
  public static final OID oidDmsGraphicEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,6,1 });

  // Index OID definitions
  public static final OID oidDmsGraphicIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,6,1,1 });

  // Column TC definitions for dmsGraphicEntry:
    
  // Column sub-identifier definitions for dmsGraphicEntry:
  public static final int colDmsGraphicIndex = 1;
  public static final int colDmsGraphicNumber = 2;
  public static final int colDmsGraphicName = 3;
  public static final int colDmsGraphicHeight = 4;
  public static final int colDmsGraphicWidth = 5;
  public static final int colDmsGraphicType = 6;
  public static final int colDmsGraphicID = 7;
  public static final int colDmsGraphicTransparentEnabled = 8;
  public static final int colDmsGraphicTransparentColor = 9;
  public static final int colDmsGraphicStatus = 10;

  // Column index definitions for dmsGraphicEntry:
  public static final int idxDmsGraphicIndex = 0;
  public static final int idxDmsGraphicNumber = 1;
  public static final int idxDmsGraphicName = 2;
  public static final int idxDmsGraphicHeight = 3;
  public static final int idxDmsGraphicWidth = 4;
  public static final int idxDmsGraphicType = 5;
  public static final int idxDmsGraphicID = 6;
  public static final int idxDmsGraphicTransparentEnabled = 7;
  public static final int idxDmsGraphicTransparentColor = 8;
  public static final int idxDmsGraphicStatus = 9;

  private MOTableSubIndex[] dmsGraphicEntryIndexes;
  private MOTableIndex dmsGraphicEntryIndex;
  
  private MOTable<DmsGraphicEntryRow,
                  MOColumn,
                  MOTableModel<DmsGraphicEntryRow>> dmsGraphicEntry;
  private MOTableModel<DmsGraphicEntryRow> dmsGraphicEntryModel;
  public static final OID oidDmsGraphicBitmapEntry = 
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,7,1 });

  // Index OID definitions
  public static final OID oidDmsGraphicBitmapIndex =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,7,1,1 });
  public static final OID oidDmsGraphicBlockNumber =
    new OID(new int[] { 1,3,6,1,4,1,1206,4,2,3,10,7,1,2 });

  // Column TC definitions for dmsGraphicBitmapEntry:
    
  // Column sub-identifier definitions for dmsGraphicBitmapEntry:
  public static final int colDmsGraphicBitmapIndex = 1;
  public static final int colDmsGraphicBlockNumber = 2;
  public static final int colDmsGraphicBlockBitmap = 3;

  // Column index definitions for dmsGraphicBitmapEntry:
  public static final int idxDmsGraphicBitmapIndex = 0;
  public static final int idxDmsGraphicBlockNumber = 1;
  public static final int idxDmsGraphicBlockBitmap = 2;

  private MOTableSubIndex[] dmsGraphicBitmapEntryIndexes;
  private MOTableIndex dmsGraphicBitmapEntryIndex;
  
  private MOTable<DmsGraphicBitmapEntryRow,
                  MOColumn,
                  MOTableModel<DmsGraphicBitmapEntryRow>> dmsGraphicBitmapEntry;
  private MOTableModel<DmsGraphicBitmapEntryRow> dmsGraphicBitmapEntryModel;


//--AgentGen BEGIN=_MEMBERS
//--AgentGen END

  /**
   * Constructs a Ntcip12032005 instance without actually creating its
   * <code>ManagedObject</code> instances. This has to be done in a
   * sub-class constructor or after construction by calling 
   * {@link #createMO(MOFactory moFactory)}. 
   */
  protected Ntcip12032005() {
//--AgentGen BEGIN=_DEFAULTCONSTRUCTOR
//--AgentGen END
  }

  /**
   * Constructs a Ntcip12032005 instance and actually creates its
   * <code>ManagedObject</code> instances using the supplied 
   * <code>MOFactory</code> (by calling
   * {@link #createMO(MOFactory moFactory)}).
   * @param moFactory
   *    the <code>MOFactory</code> to be used to create the
   *    managed objects for this module.
   */
  public Ntcip12032005(MOFactory moFactory) {
  	this();
    //--AgentGen BEGIN=_FACTORYCONSTRUCTOR::factoryWrapper
    //--AgentGen END
  	this.moFactory = moFactory;
    createMO(moFactory);
//--AgentGen BEGIN=_FACTORYCONSTRUCTOR
//--AgentGen END
  }

//--AgentGen BEGIN=_CONSTRUCTORS
//--AgentGen END

  /**
   * Create the ManagedObjects defined for this MIB module
   * using the specified {@link MOFactory}.
   * @param moFactory
   *    the <code>MOFactory</code> instance to use for object 
   *    creation.
   */
  protected void createMO(MOFactory moFactory) {
    addTCsToFactory(moFactory);
    dmsSignAccess = 
      moFactory.createScalar(oidDmsSignAccess,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsSignType = 
      moFactory.createScalar(oidDmsSignType,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsSignHeight = 
      moFactory.createScalar(oidDmsSignHeight,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsSignWidth = 
      moFactory.createScalar(oidDmsSignWidth,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsHorizontalBorder = 
      moFactory.createScalar(oidDmsHorizontalBorder,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsVerticalBorder = 
      moFactory.createScalar(oidDmsVerticalBorder,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsLegend = 
      moFactory.createScalar(oidDmsLegend,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsBeaconType = 
      moFactory.createScalar(oidDmsBeaconType,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsSignTechnology = 
      moFactory.createScalar(oidDmsSignTechnology,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    vmsCharacterHeightPixels = 
      moFactory.createScalar(oidVmsCharacterHeightPixels,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    vmsCharacterWidthPixels = 
      moFactory.createScalar(oidVmsCharacterWidthPixels,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    vmsSignHeightPixels = new VmsSignHeightPixels(oidVmsSignHeightPixels,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    vmsSignWidthPixels = 
      moFactory.createScalar(oidVmsSignWidthPixels,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    vmsHorizontalPitch = 
      moFactory.createScalar(oidVmsHorizontalPitch,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    vmsVerticalPitch = 
      moFactory.createScalar(oidVmsVerticalPitch,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    monochromeColor = 
      moFactory.createScalar(oidMonochromeColor,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    numFonts = 
      moFactory.createScalar(oidNumFonts,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    maxFontCharacters = 
      moFactory.createScalar(oidMaxFontCharacters,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    fontMaxCharacterSize = 
      moFactory.createScalar(oidFontMaxCharacterSize,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    defaultBackgroundColor = 
      new DefaultBackgroundColor(oidDefaultBackgroundColor, 
                                 moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultBackgroundColor.addMOValueValidationListener(new DefaultBackgroundColorValidator());
    defaultForegroundColor = 
      new DefaultForegroundColor(oidDefaultForegroundColor, 
                                 moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultForegroundColor.addMOValueValidationListener(new DefaultForegroundColorValidator());
    defaultFlashOn = 
      new DefaultFlashOn(oidDefaultFlashOn, 
                         moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultFlashOn.addMOValueValidationListener(new DefaultFlashOnValidator());
    defaultFlashOff = 
      new DefaultFlashOff(oidDefaultFlashOff, 
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultFlashOff.addMOValueValidationListener(new DefaultFlashOffValidator());
    defaultFont = 
      new DefaultFont(oidDefaultFont, 
                      moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultFont.addMOValueValidationListener(new DefaultFontValidator());
    defaultJustificationLine = 
      new DefaultJustificationLine(oidDefaultJustificationLine, 
                                   moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultJustificationLine.addMOValueValidationListener(new DefaultJustificationLineValidator());
    defaultJustificationPage = 
      new DefaultJustificationPage(oidDefaultJustificationPage, 
                                   moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultJustificationPage.addMOValueValidationListener(new DefaultJustificationPageValidator());
    defaultPageOnTime = 
      new DefaultPageOnTime(oidDefaultPageOnTime, 
                            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultPageOnTime.addMOValueValidationListener(new DefaultPageOnTimeValidator());
    defaultPageOffTime = 
      new DefaultPageOffTime(oidDefaultPageOffTime, 
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultPageOffTime.addMOValueValidationListener(new DefaultPageOffTimeValidator());
    defaultCharacterSet = 
      new DefaultCharacterSet(oidDefaultCharacterSet, 
                              moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultCharacterSet.addMOValueValidationListener(new DefaultCharacterSetValidator());
    dmsColorScheme = 
      moFactory.createScalar(oidDmsColorScheme,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32(1));
    defaultBackgroundRGB = 
      new DefaultBackgroundRGB(oidDefaultBackgroundRGB, 
                               moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultBackgroundRGB.addMOValueValidationListener(new DefaultBackgroundRGBValidator());
    defaultForegroundRGB = 
      new DefaultForegroundRGB(oidDefaultForegroundRGB, 
                               moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    defaultForegroundRGB.addMOValueValidationListener(new DefaultForegroundRGBValidator());
    dmsSupportedMultiTags = 
      moFactory.createScalar(oidDmsSupportedMultiTags,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    dmsMaxNumberPages = 
      moFactory.createScalar(oidDmsMaxNumberPages,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsMaxMultiStringLength = 
      moFactory.createScalar(oidDmsMaxMultiStringLength,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    defaultFlashOnActivate = 
      moFactory.createScalar(oidDefaultFlashOnActivate,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    defaultFlashOffActivate = 
      moFactory.createScalar(oidDefaultFlashOffActivate,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    defaultFontActivate = 
      moFactory.createScalar(oidDefaultFontActivate,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    defaultJustificationLineActivate = 
      moFactory.createScalar(oidDefaultJustificationLineActivate,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    defaultJustificationPageActivate = 
      moFactory.createScalar(oidDefaultJustificationPageActivate,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    defaultPageOnTimeActivate = 
      moFactory.createScalar(oidDefaultPageOnTimeActivate,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    defaultPageOffTimeActivate = 
      moFactory.createScalar(oidDefaultPageOffTimeActivate,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    defaultBackgroundRGBActivate = 
      moFactory.createScalar(oidDefaultBackgroundRGBActivate,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    defaultForegroundRGBActivate = 
      moFactory.createScalar(oidDefaultForegroundRGBActivate,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    dmsNumPermanentMsg = 
      moFactory.createScalar(oidDmsNumPermanentMsg,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsNumChangeableMsg = 
      moFactory.createScalar(oidDmsNumChangeableMsg,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsMaxChangeableMsg = 
      moFactory.createScalar(oidDmsMaxChangeableMsg,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsFreeChangeableMemory = 
      moFactory.createScalar(oidDmsFreeChangeableMemory,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsNumVolatileMsg = 
      moFactory.createScalar(oidDmsNumVolatileMsg,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsMaxVolatileMsg = 
      moFactory.createScalar(oidDmsMaxVolatileMsg,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsFreeVolatileMemory = 
      moFactory.createScalar(oidDmsFreeVolatileMemory,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsValidateMessageError = 
      moFactory.createScalar(oidDmsValidateMessageError,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsControlMode = 
      new DmsControlMode(oidDmsControlMode, 
                         moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsControlMode.addMOValueValidationListener(new DmsControlModeValidator());
    dmsSWReset = 
      new DmsSWReset(oidDmsSWReset, 
                     moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsSWReset.addMOValueValidationListener(new DmsSWResetValidator());
    dmsActivateMessage = 
      new DmsActivateMessage(oidDmsActivateMessage, 
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsActivateMessage.addMOValueValidationListener(new DmsActivateMessageValidator());
    dmsMessageTimeRemaining = 
      new DmsMessageTimeRemaining(oidDmsMessageTimeRemaining, 
                                  moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsMessageTimeRemaining.addMOValueValidationListener(new DmsMessageTimeRemainingValidator());
    dmsMsgTableSource = 
      moFactory.createScalar(oidDmsMsgTableSource,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                              null,
                             TC_MODULE_NTCIP1203_2005, TC_MESSAGEIDCODE);
    dmsMsgRequesterID = 
      moFactory.createScalar(oidDmsMsgRequesterID,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new IpAddress());
    dmsMsgSourceMode = 
      moFactory.createScalar(oidDmsMsgSourceMode,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsShortPowerRecoveryMessage = 
      new DmsShortPowerRecoveryMessage(oidDmsShortPowerRecoveryMessage, 
                                       moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsShortPowerRecoveryMessage.addMOValueValidationListener(new DmsShortPowerRecoveryMessageValidator());
    dmsLongPowerRecoveryMessage = 
      new DmsLongPowerRecoveryMessage(oidDmsLongPowerRecoveryMessage, 
                                      moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsLongPowerRecoveryMessage.addMOValueValidationListener(new DmsLongPowerRecoveryMessageValidator());
    dmsShortPowerLossTime = 
      new DmsShortPowerLossTime(oidDmsShortPowerLossTime, 
                                moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsShortPowerLossTime.addMOValueValidationListener(new DmsShortPowerLossTimeValidator());
    dmsResetMessage = 
      new DmsResetMessage(oidDmsResetMessage, 
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsResetMessage.addMOValueValidationListener(new DmsResetMessageValidator());
    dmsCommunicationsLossMessage = 
      new DmsCommunicationsLossMessage(oidDmsCommunicationsLossMessage, 
                                       moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsCommunicationsLossMessage.addMOValueValidationListener(new DmsCommunicationsLossMessageValidator());
    dmsTimeCommLoss = 
      new DmsTimeCommLoss(oidDmsTimeCommLoss, 
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsTimeCommLoss.addMOValueValidationListener(new DmsTimeCommLossValidator());
    dmsPowerLossMessage = 
      new DmsPowerLossMessage(oidDmsPowerLossMessage, 
                              moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsPowerLossMessage.addMOValueValidationListener(new DmsPowerLossMessageValidator());
    dmsEndDurationMessage = 
      new DmsEndDurationMessage(oidDmsEndDurationMessage, 
                                moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsEndDurationMessage.addMOValueValidationListener(new DmsEndDurationMessageValidator());
    dmsMemoryMgmt = 
      new DmsMemoryMgmt(oidDmsMemoryMgmt, 
                        moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsMemoryMgmt.addMOValueValidationListener(new DmsMemoryMgmtValidator());
    dmsActivateMsgError = 
      moFactory.createScalar(oidDmsActivateMsgError,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsMultiSyntaxError = 
      moFactory.createScalar(oidDmsMultiSyntaxError,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsMultiSyntaxErrorPosition = 
      moFactory.createScalar(oidDmsMultiSyntaxErrorPosition,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsMultiOtherErrorDescription = 
      moFactory.createScalar(oidDmsMultiOtherErrorDescription,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                              null,
                             TC_MODULE_RFC1213_MIB, TC_DISPLAYSTRING);
    vmsPixelServiceDuration = 
      new VmsPixelServiceDuration(oidVmsPixelServiceDuration, 
                                  moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    vmsPixelServiceDuration.addMOValueValidationListener(new VmsPixelServiceDurationValidator());
    vmsPixelServiceFrequency = 
      new VmsPixelServiceFrequency(oidVmsPixelServiceFrequency, 
                                   moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    vmsPixelServiceFrequency.addMOValueValidationListener(new VmsPixelServiceFrequencyValidator());
    vmsPixelServiceTime = 
      new VmsPixelServiceTime(oidVmsPixelServiceTime, 
                              moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    vmsPixelServiceTime.addMOValueValidationListener(new VmsPixelServiceTimeValidator());
    dmsActivateErrorMsgCode = 
      moFactory.createScalar(oidDmsActivateErrorMsgCode,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                              null,
                             TC_MODULE_NTCIP1203_2005, TC_MESSAGEACTIVATIONCODE);
    dmsActivateMessageState = 
      moFactory.createScalar(oidDmsActivateMessageState,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsIllumControl = 
      new DmsIllumControl(oidDmsIllumControl, 
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsIllumControl.addMOValueValidationListener(new DmsIllumControlValidator());
    dmsIllumMaxPhotocellLevel = 
      moFactory.createScalar(oidDmsIllumMaxPhotocellLevel,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsIllumPhotocellLevelStatus = 
      moFactory.createScalar(oidDmsIllumPhotocellLevelStatus,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsIllumNumBrightLevels = 
      moFactory.createScalar(oidDmsIllumNumBrightLevels,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsIllumBrightLevelStatus = 
      moFactory.createScalar(oidDmsIllumBrightLevelStatus,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsIllumManLevel = 
      new DmsIllumManLevel(oidDmsIllumManLevel, 
                           moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsIllumManLevel.addMOValueValidationListener(new DmsIllumManLevelValidator());
    dmsIllumBrightnessValues = 
      new DmsIllumBrightnessValues(oidDmsIllumBrightnessValues, 
                                   moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsIllumBrightnessValues.addMOValueValidationListener(new DmsIllumBrightnessValuesValidator());
    dmsIllumBrightnessValuesError = 
      moFactory.createScalar(oidDmsIllumBrightnessValuesError,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsIllumLightOutputStatus = 
      moFactory.createScalar(oidDmsIllumLightOutputStatus,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    numActionTableEntries = 
      moFactory.createScalar(oidNumActionTableEntries,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    statMultiFieldRows = 
      moFactory.createScalar(oidStatMultiFieldRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsCurrentSpeed = 
      moFactory.createScalar(oidDmsCurrentSpeed,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsCurrentSpeedLimit = 
      new DmsCurrentSpeedLimit(oidDmsCurrentSpeedLimit, 
                               moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    dmsCurrentSpeedLimit.addMOValueValidationListener(new DmsCurrentSpeedLimitValidator());
    watchdogFailureCount = 
      moFactory.createScalar(oidWatchdogFailureCount,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Counter32());
    dmsStatDoorOpen = 
      moFactory.createScalar(oidDmsStatDoorOpen,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    shortErrorStatus = 
      moFactory.createScalar(oidShortErrorStatus,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    pixelFailureTableNumRows = 
      moFactory.createScalar(oidPixelFailureTableNumRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    pixelTestActivation = 
      new PixelTestActivation(oidPixelTestActivation, 
                              moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    pixelTestActivation.addMOValueValidationListener(new PixelTestActivationValidator());
    lampFailureStuckOn = 
      moFactory.createScalar(oidLampFailureStuckOn,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    lampFailureStuckOff = 
      moFactory.createScalar(oidLampFailureStuckOff,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    lampTestActivation = 
      new LampTestActivation(oidLampTestActivation, 
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    lampTestActivation.addMOValueValidationListener(new LampTestActivationValidator());
    fanFailures = 
      moFactory.createScalar(oidFanFailures,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    fanTestActivation = 
      new FanTestActivation(oidFanTestActivation, 
                            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    fanTestActivation.addMOValueValidationListener(new FanTestActivationValidator());
    controllerErrorStatus = 
      moFactory.createScalar(oidControllerErrorStatus,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsPowerFailureStatusMap = 
      moFactory.createScalar(oidDmsPowerFailureStatusMap,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    dmsPowerNumRows = 
      moFactory.createScalar(oidDmsPowerNumRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsClimateCtrlStatusMap = 
      moFactory.createScalar(oidDmsClimateCtrlStatusMap,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    dmsClimateCtrlNumRows = 
      moFactory.createScalar(oidDmsClimateCtrlNumRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsPixelFailureTestRows = 
      moFactory.createScalar(oidDmsPixelFailureTestRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsPixelFailureMessageRows = 
      moFactory.createScalar(oidDmsPixelFailureMessageRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsLampNumRows = 
      moFactory.createScalar(oidDmsLampNumRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsDrumStatusMap = 
      moFactory.createScalar(oidDmsDrumStatusMap,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    dmsDrumNumRows = 
      moFactory.createScalar(oidDmsDrumNumRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsLightSensorStatusMap = 
      moFactory.createScalar(oidDmsLightSensorStatusMap,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    dmsLightSensorNumRows = 
      moFactory.createScalar(oidDmsLightSensorNumRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsHumiditySensorStatusMap = 
      moFactory.createScalar(oidDmsHumiditySensorStatusMap,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    dmsHumiditySensorNumRows = 
      moFactory.createScalar(oidDmsHumiditySensorNumRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsTempSensorStatusMap = 
      moFactory.createScalar(oidDmsTempSensorStatusMap,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    dmsTempSensorNumRows = 
      moFactory.createScalar(oidDmsTempSensorNumRows,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsTempSensorHighestCriticalTempThreshold = 
      moFactory.createScalar(oidDmsTempSensorHighestCriticalTempThreshold,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsTempSensorLowestCriticalTempThreshold = 
      moFactory.createScalar(oidDmsTempSensorLowestCriticalTempThreshold,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    signVolts = 
      moFactory.createScalar(oidSignVolts,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    lowFuelThreshold = 
      new LowFuelThreshold(oidLowFuelThreshold, 
                           moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
    lowFuelThreshold.addMOValueValidationListener(new LowFuelThresholdValidator());
    fuelLevel = 
      moFactory.createScalar(oidFuelLevel,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    engineRPM = 
      moFactory.createScalar(oidEngineRPM,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    lineVolts = 
      moFactory.createScalar(oidLineVolts,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    powerSource = 
      moFactory.createScalar(oidPowerSource,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    tempMinCtrlCabinet = 
      moFactory.createScalar(oidTempMinCtrlCabinet,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    tempMaxCtrlCabinet = 
      moFactory.createScalar(oidTempMaxCtrlCabinet,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    tempMinAmbient = 
      moFactory.createScalar(oidTempMinAmbient,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    tempMaxAmbient = 
      moFactory.createScalar(oidTempMaxAmbient,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    tempMinSignHousing = 
      moFactory.createScalar(oidTempMinSignHousing,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    tempMaxSignHousing = 
      moFactory.createScalar(oidTempMaxSignHousing,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    tempSensorWarningMap = 
      moFactory.createScalar(oidTempSensorWarningMap,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    tempSensorCriticalTempMap = 
      moFactory.createScalar(oidTempSensorCriticalTempMap,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new OctetString());
    dmsGraphicMaxEntries = 
      moFactory.createScalar(oidDmsGraphicMaxEntries,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsGraphicNumEntries = 
      moFactory.createScalar(oidDmsGraphicNumEntries,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    dmsGraphicMaxSize = 
      moFactory.createScalar(oidDmsGraphicMaxSize,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    availableGraphicMemory = 
      moFactory.createScalar(oidAvailableGraphicMemory,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Counter32());
    dmsGraphicBlockSize = 
      moFactory.createScalar(oidDmsGraphicBlockSize,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             new Integer32());
    createFontEntry(moFactory);
    createCharacterEntry(moFactory);
    createDmsMessageEntry(moFactory);
    createDmsActionEntry(moFactory);
    createStatMultiFieldEntry(moFactory);
    createPixelFailureEntry(moFactory);
    createDmsPowerStatusEntry(moFactory);
    createDmsClimateCtrlStatusEntry(moFactory);
    createPixelStatusEntry(moFactory);
    createDmsLampStatusEntry(moFactory);
    createDmsDrumStatusEntry(moFactory);
    createDmsLightSensorStatusEntry(moFactory);
    createDmsHumiditySensorStatusEntry(moFactory);
    createDmsTempSensorStatusEntry(moFactory);
    createDmsGraphicEntry(moFactory);
    createDmsGraphicBitmapEntry(moFactory);
  }

  public MOScalar<Integer32> getDmsSignAccess() {
    return dmsSignAccess;
  }
  public MOScalar<Integer32> getDmsSignType() {
    return dmsSignType;
  }
  public MOScalar<Integer32> getDmsSignHeight() {
    return dmsSignHeight;
  }
  public MOScalar<Integer32> getDmsSignWidth() {
    return dmsSignWidth;
  }
  public MOScalar<Integer32> getDmsHorizontalBorder() {
    return dmsHorizontalBorder;
  }
  public MOScalar<Integer32> getDmsVerticalBorder() {
    return dmsVerticalBorder;
  }
  public MOScalar<Integer32> getDmsLegend() {
    return dmsLegend;
  }
  public MOScalar<Integer32> getDmsBeaconType() {
    return dmsBeaconType;
  }
  public MOScalar<Integer32> getDmsSignTechnology() {
    return dmsSignTechnology;
  }
  public MOScalar<Integer32> getVmsCharacterHeightPixels() {
    return vmsCharacterHeightPixels;
  }
  public MOScalar<Integer32> getVmsCharacterWidthPixels() {
    return vmsCharacterWidthPixels;
  }
  public MOScalar<Integer32> getVmsSignHeightPixels() {
    return vmsSignHeightPixels;
  }
  public MOScalar<Integer32> getVmsSignWidthPixels() {
    return vmsSignWidthPixels;
  }
  public MOScalar<Integer32> getVmsHorizontalPitch() {
    return vmsHorizontalPitch;
  }
  public MOScalar<Integer32> getVmsVerticalPitch() {
    return vmsVerticalPitch;
  }
  public MOScalar<OctetString> getMonochromeColor() {
    return monochromeColor;
  }
  public MOScalar<Integer32> getNumFonts() {
    return numFonts;
  }
  public MOScalar<Integer32> getMaxFontCharacters() {
    return maxFontCharacters;
  }
  public MOScalar<Integer32> getFontMaxCharacterSize() {
    return fontMaxCharacterSize;
  }
  public MOScalar getDefaultBackgroundColor() {
    return defaultBackgroundColor;
  }
  public MOScalar getDefaultForegroundColor() {
    return defaultForegroundColor;
  }
  public MOScalar getDefaultFlashOn() {
    return defaultFlashOn;
  }
  public MOScalar getDefaultFlashOff() {
    return defaultFlashOff;
  }
  public MOScalar<Integer32> getDefaultFont() {
    return defaultFont;
  }
  public EnumeratedScalar getDefaultJustificationLine() {
    return defaultJustificationLine;
  }
  public EnumeratedScalar getDefaultJustificationPage() {
    return defaultJustificationPage;
  }
  public MOScalar getDefaultPageOnTime() {
    return defaultPageOnTime;
  }
  public MOScalar getDefaultPageOffTime() {
    return defaultPageOffTime;
  }
  public EnumeratedScalar getDefaultCharacterSet() {
    return defaultCharacterSet;
  }
  public MOScalar<Integer32> getDmsColorScheme() {
    return dmsColorScheme;
  }
  public MOScalar getDefaultBackgroundRGB() {
    return defaultBackgroundRGB;
  }
  public MOScalar getDefaultForegroundRGB() {
    return defaultForegroundRGB;
  }
  public MOScalar<OctetString> getDmsSupportedMultiTags() {
    return dmsSupportedMultiTags;
  }
  public MOScalar<Integer32> getDmsMaxNumberPages() {
    return dmsMaxNumberPages;
  }
  public MOScalar<Integer32> getDmsMaxMultiStringLength() {
    return dmsMaxMultiStringLength;
  }
  public MOScalar<Integer32> getDefaultFlashOnActivate() {
    return defaultFlashOnActivate;
  }
  public MOScalar<Integer32> getDefaultFlashOffActivate() {
    return defaultFlashOffActivate;
  }
  public MOScalar<Integer32> getDefaultFontActivate() {
    return defaultFontActivate;
  }
  public MOScalar<Integer32> getDefaultJustificationLineActivate() {
    return defaultJustificationLineActivate;
  }
  public MOScalar<Integer32> getDefaultJustificationPageActivate() {
    return defaultJustificationPageActivate;
  }
  public MOScalar<Integer32> getDefaultPageOnTimeActivate() {
    return defaultPageOnTimeActivate;
  }
  public MOScalar<Integer32> getDefaultPageOffTimeActivate() {
    return defaultPageOffTimeActivate;
  }
  public MOScalar<OctetString> getDefaultBackgroundRGBActivate() {
    return defaultBackgroundRGBActivate;
  }
  public MOScalar<OctetString> getDefaultForegroundRGBActivate() {
    return defaultForegroundRGBActivate;
  }
  public MOScalar<Integer32> getDmsNumPermanentMsg() {
    return dmsNumPermanentMsg;
  }
  public MOScalar<Integer32> getDmsNumChangeableMsg() {
    return dmsNumChangeableMsg;
  }
  public MOScalar<Integer32> getDmsMaxChangeableMsg() {
    return dmsMaxChangeableMsg;
  }
  public MOScalar<Integer32> getDmsFreeChangeableMemory() {
    return dmsFreeChangeableMemory;
  }
  public MOScalar<Integer32> getDmsNumVolatileMsg() {
    return dmsNumVolatileMsg;
  }
  public MOScalar<Integer32> getDmsMaxVolatileMsg() {
    return dmsMaxVolatileMsg;
  }
  public MOScalar<Integer32> getDmsFreeVolatileMemory() {
    return dmsFreeVolatileMemory;
  }
  public MOScalar<Integer32> getDmsValidateMessageError() {
    return dmsValidateMessageError;
  }
  public EnumeratedScalar getDmsControlMode() {
    return dmsControlMode;
  }
  public MOScalar getDmsSWReset() {
    return dmsSWReset;
  }
  public MOScalar getDmsActivateMessage() {
    return dmsActivateMessage;
  }
  public MOScalar getDmsMessageTimeRemaining() {
    return dmsMessageTimeRemaining;
  }
  public MOScalar<OctetString> getDmsMsgTableSource() {
    return dmsMsgTableSource;
  }
  public MOScalar<IpAddress> getDmsMsgRequesterID() {
    return dmsMsgRequesterID;
  }
  public MOScalar<Integer32> getDmsMsgSourceMode() {
    return dmsMsgSourceMode;
  }
  public MOScalar getDmsShortPowerRecoveryMessage() {
    return dmsShortPowerRecoveryMessage;
  }
  public MOScalar getDmsLongPowerRecoveryMessage() {
    return dmsLongPowerRecoveryMessage;
  }
  public MOScalar getDmsShortPowerLossTime() {
    return dmsShortPowerLossTime;
  }
  public MOScalar getDmsResetMessage() {
    return dmsResetMessage;
  }
  public MOScalar getDmsCommunicationsLossMessage() {
    return dmsCommunicationsLossMessage;
  }
  public MOScalar getDmsTimeCommLoss() {
    return dmsTimeCommLoss;
  }
  public MOScalar getDmsPowerLossMessage() {
    return dmsPowerLossMessage;
  }
  public MOScalar getDmsEndDurationMessage() {
    return dmsEndDurationMessage;
  }
  public EnumeratedScalar getDmsMemoryMgmt() {
    return dmsMemoryMgmt;
  }
  public MOScalar<Integer32> getDmsActivateMsgError() {
    return dmsActivateMsgError;
  }
  public MOScalar<Integer32> getDmsMultiSyntaxError() {
    return dmsMultiSyntaxError;
  }
  public MOScalar<Integer32> getDmsMultiSyntaxErrorPosition() {
    return dmsMultiSyntaxErrorPosition;
  }
  public MOScalar<OctetString> getDmsMultiOtherErrorDescription() {
    return dmsMultiOtherErrorDescription;
  }
  public MOScalar getVmsPixelServiceDuration() {
    return vmsPixelServiceDuration;
  }
  public MOScalar getVmsPixelServiceFrequency() {
    return vmsPixelServiceFrequency;
  }
  public MOScalar getVmsPixelServiceTime() {
    return vmsPixelServiceTime;
  }
  public MOScalar<OctetString> getDmsActivateErrorMsgCode() {
    return dmsActivateErrorMsgCode;
  }
  public MOScalar<Integer32> getDmsActivateMessageState() {
    return dmsActivateMessageState;
  }
  public EnumeratedScalar getDmsIllumControl() {
    return dmsIllumControl;
  }
  public MOScalar<Integer32> getDmsIllumMaxPhotocellLevel() {
    return dmsIllumMaxPhotocellLevel;
  }
  public MOScalar<Integer32> getDmsIllumPhotocellLevelStatus() {
    return dmsIllumPhotocellLevelStatus;
  }
  public MOScalar<Integer32> getDmsIllumNumBrightLevels() {
    return dmsIllumNumBrightLevels;
  }
  public MOScalar<Integer32> getDmsIllumBrightLevelStatus() {
    return dmsIllumBrightLevelStatus;
  }
  public MOScalar getDmsIllumManLevel() {
    return dmsIllumManLevel;
  }
  public MOScalar getDmsIllumBrightnessValues() {
    return dmsIllumBrightnessValues;
  }
  public MOScalar<Integer32> getDmsIllumBrightnessValuesError() {
    return dmsIllumBrightnessValuesError;
  }
  public MOScalar<Integer32> getDmsIllumLightOutputStatus() {
    return dmsIllumLightOutputStatus;
  }
  public MOScalar<Integer32> getNumActionTableEntries() {
    return numActionTableEntries;
  }
  public MOScalar<Integer32> getStatMultiFieldRows() {
    return statMultiFieldRows;
  }
  public MOScalar<Integer32> getDmsCurrentSpeed() {
    return dmsCurrentSpeed;
  }
  public MOScalar getDmsCurrentSpeedLimit() {
    return dmsCurrentSpeedLimit;
  }
  public MOScalar<Counter32> getWatchdogFailureCount() {
    return watchdogFailureCount;
  }
  public MOScalar<Integer32> getDmsStatDoorOpen() {
    return dmsStatDoorOpen;
  }
  public MOScalar<Integer32> getShortErrorStatus() {
    return shortErrorStatus;
  }
  public MOScalar<Integer32> getPixelFailureTableNumRows() {
    return pixelFailureTableNumRows;
  }
  public EnumeratedScalar getPixelTestActivation() {
    return pixelTestActivation;
  }
  public MOScalar<OctetString> getLampFailureStuckOn() {
    return lampFailureStuckOn;
  }
  public MOScalar<OctetString> getLampFailureStuckOff() {
    return lampFailureStuckOff;
  }
  public EnumeratedScalar getLampTestActivation() {
    return lampTestActivation;
  }
  public MOScalar<OctetString> getFanFailures() {
    return fanFailures;
  }
  public EnumeratedScalar getFanTestActivation() {
    return fanTestActivation;
  }
  public MOScalar<Integer32> getControllerErrorStatus() {
    return controllerErrorStatus;
  }
  public MOScalar<OctetString> getDmsPowerFailureStatusMap() {
    return dmsPowerFailureStatusMap;
  }
  public MOScalar<Integer32> getDmsPowerNumRows() {
    return dmsPowerNumRows;
  }
  public MOScalar<OctetString> getDmsClimateCtrlStatusMap() {
    return dmsClimateCtrlStatusMap;
  }
  public MOScalar<Integer32> getDmsClimateCtrlNumRows() {
    return dmsClimateCtrlNumRows;
  }
  public MOScalar<Integer32> getDmsPixelFailureTestRows() {
    return dmsPixelFailureTestRows;
  }
  public MOScalar<Integer32> getDmsPixelFailureMessageRows() {
    return dmsPixelFailureMessageRows;
  }
  public MOScalar<Integer32> getDmsLampNumRows() {
    return dmsLampNumRows;
  }
  public MOScalar<OctetString> getDmsDrumStatusMap() {
    return dmsDrumStatusMap;
  }
  public MOScalar<Integer32> getDmsDrumNumRows() {
    return dmsDrumNumRows;
  }
  public MOScalar<OctetString> getDmsLightSensorStatusMap() {
    return dmsLightSensorStatusMap;
  }
  public MOScalar<Integer32> getDmsLightSensorNumRows() {
    return dmsLightSensorNumRows;
  }
  public MOScalar<OctetString> getDmsHumiditySensorStatusMap() {
    return dmsHumiditySensorStatusMap;
  }
  public MOScalar<Integer32> getDmsHumiditySensorNumRows() {
    return dmsHumiditySensorNumRows;
  }
  public MOScalar<OctetString> getDmsTempSensorStatusMap() {
    return dmsTempSensorStatusMap;
  }
  public MOScalar<Integer32> getDmsTempSensorNumRows() {
    return dmsTempSensorNumRows;
  }
  public MOScalar<Integer32> getDmsTempSensorHighestCriticalTempThreshold() {
    return dmsTempSensorHighestCriticalTempThreshold;
  }
  public MOScalar<Integer32> getDmsTempSensorLowestCriticalTempThreshold() {
    return dmsTempSensorLowestCriticalTempThreshold;
  }
  public MOScalar<Integer32> getSignVolts() {
    return signVolts;
  }
  public MOScalar getLowFuelThreshold() {
    return lowFuelThreshold;
  }
  public MOScalar<Integer32> getFuelLevel() {
    return fuelLevel;
  }
  public MOScalar<Integer32> getEngineRPM() {
    return engineRPM;
  }
  public MOScalar<Integer32> getLineVolts() {
    return lineVolts;
  }
  public MOScalar<Integer32> getPowerSource() {
    return powerSource;
  }
  public MOScalar<Integer32> getTempMinCtrlCabinet() {
    return tempMinCtrlCabinet;
  }
  public MOScalar<Integer32> getTempMaxCtrlCabinet() {
    return tempMaxCtrlCabinet;
  }
  public MOScalar<Integer32> getTempMinAmbient() {
    return tempMinAmbient;
  }
  public MOScalar<Integer32> getTempMaxAmbient() {
    return tempMaxAmbient;
  }
  public MOScalar<Integer32> getTempMinSignHousing() {
    return tempMinSignHousing;
  }
  public MOScalar<Integer32> getTempMaxSignHousing() {
    return tempMaxSignHousing;
  }
  public MOScalar<OctetString> getTempSensorWarningMap() {
    return tempSensorWarningMap;
  }
  public MOScalar<OctetString> getTempSensorCriticalTempMap() {
    return tempSensorCriticalTempMap;
  }
  public MOScalar<Integer32> getDmsGraphicMaxEntries() {
    return dmsGraphicMaxEntries;
  }
  public MOScalar<Integer32> getDmsGraphicNumEntries() {
    return dmsGraphicNumEntries;
  }
  public MOScalar<Integer32> getDmsGraphicMaxSize() {
    return dmsGraphicMaxSize;
  }
  public MOScalar<Counter32> getAvailableGraphicMemory() {
    return availableGraphicMemory;
  }
  public MOScalar<Integer32> getDmsGraphicBlockSize() {
    return dmsGraphicBlockSize;
  }


  public MOTable<FontEntryRow,MOColumn,MOTableModel<FontEntryRow>> getFontEntry() {
    return fontEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createFontEntry(MOFactory moFactory) {
    // Index definition
    fontEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidFontIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    fontEntryIndex = 
      moFactory.createIndex(fontEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=fontEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] fontEntryColumns = new MOColumn[8];
    fontEntryColumns[idxFontIndex] = 
      moFactory.createColumn(colFontIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    fontEntryColumns[idxFontNumber] = 
      new MOMutableColumn<Integer32>(colFontNumber,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=fontNumber::auxInit
    //--AgentGen END
          );
    ValueConstraint fontNumberVC = new ConstraintsImpl();
    ((ConstraintsImpl)fontNumberVC).add(new Constraint(1L, 255L));
    ((MOMutableColumn)fontEntryColumns[idxFontNumber]).
      addMOValueValidationListener(new ValueConstraintValidator(fontNumberVC));                                  
    ((MOMutableColumn)fontEntryColumns[idxFontNumber]).
      addMOValueValidationListener(new FontNumberValidator());
    fontEntryColumns[idxFontName] = 
      new MOMutableColumn<OctetString>(colFontName,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null
    //--AgentGen BEGIN=fontName::auxInit
    //--AgentGen END
          );
    ValueConstraint fontNameVC = new ConstraintsImpl();
    ((ConstraintsImpl)fontNameVC).add(new Constraint(0L, 64L));
    ((MOMutableColumn)fontEntryColumns[idxFontName]).
      addMOValueValidationListener(new ValueConstraintValidator(fontNameVC));                                  
    ((MOMutableColumn)fontEntryColumns[idxFontName]).
      addMOValueValidationListener(new FontNameValidator());
    fontEntryColumns[idxFontHeight] = 
      new MOMutableColumn<Integer32>(colFontHeight,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=fontHeight::auxInit
    //--AgentGen END
          );
    ValueConstraint fontHeightVC = new ConstraintsImpl();
    ((ConstraintsImpl)fontHeightVC).add(new Constraint(0L, 255L));
    ((MOMutableColumn)fontEntryColumns[idxFontHeight]).
      addMOValueValidationListener(new ValueConstraintValidator(fontHeightVC));                                  
    ((MOMutableColumn)fontEntryColumns[idxFontHeight]).
      addMOValueValidationListener(new FontHeightValidator());
    fontEntryColumns[idxFontCharSpacing] = 
      new MOMutableColumn<Integer32>(colFontCharSpacing,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=fontCharSpacing::auxInit
    //--AgentGen END
          );
    ValueConstraint fontCharSpacingVC = new ConstraintsImpl();
    ((ConstraintsImpl)fontCharSpacingVC).add(new Constraint(0L, 255L));
    ((MOMutableColumn)fontEntryColumns[idxFontCharSpacing]).
      addMOValueValidationListener(new ValueConstraintValidator(fontCharSpacingVC));                                  
    ((MOMutableColumn)fontEntryColumns[idxFontCharSpacing]).
      addMOValueValidationListener(new FontCharSpacingValidator());
    fontEntryColumns[idxFontLineSpacing] = 
      new MOMutableColumn<Integer32>(colFontLineSpacing,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=fontLineSpacing::auxInit
    //--AgentGen END
          );
    ValueConstraint fontLineSpacingVC = new ConstraintsImpl();
    ((ConstraintsImpl)fontLineSpacingVC).add(new Constraint(0L, 255L));
    ((MOMutableColumn)fontEntryColumns[idxFontLineSpacing]).
      addMOValueValidationListener(new ValueConstraintValidator(fontLineSpacingVC));                                  
    ((MOMutableColumn)fontEntryColumns[idxFontLineSpacing]).
      addMOValueValidationListener(new FontLineSpacingValidator());
    fontEntryColumns[idxFontVersionID] = 
      moFactory.createColumn(colFontVersionID, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    fontEntryColumns[idxFontStatus] = 
      new Enumerated<Integer32>(colFontStatus,
                     SMIConstants.SYNTAX_INTEGER,
                     moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                     new Integer32(11)
    //--AgentGen BEGIN=fontStatus::auxInit
    //--AgentGen END
          );
    ValueConstraint fontStatusVC = new EnumerationConstraint(
      new int[] { FontStatusEnum.notUsed,
                  FontStatusEnum.modifying,
                  FontStatusEnum.calculatingID,
                  FontStatusEnum.readyForUse,
                  FontStatusEnum.inUse,
                  FontStatusEnum.permanent,
                  FontStatusEnum.modifyReq,
                  FontStatusEnum.readyForUseReq,
                  FontStatusEnum.notUsedReq,
                  FontStatusEnum.unmanagedReq,
                  FontStatusEnum.unmanaged });
    ((MOMutableColumn)fontEntryColumns[idxFontStatus]).
      addMOValueValidationListener(new ValueConstraintValidator(fontStatusVC));                                  
    ((MOMutableColumn)fontEntryColumns[idxFontStatus]).
      addMOValueValidationListener(new FontStatusValidator());
    // Table model
    fontEntryModel = 
      moFactory.createTableModel(oidFontEntry,
                                 fontEntryIndex,
                                 fontEntryColumns);
    ((MOMutableTableModel<FontEntryRow>)fontEntryModel).setRowFactory(
      new FontEntryRowFactory());
    fontEntry = 
      moFactory.createTable(oidFontEntry,
                            fontEntryIndex,
                            fontEntryColumns,
                            fontEntryModel);
  }

  public MOTable<CharacterEntryRow,MOColumn,MOTableModel<CharacterEntryRow>> getCharacterEntry() {
    return characterEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createCharacterEntry(MOFactory moFactory) {
    // Index definition
    characterEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidFontIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1),
      moFactory.createSubIndex(oidCharacterNumber, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    characterEntryIndex = 
      moFactory.createIndex(characterEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=characterEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] characterEntryColumns = new MOColumn[3];
    characterEntryColumns[idxCharacterNumber] = 
      moFactory.createColumn(colCharacterNumber, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    characterEntryColumns[idxCharacterWidth] = 
      new MOMutableColumn<Integer32>(colCharacterWidth,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=characterWidth::auxInit
    //--AgentGen END
          );
    ValueConstraint characterWidthVC = new ConstraintsImpl();
    ((ConstraintsImpl)characterWidthVC).add(new Constraint(0L, 255L));
    ((MOMutableColumn)characterEntryColumns[idxCharacterWidth]).
      addMOValueValidationListener(new ValueConstraintValidator(characterWidthVC));                                  
    ((MOMutableColumn)characterEntryColumns[idxCharacterWidth]).
      addMOValueValidationListener(new CharacterWidthValidator());
    characterEntryColumns[idxCharacterBitmap] = 
      new MOMutableColumn<OctetString>(colCharacterBitmap,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null
    //--AgentGen BEGIN=characterBitmap::auxInit
    //--AgentGen END
          );
    ((MOMutableColumn)characterEntryColumns[idxCharacterBitmap]).
      addMOValueValidationListener(new CharacterBitmapValidator());
    // Table model
    characterEntryModel = 
      moFactory.createTableModel(oidCharacterEntry,
                                 characterEntryIndex,
                                 characterEntryColumns);
    ((MOMutableTableModel<CharacterEntryRow>)characterEntryModel).setRowFactory(
      new CharacterEntryRowFactory());
    characterEntry = 
      moFactory.createTable(oidCharacterEntry,
                            characterEntryIndex,
                            characterEntryColumns,
                            characterEntryModel);
  }

  public MOTable<DmsMessageEntryRow,MOColumn,MOTableModel<DmsMessageEntryRow>> getDmsMessageEntry() {
    return dmsMessageEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsMessageEntry(MOFactory moFactory) {
    // Index definition
    dmsMessageEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsMessageMemoryType, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1),
      moFactory.createSubIndex(oidDmsMessageNumber, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsMessageEntryIndex = 
      moFactory.createIndex(dmsMessageEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsMessageEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsMessageEntryColumns = new MOColumn[9];
    dmsMessageEntryColumns[idxDmsMessageMemoryType] = 
      moFactory.createColumn(colDmsMessageMemoryType, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsMessageEntryColumns[idxDmsMessageNumber] = 
      moFactory.createColumn(colDmsMessageNumber, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsMessageEntryColumns[idxDmsMessageMultiString] = 
      new MOMutableColumn<OctetString>(colDmsMessageMultiString,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null
    //--AgentGen BEGIN=dmsMessageMultiString::auxInit
    //--AgentGen END
          );
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessageMultiString]).
      addMOValueValidationListener(new DmsMessageMultiStringValidator());
    dmsMessageEntryColumns[idxDmsMessageOwner] = 
      new MOMutableColumn<OctetString>(colDmsMessageOwner,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null
    //--AgentGen BEGIN=dmsMessageOwner::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsMessageOwnerVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsMessageOwnerVC).add(new Constraint(0L, 127L));
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessageOwner]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsMessageOwnerVC));                                  
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessageOwner]).
      addMOValueValidationListener(new DmsMessageOwnerValidator());
    dmsMessageEntryColumns[idxDmsMessageCRC] = 
      moFactory.createColumn(colDmsMessageCRC, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsMessageEntryColumns[idxDmsMessageBeacon] = 
      new MOMutableColumn<Integer32>(colDmsMessageBeacon,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          new Integer32(0)
    //--AgentGen BEGIN=dmsMessageBeacon::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsMessageBeaconVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsMessageBeaconVC).add(new Constraint(0L, 1L));
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessageBeacon]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsMessageBeaconVC));                                  
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessageBeacon]).
      addMOValueValidationListener(new DmsMessageBeaconValidator());
    dmsMessageEntryColumns[idxDmsMessagePixelService] = 
      new MOMutableColumn<Integer32>(colDmsMessagePixelService,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          new Integer32(0)
    //--AgentGen BEGIN=dmsMessagePixelService::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsMessagePixelServiceVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsMessagePixelServiceVC).add(new Constraint(0L, 1L));
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessagePixelService]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsMessagePixelServiceVC));                                  
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessagePixelService]).
      addMOValueValidationListener(new DmsMessagePixelServiceValidator());
    dmsMessageEntryColumns[idxDmsMessageRunTimePriority] = 
      new MOMutableColumn<Integer32>(colDmsMessageRunTimePriority,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=dmsMessageRunTimePriority::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsMessageRunTimePriorityVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsMessageRunTimePriorityVC).add(new Constraint(1L, 255L));
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessageRunTimePriority]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsMessageRunTimePriorityVC));                                  
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessageRunTimePriority]).
      addMOValueValidationListener(new DmsMessageRunTimePriorityValidator());
    dmsMessageEntryColumns[idxDmsMessageStatus] = 
      new Enumerated<Integer32>(colDmsMessageStatus,
                     SMIConstants.SYNTAX_INTEGER,
                     moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                     (Integer32)null
    //--AgentGen BEGIN=dmsMessageStatus::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsMessageStatusVC = new EnumerationConstraint(
      new int[] { DmsMessageStatusEnum.notUsed,
                  DmsMessageStatusEnum.modifying,
                  DmsMessageStatusEnum.validating,
                  DmsMessageStatusEnum.valid,
                  DmsMessageStatusEnum.error,
                  DmsMessageStatusEnum.modifyReq,
                  DmsMessageStatusEnum.validateReq,
                  DmsMessageStatusEnum.notUsedReq });
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessageStatus]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsMessageStatusVC));                                  
    ((MOMutableColumn)dmsMessageEntryColumns[idxDmsMessageStatus]).
      addMOValueValidationListener(new DmsMessageStatusValidator());
    // Table model
    dmsMessageEntryModel = 
      moFactory.createTableModel(oidDmsMessageEntry,
                                 dmsMessageEntryIndex,
                                 dmsMessageEntryColumns);
    ((MOMutableTableModel<DmsMessageEntryRow>)dmsMessageEntryModel).setRowFactory(
      new DmsMessageEntryRowFactory());
    dmsMessageEntry = 
      moFactory.createTable(oidDmsMessageEntry,
                            dmsMessageEntryIndex,
                            dmsMessageEntryColumns,
                            dmsMessageEntryModel);
  }

  public MOTable<DmsActionEntryRow,MOColumn,MOTableModel<DmsActionEntryRow>> getDmsActionEntry() {
    return dmsActionEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsActionEntry(MOFactory moFactory) {
    // Index definition
    dmsActionEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsActionIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsActionEntryIndex = 
      moFactory.createIndex(dmsActionEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsActionEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsActionEntryColumns = new MOColumn[2];
    dmsActionEntryColumns[idxDmsActionIndex] = 
      moFactory.createColumn(colDmsActionIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsActionEntryColumns[idxDmsActionMsgCode] = 
      new MOMutableColumn<OctetString>(colDmsActionMsgCode,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          new OctetString(new byte[] { (byte)0,(byte)0,(byte)0,(byte)0,(byte)0 })
    //--AgentGen BEGIN=dmsActionMsgCode::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsActionMsgCodeVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsActionMsgCodeVC).add(new Constraint(5L, 5L));
    ((MOMutableColumn)dmsActionEntryColumns[idxDmsActionMsgCode]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsActionMsgCodeVC));                                  
    ((MOMutableColumn)dmsActionEntryColumns[idxDmsActionMsgCode]).
      addMOValueValidationListener(new DmsActionMsgCodeValidator());
    // Table model
    dmsActionEntryModel = 
      moFactory.createTableModel(oidDmsActionEntry,
                                 dmsActionEntryIndex,
                                 dmsActionEntryColumns);
    ((MOMutableTableModel<DmsActionEntryRow>)dmsActionEntryModel).setRowFactory(
      new DmsActionEntryRowFactory());
    dmsActionEntry = 
      moFactory.createTable(oidDmsActionEntry,
                            dmsActionEntryIndex,
                            dmsActionEntryColumns,
                            dmsActionEntryModel);
  }

  public MOTable<StatMultiFieldEntryRow,MOColumn,MOTableModel<StatMultiFieldEntryRow>> getStatMultiFieldEntry() {
    return statMultiFieldEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createStatMultiFieldEntry(MOFactory moFactory) {
    // Index definition
    statMultiFieldEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidStatMultiFieldIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    statMultiFieldEntryIndex = 
      moFactory.createIndex(statMultiFieldEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=statMultiFieldEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] statMultiFieldEntryColumns = new MOColumn[3];
    statMultiFieldEntryColumns[idxStatMultiFieldIndex] = 
      moFactory.createColumn(colStatMultiFieldIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    statMultiFieldEntryColumns[idxStatMultiFieldCode] = 
      moFactory.createColumn(colStatMultiFieldCode, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    statMultiFieldEntryColumns[idxStatMultiCurrentFieldValue] = 
      moFactory.createColumn(colStatMultiCurrentFieldValue, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    statMultiFieldEntryModel = 
      moFactory.createTableModel(oidStatMultiFieldEntry,
                                 statMultiFieldEntryIndex,
                                 statMultiFieldEntryColumns);
    ((MOMutableTableModel<StatMultiFieldEntryRow>)statMultiFieldEntryModel).setRowFactory(
      new StatMultiFieldEntryRowFactory());
    statMultiFieldEntry = 
      moFactory.createTable(oidStatMultiFieldEntry,
                            statMultiFieldEntryIndex,
                            statMultiFieldEntryColumns,
                            statMultiFieldEntryModel);
  }

  public MOTable<PixelFailureEntryRow,MOColumn,MOTableModel<PixelFailureEntryRow>> getPixelFailureEntry() {
    return pixelFailureEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createPixelFailureEntry(MOFactory moFactory) {
    // Index definition
    pixelFailureEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidPixelFailureDetectionType, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1),
      moFactory.createSubIndex(oidPixelFailureIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    pixelFailureEntryIndex = 
      moFactory.createIndex(pixelFailureEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=pixelFailureEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] pixelFailureEntryColumns = new MOColumn[5];
    pixelFailureEntryColumns[idxPixelFailureDetectionType] = 
      moFactory.createColumn(colPixelFailureDetectionType, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    pixelFailureEntryColumns[idxPixelFailureIndex] = 
      moFactory.createColumn(colPixelFailureIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    pixelFailureEntryColumns[idxPixelFailureXLocation] = 
      moFactory.createColumn(colPixelFailureXLocation, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    pixelFailureEntryColumns[idxPixelFailureYLocation] = 
      moFactory.createColumn(colPixelFailureYLocation, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    pixelFailureEntryColumns[idxPixelFailureStatus] = 
      moFactory.createColumn(colPixelFailureStatus, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    pixelFailureEntryModel = 
      moFactory.createTableModel(oidPixelFailureEntry,
                                 pixelFailureEntryIndex,
                                 pixelFailureEntryColumns);
    ((MOMutableTableModel<PixelFailureEntryRow>)pixelFailureEntryModel).setRowFactory(
      new PixelFailureEntryRowFactory());
    pixelFailureEntry = 
      moFactory.createTable(oidPixelFailureEntry,
                            pixelFailureEntryIndex,
                            pixelFailureEntryColumns,
                            pixelFailureEntryModel);
  }

  public MOTable<DmsPowerStatusEntryRow,MOColumn,MOTableModel<DmsPowerStatusEntryRow>> getDmsPowerStatusEntry() {
    return dmsPowerStatusEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsPowerStatusEntry(MOFactory moFactory) {
    // Index definition
    dmsPowerStatusEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsPowerIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsPowerStatusEntryIndex = 
      moFactory.createIndex(dmsPowerStatusEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsPowerStatusEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsPowerStatusEntryColumns = new MOColumn[6];
    dmsPowerStatusEntryColumns[idxDmsPowerIndex] = 
      moFactory.createColumn(colDmsPowerIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsPowerStatusEntryColumns[idxDmsPowerDescription] = 
      moFactory.createColumn(colDmsPowerDescription, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsPowerStatusEntryColumns[idxDmsPowerMfrStatus] = 
      moFactory.createColumn(colDmsPowerMfrStatus, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsPowerStatusEntryColumns[idxDmsPowerStatus] = 
      moFactory.createColumn(colDmsPowerStatus, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsPowerStatusEntryColumns[idxDmsPowerVoltage] = 
      moFactory.createColumn(colDmsPowerVoltage, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsPowerStatusEntryColumns[idxDmsPowerType] = 
      moFactory.createColumn(colDmsPowerType, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    dmsPowerStatusEntryModel = 
      moFactory.createTableModel(oidDmsPowerStatusEntry,
                                 dmsPowerStatusEntryIndex,
                                 dmsPowerStatusEntryColumns);
    ((MOMutableTableModel<DmsPowerStatusEntryRow>)dmsPowerStatusEntryModel).setRowFactory(
      new DmsPowerStatusEntryRowFactory());
    dmsPowerStatusEntry = 
      moFactory.createTable(oidDmsPowerStatusEntry,
                            dmsPowerStatusEntryIndex,
                            dmsPowerStatusEntryColumns,
                            dmsPowerStatusEntryModel);
  }

  public MOTable<DmsClimateCtrlStatusEntryRow,MOColumn,MOTableModel<DmsClimateCtrlStatusEntryRow>> getDmsClimateCtrlStatusEntry() {
    return dmsClimateCtrlStatusEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsClimateCtrlStatusEntry(MOFactory moFactory) {
    // Index definition
    dmsClimateCtrlStatusEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsClimateCtrlIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsClimateCtrlStatusEntryIndex = 
      moFactory.createIndex(dmsClimateCtrlStatusEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsClimateCtrlStatusEntryColumns = new MOColumn[8];
    dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlIndex] = 
      moFactory.createColumn(colDmsClimateCtrlIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlDescription] = 
      moFactory.createColumn(colDmsClimateCtrlDescription, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlMfrStatus] = 
      moFactory.createColumn(colDmsClimateCtrlMfrStatus, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlErrorStatus] = 
      moFactory.createColumn(colDmsClimateCtrlErrorStatus, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlOnStatus] = 
      moFactory.createColumn(colDmsClimateCtrlOnStatus, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlTestActivation] = 
      new Enumerated<Integer32>(colDmsClimateCtrlTestActivation,
                     SMIConstants.SYNTAX_INTEGER,
                     moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                     (Integer32)null
    //--AgentGen BEGIN=dmsClimateCtrlTestActivation::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsClimateCtrlTestActivationVC = new EnumerationConstraint(
      new int[] { DmsClimateCtrlTestActivationEnum.noTest,
                  DmsClimateCtrlTestActivationEnum.test,
                  DmsClimateCtrlTestActivationEnum.testAborted });
    ((MOMutableColumn)dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlTestActivation]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsClimateCtrlTestActivationVC));                                  
    ((MOMutableColumn)dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlTestActivation]).
      addMOValueValidationListener(new DmsClimateCtrlTestActivationValidator());
    dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlAbortReason] = 
      moFactory.createColumn(colDmsClimateCtrlAbortReason, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsClimateCtrlStatusEntryColumns[idxDmsClimateCtrlType] = 
      moFactory.createColumn(colDmsClimateCtrlType, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    dmsClimateCtrlStatusEntryModel = 
      moFactory.createTableModel(oidDmsClimateCtrlStatusEntry,
                                 dmsClimateCtrlStatusEntryIndex,
                                 dmsClimateCtrlStatusEntryColumns);
    ((MOMutableTableModel<DmsClimateCtrlStatusEntryRow>)dmsClimateCtrlStatusEntryModel).setRowFactory(
      new DmsClimateCtrlStatusEntryRowFactory());
    dmsClimateCtrlStatusEntry = 
      moFactory.createTable(oidDmsClimateCtrlStatusEntry,
                            dmsClimateCtrlStatusEntryIndex,
                            dmsClimateCtrlStatusEntryColumns,
                            dmsClimateCtrlStatusEntryModel);
  }

  public MOTable<PixelStatusEntryRow,MOColumn,MOTableModel<PixelStatusEntryRow>> getPixelStatusEntry() {
    return pixelStatusEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createPixelStatusEntry(MOFactory moFactory) {
    // Index definition
    pixelStatusEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsPixelStatusIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    pixelStatusEntryIndex = 
      moFactory.createIndex(pixelStatusEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=pixelStatusEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] pixelStatusEntryColumns = new MOColumn[2];
    pixelStatusEntryColumns[idxDmsPixelStatusIndex] = 
      moFactory.createColumn(colDmsPixelStatusIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    pixelStatusEntryColumns[idxDmsPixelStatus] = 
      moFactory.createColumn(colDmsPixelStatus, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    pixelStatusEntryModel = 
      moFactory.createTableModel(oidPixelStatusEntry,
                                 pixelStatusEntryIndex,
                                 pixelStatusEntryColumns);
    ((MOMutableTableModel<PixelStatusEntryRow>)pixelStatusEntryModel).setRowFactory(
      new PixelStatusEntryRowFactory());
    pixelStatusEntry = 
      moFactory.createTable(oidPixelStatusEntry,
                            pixelStatusEntryIndex,
                            pixelStatusEntryColumns,
                            pixelStatusEntryModel);
  }

  public MOTable<DmsLampStatusEntryRow,MOColumn,MOTableModel<DmsLampStatusEntryRow>> getDmsLampStatusEntry() {
    return dmsLampStatusEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsLampStatusEntry(MOFactory moFactory) {
    // Index definition
    dmsLampStatusEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsLampIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsLampStatusEntryIndex = 
      moFactory.createIndex(dmsLampStatusEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsLampStatusEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsLampStatusEntryColumns = new MOColumn[8];
    dmsLampStatusEntryColumns[idxDmsLampIndex] = 
      moFactory.createColumn(colDmsLampIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsLampStatusEntryColumns[idxDmsLampDescription] = 
      moFactory.createColumn(colDmsLampDescription, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsLampStatusEntryColumns[idxDmsLampMfrStatus] = 
      moFactory.createColumn(colDmsLampMfrStatus, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsLampStatusEntryColumns[idxDmsLampStatus] = 
      moFactory.createColumn(colDmsLampStatus, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsLampStatusEntryColumns[idxDmsLampPixelTop] = 
      moFactory.createColumn(colDmsLampPixelTop, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsLampStatusEntryColumns[idxDmsLampPixelLeft] = 
      moFactory.createColumn(colDmsLampPixelLeft, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsLampStatusEntryColumns[idxDmsLampPixelBottom] = 
      moFactory.createColumn(colDmsLampPixelBottom, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsLampStatusEntryColumns[idxDmsLampPixelRight] = 
      moFactory.createColumn(colDmsLampPixelRight, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    dmsLampStatusEntryModel = 
      moFactory.createTableModel(oidDmsLampStatusEntry,
                                 dmsLampStatusEntryIndex,
                                 dmsLampStatusEntryColumns);
    ((MOMutableTableModel<DmsLampStatusEntryRow>)dmsLampStatusEntryModel).setRowFactory(
      new DmsLampStatusEntryRowFactory());
    dmsLampStatusEntry = 
      moFactory.createTable(oidDmsLampStatusEntry,
                            dmsLampStatusEntryIndex,
                            dmsLampStatusEntryColumns,
                            dmsLampStatusEntryModel);
  }

  public MOTable<DmsDrumStatusEntryRow,MOColumn,MOTableModel<DmsDrumStatusEntryRow>> getDmsDrumStatusEntry() {
    return dmsDrumStatusEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsDrumStatusEntry(MOFactory moFactory) {
    // Index definition
    dmsDrumStatusEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsDrumIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsDrumStatusEntryIndex = 
      moFactory.createIndex(dmsDrumStatusEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsDrumStatusEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsDrumStatusEntryColumns = new MOColumn[4];
    dmsDrumStatusEntryColumns[idxDmsDrumIndex] = 
      moFactory.createColumn(colDmsDrumIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsDrumStatusEntryColumns[idxDmsDrumDescription] = 
      moFactory.createColumn(colDmsDrumDescription, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsDrumStatusEntryColumns[idxDmsDrumMfrStatus] = 
      moFactory.createColumn(colDmsDrumMfrStatus, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsDrumStatusEntryColumns[idxDmsDrumStatus] = 
      moFactory.createColumn(colDmsDrumStatus, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    dmsDrumStatusEntryModel = 
      moFactory.createTableModel(oidDmsDrumStatusEntry,
                                 dmsDrumStatusEntryIndex,
                                 dmsDrumStatusEntryColumns);
    ((MOMutableTableModel<DmsDrumStatusEntryRow>)dmsDrumStatusEntryModel).setRowFactory(
      new DmsDrumStatusEntryRowFactory());
    dmsDrumStatusEntry = 
      moFactory.createTable(oidDmsDrumStatusEntry,
                            dmsDrumStatusEntryIndex,
                            dmsDrumStatusEntryColumns,
                            dmsDrumStatusEntryModel);
  }

  public MOTable<DmsLightSensorStatusEntryRow,MOColumn,MOTableModel<DmsLightSensorStatusEntryRow>> getDmsLightSensorStatusEntry() {
    return dmsLightSensorStatusEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsLightSensorStatusEntry(MOFactory moFactory) {
    // Index definition
    dmsLightSensorStatusEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsLightSensorIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsLightSensorStatusEntryIndex = 
      moFactory.createIndex(dmsLightSensorStatusEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsLightSensorStatusEntryColumns = new MOColumn[4];
    dmsLightSensorStatusEntryColumns[idxDmsLightSensorIndex] = 
      moFactory.createColumn(colDmsLightSensorIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsLightSensorStatusEntryColumns[idxDmsLightSensorDescription] = 
      moFactory.createColumn(colDmsLightSensorDescription, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsLightSensorStatusEntryColumns[idxDmsLightSensorCurrentReading] = 
      moFactory.createColumn(colDmsLightSensorCurrentReading, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsLightSensorStatusEntryColumns[idxDmsLightSensorStatus] = 
      moFactory.createColumn(colDmsLightSensorStatus, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    dmsLightSensorStatusEntryModel = 
      moFactory.createTableModel(oidDmsLightSensorStatusEntry,
                                 dmsLightSensorStatusEntryIndex,
                                 dmsLightSensorStatusEntryColumns);
    ((MOMutableTableModel<DmsLightSensorStatusEntryRow>)dmsLightSensorStatusEntryModel).setRowFactory(
      new DmsLightSensorStatusEntryRowFactory());
    dmsLightSensorStatusEntry = 
      moFactory.createTable(oidDmsLightSensorStatusEntry,
                            dmsLightSensorStatusEntryIndex,
                            dmsLightSensorStatusEntryColumns,
                            dmsLightSensorStatusEntryModel);
  }

  public MOTable<DmsHumiditySensorStatusEntryRow,MOColumn,MOTableModel<DmsHumiditySensorStatusEntryRow>> getDmsHumiditySensorStatusEntry() {
    return dmsHumiditySensorStatusEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsHumiditySensorStatusEntry(MOFactory moFactory) {
    // Index definition
    dmsHumiditySensorStatusEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsHumiditySensorIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsHumiditySensorStatusEntryIndex = 
      moFactory.createIndex(dmsHumiditySensorStatusEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsHumiditySensorStatusEntryColumns = new MOColumn[4];
    dmsHumiditySensorStatusEntryColumns[idxDmsHumiditySensorIndex] = 
      moFactory.createColumn(colDmsHumiditySensorIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsHumiditySensorStatusEntryColumns[idxDmsHumiditySensorDescription] = 
      moFactory.createColumn(colDmsHumiditySensorDescription, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsHumiditySensorStatusEntryColumns[idxDmsHumiditySensorCurrentReading] = 
      moFactory.createColumn(colDmsHumiditySensorCurrentReading, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsHumiditySensorStatusEntryColumns[idxDmsHumiditySensorStatus] = 
      moFactory.createColumn(colDmsHumiditySensorStatus, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    dmsHumiditySensorStatusEntryModel = 
      moFactory.createTableModel(oidDmsHumiditySensorStatusEntry,
                                 dmsHumiditySensorStatusEntryIndex,
                                 dmsHumiditySensorStatusEntryColumns);
    ((MOMutableTableModel<DmsHumiditySensorStatusEntryRow>)dmsHumiditySensorStatusEntryModel).setRowFactory(
      new DmsHumiditySensorStatusEntryRowFactory());
    dmsHumiditySensorStatusEntry = 
      moFactory.createTable(oidDmsHumiditySensorStatusEntry,
                            dmsHumiditySensorStatusEntryIndex,
                            dmsHumiditySensorStatusEntryColumns,
                            dmsHumiditySensorStatusEntryModel);
  }

  public MOTable<DmsTempSensorStatusEntryRow,MOColumn,MOTableModel<DmsTempSensorStatusEntryRow>> getDmsTempSensorStatusEntry() {
    return dmsTempSensorStatusEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsTempSensorStatusEntry(MOFactory moFactory) {
    // Index definition
    dmsTempSensorStatusEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsTempSensorIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsTempSensorStatusEntryIndex = 
      moFactory.createIndex(dmsTempSensorStatusEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsTempSensorStatusEntryColumns = new MOColumn[8];
    dmsTempSensorStatusEntryColumns[idxDmsTempSensorIndex] = 
      moFactory.createColumn(colDmsTempSensorIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsTempSensorStatusEntryColumns[idxDmsTempSensorDescription] = 
      moFactory.createColumn(colDmsTempSensorDescription, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleRfc1213Mib,
                             tcDefDisplayString);
    dmsTempSensorStatusEntryColumns[idxDmsTempSensorCurrentReading] = 
      moFactory.createColumn(colDmsTempSensorCurrentReading, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsTempSensorStatusEntryColumns[idxDmsTempSensorHighWarningTemperature] = 
      moFactory.createColumn(colDmsTempSensorHighWarningTemperature, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsTempSensorStatusEntryColumns[idxDmsTempSensorLowWarningTemperature] = 
      moFactory.createColumn(colDmsTempSensorLowWarningTemperature, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsTempSensorStatusEntryColumns[idxDmsTempSensorHighCriticalTemperature] = 
      moFactory.createColumn(colDmsTempSensorHighCriticalTemperature, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsTempSensorStatusEntryColumns[idxDmsTempSensorLowCriticalTemperature] = 
      moFactory.createColumn(colDmsTempSensorLowCriticalTemperature, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsTempSensorStatusEntryColumns[idxDmsTempSensorStatus] = 
      moFactory.createColumn(colDmsTempSensorStatus, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    // Table model
    dmsTempSensorStatusEntryModel = 
      moFactory.createTableModel(oidDmsTempSensorStatusEntry,
                                 dmsTempSensorStatusEntryIndex,
                                 dmsTempSensorStatusEntryColumns);
    ((MOMutableTableModel<DmsTempSensorStatusEntryRow>)dmsTempSensorStatusEntryModel).setRowFactory(
      new DmsTempSensorStatusEntryRowFactory());
    dmsTempSensorStatusEntry = 
      moFactory.createTable(oidDmsTempSensorStatusEntry,
                            dmsTempSensorStatusEntryIndex,
                            dmsTempSensorStatusEntryColumns,
                            dmsTempSensorStatusEntryModel);
  }

  public MOTable<DmsGraphicEntryRow,MOColumn,MOTableModel<DmsGraphicEntryRow>> getDmsGraphicEntry() {
    return dmsGraphicEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsGraphicEntry(MOFactory moFactory) {
    // Index definition
    dmsGraphicEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsGraphicIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsGraphicEntryIndex = 
      moFactory.createIndex(dmsGraphicEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsGraphicEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsGraphicEntryColumns = new MOColumn[10];
    dmsGraphicEntryColumns[idxDmsGraphicIndex] = 
      moFactory.createColumn(colDmsGraphicIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsGraphicEntryColumns[idxDmsGraphicNumber] = 
      new MOMutableColumn<Integer32>(colDmsGraphicNumber,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=dmsGraphicNumber::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsGraphicNumberVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsGraphicNumberVC).add(new Constraint(1L, 255L));
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicNumber]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsGraphicNumberVC));                                  
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicNumber]).
      addMOValueValidationListener(new DmsGraphicNumberValidator());
    dmsGraphicEntryColumns[idxDmsGraphicName] = 
      new MOMutableColumn<OctetString>(colDmsGraphicName,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null
    //--AgentGen BEGIN=dmsGraphicName::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsGraphicNameVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsGraphicNameVC).add(new Constraint(0L, 64L));
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicName]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsGraphicNameVC));                                  
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicName]).
      addMOValueValidationListener(new DmsGraphicNameValidator());
    dmsGraphicEntryColumns[idxDmsGraphicHeight] = 
      new MOMutableColumn<Integer32>(colDmsGraphicHeight,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=dmsGraphicHeight::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsGraphicHeightVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsGraphicHeightVC).add(new Constraint(1L, 255L));
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicHeight]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsGraphicHeightVC));                                  
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicHeight]).
      addMOValueValidationListener(new DmsGraphicHeightValidator());
    dmsGraphicEntryColumns[idxDmsGraphicWidth] = 
      new MOMutableColumn<Integer32>(colDmsGraphicWidth,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=dmsGraphicWidth::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsGraphicWidthVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsGraphicWidthVC).add(new Constraint(1L, 65535L));
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicWidth]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsGraphicWidthVC));                                  
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicWidth]).
      addMOValueValidationListener(new DmsGraphicWidthValidator());
    dmsGraphicEntryColumns[idxDmsGraphicType] = 
      new Enumerated<Integer32>(colDmsGraphicType,
                     SMIConstants.SYNTAX_INTEGER,
                     moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                     (Integer32)null
    //--AgentGen BEGIN=dmsGraphicType::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsGraphicTypeVC = new EnumerationConstraint(
      new int[] { DmsGraphicTypeEnum.monochrome1bit,
                  DmsGraphicTypeEnum.monochrome8bit,
                  DmsGraphicTypeEnum.colorClassic,
                  DmsGraphicTypeEnum.color24bit });
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicType]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsGraphicTypeVC));                                  
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicType]).
      addMOValueValidationListener(new DmsGraphicTypeValidator());
    dmsGraphicEntryColumns[idxDmsGraphicID] = 
      moFactory.createColumn(colDmsGraphicID, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsGraphicEntryColumns[idxDmsGraphicTransparentEnabled] = 
      new MOMutableColumn<Integer32>(colDmsGraphicTransparentEnabled,
                          SMIConstants.SYNTAX_INTEGER,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (Integer32)null
    //--AgentGen BEGIN=dmsGraphicTransparentEnabled::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsGraphicTransparentEnabledVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsGraphicTransparentEnabledVC).add(new Constraint(0L, 1L));
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicTransparentEnabled]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsGraphicTransparentEnabledVC));                                  
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicTransparentEnabled]).
      addMOValueValidationListener(new DmsGraphicTransparentEnabledValidator());
    dmsGraphicEntryColumns[idxDmsGraphicTransparentColor] = 
      new MOMutableColumn<OctetString>(colDmsGraphicTransparentColor,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null
    //--AgentGen BEGIN=dmsGraphicTransparentColor::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsGraphicTransparentColorVC = new ConstraintsImpl();
    ((ConstraintsImpl)dmsGraphicTransparentColorVC).add(new Constraint(1L, 1L));
    ((ConstraintsImpl)dmsGraphicTransparentColorVC).add(new Constraint(3L, 3L));
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicTransparentColor]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsGraphicTransparentColorVC));                                  
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicTransparentColor]).
      addMOValueValidationListener(new DmsGraphicTransparentColorValidator());
    dmsGraphicEntryColumns[idxDmsGraphicStatus] = 
      new Enumerated<Integer32>(colDmsGraphicStatus,
                     SMIConstants.SYNTAX_INTEGER,
                     moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                     (Integer32)null
    //--AgentGen BEGIN=dmsGraphicStatus::auxInit
    //--AgentGen END
          );
    ValueConstraint dmsGraphicStatusVC = new EnumerationConstraint(
      new int[] { DmsGraphicStatusEnum.notUsed,
                  DmsGraphicStatusEnum.modifying,
                  DmsGraphicStatusEnum.calculatingID,
                  DmsGraphicStatusEnum.readyForUse,
                  DmsGraphicStatusEnum.inUse,
                  DmsGraphicStatusEnum.permanent,
                  DmsGraphicStatusEnum.modifyReq,
                  DmsGraphicStatusEnum.readyForUseReq,
                  DmsGraphicStatusEnum.notUsedReq });
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicStatus]).
      addMOValueValidationListener(new ValueConstraintValidator(dmsGraphicStatusVC));                                  
    ((MOMutableColumn)dmsGraphicEntryColumns[idxDmsGraphicStatus]).
      addMOValueValidationListener(new DmsGraphicStatusValidator());
    // Table model
    dmsGraphicEntryModel = 
      moFactory.createTableModel(oidDmsGraphicEntry,
                                 dmsGraphicEntryIndex,
                                 dmsGraphicEntryColumns);
    ((MOMutableTableModel<DmsGraphicEntryRow>)dmsGraphicEntryModel).setRowFactory(
      new DmsGraphicEntryRowFactory());
    dmsGraphicEntry = 
      moFactory.createTable(oidDmsGraphicEntry,
                            dmsGraphicEntryIndex,
                            dmsGraphicEntryColumns,
                            dmsGraphicEntryModel);
  }

  public MOTable<DmsGraphicBitmapEntryRow,MOColumn,MOTableModel<DmsGraphicBitmapEntryRow>> getDmsGraphicBitmapEntry() {
    return dmsGraphicBitmapEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createDmsGraphicBitmapEntry(MOFactory moFactory) {
    // Index definition
    dmsGraphicBitmapEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidDmsGraphicBitmapIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1),
      moFactory.createSubIndex(oidDmsGraphicBlockNumber, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)
    };

    dmsGraphicBitmapEntryIndex = 
      moFactory.createIndex(dmsGraphicBitmapEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::isValidIndex
    //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] dmsGraphicBitmapEntryColumns = new MOColumn[3];
    dmsGraphicBitmapEntryColumns[idxDmsGraphicBitmapIndex] = 
      moFactory.createColumn(colDmsGraphicBitmapIndex, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsGraphicBitmapEntryColumns[idxDmsGraphicBlockNumber] = 
      moFactory.createColumn(colDmsGraphicBlockNumber, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    dmsGraphicBitmapEntryColumns[idxDmsGraphicBlockBitmap] = 
      new MOMutableColumn<OctetString>(colDmsGraphicBlockBitmap,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null
    //--AgentGen BEGIN=dmsGraphicBlockBitmap::auxInit
    //--AgentGen END
          );
    ((MOMutableColumn)dmsGraphicBitmapEntryColumns[idxDmsGraphicBlockBitmap]).
      addMOValueValidationListener(new DmsGraphicBlockBitmapValidator());
    // Table model
    dmsGraphicBitmapEntryModel = 
      moFactory.createTableModel(oidDmsGraphicBitmapEntry,
                                 dmsGraphicBitmapEntryIndex,
                                 dmsGraphicBitmapEntryColumns);
    ((MOMutableTableModel<DmsGraphicBitmapEntryRow>)dmsGraphicBitmapEntryModel).setRowFactory(
      new DmsGraphicBitmapEntryRowFactory());
    dmsGraphicBitmapEntry = 
      moFactory.createTable(oidDmsGraphicBitmapEntry,
                            dmsGraphicBitmapEntryIndex,
                            dmsGraphicBitmapEntryColumns,
                            dmsGraphicBitmapEntryModel);
  }



  public void registerMOs(MOServer server, OctetString context) 
    throws DuplicateRegistrationException 
  {
    // Scalar Objects
    server.register(this.dmsSignAccess, context);
    server.register(this.dmsSignType, context);
    server.register(this.dmsSignHeight, context);
    server.register(this.dmsSignWidth, context);
    server.register(this.dmsHorizontalBorder, context);
    server.register(this.dmsVerticalBorder, context);
    server.register(this.dmsLegend, context);
    server.register(this.dmsBeaconType, context);
    server.register(this.dmsSignTechnology, context);
    server.register(this.vmsCharacterHeightPixels, context);
    server.register(this.vmsCharacterWidthPixels, context);
    server.register(this.vmsSignHeightPixels, context);
    server.register(this.vmsSignWidthPixels, context);
    server.register(this.vmsHorizontalPitch, context);
    server.register(this.vmsVerticalPitch, context);
    server.register(this.monochromeColor, context);
    server.register(this.numFonts, context);
    server.register(this.maxFontCharacters, context);
    server.register(this.fontMaxCharacterSize, context);
    server.register(this.defaultBackgroundColor, context);
    server.register(this.defaultForegroundColor, context);
    server.register(this.defaultFlashOn, context);
    server.register(this.defaultFlashOff, context);
    server.register(this.defaultFont, context);
    server.register(this.defaultJustificationLine, context);
    server.register(this.defaultJustificationPage, context);
    server.register(this.defaultPageOnTime, context);
    server.register(this.defaultPageOffTime, context);
    server.register(this.defaultCharacterSet, context);
    server.register(this.dmsColorScheme, context);
    server.register(this.defaultBackgroundRGB, context);
    server.register(this.defaultForegroundRGB, context);
    server.register(this.dmsSupportedMultiTags, context);
    server.register(this.dmsMaxNumberPages, context);
    server.register(this.dmsMaxMultiStringLength, context);
    server.register(this.defaultFlashOnActivate, context);
    server.register(this.defaultFlashOffActivate, context);
    server.register(this.defaultFontActivate, context);
    server.register(this.defaultJustificationLineActivate, context);
    server.register(this.defaultJustificationPageActivate, context);
    server.register(this.defaultPageOnTimeActivate, context);
    server.register(this.defaultPageOffTimeActivate, context);
    server.register(this.defaultBackgroundRGBActivate, context);
    server.register(this.defaultForegroundRGBActivate, context);
    server.register(this.dmsNumPermanentMsg, context);
    server.register(this.dmsNumChangeableMsg, context);
    server.register(this.dmsMaxChangeableMsg, context);
    server.register(this.dmsFreeChangeableMemory, context);
    server.register(this.dmsNumVolatileMsg, context);
    server.register(this.dmsMaxVolatileMsg, context);
    server.register(this.dmsFreeVolatileMemory, context);
    server.register(this.dmsValidateMessageError, context);
    server.register(this.dmsControlMode, context);
    server.register(this.dmsSWReset, context);
    server.register(this.dmsActivateMessage, context);
    server.register(this.dmsMessageTimeRemaining, context);
    server.register(this.dmsMsgTableSource, context);
    server.register(this.dmsMsgRequesterID, context);
    server.register(this.dmsMsgSourceMode, context);
    server.register(this.dmsShortPowerRecoveryMessage, context);
    server.register(this.dmsLongPowerRecoveryMessage, context);
    server.register(this.dmsShortPowerLossTime, context);
    server.register(this.dmsResetMessage, context);
    server.register(this.dmsCommunicationsLossMessage, context);
    server.register(this.dmsTimeCommLoss, context);
    server.register(this.dmsPowerLossMessage, context);
    server.register(this.dmsEndDurationMessage, context);
    server.register(this.dmsMemoryMgmt, context);
    server.register(this.dmsActivateMsgError, context);
    server.register(this.dmsMultiSyntaxError, context);
    server.register(this.dmsMultiSyntaxErrorPosition, context);
    server.register(this.dmsMultiOtherErrorDescription, context);
    server.register(this.vmsPixelServiceDuration, context);
    server.register(this.vmsPixelServiceFrequency, context);
    server.register(this.vmsPixelServiceTime, context);
    server.register(this.dmsActivateErrorMsgCode, context);
    server.register(this.dmsActivateMessageState, context);
    server.register(this.dmsIllumControl, context);
    server.register(this.dmsIllumMaxPhotocellLevel, context);
    server.register(this.dmsIllumPhotocellLevelStatus, context);
    server.register(this.dmsIllumNumBrightLevels, context);
    server.register(this.dmsIllumBrightLevelStatus, context);
    server.register(this.dmsIllumManLevel, context);
    server.register(this.dmsIllumBrightnessValues, context);
    server.register(this.dmsIllumBrightnessValuesError, context);
    server.register(this.dmsIllumLightOutputStatus, context);
    server.register(this.numActionTableEntries, context);
    server.register(this.statMultiFieldRows, context);
    server.register(this.dmsCurrentSpeed, context);
    server.register(this.dmsCurrentSpeedLimit, context);
    server.register(this.watchdogFailureCount, context);
    server.register(this.dmsStatDoorOpen, context);
    server.register(this.shortErrorStatus, context);
    server.register(this.pixelFailureTableNumRows, context);
    server.register(this.pixelTestActivation, context);
    server.register(this.lampFailureStuckOn, context);
    server.register(this.lampFailureStuckOff, context);
    server.register(this.lampTestActivation, context);
    server.register(this.fanFailures, context);
    server.register(this.fanTestActivation, context);
    server.register(this.controllerErrorStatus, context);
    server.register(this.dmsPowerFailureStatusMap, context);
    server.register(this.dmsPowerNumRows, context);
    server.register(this.dmsClimateCtrlStatusMap, context);
    server.register(this.dmsClimateCtrlNumRows, context);
    server.register(this.dmsPixelFailureTestRows, context);
    server.register(this.dmsPixelFailureMessageRows, context);
    server.register(this.dmsLampNumRows, context);
    server.register(this.dmsDrumStatusMap, context);
    server.register(this.dmsDrumNumRows, context);
    server.register(this.dmsLightSensorStatusMap, context);
    server.register(this.dmsLightSensorNumRows, context);
    server.register(this.dmsHumiditySensorStatusMap, context);
    server.register(this.dmsHumiditySensorNumRows, context);
    server.register(this.dmsTempSensorStatusMap, context);
    server.register(this.dmsTempSensorNumRows, context);
    server.register(this.dmsTempSensorHighestCriticalTempThreshold, context);
    server.register(this.dmsTempSensorLowestCriticalTempThreshold, context);
    server.register(this.signVolts, context);
    server.register(this.lowFuelThreshold, context);
    server.register(this.fuelLevel, context);
    server.register(this.engineRPM, context);
    server.register(this.lineVolts, context);
    server.register(this.powerSource, context);
    server.register(this.tempMinCtrlCabinet, context);
    server.register(this.tempMaxCtrlCabinet, context);
    server.register(this.tempMinAmbient, context);
    server.register(this.tempMaxAmbient, context);
    server.register(this.tempMinSignHousing, context);
    server.register(this.tempMaxSignHousing, context);
    server.register(this.tempSensorWarningMap, context);
    server.register(this.tempSensorCriticalTempMap, context);
    server.register(this.dmsGraphicMaxEntries, context);
    server.register(this.dmsGraphicNumEntries, context);
    server.register(this.dmsGraphicMaxSize, context);
    server.register(this.availableGraphicMemory, context);
    server.register(this.dmsGraphicBlockSize, context);
    server.register(this.fontEntry, context);
    server.register(this.characterEntry, context);
    server.register(this.dmsMessageEntry, context);
    server.register(this.dmsActionEntry, context);
    server.register(this.statMultiFieldEntry, context);
    server.register(this.pixelFailureEntry, context);
    server.register(this.dmsPowerStatusEntry, context);
    server.register(this.dmsClimateCtrlStatusEntry, context);
    server.register(this.pixelStatusEntry, context);
    server.register(this.dmsLampStatusEntry, context);
    server.register(this.dmsDrumStatusEntry, context);
    server.register(this.dmsLightSensorStatusEntry, context);
    server.register(this.dmsHumiditySensorStatusEntry, context);
    server.register(this.dmsTempSensorStatusEntry, context);
    server.register(this.dmsGraphicEntry, context);
    server.register(this.dmsGraphicBitmapEntry, context);
//--AgentGen BEGIN=_registerMOs
//--AgentGen END
  }

  public void unregisterMOs(MOServer server, OctetString context) {
    // Scalar Objects
    server.unregister(this.dmsSignAccess, context);
    server.unregister(this.dmsSignType, context);
    server.unregister(this.dmsSignHeight, context);
    server.unregister(this.dmsSignWidth, context);
    server.unregister(this.dmsHorizontalBorder, context);
    server.unregister(this.dmsVerticalBorder, context);
    server.unregister(this.dmsLegend, context);
    server.unregister(this.dmsBeaconType, context);
    server.unregister(this.dmsSignTechnology, context);
    server.unregister(this.vmsCharacterHeightPixels, context);
    server.unregister(this.vmsCharacterWidthPixels, context);
    server.unregister(this.vmsSignHeightPixels, context);
    server.unregister(this.vmsSignWidthPixels, context);
    server.unregister(this.vmsHorizontalPitch, context);
    server.unregister(this.vmsVerticalPitch, context);
    server.unregister(this.monochromeColor, context);
    server.unregister(this.numFonts, context);
    server.unregister(this.maxFontCharacters, context);
    server.unregister(this.fontMaxCharacterSize, context);
    server.unregister(this.defaultBackgroundColor, context);
    server.unregister(this.defaultForegroundColor, context);
    server.unregister(this.defaultFlashOn, context);
    server.unregister(this.defaultFlashOff, context);
    server.unregister(this.defaultFont, context);
    server.unregister(this.defaultJustificationLine, context);
    server.unregister(this.defaultJustificationPage, context);
    server.unregister(this.defaultPageOnTime, context);
    server.unregister(this.defaultPageOffTime, context);
    server.unregister(this.defaultCharacterSet, context);
    server.unregister(this.dmsColorScheme, context);
    server.unregister(this.defaultBackgroundRGB, context);
    server.unregister(this.defaultForegroundRGB, context);
    server.unregister(this.dmsSupportedMultiTags, context);
    server.unregister(this.dmsMaxNumberPages, context);
    server.unregister(this.dmsMaxMultiStringLength, context);
    server.unregister(this.defaultFlashOnActivate, context);
    server.unregister(this.defaultFlashOffActivate, context);
    server.unregister(this.defaultFontActivate, context);
    server.unregister(this.defaultJustificationLineActivate, context);
    server.unregister(this.defaultJustificationPageActivate, context);
    server.unregister(this.defaultPageOnTimeActivate, context);
    server.unregister(this.defaultPageOffTimeActivate, context);
    server.unregister(this.defaultBackgroundRGBActivate, context);
    server.unregister(this.defaultForegroundRGBActivate, context);
    server.unregister(this.dmsNumPermanentMsg, context);
    server.unregister(this.dmsNumChangeableMsg, context);
    server.unregister(this.dmsMaxChangeableMsg, context);
    server.unregister(this.dmsFreeChangeableMemory, context);
    server.unregister(this.dmsNumVolatileMsg, context);
    server.unregister(this.dmsMaxVolatileMsg, context);
    server.unregister(this.dmsFreeVolatileMemory, context);
    server.unregister(this.dmsValidateMessageError, context);
    server.unregister(this.dmsControlMode, context);
    server.unregister(this.dmsSWReset, context);
    server.unregister(this.dmsActivateMessage, context);
    server.unregister(this.dmsMessageTimeRemaining, context);
    server.unregister(this.dmsMsgTableSource, context);
    server.unregister(this.dmsMsgRequesterID, context);
    server.unregister(this.dmsMsgSourceMode, context);
    server.unregister(this.dmsShortPowerRecoveryMessage, context);
    server.unregister(this.dmsLongPowerRecoveryMessage, context);
    server.unregister(this.dmsShortPowerLossTime, context);
    server.unregister(this.dmsResetMessage, context);
    server.unregister(this.dmsCommunicationsLossMessage, context);
    server.unregister(this.dmsTimeCommLoss, context);
    server.unregister(this.dmsPowerLossMessage, context);
    server.unregister(this.dmsEndDurationMessage, context);
    server.unregister(this.dmsMemoryMgmt, context);
    server.unregister(this.dmsActivateMsgError, context);
    server.unregister(this.dmsMultiSyntaxError, context);
    server.unregister(this.dmsMultiSyntaxErrorPosition, context);
    server.unregister(this.dmsMultiOtherErrorDescription, context);
    server.unregister(this.vmsPixelServiceDuration, context);
    server.unregister(this.vmsPixelServiceFrequency, context);
    server.unregister(this.vmsPixelServiceTime, context);
    server.unregister(this.dmsActivateErrorMsgCode, context);
    server.unregister(this.dmsActivateMessageState, context);
    server.unregister(this.dmsIllumControl, context);
    server.unregister(this.dmsIllumMaxPhotocellLevel, context);
    server.unregister(this.dmsIllumPhotocellLevelStatus, context);
    server.unregister(this.dmsIllumNumBrightLevels, context);
    server.unregister(this.dmsIllumBrightLevelStatus, context);
    server.unregister(this.dmsIllumManLevel, context);
    server.unregister(this.dmsIllumBrightnessValues, context);
    server.unregister(this.dmsIllumBrightnessValuesError, context);
    server.unregister(this.dmsIllumLightOutputStatus, context);
    server.unregister(this.numActionTableEntries, context);
    server.unregister(this.statMultiFieldRows, context);
    server.unregister(this.dmsCurrentSpeed, context);
    server.unregister(this.dmsCurrentSpeedLimit, context);
    server.unregister(this.watchdogFailureCount, context);
    server.unregister(this.dmsStatDoorOpen, context);
    server.unregister(this.shortErrorStatus, context);
    server.unregister(this.pixelFailureTableNumRows, context);
    server.unregister(this.pixelTestActivation, context);
    server.unregister(this.lampFailureStuckOn, context);
    server.unregister(this.lampFailureStuckOff, context);
    server.unregister(this.lampTestActivation, context);
    server.unregister(this.fanFailures, context);
    server.unregister(this.fanTestActivation, context);
    server.unregister(this.controllerErrorStatus, context);
    server.unregister(this.dmsPowerFailureStatusMap, context);
    server.unregister(this.dmsPowerNumRows, context);
    server.unregister(this.dmsClimateCtrlStatusMap, context);
    server.unregister(this.dmsClimateCtrlNumRows, context);
    server.unregister(this.dmsPixelFailureTestRows, context);
    server.unregister(this.dmsPixelFailureMessageRows, context);
    server.unregister(this.dmsLampNumRows, context);
    server.unregister(this.dmsDrumStatusMap, context);
    server.unregister(this.dmsDrumNumRows, context);
    server.unregister(this.dmsLightSensorStatusMap, context);
    server.unregister(this.dmsLightSensorNumRows, context);
    server.unregister(this.dmsHumiditySensorStatusMap, context);
    server.unregister(this.dmsHumiditySensorNumRows, context);
    server.unregister(this.dmsTempSensorStatusMap, context);
    server.unregister(this.dmsTempSensorNumRows, context);
    server.unregister(this.dmsTempSensorHighestCriticalTempThreshold, context);
    server.unregister(this.dmsTempSensorLowestCriticalTempThreshold, context);
    server.unregister(this.signVolts, context);
    server.unregister(this.lowFuelThreshold, context);
    server.unregister(this.fuelLevel, context);
    server.unregister(this.engineRPM, context);
    server.unregister(this.lineVolts, context);
    server.unregister(this.powerSource, context);
    server.unregister(this.tempMinCtrlCabinet, context);
    server.unregister(this.tempMaxCtrlCabinet, context);
    server.unregister(this.tempMinAmbient, context);
    server.unregister(this.tempMaxAmbient, context);
    server.unregister(this.tempMinSignHousing, context);
    server.unregister(this.tempMaxSignHousing, context);
    server.unregister(this.tempSensorWarningMap, context);
    server.unregister(this.tempSensorCriticalTempMap, context);
    server.unregister(this.dmsGraphicMaxEntries, context);
    server.unregister(this.dmsGraphicNumEntries, context);
    server.unregister(this.dmsGraphicMaxSize, context);
    server.unregister(this.availableGraphicMemory, context);
    server.unregister(this.dmsGraphicBlockSize, context);
    server.unregister(this.fontEntry, context);
    server.unregister(this.characterEntry, context);
    server.unregister(this.dmsMessageEntry, context);
    server.unregister(this.dmsActionEntry, context);
    server.unregister(this.statMultiFieldEntry, context);
    server.unregister(this.pixelFailureEntry, context);
    server.unregister(this.dmsPowerStatusEntry, context);
    server.unregister(this.dmsClimateCtrlStatusEntry, context);
    server.unregister(this.pixelStatusEntry, context);
    server.unregister(this.dmsLampStatusEntry, context);
    server.unregister(this.dmsDrumStatusEntry, context);
    server.unregister(this.dmsLightSensorStatusEntry, context);
    server.unregister(this.dmsHumiditySensorStatusEntry, context);
    server.unregister(this.dmsTempSensorStatusEntry, context);
    server.unregister(this.dmsGraphicEntry, context);
    server.unregister(this.dmsGraphicBitmapEntry, context);
//--AgentGen BEGIN=_unregisterMOs
//--AgentGen END
  }

  // Notifications

  // Scalars
  public class DefaultBackgroundColor extends MOScalar<Integer32> {
    DefaultBackgroundColor(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(0));
//--AgentGen BEGIN=defaultBackgroundColor
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=defaultBackgroundColor::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultBackgroundColor::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultBackgroundColor::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultBackgroundColor::_METHODS
    //--AgentGen END

  }

  public class DefaultForegroundColor extends MOScalar<Integer32> {
    DefaultForegroundColor(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
//--AgentGen BEGIN=defaultForegroundColor
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=defaultForegroundColor::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultForegroundColor::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultForegroundColor::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultForegroundColor::_METHODS
    //--AgentGen END

  }

  public class DefaultFlashOn extends MOScalar<Integer32> {
    DefaultFlashOn(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(5));
//--AgentGen BEGIN=defaultFlashOn
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=defaultFlashOn::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultFlashOn::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultFlashOn::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultFlashOn::_METHODS
    //--AgentGen END

  }

  public class DefaultFlashOff extends MOScalar<Integer32> {
    DefaultFlashOff(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(5));
//--AgentGen BEGIN=defaultFlashOff
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=defaultFlashOff::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultFlashOff::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultFlashOff::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultFlashOff::_METHODS
    //--AgentGen END

  }

  public class DefaultFont extends MOScalar<Integer32> {
    DefaultFont(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(1));
//--AgentGen BEGIN=defaultFont
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 1L) && (v <= 255L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=defaultFont::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultFont::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultFont::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultFont::_METHODS
    //--AgentGen END

  }

  public class DefaultJustificationLine extends EnumeratedScalar<Integer32> {
    DefaultJustificationLine(OID oid, MOAccess access) {
      super(oid, access, new Integer32(),
            new int[] { DefaultJustificationLineEnum.left,
                        DefaultJustificationLineEnum.center,
                        DefaultJustificationLineEnum.right,
                        DefaultJustificationLineEnum.full });
      setValue(new Integer32(3));
//--AgentGen BEGIN=defaultJustificationLine
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=defaultJustificationLine::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultJustificationLine::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultJustificationLine::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultJustificationLine::_METHODS
    //--AgentGen END

  }

  public class DefaultJustificationPage extends EnumeratedScalar<Integer32> {
    DefaultJustificationPage(OID oid, MOAccess access) {
      super(oid, access, new Integer32(),
            new int[] { DefaultJustificationPageEnum.top,
                        DefaultJustificationPageEnum.middle,
                        DefaultJustificationPageEnum.bottom });
      setValue(new Integer32(3));
//--AgentGen BEGIN=defaultJustificationPage
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=defaultJustificationPage::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultJustificationPage::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultJustificationPage::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultJustificationPage::_METHODS
    //--AgentGen END

  }

  public class DefaultPageOnTime extends MOScalar<Integer32> {
    DefaultPageOnTime(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(30));
//--AgentGen BEGIN=defaultPageOnTime
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 1L) && (v <= 255L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=defaultPageOnTime::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultPageOnTime::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultPageOnTime::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultPageOnTime::_METHODS
    //--AgentGen END

  }

  public class DefaultPageOffTime extends MOScalar<Integer32> {
    DefaultPageOffTime(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(0));
//--AgentGen BEGIN=defaultPageOffTime
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=defaultPageOffTime::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultPageOffTime::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultPageOffTime::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultPageOffTime::_METHODS
    //--AgentGen END

  }

  public class DefaultCharacterSet extends EnumeratedScalar<Integer32> {
    DefaultCharacterSet(OID oid, MOAccess access) {
      super(oid, access, new Integer32(),
            new int[] { DefaultCharacterSetEnum.other,
                        DefaultCharacterSetEnum.eightBit });
      setValue(new Integer32(2));
//--AgentGen BEGIN=defaultCharacterSet
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=defaultCharacterSet::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=defaultCharacterSet::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=defaultCharacterSet::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultCharacterSet::_METHODS
    //--AgentGen END

  }

  public class DefaultBackgroundRGB extends MOScalar<OctetString> {
    DefaultBackgroundRGB(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=defaultBackgroundRGB
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
      if (!(((os.length() >= 1) && (os.length() <= 1)) ||
        ((os.length() >= 3) && (os.length() <= 3)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_LENGTH;
      }
    //--AgentGen BEGIN=defaultBackgroundRGB::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=defaultBackgroundRGB::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=defaultBackgroundRGB::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultBackgroundRGB::_METHODS
    //--AgentGen END

  }

  public class DefaultForegroundRGB extends MOScalar<OctetString> {
    DefaultForegroundRGB(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=defaultForegroundRGB
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
      if (!(((os.length() >= 1) && (os.length() <= 1)) ||
        ((os.length() >= 3) && (os.length() <= 3)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_LENGTH;
      }
    //--AgentGen BEGIN=defaultForegroundRGB::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=defaultForegroundRGB::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=defaultForegroundRGB::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=defaultForegroundRGB::_METHODS
    //--AgentGen END

  }

  public class DmsControlMode extends EnumeratedScalar<Integer32> {
    DmsControlMode(OID oid, MOAccess access) {
      super(oid, access, new Integer32(),
            new int[] { DmsControlModeEnum.local,
                        DmsControlModeEnum.central,
                        DmsControlModeEnum.centralOverride });
      setValue(new Integer32(4));
//--AgentGen BEGIN=dmsControlMode
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=dmsControlMode::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=dmsControlMode::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=dmsControlMode::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsControlMode::_METHODS
    //--AgentGen END

  }

  public class DmsSWReset extends MOScalar<Integer32> {
    DmsSWReset(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(0));
//--AgentGen BEGIN=dmsSWReset
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 1L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=dmsSWReset::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=dmsSWReset::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=dmsSWReset::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsSWReset::_METHODS
    //--AgentGen END

  }

  public class DmsMessageTimeRemaining extends MOScalar<Integer32> {
    DmsMessageTimeRemaining(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(65535));
//--AgentGen BEGIN=dmsMessageTimeRemaining
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 65535L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=dmsMessageTimeRemaining::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=dmsMessageTimeRemaining::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=dmsMessageTimeRemaining::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsMessageTimeRemaining::_METHODS
    //--AgentGen END

  }

  public class DmsShortPowerRecoveryMessage extends MOScalar<OctetString> {
    DmsShortPowerRecoveryMessage(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=dmsShortPowerRecoveryMessage
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
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_LENGTH;
      }
    //--AgentGen BEGIN=dmsShortPowerRecoveryMessage::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=dmsShortPowerRecoveryMessage::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=dmsShortPowerRecoveryMessage::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsShortPowerRecoveryMessage::_METHODS
    //--AgentGen END

  }

  public class DmsLongPowerRecoveryMessage extends MOScalar<OctetString> {
    DmsLongPowerRecoveryMessage(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=dmsLongPowerRecoveryMessage
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
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_LENGTH;
      }
    //--AgentGen BEGIN=dmsLongPowerRecoveryMessage::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=dmsLongPowerRecoveryMessage::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=dmsLongPowerRecoveryMessage::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsLongPowerRecoveryMessage::_METHODS
    //--AgentGen END

  }

  public class DmsShortPowerLossTime extends MOScalar<Integer32> {
    DmsShortPowerLossTime(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
//--AgentGen BEGIN=dmsShortPowerLossTime
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 65535L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=dmsShortPowerLossTime::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=dmsShortPowerLossTime::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=dmsShortPowerLossTime::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsShortPowerLossTime::_METHODS
    //--AgentGen END

  }

  public class DmsResetMessage extends MOScalar<OctetString> {
    DmsResetMessage(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=dmsResetMessage
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
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_LENGTH;
      }
    //--AgentGen BEGIN=dmsResetMessage::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=dmsResetMessage::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=dmsResetMessage::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsResetMessage::_METHODS
    //--AgentGen END

  }

  public class DmsCommunicationsLossMessage extends MOScalar<OctetString> {
    DmsCommunicationsLossMessage(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=dmsCommunicationsLossMessage
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
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_LENGTH;
      }
    //--AgentGen BEGIN=dmsCommunicationsLossMessage::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=dmsCommunicationsLossMessage::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=dmsCommunicationsLossMessage::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsCommunicationsLossMessage::_METHODS
    //--AgentGen END

  }

  public class DmsTimeCommLoss extends MOScalar<Integer32> {
    DmsTimeCommLoss(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
//--AgentGen BEGIN=dmsTimeCommLoss
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 65535L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=dmsTimeCommLoss::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=dmsTimeCommLoss::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=dmsTimeCommLoss::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsTimeCommLoss::_METHODS
    //--AgentGen END

  }

  public class DmsPowerLossMessage extends MOScalar<OctetString> {
    DmsPowerLossMessage(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=dmsPowerLossMessage
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
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_LENGTH;
      }
    //--AgentGen BEGIN=dmsPowerLossMessage::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=dmsPowerLossMessage::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=dmsPowerLossMessage::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsPowerLossMessage::_METHODS
    //--AgentGen END

  }

  public class DmsEndDurationMessage extends MOScalar<OctetString> {
    DmsEndDurationMessage(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=dmsEndDurationMessage
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
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_LENGTH;
      }
    //--AgentGen BEGIN=dmsEndDurationMessage::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=dmsEndDurationMessage::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=dmsEndDurationMessage::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsEndDurationMessage::_METHODS
    //--AgentGen END

  }

  public class DmsMemoryMgmt extends EnumeratedScalar<Integer32> {
    DmsMemoryMgmt(OID oid, MOAccess access) {
      super(oid, access, new Integer32(),
            new int[] { DmsMemoryMgmtEnum.normal,
                        DmsMemoryMgmtEnum.clearChangeableMessages,
                        DmsMemoryMgmtEnum.clearVolatileMessages });
      setValue(new Integer32(2));
//--AgentGen BEGIN=dmsMemoryMgmt
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=dmsMemoryMgmt::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=dmsMemoryMgmt::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=dmsMemoryMgmt::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsMemoryMgmt::_METHODS
    //--AgentGen END

  }

  public class VmsPixelServiceDuration extends MOScalar<Integer32> {
    VmsPixelServiceDuration(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
//--AgentGen BEGIN=vmsPixelServiceDuration
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 65535L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=vmsPixelServiceDuration::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=vmsPixelServiceDuration::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=vmsPixelServiceDuration::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=vmsPixelServiceDuration::_METHODS
    //--AgentGen END

  }

  public class VmsPixelServiceFrequency extends MOScalar<Integer32> {
    VmsPixelServiceFrequency(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(1440));
//--AgentGen BEGIN=vmsPixelServiceFrequency
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 1440L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=vmsPixelServiceFrequency::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=vmsPixelServiceFrequency::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=vmsPixelServiceFrequency::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=vmsPixelServiceFrequency::_METHODS
    //--AgentGen END

  }

  public class VmsPixelServiceTime extends MOScalar<Integer32> {
    VmsPixelServiceTime(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
      setValue(new Integer32(1));
//--AgentGen BEGIN=vmsPixelServiceTime
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 1440L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=vmsPixelServiceTime::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=vmsPixelServiceTime::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=vmsPixelServiceTime::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=vmsPixelServiceTime::_METHODS
    //--AgentGen END

  }

  public class DmsIllumControl extends EnumeratedScalar<Integer32> {
    DmsIllumControl(OID oid, MOAccess access) {
      super(oid, access, new Integer32(),
            new int[] { DmsIllumControlEnum.other,
                        DmsIllumControlEnum.photocell,
                        DmsIllumControlEnum.timer,
                        DmsIllumControlEnum.manual,
                        DmsIllumControlEnum.manualDirect,
                        DmsIllumControlEnum.manualIndexed });
      setValue(new Integer32(2));
//--AgentGen BEGIN=dmsIllumControl
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=dmsIllumControl::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=dmsIllumControl::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=dmsIllumControl::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsIllumControl::_METHODS
    //--AgentGen END

  }

  public class DmsIllumManLevel extends MOScalar<Integer32> {
    DmsIllumManLevel(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
//--AgentGen BEGIN=dmsIllumManLevel
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=dmsIllumManLevel::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=dmsIllumManLevel::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=dmsIllumManLevel::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsIllumManLevel::_METHODS
    //--AgentGen END

  }

  public class DmsIllumBrightnessValues extends MOScalar<OctetString> {
    DmsIllumBrightnessValues(OID oid, MOAccess access) {
      super(oid, access, new OctetString());
//--AgentGen BEGIN=dmsIllumBrightnessValues
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=dmsIllumBrightnessValues::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public OctetString getValue() {
    //--AgentGen BEGIN=dmsIllumBrightnessValues::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(OctetString newValue) {
    //--AgentGen BEGIN=dmsIllumBrightnessValues::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsIllumBrightnessValues::_METHODS
    //--AgentGen END

  }

  public class DmsCurrentSpeedLimit extends MOScalar<Integer32> {
    DmsCurrentSpeedLimit(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
//--AgentGen BEGIN=dmsCurrentSpeedLimit
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=dmsCurrentSpeedLimit::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=dmsCurrentSpeedLimit::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=dmsCurrentSpeedLimit::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=dmsCurrentSpeedLimit::_METHODS
    //--AgentGen END

  }

  public class PixelTestActivation extends EnumeratedScalar<Integer32> {
    PixelTestActivation(OID oid, MOAccess access) {
      super(oid, access, new Integer32(),
            new int[] { PixelTestActivationEnum.noTest,
                        PixelTestActivationEnum.test,
                        PixelTestActivationEnum.clearTable });
      setValue(new Integer32(2));
//--AgentGen BEGIN=pixelTestActivation
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=pixelTestActivation::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=pixelTestActivation::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=pixelTestActivation::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=pixelTestActivation::_METHODS
    //--AgentGen END

  }

  public class LampTestActivation extends EnumeratedScalar<Integer32> {
    LampTestActivation(OID oid, MOAccess access) {
      super(oid, access, new Integer32(),
            new int[] { LampTestActivationEnum.noTest,
                        LampTestActivationEnum.test });
      setValue(new Integer32(2));
//--AgentGen BEGIN=lampTestActivation
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=lampTestActivation::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=lampTestActivation::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=lampTestActivation::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=lampTestActivation::_METHODS
    //--AgentGen END

  }

  public class FanTestActivation extends EnumeratedScalar<Integer32> {
    FanTestActivation(OID oid, MOAccess access) {
      super(oid, access, new Integer32(),
            new int[] { FanTestActivationEnum.noTest,
                        FanTestActivationEnum.test });
//--AgentGen BEGIN=fanTestActivation
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
    //--AgentGen BEGIN=fanTestActivation::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=fanTestActivation::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=fanTestActivation::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=fanTestActivation::_METHODS
    //--AgentGen END

  }

  public class LowFuelThreshold extends MOScalar<Integer32> {
    LowFuelThreshold(OID oid, MOAccess access) {
      super(oid, access, new Integer32());
//--AgentGen BEGIN=lowFuelThreshold
//--AgentGen END
    }

    public int isValueOK(SubRequest request) {
      Variable newValue =
        request.getVariableBinding().getVariable();
      int valueOK = super.isValueOK(request);
      if (valueOK != SnmpConstants.SNMP_ERROR_SUCCESS) {
      	return valueOK;
      }
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 100L)))) {
        valueOK = SnmpConstants.SNMP_ERROR_WRONG_VALUE;
      }    
    //--AgentGen BEGIN=lowFuelThreshold::isValueOK
    //--AgentGen END
      return valueOK; 
    }

    public Integer32 getValue() {
    //--AgentGen BEGIN=lowFuelThreshold::getValue
    //--AgentGen END
      return super.getValue();    
    }

    public int setValue(Integer32 newValue) {
    //--AgentGen BEGIN=lowFuelThreshold::setValue
    //--AgentGen END
      return super.setValue(newValue);    
    }

    //--AgentGen BEGIN=lowFuelThreshold::_METHODS
    //--AgentGen END

  }


  // Value Validators
  /**
   * The <code>DefaultBackgroundColorValidator</code> implements the value
   * validation for <code>DefaultBackgroundColor</code>.
   */
  static class DefaultBackgroundColorValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=defaultBackgroundColor::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultForegroundColorValidator</code> implements the value
   * validation for <code>DefaultForegroundColor</code>.
   */
  static class DefaultForegroundColorValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=defaultForegroundColor::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultFlashOnValidator</code> implements the value
   * validation for <code>DefaultFlashOn</code>.
   */
  static class DefaultFlashOnValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=defaultFlashOn::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultFlashOffValidator</code> implements the value
   * validation for <code>DefaultFlashOff</code>.
   */
  static class DefaultFlashOffValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=defaultFlashOff::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultFontValidator</code> implements the value
   * validation for <code>DefaultFont</code>.
   */
  static class DefaultFontValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 1L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=defaultFont::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultJustificationLineValidator</code> implements the value
   * validation for <code>DefaultJustificationLine</code>.
   */
  static class DefaultJustificationLineValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=defaultJustificationLine::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultJustificationPageValidator</code> implements the value
   * validation for <code>DefaultJustificationPage</code>.
   */
  static class DefaultJustificationPageValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=defaultJustificationPage::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultPageOnTimeValidator</code> implements the value
   * validation for <code>DefaultPageOnTime</code>.
   */
  static class DefaultPageOnTimeValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 1L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=defaultPageOnTime::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultPageOffTimeValidator</code> implements the value
   * validation for <code>DefaultPageOffTime</code>.
   */
  static class DefaultPageOffTimeValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=defaultPageOffTime::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultCharacterSetValidator</code> implements the value
   * validation for <code>DefaultCharacterSet</code>.
   */
  static class DefaultCharacterSetValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=defaultCharacterSet::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultBackgroundRGBValidator</code> implements the value
   * validation for <code>DefaultBackgroundRGB</code>.
   */
  static class DefaultBackgroundRGBValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 1) && (os.length() <= 1)) ||
        ((os.length() >= 3) && (os.length() <= 3)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=defaultBackgroundRGB::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DefaultForegroundRGBValidator</code> implements the value
   * validation for <code>DefaultForegroundRGB</code>.
   */
  static class DefaultForegroundRGBValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 1) && (os.length() <= 1)) ||
        ((os.length() >= 3) && (os.length() <= 3)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=defaultForegroundRGB::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsControlModeValidator</code> implements the value
   * validation for <code>DmsControlMode</code>.
   */
  static class DmsControlModeValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsControlMode::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsSWResetValidator</code> implements the value
   * validation for <code>DmsSWReset</code>.
   */
  static class DmsSWResetValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 1L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsSWReset::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsActivateMessageValidator</code> implements the value
   * validation for <code>DmsActivateMessage</code>.
   */
  static class DmsActivateMessageValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 12) && (os.length() <= 12)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsActivateMessage::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsMessageTimeRemainingValidator</code> implements the value
   * validation for <code>DmsMessageTimeRemaining</code>.
   */
  static class DmsMessageTimeRemainingValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 65535L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsMessageTimeRemaining::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsShortPowerRecoveryMessageValidator</code> implements the value
   * validation for <code>DmsShortPowerRecoveryMessage</code>.
   */
  static class DmsShortPowerRecoveryMessageValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsShortPowerRecoveryMessage::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsLongPowerRecoveryMessageValidator</code> implements the value
   * validation for <code>DmsLongPowerRecoveryMessage</code>.
   */
  static class DmsLongPowerRecoveryMessageValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsLongPowerRecoveryMessage::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsShortPowerLossTimeValidator</code> implements the value
   * validation for <code>DmsShortPowerLossTime</code>.
   */
  static class DmsShortPowerLossTimeValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 65535L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsShortPowerLossTime::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsResetMessageValidator</code> implements the value
   * validation for <code>DmsResetMessage</code>.
   */
  static class DmsResetMessageValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsResetMessage::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsCommunicationsLossMessageValidator</code> implements the value
   * validation for <code>DmsCommunicationsLossMessage</code>.
   */
  static class DmsCommunicationsLossMessageValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsCommunicationsLossMessage::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsTimeCommLossValidator</code> implements the value
   * validation for <code>DmsTimeCommLoss</code>.
   */
  static class DmsTimeCommLossValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 65535L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsTimeCommLoss::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsPowerLossMessageValidator</code> implements the value
   * validation for <code>DmsPowerLossMessage</code>.
   */
  static class DmsPowerLossMessageValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsPowerLossMessage::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsEndDurationMessageValidator</code> implements the value
   * validation for <code>DmsEndDurationMessage</code>.
   */
  static class DmsEndDurationMessageValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsEndDurationMessage::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsMemoryMgmtValidator</code> implements the value
   * validation for <code>DmsMemoryMgmt</code>.
   */
  static class DmsMemoryMgmtValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsMemoryMgmt::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>VmsPixelServiceDurationValidator</code> implements the value
   * validation for <code>VmsPixelServiceDuration</code>.
   */
  static class VmsPixelServiceDurationValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 65535L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=vmsPixelServiceDuration::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>VmsPixelServiceFrequencyValidator</code> implements the value
   * validation for <code>VmsPixelServiceFrequency</code>.
   */
  static class VmsPixelServiceFrequencyValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 1440L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=vmsPixelServiceFrequency::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>VmsPixelServiceTimeValidator</code> implements the value
   * validation for <code>VmsPixelServiceTime</code>.
   */
  static class VmsPixelServiceTimeValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 1440L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=vmsPixelServiceTime::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsIllumControlValidator</code> implements the value
   * validation for <code>DmsIllumControl</code>.
   */
  static class DmsIllumControlValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsIllumControl::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsIllumManLevelValidator</code> implements the value
   * validation for <code>DmsIllumManLevel</code>.
   */
  static class DmsIllumManLevelValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsIllumManLevel::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsIllumBrightnessValuesValidator</code> implements the value
   * validation for <code>DmsIllumBrightnessValues</code>.
   */
  static class DmsIllumBrightnessValuesValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsIllumBrightnessValues::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsCurrentSpeedLimitValidator</code> implements the value
   * validation for <code>DmsCurrentSpeedLimit</code>.
   */
  static class DmsCurrentSpeedLimitValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsCurrentSpeedLimit::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>PixelTestActivationValidator</code> implements the value
   * validation for <code>PixelTestActivation</code>.
   */
  static class PixelTestActivationValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=pixelTestActivation::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>LampTestActivationValidator</code> implements the value
   * validation for <code>LampTestActivation</code>.
   */
  static class LampTestActivationValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=lampTestActivation::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>FanTestActivationValidator</code> implements the value
   * validation for <code>FanTestActivation</code>.
   */
  static class FanTestActivationValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=fanTestActivation::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>LowFuelThresholdValidator</code> implements the value
   * validation for <code>LowFuelThreshold</code>.
   */
  static class LowFuelThresholdValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 100L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=lowFuelThreshold::validate
    //--AgentGen END
    }
  }

  /**
   * The <code>FontNumberValidator</code> implements the value
   * validation for <code>FontNumber</code>.
   */
  static class FontNumberValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 1L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=fontNumber::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>FontNameValidator</code> implements the value
   * validation for <code>FontName</code>.
   */
  static class FontNameValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 0) && (os.length() <= 64)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=fontName::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>FontHeightValidator</code> implements the value
   * validation for <code>FontHeight</code>.
   */
  static class FontHeightValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=fontHeight::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>FontCharSpacingValidator</code> implements the value
   * validation for <code>FontCharSpacing</code>.
   */
  static class FontCharSpacingValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=fontCharSpacing::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>FontLineSpacingValidator</code> implements the value
   * validation for <code>FontLineSpacing</code>.
   */
  static class FontLineSpacingValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=fontLineSpacing::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>FontStatusValidator</code> implements the value
   * validation for <code>FontStatus</code>.
   */
  static class FontStatusValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=fontStatus::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>CharacterWidthValidator</code> implements the value
   * validation for <code>CharacterWidth</code>.
   */
  static class CharacterWidthValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=characterWidth::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>CharacterBitmapValidator</code> implements the value
   * validation for <code>CharacterBitmap</code>.
   */
  static class CharacterBitmapValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=characterBitmap::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsMessageMultiStringValidator</code> implements the value
   * validation for <code>DmsMessageMultiString</code>.
   */
  static class DmsMessageMultiStringValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsMessageMultiString::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsMessageOwnerValidator</code> implements the value
   * validation for <code>DmsMessageOwner</code>.
   */
  static class DmsMessageOwnerValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 0) && (os.length() <= 127)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsMessageOwner::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsMessageBeaconValidator</code> implements the value
   * validation for <code>DmsMessageBeacon</code>.
   */
  static class DmsMessageBeaconValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 1L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsMessageBeacon::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsMessagePixelServiceValidator</code> implements the value
   * validation for <code>DmsMessagePixelService</code>.
   */
  static class DmsMessagePixelServiceValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 1L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsMessagePixelService::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsMessageRunTimePriorityValidator</code> implements the value
   * validation for <code>DmsMessageRunTimePriority</code>.
   */
  static class DmsMessageRunTimePriorityValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 1L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsMessageRunTimePriority::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsMessageStatusValidator</code> implements the value
   * validation for <code>DmsMessageStatus</code>.
   */
  static class DmsMessageStatusValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsMessageStatus::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsActionMsgCodeValidator</code> implements the value
   * validation for <code>DmsActionMsgCode</code>.
   */
  static class DmsActionMsgCodeValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 5) && (os.length() <= 5)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsActionMsgCode::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsClimateCtrlTestActivationValidator</code> implements the value
   * validation for <code>DmsClimateCtrlTestActivation</code>.
   */
  static class DmsClimateCtrlTestActivationValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsClimateCtrlTestActivation::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsGraphicNumberValidator</code> implements the value
   * validation for <code>DmsGraphicNumber</code>.
   */
  static class DmsGraphicNumberValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 1L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsGraphicNumber::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsGraphicNameValidator</code> implements the value
   * validation for <code>DmsGraphicName</code>.
   */
  static class DmsGraphicNameValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 0) && (os.length() <= 64)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsGraphicName::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsGraphicHeightValidator</code> implements the value
   * validation for <code>DmsGraphicHeight</code>.
   */
  static class DmsGraphicHeightValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 1L) && (v <= 255L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsGraphicHeight::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsGraphicWidthValidator</code> implements the value
   * validation for <code>DmsGraphicWidth</code>.
   */
  static class DmsGraphicWidthValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 1L) && (v <= 65535L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsGraphicWidth::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsGraphicTypeValidator</code> implements the value
   * validation for <code>DmsGraphicType</code>.
   */
  static class DmsGraphicTypeValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsGraphicType::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsGraphicTransparentEnabledValidator</code> implements the value
   * validation for <code>DmsGraphicTransparentEnabled</code>.
   */
  static class DmsGraphicTransparentEnabledValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      long v = ((Integer32)newValue).getValue();
      if (!(((v >= 0L) && (v <= 1L)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_VALUE);
        return;
      }
    //--AgentGen BEGIN=dmsGraphicTransparentEnabled::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsGraphicTransparentColorValidator</code> implements the value
   * validation for <code>DmsGraphicTransparentColor</code>.
   */
  static class DmsGraphicTransparentColorValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 1) && (os.length() <= 1)) ||
        ((os.length() >= 3) && (os.length() <= 3)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
    //--AgentGen BEGIN=dmsGraphicTransparentColor::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsGraphicStatusValidator</code> implements the value
   * validation for <code>DmsGraphicStatus</code>.
   */
  static class DmsGraphicStatusValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsGraphicStatus::validate
    //--AgentGen END
    }
  }
  /**
   * The <code>DmsGraphicBlockBitmapValidator</code> implements the value
   * validation for <code>DmsGraphicBlockBitmap</code>.
   */
  static class DmsGraphicBlockBitmapValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
    //--AgentGen BEGIN=dmsGraphicBlockBitmap::validate
    //--AgentGen END
    }
  }

  // Rows and Factories

  public class FontEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=fontEntry::RowMembers
    //--AgentGen END

    public FontEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=fontEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getFontIndex() {
    //--AgentGen BEGIN=fontEntry::getFontIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxFontIndex);
    }  
    
    public void setFontIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=fontEntry::setFontIndex
    //--AgentGen END
      super.setValue(idxFontIndex, newColValue);
    }
    
    public Integer32 getFontNumber() {
    //--AgentGen BEGIN=fontEntry::getFontNumber
    //--AgentGen END
      return (Integer32) super.getValue(idxFontNumber);
    }  
    
    public void setFontNumber(Integer32 newColValue) {
    //--AgentGen BEGIN=fontEntry::setFontNumber
    //--AgentGen END
      super.setValue(idxFontNumber, newColValue);
    }
    
    public OctetString getFontName() {
    //--AgentGen BEGIN=fontEntry::getFontName
    //--AgentGen END
      return (OctetString) super.getValue(idxFontName);
    }  
    
    public void setFontName(OctetString newColValue) {
    //--AgentGen BEGIN=fontEntry::setFontName
    //--AgentGen END
      super.setValue(idxFontName, newColValue);
    }
    
    public Integer32 getFontHeight() {
    //--AgentGen BEGIN=fontEntry::getFontHeight
    //--AgentGen END
      return (Integer32) super.getValue(idxFontHeight);
    }  
    
    public void setFontHeight(Integer32 newColValue) {
    //--AgentGen BEGIN=fontEntry::setFontHeight
    //--AgentGen END
      super.setValue(idxFontHeight, newColValue);
    }
    
    public Integer32 getFontCharSpacing() {
    //--AgentGen BEGIN=fontEntry::getFontCharSpacing
    //--AgentGen END
      return (Integer32) super.getValue(idxFontCharSpacing);
    }  
    
    public void setFontCharSpacing(Integer32 newColValue) {
    //--AgentGen BEGIN=fontEntry::setFontCharSpacing
    //--AgentGen END
      super.setValue(idxFontCharSpacing, newColValue);
    }
    
    public Integer32 getFontLineSpacing() {
    //--AgentGen BEGIN=fontEntry::getFontLineSpacing
    //--AgentGen END
      return (Integer32) super.getValue(idxFontLineSpacing);
    }  
    
    public void setFontLineSpacing(Integer32 newColValue) {
    //--AgentGen BEGIN=fontEntry::setFontLineSpacing
    //--AgentGen END
      super.setValue(idxFontLineSpacing, newColValue);
    }
    
    public Integer32 getFontVersionID() {
    //--AgentGen BEGIN=fontEntry::getFontVersionID
    //--AgentGen END
      return (Integer32) super.getValue(idxFontVersionID);
    }  
    
    public void setFontVersionID(Integer32 newColValue) {
    //--AgentGen BEGIN=fontEntry::setFontVersionID
    //--AgentGen END
      super.setValue(idxFontVersionID, newColValue);
    }
    
    public Integer32 getFontStatus() {
    //--AgentGen BEGIN=fontEntry::getFontStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxFontStatus);
    }  
    
    public void setFontStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=fontEntry::setFontStatus
    //--AgentGen END
      super.setValue(idxFontStatus, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=fontEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxFontIndex: 
        	return getFontIndex();
        case idxFontNumber: 
        	return getFontNumber();
        case idxFontName: 
        	return getFontName();
        case idxFontHeight: 
        	return getFontHeight();
        case idxFontCharSpacing: 
        	return getFontCharSpacing();
        case idxFontLineSpacing: 
        	return getFontLineSpacing();
        case idxFontVersionID: 
        	return getFontVersionID();
        case idxFontStatus: 
        	return getFontStatus();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=fontEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxFontIndex: 
        	setFontIndex((Integer32)value);
        	break;
        case idxFontNumber: 
        	setFontNumber((Integer32)value);
        	break;
        case idxFontName: 
        	setFontName((OctetString)value);
        	break;
        case idxFontHeight: 
        	setFontHeight((Integer32)value);
        	break;
        case idxFontCharSpacing: 
        	setFontCharSpacing((Integer32)value);
        	break;
        case idxFontLineSpacing: 
        	setFontLineSpacing((Integer32)value);
        	break;
        case idxFontVersionID: 
        	setFontVersionID((Integer32)value);
        	break;
        case idxFontStatus: 
        	setFontStatus((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=fontEntry::Row
    //--AgentGen END
  }
  
  class FontEntryRowFactory 
        implements MOTableRowFactory<FontEntryRow>
  {
    public synchronized FontEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      FontEntryRow row = 
        new FontEntryRow(index, values);
    //--AgentGen BEGIN=fontEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(FontEntryRow row) {
    //--AgentGen BEGIN=fontEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=fontEntry::RowFactory
    //--AgentGen END
  }

  class DmsMessageEntryRowFactory 
        implements MOTableRowFactory<DmsMessageEntryRow>
  {
    public synchronized DmsMessageEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsMessageEntryRow row = 
        new DmsMessageEntryRow(index, values);
    //--AgentGen BEGIN=dmsMessageEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsMessageEntryRow row) {
    //--AgentGen BEGIN=dmsMessageEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsMessageEntry::RowFactory
    //--AgentGen END
  }

  public class DmsActionEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsActionEntry::RowMembers
    //--AgentGen END

    public DmsActionEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsActionEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsActionIndex() {
    //--AgentGen BEGIN=dmsActionEntry::getDmsActionIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsActionIndex);
    }  
    
    public void setDmsActionIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsActionEntry::setDmsActionIndex
    //--AgentGen END
      super.setValue(idxDmsActionIndex, newColValue);
    }
    
    public OctetString getDmsActionMsgCode() {
    //--AgentGen BEGIN=dmsActionEntry::getDmsActionMsgCode
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsActionMsgCode);
    }  
    
    public void setDmsActionMsgCode(OctetString newColValue) {
    //--AgentGen BEGIN=dmsActionEntry::setDmsActionMsgCode
    //--AgentGen END
      super.setValue(idxDmsActionMsgCode, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsActionEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsActionIndex: 
        	return getDmsActionIndex();
        case idxDmsActionMsgCode: 
        	return getDmsActionMsgCode();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsActionEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsActionIndex: 
        	setDmsActionIndex((Integer32)value);
        	break;
        case idxDmsActionMsgCode: 
        	setDmsActionMsgCode((OctetString)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsActionEntry::Row
    //--AgentGen END
  }
  
  class DmsActionEntryRowFactory 
        implements MOTableRowFactory<DmsActionEntryRow>
  {
    public synchronized DmsActionEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsActionEntryRow row = 
        new DmsActionEntryRow(index, values);
    //--AgentGen BEGIN=dmsActionEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsActionEntryRow row) {
    //--AgentGen BEGIN=dmsActionEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsActionEntry::RowFactory
    //--AgentGen END
  }

  public class StatMultiFieldEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=statMultiFieldEntry::RowMembers
    //--AgentGen END

    public StatMultiFieldEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=statMultiFieldEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getStatMultiFieldIndex() {
    //--AgentGen BEGIN=statMultiFieldEntry::getStatMultiFieldIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxStatMultiFieldIndex);
    }  
    
    public void setStatMultiFieldIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=statMultiFieldEntry::setStatMultiFieldIndex
    //--AgentGen END
      super.setValue(idxStatMultiFieldIndex, newColValue);
    }
    
    public Integer32 getStatMultiFieldCode() {
    //--AgentGen BEGIN=statMultiFieldEntry::getStatMultiFieldCode
    //--AgentGen END
      return (Integer32) super.getValue(idxStatMultiFieldCode);
    }  
    
    public void setStatMultiFieldCode(Integer32 newColValue) {
    //--AgentGen BEGIN=statMultiFieldEntry::setStatMultiFieldCode
    //--AgentGen END
      super.setValue(idxStatMultiFieldCode, newColValue);
    }
    
    public OctetString getStatMultiCurrentFieldValue() {
    //--AgentGen BEGIN=statMultiFieldEntry::getStatMultiCurrentFieldValue
    //--AgentGen END
      return (OctetString) super.getValue(idxStatMultiCurrentFieldValue);
    }  
    
    public void setStatMultiCurrentFieldValue(OctetString newColValue) {
    //--AgentGen BEGIN=statMultiFieldEntry::setStatMultiCurrentFieldValue
    //--AgentGen END
      super.setValue(idxStatMultiCurrentFieldValue, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=statMultiFieldEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxStatMultiFieldIndex: 
        	return getStatMultiFieldIndex();
        case idxStatMultiFieldCode: 
        	return getStatMultiFieldCode();
        case idxStatMultiCurrentFieldValue: 
        	return getStatMultiCurrentFieldValue();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=statMultiFieldEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxStatMultiFieldIndex: 
        	setStatMultiFieldIndex((Integer32)value);
        	break;
        case idxStatMultiFieldCode: 
        	setStatMultiFieldCode((Integer32)value);
        	break;
        case idxStatMultiCurrentFieldValue: 
        	setStatMultiCurrentFieldValue((OctetString)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=statMultiFieldEntry::Row
    //--AgentGen END
  }
  
  class StatMultiFieldEntryRowFactory 
        implements MOTableRowFactory<StatMultiFieldEntryRow>
  {
    public synchronized StatMultiFieldEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      StatMultiFieldEntryRow row = 
        new StatMultiFieldEntryRow(index, values);
    //--AgentGen BEGIN=statMultiFieldEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(StatMultiFieldEntryRow row) {
    //--AgentGen BEGIN=statMultiFieldEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=statMultiFieldEntry::RowFactory
    //--AgentGen END
  }

  public class PixelFailureEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=pixelFailureEntry::RowMembers
    //--AgentGen END

    public PixelFailureEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=pixelFailureEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getPixelFailureDetectionType() {
    //--AgentGen BEGIN=pixelFailureEntry::getPixelFailureDetectionType
    //--AgentGen END
      return (Integer32) super.getValue(idxPixelFailureDetectionType);
    }  
    
    public void setPixelFailureDetectionType(Integer32 newColValue) {
    //--AgentGen BEGIN=pixelFailureEntry::setPixelFailureDetectionType
    //--AgentGen END
      super.setValue(idxPixelFailureDetectionType, newColValue);
    }
    
    public Integer32 getPixelFailureIndex() {
    //--AgentGen BEGIN=pixelFailureEntry::getPixelFailureIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxPixelFailureIndex);
    }  
    
    public void setPixelFailureIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=pixelFailureEntry::setPixelFailureIndex
    //--AgentGen END
      super.setValue(idxPixelFailureIndex, newColValue);
    }
    
    public Integer32 getPixelFailureXLocation() {
    //--AgentGen BEGIN=pixelFailureEntry::getPixelFailureXLocation
    //--AgentGen END
      return (Integer32) super.getValue(idxPixelFailureXLocation);
    }  
    
    public void setPixelFailureXLocation(Integer32 newColValue) {
    //--AgentGen BEGIN=pixelFailureEntry::setPixelFailureXLocation
    //--AgentGen END
      super.setValue(idxPixelFailureXLocation, newColValue);
    }
    
    public Integer32 getPixelFailureYLocation() {
    //--AgentGen BEGIN=pixelFailureEntry::getPixelFailureYLocation
    //--AgentGen END
      return (Integer32) super.getValue(idxPixelFailureYLocation);
    }  
    
    public void setPixelFailureYLocation(Integer32 newColValue) {
    //--AgentGen BEGIN=pixelFailureEntry::setPixelFailureYLocation
    //--AgentGen END
      super.setValue(idxPixelFailureYLocation, newColValue);
    }
    
    public Integer32 getPixelFailureStatus() {
    //--AgentGen BEGIN=pixelFailureEntry::getPixelFailureStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxPixelFailureStatus);
    }  
    
    public void setPixelFailureStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=pixelFailureEntry::setPixelFailureStatus
    //--AgentGen END
      super.setValue(idxPixelFailureStatus, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=pixelFailureEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxPixelFailureDetectionType: 
        	return getPixelFailureDetectionType();
        case idxPixelFailureIndex: 
        	return getPixelFailureIndex();
        case idxPixelFailureXLocation: 
        	return getPixelFailureXLocation();
        case idxPixelFailureYLocation: 
        	return getPixelFailureYLocation();
        case idxPixelFailureStatus: 
        	return getPixelFailureStatus();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=pixelFailureEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxPixelFailureDetectionType: 
        	setPixelFailureDetectionType((Integer32)value);
        	break;
        case idxPixelFailureIndex: 
        	setPixelFailureIndex((Integer32)value);
        	break;
        case idxPixelFailureXLocation: 
        	setPixelFailureXLocation((Integer32)value);
        	break;
        case idxPixelFailureYLocation: 
        	setPixelFailureYLocation((Integer32)value);
        	break;
        case idxPixelFailureStatus: 
        	setPixelFailureStatus((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=pixelFailureEntry::Row
    //--AgentGen END
  }
  
  class PixelFailureEntryRowFactory 
        implements MOTableRowFactory<PixelFailureEntryRow>
  {
    public synchronized PixelFailureEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      PixelFailureEntryRow row = 
        new PixelFailureEntryRow(index, values);
    //--AgentGen BEGIN=pixelFailureEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(PixelFailureEntryRow row) {
    //--AgentGen BEGIN=pixelFailureEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=pixelFailureEntry::RowFactory
    //--AgentGen END
  }

  public class DmsPowerStatusEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsPowerStatusEntry::RowMembers
    //--AgentGen END

    public DmsPowerStatusEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsPowerStatusEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsPowerIndex() {
    //--AgentGen BEGIN=dmsPowerStatusEntry::getDmsPowerIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsPowerIndex);
    }  
    
    public void setDmsPowerIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsPowerStatusEntry::setDmsPowerIndex
    //--AgentGen END
      super.setValue(idxDmsPowerIndex, newColValue);
    }
    
    public OctetString getDmsPowerDescription() {
    //--AgentGen BEGIN=dmsPowerStatusEntry::getDmsPowerDescription
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsPowerDescription);
    }  
    
    public void setDmsPowerDescription(OctetString newColValue) {
    //--AgentGen BEGIN=dmsPowerStatusEntry::setDmsPowerDescription
    //--AgentGen END
      super.setValue(idxDmsPowerDescription, newColValue);
    }
    
    public OctetString getDmsPowerMfrStatus() {
    //--AgentGen BEGIN=dmsPowerStatusEntry::getDmsPowerMfrStatus
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsPowerMfrStatus);
    }  
    
    public void setDmsPowerMfrStatus(OctetString newColValue) {
    //--AgentGen BEGIN=dmsPowerStatusEntry::setDmsPowerMfrStatus
    //--AgentGen END
      super.setValue(idxDmsPowerMfrStatus, newColValue);
    }
    
    public Integer32 getDmsPowerStatus() {
    //--AgentGen BEGIN=dmsPowerStatusEntry::getDmsPowerStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsPowerStatus);
    }  
    
    public void setDmsPowerStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsPowerStatusEntry::setDmsPowerStatus
    //--AgentGen END
      super.setValue(idxDmsPowerStatus, newColValue);
    }
    
    public Integer32 getDmsPowerVoltage() {
    //--AgentGen BEGIN=dmsPowerStatusEntry::getDmsPowerVoltage
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsPowerVoltage);
    }  
    
    public void setDmsPowerVoltage(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsPowerStatusEntry::setDmsPowerVoltage
    //--AgentGen END
      super.setValue(idxDmsPowerVoltage, newColValue);
    }
    
    public Integer32 getDmsPowerType() {
    //--AgentGen BEGIN=dmsPowerStatusEntry::getDmsPowerType
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsPowerType);
    }  
    
    public void setDmsPowerType(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsPowerStatusEntry::setDmsPowerType
    //--AgentGen END
      super.setValue(idxDmsPowerType, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsPowerStatusEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsPowerIndex: 
        	return getDmsPowerIndex();
        case idxDmsPowerDescription: 
        	return getDmsPowerDescription();
        case idxDmsPowerMfrStatus: 
        	return getDmsPowerMfrStatus();
        case idxDmsPowerStatus: 
        	return getDmsPowerStatus();
        case idxDmsPowerVoltage: 
        	return getDmsPowerVoltage();
        case idxDmsPowerType: 
        	return getDmsPowerType();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsPowerStatusEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsPowerIndex: 
        	setDmsPowerIndex((Integer32)value);
        	break;
        case idxDmsPowerDescription: 
        	setDmsPowerDescription((OctetString)value);
        	break;
        case idxDmsPowerMfrStatus: 
        	setDmsPowerMfrStatus((OctetString)value);
        	break;
        case idxDmsPowerStatus: 
        	setDmsPowerStatus((Integer32)value);
        	break;
        case idxDmsPowerVoltage: 
        	setDmsPowerVoltage((Integer32)value);
        	break;
        case idxDmsPowerType: 
        	setDmsPowerType((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsPowerStatusEntry::Row
    //--AgentGen END
  }
  
  class DmsPowerStatusEntryRowFactory 
        implements MOTableRowFactory<DmsPowerStatusEntryRow>
  {
    public synchronized DmsPowerStatusEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsPowerStatusEntryRow row = 
        new DmsPowerStatusEntryRow(index, values);
    //--AgentGen BEGIN=dmsPowerStatusEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsPowerStatusEntryRow row) {
    //--AgentGen BEGIN=dmsPowerStatusEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsPowerStatusEntry::RowFactory
    //--AgentGen END
  }

  public class DmsClimateCtrlStatusEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::RowMembers
    //--AgentGen END

    public DmsClimateCtrlStatusEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsClimateCtrlIndex() {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::getDmsClimateCtrlIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsClimateCtrlIndex);
    }  
    
    public void setDmsClimateCtrlIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::setDmsClimateCtrlIndex
    //--AgentGen END
      super.setValue(idxDmsClimateCtrlIndex, newColValue);
    }
    
    public OctetString getDmsClimateCtrlDescription() {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::getDmsClimateCtrlDescription
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsClimateCtrlDescription);
    }  
    
    public void setDmsClimateCtrlDescription(OctetString newColValue) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::setDmsClimateCtrlDescription
    //--AgentGen END
      super.setValue(idxDmsClimateCtrlDescription, newColValue);
    }
    
    public OctetString getDmsClimateCtrlMfrStatus() {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::getDmsClimateCtrlMfrStatus
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsClimateCtrlMfrStatus);
    }  
    
    public void setDmsClimateCtrlMfrStatus(OctetString newColValue) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::setDmsClimateCtrlMfrStatus
    //--AgentGen END
      super.setValue(idxDmsClimateCtrlMfrStatus, newColValue);
    }
    
    public Integer32 getDmsClimateCtrlErrorStatus() {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::getDmsClimateCtrlErrorStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsClimateCtrlErrorStatus);
    }  
    
    public void setDmsClimateCtrlErrorStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::setDmsClimateCtrlErrorStatus
    //--AgentGen END
      super.setValue(idxDmsClimateCtrlErrorStatus, newColValue);
    }
    
    public Integer32 getDmsClimateCtrlOnStatus() {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::getDmsClimateCtrlOnStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsClimateCtrlOnStatus);
    }  
    
    public void setDmsClimateCtrlOnStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::setDmsClimateCtrlOnStatus
    //--AgentGen END
      super.setValue(idxDmsClimateCtrlOnStatus, newColValue);
    }
    
    public Integer32 getDmsClimateCtrlTestActivation() {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::getDmsClimateCtrlTestActivation
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsClimateCtrlTestActivation);
    }  
    
    public void setDmsClimateCtrlTestActivation(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::setDmsClimateCtrlTestActivation
    //--AgentGen END
      super.setValue(idxDmsClimateCtrlTestActivation, newColValue);
    }
    
    public OctetString getDmsClimateCtrlAbortReason() {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::getDmsClimateCtrlAbortReason
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsClimateCtrlAbortReason);
    }  
    
    public void setDmsClimateCtrlAbortReason(OctetString newColValue) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::setDmsClimateCtrlAbortReason
    //--AgentGen END
      super.setValue(idxDmsClimateCtrlAbortReason, newColValue);
    }
    
    public Integer32 getDmsClimateCtrlType() {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::getDmsClimateCtrlType
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsClimateCtrlType);
    }  
    
    public void setDmsClimateCtrlType(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::setDmsClimateCtrlType
    //--AgentGen END
      super.setValue(idxDmsClimateCtrlType, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsClimateCtrlIndex: 
        	return getDmsClimateCtrlIndex();
        case idxDmsClimateCtrlDescription: 
        	return getDmsClimateCtrlDescription();
        case idxDmsClimateCtrlMfrStatus: 
        	return getDmsClimateCtrlMfrStatus();
        case idxDmsClimateCtrlErrorStatus: 
        	return getDmsClimateCtrlErrorStatus();
        case idxDmsClimateCtrlOnStatus: 
        	return getDmsClimateCtrlOnStatus();
        case idxDmsClimateCtrlTestActivation: 
        	return getDmsClimateCtrlTestActivation();
        case idxDmsClimateCtrlAbortReason: 
        	return getDmsClimateCtrlAbortReason();
        case idxDmsClimateCtrlType: 
        	return getDmsClimateCtrlType();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsClimateCtrlIndex: 
        	setDmsClimateCtrlIndex((Integer32)value);
        	break;
        case idxDmsClimateCtrlDescription: 
        	setDmsClimateCtrlDescription((OctetString)value);
        	break;
        case idxDmsClimateCtrlMfrStatus: 
        	setDmsClimateCtrlMfrStatus((OctetString)value);
        	break;
        case idxDmsClimateCtrlErrorStatus: 
        	setDmsClimateCtrlErrorStatus((Integer32)value);
        	break;
        case idxDmsClimateCtrlOnStatus: 
        	setDmsClimateCtrlOnStatus((Integer32)value);
        	break;
        case idxDmsClimateCtrlTestActivation: 
        	setDmsClimateCtrlTestActivation((Integer32)value);
        	break;
        case idxDmsClimateCtrlAbortReason: 
        	setDmsClimateCtrlAbortReason((OctetString)value);
        	break;
        case idxDmsClimateCtrlType: 
        	setDmsClimateCtrlType((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::Row
    //--AgentGen END
  }
  
  class DmsClimateCtrlStatusEntryRowFactory 
        implements MOTableRowFactory<DmsClimateCtrlStatusEntryRow>
  {
    public synchronized DmsClimateCtrlStatusEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsClimateCtrlStatusEntryRow row = 
        new DmsClimateCtrlStatusEntryRow(index, values);
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsClimateCtrlStatusEntryRow row) {
    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsClimateCtrlStatusEntry::RowFactory
    //--AgentGen END
  }

  public class PixelStatusEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=pixelStatusEntry::RowMembers
    //--AgentGen END

    public PixelStatusEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=pixelStatusEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsPixelStatusIndex() {
    //--AgentGen BEGIN=pixelStatusEntry::getDmsPixelStatusIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsPixelStatusIndex);
    }  
    
    public void setDmsPixelStatusIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=pixelStatusEntry::setDmsPixelStatusIndex
    //--AgentGen END
      super.setValue(idxDmsPixelStatusIndex, newColValue);
    }
    
    public OctetString getDmsPixelStatus() {
    //--AgentGen BEGIN=pixelStatusEntry::getDmsPixelStatus
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsPixelStatus);
    }  
    
    public void setDmsPixelStatus(OctetString newColValue) {
    //--AgentGen BEGIN=pixelStatusEntry::setDmsPixelStatus
    //--AgentGen END
      super.setValue(idxDmsPixelStatus, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=pixelStatusEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsPixelStatusIndex: 
        	return getDmsPixelStatusIndex();
        case idxDmsPixelStatus: 
        	return getDmsPixelStatus();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=pixelStatusEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsPixelStatusIndex: 
        	setDmsPixelStatusIndex((Integer32)value);
        	break;
        case idxDmsPixelStatus: 
        	setDmsPixelStatus((OctetString)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=pixelStatusEntry::Row
    //--AgentGen END
  }
  
  class PixelStatusEntryRowFactory 
        implements MOTableRowFactory<PixelStatusEntryRow>
  {
    public synchronized PixelStatusEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      PixelStatusEntryRow row = 
        new PixelStatusEntryRow(index, values);
    //--AgentGen BEGIN=pixelStatusEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(PixelStatusEntryRow row) {
    //--AgentGen BEGIN=pixelStatusEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=pixelStatusEntry::RowFactory
    //--AgentGen END
  }

  public class DmsLampStatusEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsLampStatusEntry::RowMembers
    //--AgentGen END

    public DmsLampStatusEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsLampStatusEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsLampIndex() {
    //--AgentGen BEGIN=dmsLampStatusEntry::getDmsLampIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsLampIndex);
    }  
    
    public void setDmsLampIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsLampStatusEntry::setDmsLampIndex
    //--AgentGen END
      super.setValue(idxDmsLampIndex, newColValue);
    }
    
    public OctetString getDmsLampDescription() {
    //--AgentGen BEGIN=dmsLampStatusEntry::getDmsLampDescription
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsLampDescription);
    }  
    
    public void setDmsLampDescription(OctetString newColValue) {
    //--AgentGen BEGIN=dmsLampStatusEntry::setDmsLampDescription
    //--AgentGen END
      super.setValue(idxDmsLampDescription, newColValue);
    }
    
    public OctetString getDmsLampMfrStatus() {
    //--AgentGen BEGIN=dmsLampStatusEntry::getDmsLampMfrStatus
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsLampMfrStatus);
    }  
    
    public void setDmsLampMfrStatus(OctetString newColValue) {
    //--AgentGen BEGIN=dmsLampStatusEntry::setDmsLampMfrStatus
    //--AgentGen END
      super.setValue(idxDmsLampMfrStatus, newColValue);
    }
    
    public Integer32 getDmsLampStatus() {
    //--AgentGen BEGIN=dmsLampStatusEntry::getDmsLampStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsLampStatus);
    }  
    
    public void setDmsLampStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsLampStatusEntry::setDmsLampStatus
    //--AgentGen END
      super.setValue(idxDmsLampStatus, newColValue);
    }
    
    public Integer32 getDmsLampPixelTop() {
    //--AgentGen BEGIN=dmsLampStatusEntry::getDmsLampPixelTop
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsLampPixelTop);
    }  
    
    public void setDmsLampPixelTop(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsLampStatusEntry::setDmsLampPixelTop
    //--AgentGen END
      super.setValue(idxDmsLampPixelTop, newColValue);
    }
    
    public Integer32 getDmsLampPixelLeft() {
    //--AgentGen BEGIN=dmsLampStatusEntry::getDmsLampPixelLeft
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsLampPixelLeft);
    }  
    
    public void setDmsLampPixelLeft(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsLampStatusEntry::setDmsLampPixelLeft
    //--AgentGen END
      super.setValue(idxDmsLampPixelLeft, newColValue);
    }
    
    public Integer32 getDmsLampPixelBottom() {
    //--AgentGen BEGIN=dmsLampStatusEntry::getDmsLampPixelBottom
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsLampPixelBottom);
    }  
    
    public void setDmsLampPixelBottom(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsLampStatusEntry::setDmsLampPixelBottom
    //--AgentGen END
      super.setValue(idxDmsLampPixelBottom, newColValue);
    }
    
    public Integer32 getDmsLampPixelRight() {
    //--AgentGen BEGIN=dmsLampStatusEntry::getDmsLampPixelRight
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsLampPixelRight);
    }  
    
    public void setDmsLampPixelRight(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsLampStatusEntry::setDmsLampPixelRight
    //--AgentGen END
      super.setValue(idxDmsLampPixelRight, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsLampStatusEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsLampIndex: 
        	return getDmsLampIndex();
        case idxDmsLampDescription: 
        	return getDmsLampDescription();
        case idxDmsLampMfrStatus: 
        	return getDmsLampMfrStatus();
        case idxDmsLampStatus: 
        	return getDmsLampStatus();
        case idxDmsLampPixelTop: 
        	return getDmsLampPixelTop();
        case idxDmsLampPixelLeft: 
        	return getDmsLampPixelLeft();
        case idxDmsLampPixelBottom: 
        	return getDmsLampPixelBottom();
        case idxDmsLampPixelRight: 
        	return getDmsLampPixelRight();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsLampStatusEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsLampIndex: 
        	setDmsLampIndex((Integer32)value);
        	break;
        case idxDmsLampDescription: 
        	setDmsLampDescription((OctetString)value);
        	break;
        case idxDmsLampMfrStatus: 
        	setDmsLampMfrStatus((OctetString)value);
        	break;
        case idxDmsLampStatus: 
        	setDmsLampStatus((Integer32)value);
        	break;
        case idxDmsLampPixelTop: 
        	setDmsLampPixelTop((Integer32)value);
        	break;
        case idxDmsLampPixelLeft: 
        	setDmsLampPixelLeft((Integer32)value);
        	break;
        case idxDmsLampPixelBottom: 
        	setDmsLampPixelBottom((Integer32)value);
        	break;
        case idxDmsLampPixelRight: 
        	setDmsLampPixelRight((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsLampStatusEntry::Row
    //--AgentGen END
  }
  
  class DmsLampStatusEntryRowFactory 
        implements MOTableRowFactory<DmsLampStatusEntryRow>
  {
    public synchronized DmsLampStatusEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsLampStatusEntryRow row = 
        new DmsLampStatusEntryRow(index, values);
    //--AgentGen BEGIN=dmsLampStatusEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsLampStatusEntryRow row) {
    //--AgentGen BEGIN=dmsLampStatusEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsLampStatusEntry::RowFactory
    //--AgentGen END
  }

  public class DmsDrumStatusEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsDrumStatusEntry::RowMembers
    //--AgentGen END

    public DmsDrumStatusEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsDrumStatusEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsDrumIndex() {
    //--AgentGen BEGIN=dmsDrumStatusEntry::getDmsDrumIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsDrumIndex);
    }  
    
    public void setDmsDrumIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsDrumStatusEntry::setDmsDrumIndex
    //--AgentGen END
      super.setValue(idxDmsDrumIndex, newColValue);
    }
    
    public OctetString getDmsDrumDescription() {
    //--AgentGen BEGIN=dmsDrumStatusEntry::getDmsDrumDescription
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsDrumDescription);
    }  
    
    public void setDmsDrumDescription(OctetString newColValue) {
    //--AgentGen BEGIN=dmsDrumStatusEntry::setDmsDrumDescription
    //--AgentGen END
      super.setValue(idxDmsDrumDescription, newColValue);
    }
    
    public OctetString getDmsDrumMfrStatus() {
    //--AgentGen BEGIN=dmsDrumStatusEntry::getDmsDrumMfrStatus
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsDrumMfrStatus);
    }  
    
    public void setDmsDrumMfrStatus(OctetString newColValue) {
    //--AgentGen BEGIN=dmsDrumStatusEntry::setDmsDrumMfrStatus
    //--AgentGen END
      super.setValue(idxDmsDrumMfrStatus, newColValue);
    }
    
    public Integer32 getDmsDrumStatus() {
    //--AgentGen BEGIN=dmsDrumStatusEntry::getDmsDrumStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsDrumStatus);
    }  
    
    public void setDmsDrumStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsDrumStatusEntry::setDmsDrumStatus
    //--AgentGen END
      super.setValue(idxDmsDrumStatus, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsDrumStatusEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsDrumIndex: 
        	return getDmsDrumIndex();
        case idxDmsDrumDescription: 
        	return getDmsDrumDescription();
        case idxDmsDrumMfrStatus: 
        	return getDmsDrumMfrStatus();
        case idxDmsDrumStatus: 
        	return getDmsDrumStatus();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsDrumStatusEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsDrumIndex: 
        	setDmsDrumIndex((Integer32)value);
        	break;
        case idxDmsDrumDescription: 
        	setDmsDrumDescription((OctetString)value);
        	break;
        case idxDmsDrumMfrStatus: 
        	setDmsDrumMfrStatus((OctetString)value);
        	break;
        case idxDmsDrumStatus: 
        	setDmsDrumStatus((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsDrumStatusEntry::Row
    //--AgentGen END
  }
  
  class DmsDrumStatusEntryRowFactory 
        implements MOTableRowFactory<DmsDrumStatusEntryRow>
  {
    public synchronized DmsDrumStatusEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsDrumStatusEntryRow row = 
        new DmsDrumStatusEntryRow(index, values);
    //--AgentGen BEGIN=dmsDrumStatusEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsDrumStatusEntryRow row) {
    //--AgentGen BEGIN=dmsDrumStatusEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsDrumStatusEntry::RowFactory
    //--AgentGen END
  }

  public class DmsLightSensorStatusEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsLightSensorStatusEntry::RowMembers
    //--AgentGen END

    public DmsLightSensorStatusEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsLightSensorIndex() {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::getDmsLightSensorIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsLightSensorIndex);
    }  
    
    public void setDmsLightSensorIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::setDmsLightSensorIndex
    //--AgentGen END
      super.setValue(idxDmsLightSensorIndex, newColValue);
    }
    
    public OctetString getDmsLightSensorDescription() {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::getDmsLightSensorDescription
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsLightSensorDescription);
    }  
    
    public void setDmsLightSensorDescription(OctetString newColValue) {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::setDmsLightSensorDescription
    //--AgentGen END
      super.setValue(idxDmsLightSensorDescription, newColValue);
    }
    
    public Integer32 getDmsLightSensorCurrentReading() {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::getDmsLightSensorCurrentReading
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsLightSensorCurrentReading);
    }  
    
    public void setDmsLightSensorCurrentReading(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::setDmsLightSensorCurrentReading
    //--AgentGen END
      super.setValue(idxDmsLightSensorCurrentReading, newColValue);
    }
    
    public Integer32 getDmsLightSensorStatus() {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::getDmsLightSensorStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsLightSensorStatus);
    }  
    
    public void setDmsLightSensorStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::setDmsLightSensorStatus
    //--AgentGen END
      super.setValue(idxDmsLightSensorStatus, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsLightSensorIndex: 
        	return getDmsLightSensorIndex();
        case idxDmsLightSensorDescription: 
        	return getDmsLightSensorDescription();
        case idxDmsLightSensorCurrentReading: 
        	return getDmsLightSensorCurrentReading();
        case idxDmsLightSensorStatus: 
        	return getDmsLightSensorStatus();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsLightSensorIndex: 
        	setDmsLightSensorIndex((Integer32)value);
        	break;
        case idxDmsLightSensorDescription: 
        	setDmsLightSensorDescription((OctetString)value);
        	break;
        case idxDmsLightSensorCurrentReading: 
        	setDmsLightSensorCurrentReading((Integer32)value);
        	break;
        case idxDmsLightSensorStatus: 
        	setDmsLightSensorStatus((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsLightSensorStatusEntry::Row
    //--AgentGen END
  }
  
  class DmsLightSensorStatusEntryRowFactory 
        implements MOTableRowFactory<DmsLightSensorStatusEntryRow>
  {
    public synchronized DmsLightSensorStatusEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsLightSensorStatusEntryRow row = 
        new DmsLightSensorStatusEntryRow(index, values);
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsLightSensorStatusEntryRow row) {
    //--AgentGen BEGIN=dmsLightSensorStatusEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsLightSensorStatusEntry::RowFactory
    //--AgentGen END
  }

  public class DmsHumiditySensorStatusEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::RowMembers
    //--AgentGen END

    public DmsHumiditySensorStatusEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsHumiditySensorIndex() {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::getDmsHumiditySensorIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsHumiditySensorIndex);
    }  
    
    public void setDmsHumiditySensorIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::setDmsHumiditySensorIndex
    //--AgentGen END
      super.setValue(idxDmsHumiditySensorIndex, newColValue);
    }
    
    public OctetString getDmsHumiditySensorDescription() {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::getDmsHumiditySensorDescription
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsHumiditySensorDescription);
    }  
    
    public void setDmsHumiditySensorDescription(OctetString newColValue) {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::setDmsHumiditySensorDescription
    //--AgentGen END
      super.setValue(idxDmsHumiditySensorDescription, newColValue);
    }
    
    public Integer32 getDmsHumiditySensorCurrentReading() {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::getDmsHumiditySensorCurrentReading
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsHumiditySensorCurrentReading);
    }  
    
    public void setDmsHumiditySensorCurrentReading(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::setDmsHumiditySensorCurrentReading
    //--AgentGen END
      super.setValue(idxDmsHumiditySensorCurrentReading, newColValue);
    }
    
    public Integer32 getDmsHumiditySensorStatus() {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::getDmsHumiditySensorStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsHumiditySensorStatus);
    }  
    
    public void setDmsHumiditySensorStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::setDmsHumiditySensorStatus
    //--AgentGen END
      super.setValue(idxDmsHumiditySensorStatus, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsHumiditySensorIndex: 
        	return getDmsHumiditySensorIndex();
        case idxDmsHumiditySensorDescription: 
        	return getDmsHumiditySensorDescription();
        case idxDmsHumiditySensorCurrentReading: 
        	return getDmsHumiditySensorCurrentReading();
        case idxDmsHumiditySensorStatus: 
        	return getDmsHumiditySensorStatus();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsHumiditySensorIndex: 
        	setDmsHumiditySensorIndex((Integer32)value);
        	break;
        case idxDmsHumiditySensorDescription: 
        	setDmsHumiditySensorDescription((OctetString)value);
        	break;
        case idxDmsHumiditySensorCurrentReading: 
        	setDmsHumiditySensorCurrentReading((Integer32)value);
        	break;
        case idxDmsHumiditySensorStatus: 
        	setDmsHumiditySensorStatus((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::Row
    //--AgentGen END
  }
  
  class DmsHumiditySensorStatusEntryRowFactory 
        implements MOTableRowFactory<DmsHumiditySensorStatusEntryRow>
  {
    public synchronized DmsHumiditySensorStatusEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsHumiditySensorStatusEntryRow row = 
        new DmsHumiditySensorStatusEntryRow(index, values);
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsHumiditySensorStatusEntryRow row) {
    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsHumiditySensorStatusEntry::RowFactory
    //--AgentGen END
  }

  public class DmsTempSensorStatusEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsTempSensorStatusEntry::RowMembers
    //--AgentGen END

    public DmsTempSensorStatusEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsTempSensorIndex() {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::getDmsTempSensorIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsTempSensorIndex);
    }  
    
    public void setDmsTempSensorIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::setDmsTempSensorIndex
    //--AgentGen END
      super.setValue(idxDmsTempSensorIndex, newColValue);
    }
    
    public OctetString getDmsTempSensorDescription() {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::getDmsTempSensorDescription
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsTempSensorDescription);
    }  
    
    public void setDmsTempSensorDescription(OctetString newColValue) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::setDmsTempSensorDescription
    //--AgentGen END
      super.setValue(idxDmsTempSensorDescription, newColValue);
    }
    
    public Integer32 getDmsTempSensorCurrentReading() {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::getDmsTempSensorCurrentReading
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsTempSensorCurrentReading);
    }  
    
    public void setDmsTempSensorCurrentReading(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::setDmsTempSensorCurrentReading
    //--AgentGen END
      super.setValue(idxDmsTempSensorCurrentReading, newColValue);
    }
    
    public Integer32 getDmsTempSensorHighWarningTemperature() {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::getDmsTempSensorHighWarningTemperature
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsTempSensorHighWarningTemperature);
    }  
    
    public void setDmsTempSensorHighWarningTemperature(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::setDmsTempSensorHighWarningTemperature
    //--AgentGen END
      super.setValue(idxDmsTempSensorHighWarningTemperature, newColValue);
    }
    
    public Integer32 getDmsTempSensorLowWarningTemperature() {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::getDmsTempSensorLowWarningTemperature
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsTempSensorLowWarningTemperature);
    }  
    
    public void setDmsTempSensorLowWarningTemperature(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::setDmsTempSensorLowWarningTemperature
    //--AgentGen END
      super.setValue(idxDmsTempSensorLowWarningTemperature, newColValue);
    }
    
    public Integer32 getDmsTempSensorHighCriticalTemperature() {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::getDmsTempSensorHighCriticalTemperature
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsTempSensorHighCriticalTemperature);
    }  
    
    public void setDmsTempSensorHighCriticalTemperature(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::setDmsTempSensorHighCriticalTemperature
    //--AgentGen END
      super.setValue(idxDmsTempSensorHighCriticalTemperature, newColValue);
    }
    
    public Integer32 getDmsTempSensorLowCriticalTemperature() {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::getDmsTempSensorLowCriticalTemperature
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsTempSensorLowCriticalTemperature);
    }  
    
    public void setDmsTempSensorLowCriticalTemperature(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::setDmsTempSensorLowCriticalTemperature
    //--AgentGen END
      super.setValue(idxDmsTempSensorLowCriticalTemperature, newColValue);
    }
    
    public Integer32 getDmsTempSensorStatus() {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::getDmsTempSensorStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsTempSensorStatus);
    }  
    
    public void setDmsTempSensorStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::setDmsTempSensorStatus
    //--AgentGen END
      super.setValue(idxDmsTempSensorStatus, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsTempSensorIndex: 
        	return getDmsTempSensorIndex();
        case idxDmsTempSensorDescription: 
        	return getDmsTempSensorDescription();
        case idxDmsTempSensorCurrentReading: 
        	return getDmsTempSensorCurrentReading();
        case idxDmsTempSensorHighWarningTemperature: 
        	return getDmsTempSensorHighWarningTemperature();
        case idxDmsTempSensorLowWarningTemperature: 
        	return getDmsTempSensorLowWarningTemperature();
        case idxDmsTempSensorHighCriticalTemperature: 
        	return getDmsTempSensorHighCriticalTemperature();
        case idxDmsTempSensorLowCriticalTemperature: 
        	return getDmsTempSensorLowCriticalTemperature();
        case idxDmsTempSensorStatus: 
        	return getDmsTempSensorStatus();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsTempSensorIndex: 
        	setDmsTempSensorIndex((Integer32)value);
        	break;
        case idxDmsTempSensorDescription: 
        	setDmsTempSensorDescription((OctetString)value);
        	break;
        case idxDmsTempSensorCurrentReading: 
        	setDmsTempSensorCurrentReading((Integer32)value);
        	break;
        case idxDmsTempSensorHighWarningTemperature: 
        	setDmsTempSensorHighWarningTemperature((Integer32)value);
        	break;
        case idxDmsTempSensorLowWarningTemperature: 
        	setDmsTempSensorLowWarningTemperature((Integer32)value);
        	break;
        case idxDmsTempSensorHighCriticalTemperature: 
        	setDmsTempSensorHighCriticalTemperature((Integer32)value);
        	break;
        case idxDmsTempSensorLowCriticalTemperature: 
        	setDmsTempSensorLowCriticalTemperature((Integer32)value);
        	break;
        case idxDmsTempSensorStatus: 
        	setDmsTempSensorStatus((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsTempSensorStatusEntry::Row
    //--AgentGen END
  }
  
  class DmsTempSensorStatusEntryRowFactory 
        implements MOTableRowFactory<DmsTempSensorStatusEntryRow>
  {
    public synchronized DmsTempSensorStatusEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsTempSensorStatusEntryRow row = 
        new DmsTempSensorStatusEntryRow(index, values);
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsTempSensorStatusEntryRow row) {
    //--AgentGen BEGIN=dmsTempSensorStatusEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsTempSensorStatusEntry::RowFactory
    //--AgentGen END
  }

  public class DmsGraphicEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsGraphicEntry::RowMembers
    //--AgentGen END

    public DmsGraphicEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsGraphicEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsGraphicIndex() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicIndex);
    }  
    
    public void setDmsGraphicIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicIndex
    //--AgentGen END
      super.setValue(idxDmsGraphicIndex, newColValue);
    }
    
    public Integer32 getDmsGraphicNumber() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicNumber
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicNumber);
    }  
    
    public void setDmsGraphicNumber(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicNumber
    //--AgentGen END
      super.setValue(idxDmsGraphicNumber, newColValue);
    }
    
    public OctetString getDmsGraphicName() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicName
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsGraphicName);
    }  
    
    public void setDmsGraphicName(OctetString newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicName
    //--AgentGen END
      super.setValue(idxDmsGraphicName, newColValue);
    }
    
    public Integer32 getDmsGraphicHeight() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicHeight
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicHeight);
    }  
    
    public void setDmsGraphicHeight(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicHeight
    //--AgentGen END
      super.setValue(idxDmsGraphicHeight, newColValue);
    }
    
    public Integer32 getDmsGraphicWidth() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicWidth
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicWidth);
    }  
    
    public void setDmsGraphicWidth(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicWidth
    //--AgentGen END
      super.setValue(idxDmsGraphicWidth, newColValue);
    }
    
    public Integer32 getDmsGraphicType() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicType
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicType);
    }  
    
    public void setDmsGraphicType(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicType
    //--AgentGen END
      super.setValue(idxDmsGraphicType, newColValue);
    }
    
    public Integer32 getDmsGraphicID() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicID
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicID);
    }  
    
    public void setDmsGraphicID(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicID
    //--AgentGen END
      super.setValue(idxDmsGraphicID, newColValue);
    }
    
    public Integer32 getDmsGraphicTransparentEnabled() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicTransparentEnabled
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicTransparentEnabled);
    }  
    
    public void setDmsGraphicTransparentEnabled(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicTransparentEnabled
    //--AgentGen END
      super.setValue(idxDmsGraphicTransparentEnabled, newColValue);
    }
    
    public OctetString getDmsGraphicTransparentColor() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicTransparentColor
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsGraphicTransparentColor);
    }  
    
    public void setDmsGraphicTransparentColor(OctetString newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicTransparentColor
    //--AgentGen END
      super.setValue(idxDmsGraphicTransparentColor, newColValue);
    }
    
    public Integer32 getDmsGraphicStatus() {
    //--AgentGen BEGIN=dmsGraphicEntry::getDmsGraphicStatus
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicStatus);
    }  
    
    public void setDmsGraphicStatus(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicEntry::setDmsGraphicStatus
    //--AgentGen END
      super.setValue(idxDmsGraphicStatus, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsGraphicEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsGraphicIndex: 
        	return getDmsGraphicIndex();
        case idxDmsGraphicNumber: 
        	return getDmsGraphicNumber();
        case idxDmsGraphicName: 
        	return getDmsGraphicName();
        case idxDmsGraphicHeight: 
        	return getDmsGraphicHeight();
        case idxDmsGraphicWidth: 
        	return getDmsGraphicWidth();
        case idxDmsGraphicType: 
        	return getDmsGraphicType();
        case idxDmsGraphicID: 
        	return getDmsGraphicID();
        case idxDmsGraphicTransparentEnabled: 
        	return getDmsGraphicTransparentEnabled();
        case idxDmsGraphicTransparentColor: 
        	return getDmsGraphicTransparentColor();
        case idxDmsGraphicStatus: 
        	return getDmsGraphicStatus();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsGraphicEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsGraphicIndex: 
        	setDmsGraphicIndex((Integer32)value);
        	break;
        case idxDmsGraphicNumber: 
        	setDmsGraphicNumber((Integer32)value);
        	break;
        case idxDmsGraphicName: 
        	setDmsGraphicName((OctetString)value);
        	break;
        case idxDmsGraphicHeight: 
        	setDmsGraphicHeight((Integer32)value);
        	break;
        case idxDmsGraphicWidth: 
        	setDmsGraphicWidth((Integer32)value);
        	break;
        case idxDmsGraphicType: 
        	setDmsGraphicType((Integer32)value);
        	break;
        case idxDmsGraphicID: 
        	setDmsGraphicID((Integer32)value);
        	break;
        case idxDmsGraphicTransparentEnabled: 
        	setDmsGraphicTransparentEnabled((Integer32)value);
        	break;
        case idxDmsGraphicTransparentColor: 
        	setDmsGraphicTransparentColor((OctetString)value);
        	break;
        case idxDmsGraphicStatus: 
        	setDmsGraphicStatus((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsGraphicEntry::Row
    //--AgentGen END
  }
  
  class DmsGraphicEntryRowFactory 
        implements MOTableRowFactory<DmsGraphicEntryRow>
  {
    public synchronized DmsGraphicEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsGraphicEntryRow row = 
        new DmsGraphicEntryRow(index, values);
    //--AgentGen BEGIN=dmsGraphicEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsGraphicEntryRow row) {
    //--AgentGen BEGIN=dmsGraphicEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsGraphicEntry::RowFactory
    //--AgentGen END
  }

  public class DmsGraphicBitmapEntryRow extends DefaultMOMutableRow2PC {

    //--AgentGen BEGIN=dmsGraphicBitmapEntry::RowMembers
    //--AgentGen END

    public DmsGraphicBitmapEntryRow(OID index, Variable[] values) {
      super(index, values);
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::RowConstructor
    //--AgentGen END
    }
    
    public Integer32 getDmsGraphicBitmapIndex() {
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::getDmsGraphicBitmapIndex
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicBitmapIndex);
    }  
    
    public void setDmsGraphicBitmapIndex(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::setDmsGraphicBitmapIndex
    //--AgentGen END
      super.setValue(idxDmsGraphicBitmapIndex, newColValue);
    }
    
    public Integer32 getDmsGraphicBlockNumber() {
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::getDmsGraphicBlockNumber
    //--AgentGen END
      return (Integer32) super.getValue(idxDmsGraphicBlockNumber);
    }  
    
    public void setDmsGraphicBlockNumber(Integer32 newColValue) {
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::setDmsGraphicBlockNumber
    //--AgentGen END
      super.setValue(idxDmsGraphicBlockNumber, newColValue);
    }
    
    public OctetString getDmsGraphicBlockBitmap() {
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::getDmsGraphicBlockBitmap
    //--AgentGen END
      return (OctetString) super.getValue(idxDmsGraphicBlockBitmap);
    }  
    
    public void setDmsGraphicBlockBitmap(OctetString newColValue) {
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::setDmsGraphicBlockBitmap
    //--AgentGen END
      super.setValue(idxDmsGraphicBlockBitmap, newColValue);
    }
    
    public Variable getValue(int column) {
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::RowGetValue
    //--AgentGen END
      switch(column) {
        case idxDmsGraphicBitmapIndex: 
        	return getDmsGraphicBitmapIndex();
        case idxDmsGraphicBlockNumber: 
        	return getDmsGraphicBlockNumber();
        case idxDmsGraphicBlockBitmap: 
        	return getDmsGraphicBlockBitmap();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::RowSetValue
    //--AgentGen END
      switch(column) {
        case idxDmsGraphicBitmapIndex: 
        	setDmsGraphicBitmapIndex((Integer32)value);
        	break;
        case idxDmsGraphicBlockNumber: 
        	setDmsGraphicBlockNumber((Integer32)value);
        	break;
        case idxDmsGraphicBlockBitmap: 
        	setDmsGraphicBlockBitmap((OctetString)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

    //--AgentGen BEGIN=dmsGraphicBitmapEntry::Row
    //--AgentGen END
  }
  
  class DmsGraphicBitmapEntryRowFactory 
        implements MOTableRowFactory<DmsGraphicBitmapEntryRow>
  {
    public synchronized DmsGraphicBitmapEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      DmsGraphicBitmapEntryRow row = 
        new DmsGraphicBitmapEntryRow(index, values);
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::createRow
    //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(DmsGraphicBitmapEntryRow row) {
    //--AgentGen BEGIN=dmsGraphicBitmapEntry::freeRow
    //--AgentGen END
    }

    //--AgentGen BEGIN=dmsGraphicBitmapEntry::RowFactory
    //--AgentGen END
  }


//--AgentGen BEGIN=_METHODS
//--AgentGen END

  // Textual Definitions of MIB module Ntcip12032005
  protected void addTCsToFactory(MOFactory moFactory) {
   moFactory.addTextualConvention(new MessageActivationCode()); 
   moFactory.addTextualConvention(new MessageIDCode()); 
  }


  public class MessageActivationCode implements TextualConvention {
	private ValueConstraintValidator valueConstraintValidator;
	  	
    public MessageActivationCode() {
      ValueConstraint vc = new ConstraintsImpl();
      ((ConstraintsImpl)vc).add(new Constraint(12L, 12L));
      valueConstraintValidator = new ValueConstraintValidator(vc);
    }

    public String getModuleName() {
      return TC_MODULE_NTCIP1203_2005;
    }
  	
    public String getName() {
      return TC_MESSAGEACTIVATIONCODE;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OctetString();
      if (v instanceof AssignableFromLong) {
      	((AssignableFromLong)v).setValue(12L);
      }
    	// further modify value to comply with TC constraints here:
    //--AgentGen BEGIN=MessageActivationCode::createInitialValue
    //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      scalar.addMOValueValidationListener(valueConstraintValidator);                                  
    //--AgentGen BEGIN=MessageActivationCode::createScalar
    //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        mcol.addMOValueValidationListener(valueConstraintValidator);                                  
      }
    //--AgentGen BEGIN=MessageActivationCode::createColumn
    //--AgentGen END
      return col;      
    }
  }


  public class MessageIDCode implements TextualConvention {
	private ValueConstraintValidator valueConstraintValidator;
	  	
    public MessageIDCode() {
      ValueConstraint vc = new ConstraintsImpl();
      ((ConstraintsImpl)vc).add(new Constraint(5L, 5L));
      valueConstraintValidator = new ValueConstraintValidator(vc);
    }

    public String getModuleName() {
      return TC_MODULE_NTCIP1203_2005;
    }
  	
    public String getName() {
      return TC_MESSAGEIDCODE;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OctetString();
      if (v instanceof AssignableFromLong) {
      	((AssignableFromLong)v).setValue(5L);
      }
    	// further modify value to comply with TC constraints here:
    //--AgentGen BEGIN=MessageIDCode::createInitialValue
    //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      scalar.addMOValueValidationListener(valueConstraintValidator);                                  
    //--AgentGen BEGIN=MessageIDCode::createScalar
    //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        mcol.addMOValueValidationListener(valueConstraintValidator);                                  
      }
    //--AgentGen BEGIN=MessageIDCode::createColumn
    //--AgentGen END
      return col;      
    }
  }


//--AgentGen BEGIN=_TC_CLASSES_IMPORTED_MODULES_BEGIN
//--AgentGen END

  // Textual Definitions of other MIB modules
  public void addImportedTCsToFactory(MOFactory moFactory) {
   moFactory.addTextualConvention(new OwnerString()); 
   moFactory.addTextualConvention(new DisplayString()); 
  }

  // Textual Convention OwnerString from MIB module NTCIP8004-2008

  public class OwnerString implements TextualConvention {
	private ValueConstraintValidator valueConstraintValidator;
	  	
    public OwnerString() {
      ValueConstraint vc = new ConstraintsImpl();
      ((ConstraintsImpl)vc).add(new Constraint(0L, 127L));
      valueConstraintValidator = new ValueConstraintValidator(vc);
    }

    public String getModuleName() {
      return TC_MODULE_NTCIP8004_2008;
    }
  	
    public String getName() {
      return TC_OWNERSTRING;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OctetString();
      if (v instanceof AssignableFromLong) {
      	((AssignableFromLong)v).setValue(0L);
      }
    	// further modify value to comply with TC constraints here:
    //--AgentGen BEGIN=OwnerString::createInitialValue
    //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      scalar.addMOValueValidationListener(valueConstraintValidator);                                  
    //--AgentGen BEGIN=OwnerString::createScalar
    //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        mcol.addMOValueValidationListener(valueConstraintValidator);                                  
      }
    //--AgentGen BEGIN=OwnerString::createColumn
    //--AgentGen END
      return col;      
    }
  }

  // Textual Convention DisplayString from MIB module RFC1213-MIB

  public class DisplayString implements TextualConvention {
	  	
    public DisplayString() {
    }

    public String getModuleName() {
      return TC_MODULE_RFC1213_MIB;
    }
  	
    public String getName() {
      return TC_DISPLAYSTRING;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OctetString();
    	// further modify value to comply with TC constraints here:
    //--AgentGen BEGIN=DisplayString::createInitialValue
    //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
    //--AgentGen BEGIN=DisplayString::createScalar
    //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
    //--AgentGen BEGIN=DisplayString::createColumn
    //--AgentGen END
      return col;      
    }
  }


//--AgentGen BEGIN=_TC_CLASSES_IMPORTED_MODULES_END
//--AgentGen END

//--AgentGen BEGIN=_CLASSES
//--AgentGen END

//--AgentGen BEGIN=_END
//--AgentGen END
}


