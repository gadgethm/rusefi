package com.rusefi.config.generated;

// this file was generated automatically by rusEFI tool ConfigDefinition.jar based on (unknown script) console/binary/output_channels.txt Wed May 10 00:32:43 UTC 2023

// by class com.rusefi.output.FileJavaFieldsConsumer
import com.rusefi.config.*;

public class TsOutputs {
	public static final int BANKS_COUNT = 2;
	public static final int BOOST_BLEND_COUNT = 2;
	public static final int CAM_INPUTS_COUNT = 4;
	public static final int CAMS_PER_BANK = 2;
	public static final int EGT_CHANNEL_COUNT = 8;
	public static final String GAUGE_CATEGORY_BOOST_CONTROL = "Boost Control";
	public static final String GAUGE_CATEGORY_ETB = "ETB more";
	public static final String GAUGE_CATEGORY_FUEL_MATH = "Fuel: math";
	public static final String GAUGE_CATEGORY_SYNC = "Sync";
	public static final String GAUGE_CATEGORY_TIMING = "Timing";
	public static final String GAUGE_COIL_DWELL_TIME = "Ign: Dwell";
	public static final String GAUGE_NAME_ACCEL_ROLL = "Acceleration: Roll";
	public static final String GAUGE_NAME_ACCEL_X = "Acceleration: X";
	public static final String GAUGE_NAME_ACCEL_Y = "Acceleration: Y";
	public static final String GAUGE_NAME_ACCEL_YAW = "Acceleration: Yaw";
	public static final String GAUGE_NAME_ACCEL_Z = "Acceleration: Z";
	public static final String GAUGE_NAME_ADJUSTED_TIMING = "Timing: ignition";
	public static final String GAUGE_NAME_AFR = "Air/Fuel Ratio";
	public static final String GAUGE_NAME_AFR2 = "Air/Fuel Ratio 2";
	public static final String GAUGE_NAME_AIR_FLOW_ESTIMATE = "Air: Flow estimate";
	public static final String GAUGE_NAME_AIR_FLOW_MEASURED = "MAF";
	public static final String GAUGE_NAME_AIR_FLOW_MEASURED_2 = "MAF #2";
	public static final String GAUGE_NAME_AIR_MASS = "Air: Cylinder airmass";
	public static final String GAUGE_NAME_AUX_LINEAR_1 = "Aux linear #1";
	public static final String GAUGE_NAME_AUX_LINEAR_2 = "Aux linear #2";
	public static final String GAUGE_NAME_AUX_TEMP1 = "Aux temp 1";
	public static final String GAUGE_NAME_AUX_TEMP2 = "Aux temp 2";
	public static final String GAUGE_NAME_BARO_PRESSURE = "Barometric pressure";
	public static final String GAUGE_NAME_BOOST_CLOSED_LOOP = "Boost: Closed loop";
	public static final String GAUGE_NAME_BOOST_OPEN_LOOP = "Boost: Open loop";
	public static final String GAUGE_NAME_BOOST_OUTPUT = "Boost: Output";
	public static final String GAUGE_NAME_BOOST_TARGET = "Boost: Target";
	public static final String GAUGE_NAME_CAN_READ_OK = "CAN: Rx";
	public static final String GAUGE_NAME_CAN_WRITE_ERR = "CAN: Tx err";
	public static final String GAUGE_NAME_CAN_WRITE_OK = "CAN: Tx OK";
	public static final String GAUGE_NAME_CLT = "CLT";
	public static final String GAUGE_NAME_CPU_TEMP = "CPU Temperature";
	public static final String GAUGE_NAME_CURRENT_GEAR = "Current Gear";
	public static final String GAUGE_NAME_DEBUG_F1 = "debug f1";
	public static final String GAUGE_NAME_DEBUG_F2 = "debug f2: iTerm";
	public static final String GAUGE_NAME_DEBUG_F3 = "debug f3: prevError";
	public static final String GAUGE_NAME_DEBUG_F4 = "debug f4: iParam";
	public static final String GAUGE_NAME_DEBUG_F5 = "debug f5: dParam";
	public static final String GAUGE_NAME_DEBUG_F6 = "debug f6: dTerm";
	public static final String GAUGE_NAME_DEBUG_F7 = "debug f7";
	public static final String GAUGE_NAME_DEBUG_I1 = "debug i1: pParam";
	public static final String GAUGE_NAME_DEBUG_I2 = "debug i2: offset";
	public static final String GAUGE_NAME_DEBUG_I3 = "debug i3";
	public static final String GAUGE_NAME_DEBUG_I4 = "debug i4";
	public static final String GAUGE_NAME_DEBUG_I5 = "debug i5";
	public static final String GAUGE_NAME_DESIRED_GEAR = "TCU: Desired Gear";
	public static final String GAUGE_NAME_DETECTED_GEAR = "Detected Gear";
	public static final String GAUGE_NAME_DWELL_DUTY = "Ign: Coil duty cycle";
	public static final String GAUGE_NAME_ECU_TEMPERATURE = "ECU temperature";
	public static final String GAUGE_NAME_ENGINE_CRC16 = "Engine CRC16";
	public static final String GAUGE_NAME_ETB_DUTY = "ETB: Duty";
	public static final String GAUGE_NAME_ETB_ERROR = "ETB: position error";
	public static final String GAUGE_NAME_ETB_TARGET = "ETB: position target";
	public static final String GAUGE_NAME_FLEX = "Flex Ethanol %";
	public static final String GAUGE_NAME_FUEL_BARO_CORR = "Fuel: Barometric pressure mult";
	public static final String GAUGE_NAME_FUEL_BASE = "Fuel: base cycle mass";
	public static final String GAUGE_NAME_FUEL_CHARGE_TEMP = "Fuel: Estimated charge temperature";
	public static final String GAUGE_NAME_FUEL_CLT_CORR = "Fuel: CLT correction";
	public static final String GAUGE_NAME_FUEL_CONSUMPTION = "Fuel: Total consumed";
	public static final String GAUGE_NAME_FUEL_CRANKING = "Fuel: cranking";
	public static final String GAUGE_NAME_FUEL_FLOW = "Fuel: Flow rate";
	public static final String GAUGE_NAME_FUEL_IAT_CORR = "Fuel: IAT correction";
	public static final String GAUGE_NAME_FUEL_INJ_DUTY = "Fuel: injector duty cycle";
	public static final String GAUGE_NAME_FUEL_INJECTION_TIMING = "Fuel: Injection timing SOI";
	public static final String GAUGE_NAME_FUEL_LAST_INJECTION = "Fuel: Last inj pulse width";
	public static final String GAUGE_NAME_FUEL_LEVEL = "Fuel level";
	public static final String GAUGE_NAME_FUEL_LOAD = "Fuel: Load";
	public static final String GAUGE_NAME_FUEL_PRESSURE_HIGH = "Fuel pressure (high)";
	public static final String GAUGE_NAME_FUEL_PRESSURE_HIGH_UNITS = "bar";
	public static final String GAUGE_NAME_FUEL_PRESSURE_LOW = "Fuel pressure (low)";
	public static final String GAUGE_NAME_FUEL_PRESSURE_LOW_UNITS = "kPa";
	public static final String GAUGE_NAME_FUEL_RUNNING = "Fuel: running";
	public static final String GAUGE_NAME_FUEL_TPS_EXTRA = "Fuel: TPS AE add fuel ms";
	public static final String GAUGE_NAME_FUEL_TRIM = "Fuel: fuel trim";
	public static final String GAUGE_NAME_FUEL_TRIM_2 = "Fuel: fuel trim 2";
	public static final String GAUGE_NAME_FUEL_VE = "Fuel: VE";
	public static final String GAUGE_NAME_FUEL_WALL_AMOUNT = "Fuel: wall amount";
	public static final String GAUGE_NAME_FUEL_WALL_CORRECTION = "Fuel: wall correction";
	public static final String GAUGE_NAME_FW_VERSION = "ECU Software Version";
	public static final String GAUGE_NAME_GEAR_RATIO = "Gearbox Ratio";
	public static final String GAUGE_NAME_IAC = "Idle: Position";
	public static final String GAUGE_NAME_IAT = "IAT";
	public static final String GAUGE_NAME_IDLE_POSITION = "Idle: Position sensor";
	public static final String GAUGE_NAME_IGNITION_LOAD = "Ign: Load";
	public static final String GAUGE_NAME_IGNITION_MODE = "Ign: Mode";
	public static final String GAUGE_NAME_INJECTION_MODE = "Fuel: Injection mode";
	public static final String GAUGE_NAME_INJECTOR_LAG = "Fuel: injector lag";
	public static final String GAUGE_NAME_ISS = "TCU: Input Shaft Speed";
	public static final String GAUGE_NAME_KNOCK_COUNTER = "Knock: Count";
	public static final String GAUGE_NAME_KNOCK_LEVEL = "Knock: Current level";
	public static final String GAUGE_NAME_KNOCK_RETARD = "Knock: Retard";
	public static final String GAUGE_NAME_LAMBDA = "Lambda";
	public static final String GAUGE_NAME_LAMBDA2 = "Lambda 2";
	public static final String GAUGE_NAME_LAST_ERROR = "Last error";
	public static final String GAUGE_NAME_MAF = "MAF";
	public static final String GAUGE_NAME_MAP = "MAP";
	public static final String GAUGE_NAME_OIL_PRESSURE = "Oil Pressure";
	public static final String GAUGE_NAME_OIL_PRESSURE_UNITS = "kPa";
	public static final String GAUGE_NAME_RAW_FUEL_PRESSURE_HIGH = "Fuel pressure raw (high)";
	public static final String GAUGE_NAME_RAW_FUEL_PRESSURE_LOW = "Fuel pressure raw (low)";
	public static final String GAUGE_NAME_RPM = "RPM";
	public static final String GAUGE_NAME_TARGET_AFR = "Fuel: target AFR";
	public static final String GAUGE_NAME_TARGET_LAMBDA = "Fuel: target lambda";
	public static final String GAUGE_NAME_TC_RATIO = "TCU: Torque Converter Ratio";
	public static final String GAUGE_NAME_TCHARGE = "Air: SD tCharge";
	public static final String GAUGE_NAME_THROTTLE_PEDAL = "Throttle pedal position";
	public static final String GAUGE_NAME_TIME = "Time";
	public static final String GAUGE_NAME_TIMING_ADVANCE = "Ign: Timing";
	public static final String GAUGE_NAME_TPS = "TPS";
	public static final String GAUGE_NAME_TPS2 = "TPS2";
	public static final String GAUGE_NAME_TRG_ERR = "Trigger Error Counter";
	public static final String GAUGE_NAME_TRG_GAP = "Trigger Sync Latest Ratio";
	public static final String GAUGE_NAME_TUNE_CRC16 = "Tune CRC16";
	public static final String GAUGE_NAME_TURBO_SPEED = "Turbocharger Speed";
	public static final String GAUGE_NAME_UPTIME = "Uptime";
	public static final String GAUGE_NAME_VBAT = "VBatt";
	public static final String GAUGE_NAME_VERSION = "firmware";
	public static final String GAUGE_NAME_VVS = "Vehicle Speed";
	public static final String GAUGE_NAME_VVT_B1E = "VVT: bank 1 exhaust";
	public static final String GAUGE_NAME_VVT_B1I = "VVT: bank 1 intake";
	public static final String GAUGE_NAME_VVT_B2E = "VVT: bank 2 exhaust";
	public static final String GAUGE_NAME_VVT_B2I = "VVT: bank 2 intake";
	public static final String GAUGE_NAME_VVT_TARGET_B1E = "VVT: bank 1 exhaust target";
	public static final String GAUGE_NAME_VVT_TARGET_B1I = "VVT: bank 1 intake target";
	public static final String GAUGE_NAME_VVT_TARGET_B2E = "VVT: bank 2 exhaust target";
	public static final String GAUGE_NAME_VVT_TARGET_B2I = "VVT: bank 2 intake target";
	public static final String GAUGE_NAME_WARNING_COUNTER = "Warning: counter";
	public static final String GAUGE_NAME_WARNING_LAST = "Warning: last";
	public static final String GAUGE_NAME_WG_POSITION = "Wastegate position sensor";
	public static final int GEARS_COUNT = 8;
	public static final int IGN_BLEND_COUNT = 4;
	public static final String INDICATOR_NAME_AC_SWITCH = "AC switch";
	public static final String INDICATOR_NAME_BRAKE_DOWN = "Brake switch";
	public static final String INDICATOR_NAME_CLUTCH_DOWN = "Clutch: down";
	public static final String INDICATOR_NAME_CLUTCH_UP = "Clutch: up";
	public static final int LUA_ANALOG_INPUT_COUNT = 8;
	public static final int LUA_GAUGE_COUNT = 2;
	public static final int MAX_CYLINDER_COUNT = 12;
	public static final int PACK_ADD_TEMPERATURE = 40;
	public static final int PACK_MULT_AFR = 1000;
	public static final int PACK_MULT_AFR_CFG = 10;
	public static final int PACK_MULT_ANGLE = 50;
	public static final int PACK_MULT_FUEL_FLOW = 200;
	public static final int PACK_MULT_FUEL_MASS = 100;
	public static final int PACK_MULT_HIGH_PRESSURE = 10;
	public static final int PACK_MULT_LAMBDA = 10000;
	public static final int PACK_MULT_LAMBDA_CFG = 147;
	public static final int PACK_MULT_MASS_FLOW = 10;
	public static final int PACK_MULT_MS = 300;
	public static final int PACK_MULT_PERCENT = 100;
	public static final int PACK_MULT_PRESSURE = 30;
	public static final int PACK_MULT_TEMPERATURE = 100;
	public static final int PACK_MULT_VOLTAGE = 1000;
	public static final int PACK_MULT_VSS = 100;
	public static final int TPS_2_BYTE_PACKING_MULT = 100;
	public static final int VE_BLEND_COUNT = 4;
	public static final Field SD_PRESENT = Field.create("SD_PRESENT", 0, FieldType.BIT, 0).setBaseOffset(0);
	public static final Field SD_LOGGING_INTERNAL = Field.create("SD_LOGGING_INTERNAL", 0, FieldType.BIT, 1).setBaseOffset(0);
	public static final Field TRIGGERSCOPEREADY = Field.create("TRIGGERSCOPEREADY", 0, FieldType.BIT, 2).setBaseOffset(0);
	public static final Field ANTILAGTRIGGERED = Field.create("ANTILAGTRIGGERED", 0, FieldType.BIT, 3).setBaseOffset(0);
	public static final Field ISFANON = Field.create("ISFANON", 0, FieldType.BIT, 4).setBaseOffset(0);
	public static final Field ISO2HEATERON = Field.create("ISO2HEATERON", 0, FieldType.BIT, 5).setBaseOffset(0);
	public static final Field CHECKENGINE = Field.create("CHECKENGINE", 0, FieldType.BIT, 6).setBaseOffset(0);
	public static final Field NEEDBURN = Field.create("NEEDBURN", 0, FieldType.BIT, 7).setBaseOffset(0);
	public static final Field SD_MSD = Field.create("SD_MSD", 0, FieldType.BIT, 8).setBaseOffset(0);
	public static final Field ISFAN2ON = Field.create("ISFAN2ON", 0, FieldType.BIT, 9).setBaseOffset(0);
	public static final Field TOOTHLOGREADY = Field.create("TOOTHLOGREADY", 0, FieldType.BIT, 11).setBaseOffset(0);
	public static final Field ISTPSERROR = Field.create("ISTPSERROR", 0, FieldType.BIT, 12).setBaseOffset(0);
	public static final Field ISCLTERROR = Field.create("ISCLTERROR", 0, FieldType.BIT, 13).setBaseOffset(0);
	public static final Field ISMAPERROR = Field.create("ISMAPERROR", 0, FieldType.BIT, 14).setBaseOffset(0);
	public static final Field ISIATERROR = Field.create("ISIATERROR", 0, FieldType.BIT, 15).setBaseOffset(0);
	public static final Field ISTRIGGERERROR = Field.create("ISTRIGGERERROR", 0, FieldType.BIT, 16).setBaseOffset(0);
	public static final Field HASCRITICALERROR = Field.create("HASCRITICALERROR", 0, FieldType.BIT, 17).setBaseOffset(0);
	public static final Field ISWARNNOW = Field.create("ISWARNNOW", 0, FieldType.BIT, 18).setBaseOffset(0);
	public static final Field ISPEDALERROR = Field.create("ISPEDALERROR", 0, FieldType.BIT, 19).setBaseOffset(0);
	public static final Field ISKNOCKCHIPOK = Field.create("ISKNOCKCHIPOK", 0, FieldType.BIT, 20).setBaseOffset(0);
	public static final Field LAUNCHTRIGGERED = Field.create("LAUNCHTRIGGERED", 0, FieldType.BIT, 21).setBaseOffset(0);
	public static final Field ISTPS2ERROR = Field.create("ISTPS2ERROR", 0, FieldType.BIT, 22).setBaseOffset(0);
	public static final Field ISIDLECLOSEDLOOP = Field.create("ISIDLECLOSEDLOOP", 0, FieldType.BIT, 23).setBaseOffset(0);
	public static final Field INJECTORFAULT = Field.create("INJECTORFAULT", 0, FieldType.BIT, 24).setBaseOffset(0);
	public static final Field IGNITIONFAULT = Field.create("IGNITIONFAULT", 0, FieldType.BIT, 25).setBaseOffset(0);
	public static final Field RPMVALUE = Field.create("RPMVALUE", 4, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RPMACCELERATION = Field.create("RPMACCELERATION", 6, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field SPEEDTORPMRATIO = Field.create("SPEEDTORPMRATIO", 8, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field UNUSEDVEHICLESPEEDKPH = Field.create("UNUSEDVEHICLESPEEDKPH", 10, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field INTERNALMCUTEMPERATURE = Field.create("INTERNALMCUTEMPERATURE", 11, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field COOLANT = Field.create("COOLANT", 12, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field INTAKE = Field.create("INTAKE", 14, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field AUXTEMP1 = Field.create("AUXTEMP1", 16, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field AUXTEMP2 = Field.create("AUXTEMP2", 18, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TPSVALUE = Field.create("TPSVALUE", 20, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field THROTTLEPEDALPOSITION = Field.create("THROTTLEPEDALPOSITION", 22, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TPSADC = Field.create("TPSADC", 24, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RAWMAF = Field.create("RAWMAF", 26, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field MAFMEASURED = Field.create("MAFMEASURED", 28, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field MAPVALUE = Field.create("MAPVALUE", 30, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field BAROPRESSURE = Field.create("BAROPRESSURE", 32, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field LAMBDAVALUE = Field.create("LAMBDAVALUE", 34, FieldType.INT16).setScale(1.0E-4).setBaseOffset(0);
	public static final Field KNOCKRETARD = Field.create("KNOCKRETARD", 36, FieldType.INT8).setScale(0.1).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_37 = Field.create("ALIGNMENTFILL_AT_37", 37, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field VBATT = Field.create("VBATT", 38, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field OILPRESSURE = Field.create("OILPRESSURE", 40, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field VVTPOSITIONB1I = Field.create("VVTPOSITIONB1I", 42, FieldType.INT16).setScale(0.02).setBaseOffset(0);
	public static final Field ACTUALLASTINJECTION = Field.create("ACTUALLASTINJECTION", 44, FieldType.INT16).setScale(0.0033333333333333335).setBaseOffset(0);
	public static final Field INJECTORDUTYCYCLE = Field.create("INJECTORDUTYCYCLE", 46, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEVALUE = Field.create("VEVALUE", 47, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field INJECTIONOFFSET = Field.create("INJECTIONOFFSET", 48, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field INJECTORLAGMS = Field.create("INJECTORLAGMS", 50, FieldType.INT16).setScale(0.0033333333333333335).setBaseOffset(0);
	public static final Field ENGINEMAKECODENAMECRC16 = Field.create("ENGINEMAKECODENAMECRC16", 52, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field WALLFUELAMOUNT = Field.create("WALLFUELAMOUNT", 54, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WALLFUELCORRECTIONVALUE = Field.create("WALLFUELCORRECTIONVALUE", 56, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field REVOLUTIONCOUNTERSINCESTART = Field.create("REVOLUTIONCOUNTERSINCESTART", 58, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field CANREADCOUNTER = Field.create("CANREADCOUNTER", 60, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TPSACCELFUEL = Field.create("TPSACCELFUEL", 62, FieldType.INT16).setScale(0.0033333333333333335).setBaseOffset(0);
	public static final Field CURRENTIGNITIONMODE = Field.create("CURRENTIGNITIONMODE", 64, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field CURRENTINJECTIONMODE = Field.create("CURRENTINJECTIONMODE", 65, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field COILDUTYCYCLE = Field.create("COILDUTYCYCLE", 66, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLEAIRVALVEPOSITION = Field.create("IDLEAIRVALVEPOSITION", 68, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBTARGET = Field.create("ETBTARGET", 70, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETB1DUTYCYCLE = Field.create("ETB1DUTYCYCLE", 72, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field FUELTANKLEVEL = Field.create("FUELTANKLEVEL", 74, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TOTALFUELCONSUMPTION = Field.create("TOTALFUELCONSUMPTION", 76, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field FUELFLOWRATE = Field.create("FUELFLOWRATE", 78, FieldType.INT16).setScale(0.005).setBaseOffset(0);
	public static final Field TPS2VALUE = Field.create("TPS2VALUE", 80, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TUNECRC16 = Field.create("TUNECRC16", 82, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCKLEVEL = Field.create("KNOCKLEVEL", 84, FieldType.FLOAT).setBaseOffset(0);
	public static final Field SECONDS = Field.create("SECONDS", 88, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field ENGINEMODE = Field.create("ENGINEMODE", 92, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field FIRMWAREVERSION = Field.create("FIRMWAREVERSION", 96, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field RAWIDLEPOSITIONSENSOR = Field.create("RAWIDLEPOSITIONSENSOR", 100, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWWASTEGATEPOSITION = Field.create("RAWWASTEGATEPOSITION", 102, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field ACCELERATIONX = Field.create("ACCELERATIONX", 104, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ACCELERATIONY = Field.create("ACCELERATIONY", 106, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field DETECTEDGEAR = Field.create("DETECTEDGEAR", 108, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field MAXTRIGGERREENTRANT = Field.create("MAXTRIGGERREENTRANT", 109, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field RAWLOWFUELPRESSURE = Field.create("RAWLOWFUELPRESSURE", 110, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWHIGHFUELPRESSURE = Field.create("RAWHIGHFUELPRESSURE", 112, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field LOWFUELPRESSURE = Field.create("LOWFUELPRESSURE", 114, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field TCUDESIREDGEAR = Field.create("TCUDESIREDGEAR", 116, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field FLEXPERCENT = Field.create("FLEXPERCENT", 117, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field WASTEGATEPOSITIONSENSOR = Field.create("WASTEGATEPOSITIONSENSOR", 118, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field HIGHFUELPRESSURE = Field.create("HIGHFUELPRESSURE", 120, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_122 = Field.create("ALIGNMENTFILL_AT_122", 122, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TSCONFIGVERSION = Field.create("TSCONFIGVERSION", 124, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field CALIBRATIONVALUE = Field.create("CALIBRATIONVALUE", 128, FieldType.FLOAT).setBaseOffset(0);
	public static final Field CALIBRATIONMODE = Field.create("CALIBRATIONMODE", 132, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field IDLETARGETPOSITION = Field.create("IDLETARGETPOSITION", 133, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_134 = Field.create("ALIGNMENTFILL_AT_134", 134, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TOTALTRIGGERERRORCOUNTER = Field.create("TOTALTRIGGERERRORCOUNTER", 136, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field ORDERINGERRORCOUNTER = Field.create("ORDERINGERRORCOUNTER", 140, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field WARNINGCOUNTER = Field.create("WARNINGCOUNTER", 144, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field LASTERRORCODE = Field.create("LASTERRORCODE", 146, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE1 = Field.create("RECENTERRORCODE1", 148, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE2 = Field.create("RECENTERRORCODE2", 150, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE3 = Field.create("RECENTERRORCODE3", 152, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE4 = Field.create("RECENTERRORCODE4", 154, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE5 = Field.create("RECENTERRORCODE5", 156, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE6 = Field.create("RECENTERRORCODE6", 158, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE7 = Field.create("RECENTERRORCODE7", 160, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RECENTERRORCODE8 = Field.create("RECENTERRORCODE8", 162, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD1 = Field.create("DEBUGFLOATFIELD1", 164, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD2 = Field.create("DEBUGFLOATFIELD2", 168, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD3 = Field.create("DEBUGFLOATFIELD3", 172, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD4 = Field.create("DEBUGFLOATFIELD4", 176, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD5 = Field.create("DEBUGFLOATFIELD5", 180, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD6 = Field.create("DEBUGFLOATFIELD6", 184, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGFLOATFIELD7 = Field.create("DEBUGFLOATFIELD7", 188, FieldType.FLOAT).setBaseOffset(0);
	public static final Field DEBUGINTFIELD1 = Field.create("DEBUGINTFIELD1", 192, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGINTFIELD2 = Field.create("DEBUGINTFIELD2", 196, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGINTFIELD3 = Field.create("DEBUGINTFIELD3", 200, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGINTFIELD4 = Field.create("DEBUGINTFIELD4", 204, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field DEBUGINTFIELD5 = Field.create("DEBUGINTFIELD5", 206, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT1 = Field.create("EGT1", 208, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT2 = Field.create("EGT2", 210, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT3 = Field.create("EGT3", 212, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT4 = Field.create("EGT4", 214, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT5 = Field.create("EGT5", 216, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT6 = Field.create("EGT6", 218, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT7 = Field.create("EGT7", 220, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field EGT8 = Field.create("EGT8", 222, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RAWTPS1PRIMARY = Field.create("RAWTPS1PRIMARY", 224, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWPPSPRIMARY = Field.create("RAWPPSPRIMARY", 226, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWCLT = Field.create("RAWCLT", 228, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWIAT = Field.create("RAWIAT", 230, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWOILPRESSURE = Field.create("RAWOILPRESSURE", 232, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field FUELCLOSEDLOOPBINIDX = Field.create("FUELCLOSEDLOOPBINIDX", 234, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TCUCURRENTGEAR = Field.create("TCUCURRENTGEAR", 235, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field RAWPPSSECONDARY = Field.create("RAWPPSSECONDARY", 236, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field KNOCK1 = Field.create("KNOCK1", 238, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK2 = Field.create("KNOCK2", 239, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK3 = Field.create("KNOCK3", 240, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK4 = Field.create("KNOCK4", 241, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK5 = Field.create("KNOCK5", 242, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK6 = Field.create("KNOCK6", 243, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK7 = Field.create("KNOCK7", 244, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK8 = Field.create("KNOCK8", 245, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK9 = Field.create("KNOCK9", 246, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK10 = Field.create("KNOCK10", 247, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK11 = Field.create("KNOCK11", 248, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field KNOCK12 = Field.create("KNOCK12", 249, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field IDLEPOSITIONSENSOR = Field.create("IDLEPOSITIONSENSOR", 250, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field AFRVALUE = Field.create("AFRVALUE", 252, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field VSSACCELERATION = Field.create("VSSACCELERATION", 254, FieldType.INT16).setScale(0.0033333333333333335).setBaseOffset(0);
	public static final Field LAMBDAVALUE2 = Field.create("LAMBDAVALUE2", 256, FieldType.INT16).setScale(1.0E-4).setBaseOffset(0);
	public static final Field AFRVALUE2 = Field.create("AFRVALUE2", 258, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field VVTPOSITIONB1E = Field.create("VVTPOSITIONB1E", 260, FieldType.INT16).setScale(0.02).setBaseOffset(0);
	public static final Field VVTPOSITIONB2I = Field.create("VVTPOSITIONB2I", 262, FieldType.INT16).setScale(0.02).setBaseOffset(0);
	public static final Field VVTPOSITIONB2E = Field.create("VVTPOSITIONB2E", 264, FieldType.INT16).setScale(0.02).setBaseOffset(0);
	public static final Field FUELPIDCORRECTION1 = Field.create("FUELPIDCORRECTION1", 266, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field FUELPIDCORRECTION2 = Field.create("FUELPIDCORRECTION2", 268, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field RAWTPS1SECONDARY = Field.create("RAWTPS1SECONDARY", 270, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWTPS2PRIMARY = Field.create("RAWTPS2PRIMARY", 272, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWTPS2SECONDARY = Field.create("RAWTPS2SECONDARY", 274, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field ACCELERATIONZ = Field.create("ACCELERATIONZ", 276, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ACCELERATIONROLL = Field.create("ACCELERATIONROLL", 278, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ACCELERATIONYAW = Field.create("ACCELERATIONYAW", 280, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTTARGETS1 = Field.create("VVTTARGETS1", 282, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field VVTTARGETS2 = Field.create("VVTTARGETS2", 283, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field VVTTARGETS3 = Field.create("VVTTARGETS3", 284, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field VVTTARGETS4 = Field.create("VVTTARGETS4", 285, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TURBOSPEED = Field.create("TURBOSPEED", 286, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TPS1SPLIT = Field.create("TPS1SPLIT", 288, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TPS2SPLIT = Field.create("TPS2SPLIT", 290, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field TPS12SPLIT = Field.create("TPS12SPLIT", 292, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ACCPEDALSPLIT = Field.create("ACCPEDALSPLIT", 294, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field SPARKCUTREASON = Field.create("SPARKCUTREASON", 296, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field FUELCUTREASON = Field.create("FUELCUTREASON", 297, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field MAFESTIMATE = Field.create("MAFESTIMATE", 298, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field INSTANTRPM = Field.create("INSTANTRPM", 300, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RAWMAP = Field.create("RAWMAP", 302, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWAFR = Field.create("RAWAFR", 304, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_306 = Field.create("ALIGNMENTFILL_AT_306", 306, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field CALIBRATIONVALUE2 = Field.create("CALIBRATIONVALUE2", 308, FieldType.FLOAT).setBaseOffset(0);
	public static final Field ISMAINRELAYON = Field.create("ISMAINRELAYON", 312, FieldType.BIT, 0).setBaseOffset(0);
	public static final Field ISUSBCONNECTED = Field.create("ISUSBCONNECTED", 312, FieldType.BIT, 1).setBaseOffset(0);
	public static final Field LUAINVOCATIONCOUNTER = Field.create("LUAINVOCATIONCOUNTER", 316, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field LUALASTCYCLEDURATION = Field.create("LUALASTCYCLEDURATION", 320, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TESTBENCHITER = Field.create("TESTBENCHITER", 324, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TCU_CURRENTRANGE = Field.create("TCU_CURRENTRANGE", 325, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TCRATIO = Field.create("TCRATIO", 326, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field LASTSHIFTTIME = Field.create("LASTSHIFTTIME", 328, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VSSEDGECOUNTER = Field.create("VSSEDGECOUNTER", 332, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field ISSEDGECOUNTER = Field.create("ISSEDGECOUNTER", 336, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field AUXLINEAR1 = Field.create("AUXLINEAR1", 340, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field AUXLINEAR2 = Field.create("AUXLINEAR2", 342, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field DFCOACTIVE = Field.create("DFCOACTIVE", 344, FieldType.BIT, 0).setBaseOffset(0);
	public static final Field FALLBACKMAP = Field.create("FALLBACKMAP", 348, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field INSTANTMAPVALUE = Field.create("INSTANTMAPVALUE", 350, FieldType.INT16).setScale(0.03333333333333333).setBaseOffset(0);
	public static final Field MAXLOCKEDDURATION = Field.create("MAXLOCKEDDURATION", 352, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field CANWRITEOK = Field.create("CANWRITEOK", 354, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field CANWRITENOTOK = Field.create("CANWRITENOTOK", 356, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_358 = Field.create("ALIGNMENTFILL_AT_358", 358, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERPRIMARYFALL = Field.create("TRIGGERPRIMARYFALL", 360, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERPRIMARYRISE = Field.create("TRIGGERPRIMARYRISE", 364, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERSECONDARYFALL = Field.create("TRIGGERSECONDARYFALL", 368, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERSECONDARYRISE = Field.create("TRIGGERSECONDARYRISE", 372, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERVVTFALL = Field.create("TRIGGERVVTFALL", 376, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERVVTRISE = Field.create("TRIGGERVVTRISE", 378, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERVVT2FALL = Field.create("TRIGGERVVT2FALL", 380, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field TRIGGERVVT2RISE = Field.create("TRIGGERVVT2RISE", 382, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field STARTERSTATE = Field.create("STARTERSTATE", 384, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field STARTERRELAYDISABLE = Field.create("STARTERRELAYDISABLE", 385, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field MULTISPARKCOUNTER = Field.create("MULTISPARKCOUNTER", 386, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field EXTIOVERFLOWCOUNT = Field.create("EXTIOVERFLOWCOUNT", 387, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_PTERM = Field.create("ALTERNATORSTATUS_PTERM", 388, FieldType.FLOAT).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_ITERM = Field.create("ALTERNATORSTATUS_ITERM", 392, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_DTERM = Field.create("ALTERNATORSTATUS_DTERM", 394, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_OUTPUT = Field.create("ALTERNATORSTATUS_OUTPUT", 396, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_ERROR = Field.create("ALTERNATORSTATUS_ERROR", 398, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ALTERNATORSTATUS_RESETCOUNTER = Field.create("ALTERNATORSTATUS_RESETCOUNTER", 400, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field IDLESTATUS_PTERM = Field.create("IDLESTATUS_PTERM", 404, FieldType.FLOAT).setBaseOffset(0);
	public static final Field IDLESTATUS_ITERM = Field.create("IDLESTATUS_ITERM", 408, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLESTATUS_DTERM = Field.create("IDLESTATUS_DTERM", 410, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLESTATUS_OUTPUT = Field.create("IDLESTATUS_OUTPUT", 412, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLESTATUS_ERROR = Field.create("IDLESTATUS_ERROR", 414, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IDLESTATUS_RESETCOUNTER = Field.create("IDLESTATUS_RESETCOUNTER", 416, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field ETBSTATUS_PTERM = Field.create("ETBSTATUS_PTERM", 420, FieldType.FLOAT).setBaseOffset(0);
	public static final Field ETBSTATUS_ITERM = Field.create("ETBSTATUS_ITERM", 424, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBSTATUS_DTERM = Field.create("ETBSTATUS_DTERM", 426, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBSTATUS_OUTPUT = Field.create("ETBSTATUS_OUTPUT", 428, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBSTATUS_ERROR = Field.create("ETBSTATUS_ERROR", 430, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field ETBSTATUS_RESETCOUNTER = Field.create("ETBSTATUS_RESETCOUNTER", 432, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field BOOSTSTATUS_PTERM = Field.create("BOOSTSTATUS_PTERM", 436, FieldType.FLOAT).setBaseOffset(0);
	public static final Field BOOSTSTATUS_ITERM = Field.create("BOOSTSTATUS_ITERM", 440, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTSTATUS_DTERM = Field.create("BOOSTSTATUS_DTERM", 442, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTSTATUS_OUTPUT = Field.create("BOOSTSTATUS_OUTPUT", 444, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTSTATUS_ERROR = Field.create("BOOSTSTATUS_ERROR", 446, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTSTATUS_RESETCOUNTER = Field.create("BOOSTSTATUS_RESETCOUNTER", 448, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_PTERM = Field.create("WASTEGATEDCSTATUS_PTERM", 452, FieldType.FLOAT).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_ITERM = Field.create("WASTEGATEDCSTATUS_ITERM", 456, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_DTERM = Field.create("WASTEGATEDCSTATUS_DTERM", 458, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_OUTPUT = Field.create("WASTEGATEDCSTATUS_OUTPUT", 460, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_ERROR = Field.create("WASTEGATEDCSTATUS_ERROR", 462, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field WASTEGATEDCSTATUS_RESETCOUNTER = Field.create("WASTEGATEDCSTATUS_RESETCOUNTER", 464, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field VVTSTATUS1_PTERM = Field.create("VVTSTATUS1_PTERM", 468, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VVTSTATUS1_ITERM = Field.create("VVTSTATUS1_ITERM", 472, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS1_DTERM = Field.create("VVTSTATUS1_DTERM", 474, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS1_OUTPUT = Field.create("VVTSTATUS1_OUTPUT", 476, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS1_ERROR = Field.create("VVTSTATUS1_ERROR", 478, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS1_RESETCOUNTER = Field.create("VVTSTATUS1_RESETCOUNTER", 480, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field VVTSTATUS2_PTERM = Field.create("VVTSTATUS2_PTERM", 484, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VVTSTATUS2_ITERM = Field.create("VVTSTATUS2_ITERM", 488, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS2_DTERM = Field.create("VVTSTATUS2_DTERM", 490, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS2_OUTPUT = Field.create("VVTSTATUS2_OUTPUT", 492, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS2_ERROR = Field.create("VVTSTATUS2_ERROR", 494, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS2_RESETCOUNTER = Field.create("VVTSTATUS2_RESETCOUNTER", 496, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field VVTSTATUS3_PTERM = Field.create("VVTSTATUS3_PTERM", 500, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VVTSTATUS3_ITERM = Field.create("VVTSTATUS3_ITERM", 504, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS3_DTERM = Field.create("VVTSTATUS3_DTERM", 506, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS3_OUTPUT = Field.create("VVTSTATUS3_OUTPUT", 508, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS3_ERROR = Field.create("VVTSTATUS3_ERROR", 510, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS3_RESETCOUNTER = Field.create("VVTSTATUS3_RESETCOUNTER", 512, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field VVTSTATUS4_PTERM = Field.create("VVTSTATUS4_PTERM", 516, FieldType.FLOAT).setBaseOffset(0);
	public static final Field VVTSTATUS4_ITERM = Field.create("VVTSTATUS4_ITERM", 520, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS4_DTERM = Field.create("VVTSTATUS4_DTERM", 522, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS4_OUTPUT = Field.create("VVTSTATUS4_OUTPUT", 524, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS4_ERROR = Field.create("VVTSTATUS4_ERROR", 526, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VVTSTATUS4_RESETCOUNTER = Field.create("VVTSTATUS4_RESETCOUNTER", 528, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field AUXSPEED1 = Field.create("AUXSPEED1", 532, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field AUXSPEED2 = Field.create("AUXSPEED2", 534, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field ISSVALUE = Field.create("ISSVALUE", 536, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field RAWANALOGINPUT1 = Field.create("RAWANALOGINPUT1", 538, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT2 = Field.create("RAWANALOGINPUT2", 540, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT3 = Field.create("RAWANALOGINPUT3", 542, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT4 = Field.create("RAWANALOGINPUT4", 544, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT5 = Field.create("RAWANALOGINPUT5", 546, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT6 = Field.create("RAWANALOGINPUT6", 548, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT7 = Field.create("RAWANALOGINPUT7", 550, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field RAWANALOGINPUT8 = Field.create("RAWANALOGINPUT8", 552, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field GPPWMOUTPUT1 = Field.create("GPPWMOUTPUT1", 554, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field GPPWMOUTPUT2 = Field.create("GPPWMOUTPUT2", 555, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field GPPWMOUTPUT3 = Field.create("GPPWMOUTPUT3", 556, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field GPPWMOUTPUT4 = Field.create("GPPWMOUTPUT4", 557, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field GPPWMXAXIS1 = Field.create("GPPWMXAXIS1", 558, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field GPPWMXAXIS2 = Field.create("GPPWMXAXIS2", 560, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field GPPWMXAXIS3 = Field.create("GPPWMXAXIS3", 562, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field GPPWMXAXIS4 = Field.create("GPPWMXAXIS4", 564, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field GPPWMYAXIS1 = Field.create("GPPWMYAXIS1", 566, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field GPPWMYAXIS2 = Field.create("GPPWMYAXIS2", 568, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field GPPWMYAXIS3 = Field.create("GPPWMYAXIS3", 570, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field GPPWMYAXIS4 = Field.create("GPPWMYAXIS4", 572, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field RAWBATTERY = Field.create("RAWBATTERY", 574, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field IGNBLENDPARAMETER1 = Field.create("IGNBLENDPARAMETER1", 576, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field IGNBLENDPARAMETER2 = Field.create("IGNBLENDPARAMETER2", 578, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field IGNBLENDPARAMETER3 = Field.create("IGNBLENDPARAMETER3", 580, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field IGNBLENDPARAMETER4 = Field.create("IGNBLENDPARAMETER4", 582, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field IGNBLENDBIAS1 = Field.create("IGNBLENDBIAS1", 584, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field IGNBLENDBIAS2 = Field.create("IGNBLENDBIAS2", 585, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field IGNBLENDBIAS3 = Field.create("IGNBLENDBIAS3", 586, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field IGNBLENDBIAS4 = Field.create("IGNBLENDBIAS4", 587, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field IGNBLENDOUTPUT1 = Field.create("IGNBLENDOUTPUT1", 588, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IGNBLENDOUTPUT2 = Field.create("IGNBLENDOUTPUT2", 590, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IGNBLENDOUTPUT3 = Field.create("IGNBLENDOUTPUT3", 592, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field IGNBLENDOUTPUT4 = Field.create("IGNBLENDOUTPUT4", 594, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VEBLENDPARAMETER1 = Field.create("VEBLENDPARAMETER1", 596, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field VEBLENDPARAMETER2 = Field.create("VEBLENDPARAMETER2", 598, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field VEBLENDPARAMETER3 = Field.create("VEBLENDPARAMETER3", 600, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field VEBLENDPARAMETER4 = Field.create("VEBLENDPARAMETER4", 602, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field VEBLENDBIAS1 = Field.create("VEBLENDBIAS1", 604, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEBLENDBIAS2 = Field.create("VEBLENDBIAS2", 605, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEBLENDBIAS3 = Field.create("VEBLENDBIAS3", 606, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEBLENDBIAS4 = Field.create("VEBLENDBIAS4", 607, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field VEBLENDOUTPUT1 = Field.create("VEBLENDOUTPUT1", 608, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VEBLENDOUTPUT2 = Field.create("VEBLENDOUTPUT2", 610, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VEBLENDOUTPUT3 = Field.create("VEBLENDOUTPUT3", 612, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field VEBLENDOUTPUT4 = Field.create("VEBLENDOUTPUT4", 614, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDPARAMETER1 = Field.create("BOOSTOPENLOOPBLENDPARAMETER1", 616, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDPARAMETER2 = Field.create("BOOSTOPENLOOPBLENDPARAMETER2", 618, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDBIAS1 = Field.create("BOOSTOPENLOOPBLENDBIAS1", 620, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDBIAS2 = Field.create("BOOSTOPENLOOPBLENDBIAS2", 621, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDOUTPUT1 = Field.create("BOOSTOPENLOOPBLENDOUTPUT1", 622, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field BOOSTOPENLOOPBLENDOUTPUT2 = Field.create("BOOSTOPENLOOPBLENDOUTPUT2", 623, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDPARAMETER1 = Field.create("BOOSTCLOSEDLOOPBLENDPARAMETER1", 624, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDPARAMETER2 = Field.create("BOOSTCLOSEDLOOPBLENDPARAMETER2", 626, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDBIAS1 = Field.create("BOOSTCLOSEDLOOPBLENDBIAS1", 628, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDBIAS2 = Field.create("BOOSTCLOSEDLOOPBLENDBIAS2", 629, FieldType.INT8).setScale(0.5).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDOUTPUT1 = Field.create("BOOSTCLOSEDLOOPBLENDOUTPUT1", 630, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field BOOSTCLOSEDLOOPBLENDOUTPUT2 = Field.create("BOOSTCLOSEDLOOPBLENDOUTPUT2", 632, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field ALIGNMENTFILL_AT_634 = Field.create("ALIGNMENTFILL_AT_634", 634, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field COILSTATE1 = Field.create("COILSTATE1", 636, FieldType.BIT, 0).setBaseOffset(0);
	public static final Field COILSTATE2 = Field.create("COILSTATE2", 636, FieldType.BIT, 1).setBaseOffset(0);
	public static final Field COILSTATE3 = Field.create("COILSTATE3", 636, FieldType.BIT, 2).setBaseOffset(0);
	public static final Field COILSTATE4 = Field.create("COILSTATE4", 636, FieldType.BIT, 3).setBaseOffset(0);
	public static final Field COILSTATE5 = Field.create("COILSTATE5", 636, FieldType.BIT, 4).setBaseOffset(0);
	public static final Field COILSTATE6 = Field.create("COILSTATE6", 636, FieldType.BIT, 5).setBaseOffset(0);
	public static final Field COILSTATE7 = Field.create("COILSTATE7", 636, FieldType.BIT, 6).setBaseOffset(0);
	public static final Field COILSTATE8 = Field.create("COILSTATE8", 636, FieldType.BIT, 7).setBaseOffset(0);
	public static final Field COILSTATE9 = Field.create("COILSTATE9", 636, FieldType.BIT, 8).setBaseOffset(0);
	public static final Field COILSTATE10 = Field.create("COILSTATE10", 636, FieldType.BIT, 9).setBaseOffset(0);
	public static final Field COILSTATE11 = Field.create("COILSTATE11", 636, FieldType.BIT, 10).setBaseOffset(0);
	public static final Field COILSTATE12 = Field.create("COILSTATE12", 636, FieldType.BIT, 11).setBaseOffset(0);
	public static final Field INJECTORSTATE1 = Field.create("INJECTORSTATE1", 636, FieldType.BIT, 12).setBaseOffset(0);
	public static final Field INJECTORSTATE2 = Field.create("INJECTORSTATE2", 636, FieldType.BIT, 13).setBaseOffset(0);
	public static final Field INJECTORSTATE3 = Field.create("INJECTORSTATE3", 636, FieldType.BIT, 14).setBaseOffset(0);
	public static final Field INJECTORSTATE4 = Field.create("INJECTORSTATE4", 636, FieldType.BIT, 15).setBaseOffset(0);
	public static final Field INJECTORSTATE5 = Field.create("INJECTORSTATE5", 636, FieldType.BIT, 16).setBaseOffset(0);
	public static final Field INJECTORSTATE6 = Field.create("INJECTORSTATE6", 636, FieldType.BIT, 17).setBaseOffset(0);
	public static final Field INJECTORSTATE7 = Field.create("INJECTORSTATE7", 636, FieldType.BIT, 18).setBaseOffset(0);
	public static final Field INJECTORSTATE8 = Field.create("INJECTORSTATE8", 636, FieldType.BIT, 19).setBaseOffset(0);
	public static final Field INJECTORSTATE9 = Field.create("INJECTORSTATE9", 636, FieldType.BIT, 20).setBaseOffset(0);
	public static final Field INJECTORSTATE10 = Field.create("INJECTORSTATE10", 636, FieldType.BIT, 21).setBaseOffset(0);
	public static final Field INJECTORSTATE11 = Field.create("INJECTORSTATE11", 636, FieldType.BIT, 22).setBaseOffset(0);
	public static final Field INJECTORSTATE12 = Field.create("INJECTORSTATE12", 636, FieldType.BIT, 23).setBaseOffset(0);
	public static final Field TRIGGERCHANNEL1 = Field.create("TRIGGERCHANNEL1", 636, FieldType.BIT, 24).setBaseOffset(0);
	public static final Field TRIGGERCHANNEL2 = Field.create("TRIGGERCHANNEL2", 636, FieldType.BIT, 25).setBaseOffset(0);
	public static final Field VVTCHANNEL1 = Field.create("VVTCHANNEL1", 636, FieldType.BIT, 26).setBaseOffset(0);
	public static final Field VVTCHANNEL2 = Field.create("VVTCHANNEL2", 636, FieldType.BIT, 27).setBaseOffset(0);
	public static final Field VVTCHANNEL3 = Field.create("VVTCHANNEL3", 636, FieldType.BIT, 28).setBaseOffset(0);
	public static final Field VVTCHANNEL4 = Field.create("VVTCHANNEL4", 636, FieldType.BIT, 29).setBaseOffset(0);
	public static final Field OUTPUTREQUESTPERIOD = Field.create("OUTPUTREQUESTPERIOD", 640, FieldType.INT).setScale(1.0).setBaseOffset(0);
	public static final Field MAPFAST = Field.create("MAPFAST", 644, FieldType.FLOAT).setBaseOffset(0);
	public static final Field LUAGAUGES1 = Field.create("LUAGAUGES1", 648, FieldType.FLOAT).setBaseOffset(0);
	public static final Field LUAGAUGES2 = Field.create("LUAGAUGES2", 652, FieldType.FLOAT).setBaseOffset(0);
	public static final Field RAWMAF2 = Field.create("RAWMAF2", 656, FieldType.INT16).setScale(0.001).setBaseOffset(0);
	public static final Field MAFMEASURED2 = Field.create("MAFMEASURED2", 658, FieldType.INT16).setScale(0.1).setBaseOffset(0);
	public static final Field SCHEDULINGUSEDCOUNT = Field.create("SCHEDULINGUSEDCOUNT", 660, FieldType.INT16).setScale(1.0).setBaseOffset(0);
	public static final Field VEHICLESPEEDKPH = Field.create("VEHICLESPEEDKPH", 662, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field GEGO = Field.create("GEGO", 664, FieldType.INT16).setScale(0.01).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND1 = Field.create("UNUSEDATTHEEND1", 666, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND2 = Field.create("UNUSEDATTHEEND2", 667, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND3 = Field.create("UNUSEDATTHEEND3", 668, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND4 = Field.create("UNUSEDATTHEEND4", 669, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND5 = Field.create("UNUSEDATTHEEND5", 670, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND6 = Field.create("UNUSEDATTHEEND6", 671, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND7 = Field.create("UNUSEDATTHEEND7", 672, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND8 = Field.create("UNUSEDATTHEEND8", 673, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND9 = Field.create("UNUSEDATTHEEND9", 674, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND10 = Field.create("UNUSEDATTHEEND10", 675, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND11 = Field.create("UNUSEDATTHEEND11", 676, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND12 = Field.create("UNUSEDATTHEEND12", 677, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND13 = Field.create("UNUSEDATTHEEND13", 678, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND14 = Field.create("UNUSEDATTHEEND14", 679, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND15 = Field.create("UNUSEDATTHEEND15", 680, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND16 = Field.create("UNUSEDATTHEEND16", 681, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND17 = Field.create("UNUSEDATTHEEND17", 682, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND18 = Field.create("UNUSEDATTHEEND18", 683, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND19 = Field.create("UNUSEDATTHEEND19", 684, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND20 = Field.create("UNUSEDATTHEEND20", 685, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND21 = Field.create("UNUSEDATTHEEND21", 686, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND22 = Field.create("UNUSEDATTHEEND22", 687, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND23 = Field.create("UNUSEDATTHEEND23", 688, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND24 = Field.create("UNUSEDATTHEEND24", 689, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND25 = Field.create("UNUSEDATTHEEND25", 690, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND26 = Field.create("UNUSEDATTHEEND26", 691, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND27 = Field.create("UNUSEDATTHEEND27", 692, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND28 = Field.create("UNUSEDATTHEEND28", 693, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND29 = Field.create("UNUSEDATTHEEND29", 694, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND30 = Field.create("UNUSEDATTHEEND30", 695, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND31 = Field.create("UNUSEDATTHEEND31", 696, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND32 = Field.create("UNUSEDATTHEEND32", 697, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND33 = Field.create("UNUSEDATTHEEND33", 698, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND34 = Field.create("UNUSEDATTHEEND34", 699, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND35 = Field.create("UNUSEDATTHEEND35", 700, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND36 = Field.create("UNUSEDATTHEEND36", 701, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND37 = Field.create("UNUSEDATTHEEND37", 702, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND38 = Field.create("UNUSEDATTHEEND38", 703, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND39 = Field.create("UNUSEDATTHEEND39", 704, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND40 = Field.create("UNUSEDATTHEEND40", 705, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND41 = Field.create("UNUSEDATTHEEND41", 706, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND42 = Field.create("UNUSEDATTHEEND42", 707, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND43 = Field.create("UNUSEDATTHEEND43", 708, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND44 = Field.create("UNUSEDATTHEEND44", 709, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND45 = Field.create("UNUSEDATTHEEND45", 710, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND46 = Field.create("UNUSEDATTHEEND46", 711, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND47 = Field.create("UNUSEDATTHEEND47", 712, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND48 = Field.create("UNUSEDATTHEEND48", 713, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND49 = Field.create("UNUSEDATTHEEND49", 714, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND50 = Field.create("UNUSEDATTHEEND50", 715, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND51 = Field.create("UNUSEDATTHEEND51", 716, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND52 = Field.create("UNUSEDATTHEEND52", 717, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND53 = Field.create("UNUSEDATTHEEND53", 718, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND54 = Field.create("UNUSEDATTHEEND54", 719, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND55 = Field.create("UNUSEDATTHEEND55", 720, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND56 = Field.create("UNUSEDATTHEEND56", 721, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND57 = Field.create("UNUSEDATTHEEND57", 722, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND58 = Field.create("UNUSEDATTHEEND58", 723, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND59 = Field.create("UNUSEDATTHEEND59", 724, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND60 = Field.create("UNUSEDATTHEEND60", 725, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND61 = Field.create("UNUSEDATTHEEND61", 726, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND62 = Field.create("UNUSEDATTHEEND62", 727, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND63 = Field.create("UNUSEDATTHEEND63", 728, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND64 = Field.create("UNUSEDATTHEEND64", 729, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND65 = Field.create("UNUSEDATTHEEND65", 730, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND66 = Field.create("UNUSEDATTHEEND66", 731, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND67 = Field.create("UNUSEDATTHEEND67", 732, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND68 = Field.create("UNUSEDATTHEEND68", 733, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND69 = Field.create("UNUSEDATTHEEND69", 734, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND70 = Field.create("UNUSEDATTHEEND70", 735, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND71 = Field.create("UNUSEDATTHEEND71", 736, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND72 = Field.create("UNUSEDATTHEEND72", 737, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND73 = Field.create("UNUSEDATTHEEND73", 738, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND74 = Field.create("UNUSEDATTHEEND74", 739, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND75 = Field.create("UNUSEDATTHEEND75", 740, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND76 = Field.create("UNUSEDATTHEEND76", 741, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND77 = Field.create("UNUSEDATTHEEND77", 742, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND78 = Field.create("UNUSEDATTHEEND78", 743, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND79 = Field.create("UNUSEDATTHEEND79", 744, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND80 = Field.create("UNUSEDATTHEEND80", 745, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND81 = Field.create("UNUSEDATTHEEND81", 746, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND82 = Field.create("UNUSEDATTHEEND82", 747, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND83 = Field.create("UNUSEDATTHEEND83", 748, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND84 = Field.create("UNUSEDATTHEEND84", 749, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND85 = Field.create("UNUSEDATTHEEND85", 750, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND86 = Field.create("UNUSEDATTHEEND86", 751, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND87 = Field.create("UNUSEDATTHEEND87", 752, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND88 = Field.create("UNUSEDATTHEEND88", 753, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND89 = Field.create("UNUSEDATTHEEND89", 754, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND90 = Field.create("UNUSEDATTHEEND90", 755, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND91 = Field.create("UNUSEDATTHEEND91", 756, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND92 = Field.create("UNUSEDATTHEEND92", 757, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND93 = Field.create("UNUSEDATTHEEND93", 758, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND94 = Field.create("UNUSEDATTHEEND94", 759, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND95 = Field.create("UNUSEDATTHEEND95", 760, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND96 = Field.create("UNUSEDATTHEEND96", 761, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND97 = Field.create("UNUSEDATTHEEND97", 762, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND98 = Field.create("UNUSEDATTHEEND98", 763, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND99 = Field.create("UNUSEDATTHEEND99", 764, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND100 = Field.create("UNUSEDATTHEEND100", 765, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND101 = Field.create("UNUSEDATTHEEND101", 766, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND102 = Field.create("UNUSEDATTHEEND102", 767, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND103 = Field.create("UNUSEDATTHEEND103", 768, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND104 = Field.create("UNUSEDATTHEEND104", 769, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND105 = Field.create("UNUSEDATTHEEND105", 770, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND106 = Field.create("UNUSEDATTHEEND106", 771, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND107 = Field.create("UNUSEDATTHEEND107", 772, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND108 = Field.create("UNUSEDATTHEEND108", 773, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND109 = Field.create("UNUSEDATTHEEND109", 774, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND110 = Field.create("UNUSEDATTHEEND110", 775, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND111 = Field.create("UNUSEDATTHEEND111", 776, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND112 = Field.create("UNUSEDATTHEEND112", 777, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND113 = Field.create("UNUSEDATTHEEND113", 778, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND114 = Field.create("UNUSEDATTHEEND114", 779, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND115 = Field.create("UNUSEDATTHEEND115", 780, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND116 = Field.create("UNUSEDATTHEEND116", 781, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND117 = Field.create("UNUSEDATTHEEND117", 782, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND118 = Field.create("UNUSEDATTHEEND118", 783, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND119 = Field.create("UNUSEDATTHEEND119", 784, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND120 = Field.create("UNUSEDATTHEEND120", 785, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND121 = Field.create("UNUSEDATTHEEND121", 786, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND122 = Field.create("UNUSEDATTHEEND122", 787, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND123 = Field.create("UNUSEDATTHEEND123", 788, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND124 = Field.create("UNUSEDATTHEEND124", 789, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND125 = Field.create("UNUSEDATTHEEND125", 790, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND126 = Field.create("UNUSEDATTHEEND126", 791, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND127 = Field.create("UNUSEDATTHEEND127", 792, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND128 = Field.create("UNUSEDATTHEEND128", 793, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND129 = Field.create("UNUSEDATTHEEND129", 794, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND130 = Field.create("UNUSEDATTHEEND130", 795, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND131 = Field.create("UNUSEDATTHEEND131", 796, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND132 = Field.create("UNUSEDATTHEEND132", 797, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND133 = Field.create("UNUSEDATTHEEND133", 798, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field UNUSEDATTHEEND134 = Field.create("UNUSEDATTHEEND134", 799, FieldType.INT8).setScale(1.0).setBaseOffset(0);
	public static final Field[] VALUES = {
	SD_PRESENT,
	SD_LOGGING_INTERNAL,
	TRIGGERSCOPEREADY,
	ANTILAGTRIGGERED,
	ISFANON,
	ISO2HEATERON,
	CHECKENGINE,
	NEEDBURN,
	SD_MSD,
	ISFAN2ON,
	TOOTHLOGREADY,
	ISTPSERROR,
	ISCLTERROR,
	ISMAPERROR,
	ISIATERROR,
	ISTRIGGERERROR,
	HASCRITICALERROR,
	ISWARNNOW,
	ISPEDALERROR,
	ISKNOCKCHIPOK,
	LAUNCHTRIGGERED,
	ISTPS2ERROR,
	ISIDLECLOSEDLOOP,
	INJECTORFAULT,
	IGNITIONFAULT,
	RPMVALUE,
	RPMACCELERATION,
	SPEEDTORPMRATIO,
	UNUSEDVEHICLESPEEDKPH,
	INTERNALMCUTEMPERATURE,
	COOLANT,
	INTAKE,
	AUXTEMP1,
	AUXTEMP2,
	TPSVALUE,
	THROTTLEPEDALPOSITION,
	TPSADC,
	RAWMAF,
	MAFMEASURED,
	MAPVALUE,
	BAROPRESSURE,
	LAMBDAVALUE,
	KNOCKRETARD,
	ALIGNMENTFILL_AT_37,
	VBATT,
	OILPRESSURE,
	VVTPOSITIONB1I,
	ACTUALLASTINJECTION,
	INJECTORDUTYCYCLE,
	VEVALUE,
	INJECTIONOFFSET,
	INJECTORLAGMS,
	ENGINEMAKECODENAMECRC16,
	WALLFUELAMOUNT,
	WALLFUELCORRECTIONVALUE,
	REVOLUTIONCOUNTERSINCESTART,
	CANREADCOUNTER,
	TPSACCELFUEL,
	CURRENTIGNITIONMODE,
	CURRENTINJECTIONMODE,
	COILDUTYCYCLE,
	IDLEAIRVALVEPOSITION,
	ETBTARGET,
	ETB1DUTYCYCLE,
	FUELTANKLEVEL,
	TOTALFUELCONSUMPTION,
	FUELFLOWRATE,
	TPS2VALUE,
	TUNECRC16,
	KNOCKLEVEL,
	SECONDS,
	ENGINEMODE,
	FIRMWAREVERSION,
	RAWIDLEPOSITIONSENSOR,
	RAWWASTEGATEPOSITION,
	ACCELERATIONX,
	ACCELERATIONY,
	DETECTEDGEAR,
	MAXTRIGGERREENTRANT,
	RAWLOWFUELPRESSURE,
	RAWHIGHFUELPRESSURE,
	LOWFUELPRESSURE,
	TCUDESIREDGEAR,
	FLEXPERCENT,
	WASTEGATEPOSITIONSENSOR,
	HIGHFUELPRESSURE,
	ALIGNMENTFILL_AT_122,
	TSCONFIGVERSION,
	CALIBRATIONVALUE,
	CALIBRATIONMODE,
	IDLETARGETPOSITION,
	ALIGNMENTFILL_AT_134,
	TOTALTRIGGERERRORCOUNTER,
	ORDERINGERRORCOUNTER,
	WARNINGCOUNTER,
	LASTERRORCODE,
	RECENTERRORCODE1,
	RECENTERRORCODE2,
	RECENTERRORCODE3,
	RECENTERRORCODE4,
	RECENTERRORCODE5,
	RECENTERRORCODE6,
	RECENTERRORCODE7,
	RECENTERRORCODE8,
	DEBUGFLOATFIELD1,
	DEBUGFLOATFIELD2,
	DEBUGFLOATFIELD3,
	DEBUGFLOATFIELD4,
	DEBUGFLOATFIELD5,
	DEBUGFLOATFIELD6,
	DEBUGFLOATFIELD7,
	DEBUGINTFIELD1,
	DEBUGINTFIELD2,
	DEBUGINTFIELD3,
	DEBUGINTFIELD4,
	DEBUGINTFIELD5,
	EGT1,
	EGT2,
	EGT3,
	EGT4,
	EGT5,
	EGT6,
	EGT7,
	EGT8,
	RAWTPS1PRIMARY,
	RAWPPSPRIMARY,
	RAWCLT,
	RAWIAT,
	RAWOILPRESSURE,
	FUELCLOSEDLOOPBINIDX,
	TCUCURRENTGEAR,
	RAWPPSSECONDARY,
	KNOCK1,
	KNOCK2,
	KNOCK3,
	KNOCK4,
	KNOCK5,
	KNOCK6,
	KNOCK7,
	KNOCK8,
	KNOCK9,
	KNOCK10,
	KNOCK11,
	KNOCK12,
	IDLEPOSITIONSENSOR,
	AFRVALUE,
	VSSACCELERATION,
	LAMBDAVALUE2,
	AFRVALUE2,
	VVTPOSITIONB1E,
	VVTPOSITIONB2I,
	VVTPOSITIONB2E,
	FUELPIDCORRECTION1,
	FUELPIDCORRECTION2,
	RAWTPS1SECONDARY,
	RAWTPS2PRIMARY,
	RAWTPS2SECONDARY,
	ACCELERATIONZ,
	ACCELERATIONROLL,
	ACCELERATIONYAW,
	VVTTARGETS1,
	VVTTARGETS2,
	VVTTARGETS3,
	VVTTARGETS4,
	TURBOSPEED,
	TPS1SPLIT,
	TPS2SPLIT,
	TPS12SPLIT,
	ACCPEDALSPLIT,
	SPARKCUTREASON,
	FUELCUTREASON,
	MAFESTIMATE,
	INSTANTRPM,
	RAWMAP,
	RAWAFR,
	ALIGNMENTFILL_AT_306,
	CALIBRATIONVALUE2,
	ISMAINRELAYON,
	ISUSBCONNECTED,
	LUAINVOCATIONCOUNTER,
	LUALASTCYCLEDURATION,
	TESTBENCHITER,
	TCU_CURRENTRANGE,
	TCRATIO,
	LASTSHIFTTIME,
	VSSEDGECOUNTER,
	ISSEDGECOUNTER,
	AUXLINEAR1,
	AUXLINEAR2,
	DFCOACTIVE,
	FALLBACKMAP,
	INSTANTMAPVALUE,
	MAXLOCKEDDURATION,
	CANWRITEOK,
	CANWRITENOTOK,
	ALIGNMENTFILL_AT_358,
	TRIGGERPRIMARYFALL,
	TRIGGERPRIMARYRISE,
	TRIGGERSECONDARYFALL,
	TRIGGERSECONDARYRISE,
	TRIGGERVVTFALL,
	TRIGGERVVTRISE,
	TRIGGERVVT2FALL,
	TRIGGERVVT2RISE,
	STARTERSTATE,
	STARTERRELAYDISABLE,
	MULTISPARKCOUNTER,
	EXTIOVERFLOWCOUNT,
	ALTERNATORSTATUS_PTERM,
	ALTERNATORSTATUS_ITERM,
	ALTERNATORSTATUS_DTERM,
	ALTERNATORSTATUS_OUTPUT,
	ALTERNATORSTATUS_ERROR,
	ALTERNATORSTATUS_RESETCOUNTER,
	IDLESTATUS_PTERM,
	IDLESTATUS_ITERM,
	IDLESTATUS_DTERM,
	IDLESTATUS_OUTPUT,
	IDLESTATUS_ERROR,
	IDLESTATUS_RESETCOUNTER,
	ETBSTATUS_PTERM,
	ETBSTATUS_ITERM,
	ETBSTATUS_DTERM,
	ETBSTATUS_OUTPUT,
	ETBSTATUS_ERROR,
	ETBSTATUS_RESETCOUNTER,
	BOOSTSTATUS_PTERM,
	BOOSTSTATUS_ITERM,
	BOOSTSTATUS_DTERM,
	BOOSTSTATUS_OUTPUT,
	BOOSTSTATUS_ERROR,
	BOOSTSTATUS_RESETCOUNTER,
	WASTEGATEDCSTATUS_PTERM,
	WASTEGATEDCSTATUS_ITERM,
	WASTEGATEDCSTATUS_DTERM,
	WASTEGATEDCSTATUS_OUTPUT,
	WASTEGATEDCSTATUS_ERROR,
	WASTEGATEDCSTATUS_RESETCOUNTER,
	VVTSTATUS1_PTERM,
	VVTSTATUS1_ITERM,
	VVTSTATUS1_DTERM,
	VVTSTATUS1_OUTPUT,
	VVTSTATUS1_ERROR,
	VVTSTATUS1_RESETCOUNTER,
	VVTSTATUS2_PTERM,
	VVTSTATUS2_ITERM,
	VVTSTATUS2_DTERM,
	VVTSTATUS2_OUTPUT,
	VVTSTATUS2_ERROR,
	VVTSTATUS2_RESETCOUNTER,
	VVTSTATUS3_PTERM,
	VVTSTATUS3_ITERM,
	VVTSTATUS3_DTERM,
	VVTSTATUS3_OUTPUT,
	VVTSTATUS3_ERROR,
	VVTSTATUS3_RESETCOUNTER,
	VVTSTATUS4_PTERM,
	VVTSTATUS4_ITERM,
	VVTSTATUS4_DTERM,
	VVTSTATUS4_OUTPUT,
	VVTSTATUS4_ERROR,
	VVTSTATUS4_RESETCOUNTER,
	AUXSPEED1,
	AUXSPEED2,
	ISSVALUE,
	RAWANALOGINPUT1,
	RAWANALOGINPUT2,
	RAWANALOGINPUT3,
	RAWANALOGINPUT4,
	RAWANALOGINPUT5,
	RAWANALOGINPUT6,
	RAWANALOGINPUT7,
	RAWANALOGINPUT8,
	GPPWMOUTPUT1,
	GPPWMOUTPUT2,
	GPPWMOUTPUT3,
	GPPWMOUTPUT4,
	GPPWMXAXIS1,
	GPPWMXAXIS2,
	GPPWMXAXIS3,
	GPPWMXAXIS4,
	GPPWMYAXIS1,
	GPPWMYAXIS2,
	GPPWMYAXIS3,
	GPPWMYAXIS4,
	RAWBATTERY,
	IGNBLENDPARAMETER1,
	IGNBLENDPARAMETER2,
	IGNBLENDPARAMETER3,
	IGNBLENDPARAMETER4,
	IGNBLENDBIAS1,
	IGNBLENDBIAS2,
	IGNBLENDBIAS3,
	IGNBLENDBIAS4,
	IGNBLENDOUTPUT1,
	IGNBLENDOUTPUT2,
	IGNBLENDOUTPUT3,
	IGNBLENDOUTPUT4,
	VEBLENDPARAMETER1,
	VEBLENDPARAMETER2,
	VEBLENDPARAMETER3,
	VEBLENDPARAMETER4,
	VEBLENDBIAS1,
	VEBLENDBIAS2,
	VEBLENDBIAS3,
	VEBLENDBIAS4,
	VEBLENDOUTPUT1,
	VEBLENDOUTPUT2,
	VEBLENDOUTPUT3,
	VEBLENDOUTPUT4,
	BOOSTOPENLOOPBLENDPARAMETER1,
	BOOSTOPENLOOPBLENDPARAMETER2,
	BOOSTOPENLOOPBLENDBIAS1,
	BOOSTOPENLOOPBLENDBIAS2,
	BOOSTOPENLOOPBLENDOUTPUT1,
	BOOSTOPENLOOPBLENDOUTPUT2,
	BOOSTCLOSEDLOOPBLENDPARAMETER1,
	BOOSTCLOSEDLOOPBLENDPARAMETER2,
	BOOSTCLOSEDLOOPBLENDBIAS1,
	BOOSTCLOSEDLOOPBLENDBIAS2,
	BOOSTCLOSEDLOOPBLENDOUTPUT1,
	BOOSTCLOSEDLOOPBLENDOUTPUT2,
	ALIGNMENTFILL_AT_634,
	COILSTATE1,
	COILSTATE2,
	COILSTATE3,
	COILSTATE4,
	COILSTATE5,
	COILSTATE6,
	COILSTATE7,
	COILSTATE8,
	COILSTATE9,
	COILSTATE10,
	COILSTATE11,
	COILSTATE12,
	INJECTORSTATE1,
	INJECTORSTATE2,
	INJECTORSTATE3,
	INJECTORSTATE4,
	INJECTORSTATE5,
	INJECTORSTATE6,
	INJECTORSTATE7,
	INJECTORSTATE8,
	INJECTORSTATE9,
	INJECTORSTATE10,
	INJECTORSTATE11,
	INJECTORSTATE12,
	TRIGGERCHANNEL1,
	TRIGGERCHANNEL2,
	VVTCHANNEL1,
	VVTCHANNEL2,
	VVTCHANNEL3,
	VVTCHANNEL4,
	OUTPUTREQUESTPERIOD,
	MAPFAST,
	LUAGAUGES1,
	LUAGAUGES2,
	RAWMAF2,
	MAFMEASURED2,
	SCHEDULINGUSEDCOUNT,
	VEHICLESPEEDKPH,
	GEGO,
	UNUSEDATTHEEND1,
	UNUSEDATTHEEND2,
	UNUSEDATTHEEND3,
	UNUSEDATTHEEND4,
	UNUSEDATTHEEND5,
	UNUSEDATTHEEND6,
	UNUSEDATTHEEND7,
	UNUSEDATTHEEND8,
	UNUSEDATTHEEND9,
	UNUSEDATTHEEND10,
	UNUSEDATTHEEND11,
	UNUSEDATTHEEND12,
	UNUSEDATTHEEND13,
	UNUSEDATTHEEND14,
	UNUSEDATTHEEND15,
	UNUSEDATTHEEND16,
	UNUSEDATTHEEND17,
	UNUSEDATTHEEND18,
	UNUSEDATTHEEND19,
	UNUSEDATTHEEND20,
	UNUSEDATTHEEND21,
	UNUSEDATTHEEND22,
	UNUSEDATTHEEND23,
	UNUSEDATTHEEND24,
	UNUSEDATTHEEND25,
	UNUSEDATTHEEND26,
	UNUSEDATTHEEND27,
	UNUSEDATTHEEND28,
	UNUSEDATTHEEND29,
	UNUSEDATTHEEND30,
	UNUSEDATTHEEND31,
	UNUSEDATTHEEND32,
	UNUSEDATTHEEND33,
	UNUSEDATTHEEND34,
	UNUSEDATTHEEND35,
	UNUSEDATTHEEND36,
	UNUSEDATTHEEND37,
	UNUSEDATTHEEND38,
	UNUSEDATTHEEND39,
	UNUSEDATTHEEND40,
	UNUSEDATTHEEND41,
	UNUSEDATTHEEND42,
	UNUSEDATTHEEND43,
	UNUSEDATTHEEND44,
	UNUSEDATTHEEND45,
	UNUSEDATTHEEND46,
	UNUSEDATTHEEND47,
	UNUSEDATTHEEND48,
	UNUSEDATTHEEND49,
	UNUSEDATTHEEND50,
	UNUSEDATTHEEND51,
	UNUSEDATTHEEND52,
	UNUSEDATTHEEND53,
	UNUSEDATTHEEND54,
	UNUSEDATTHEEND55,
	UNUSEDATTHEEND56,
	UNUSEDATTHEEND57,
	UNUSEDATTHEEND58,
	UNUSEDATTHEEND59,
	UNUSEDATTHEEND60,
	UNUSEDATTHEEND61,
	UNUSEDATTHEEND62,
	UNUSEDATTHEEND63,
	UNUSEDATTHEEND64,
	UNUSEDATTHEEND65,
	UNUSEDATTHEEND66,
	UNUSEDATTHEEND67,
	UNUSEDATTHEEND68,
	UNUSEDATTHEEND69,
	UNUSEDATTHEEND70,
	UNUSEDATTHEEND71,
	UNUSEDATTHEEND72,
	UNUSEDATTHEEND73,
	UNUSEDATTHEEND74,
	UNUSEDATTHEEND75,
	UNUSEDATTHEEND76,
	UNUSEDATTHEEND77,
	UNUSEDATTHEEND78,
	UNUSEDATTHEEND79,
	UNUSEDATTHEEND80,
	UNUSEDATTHEEND81,
	UNUSEDATTHEEND82,
	UNUSEDATTHEEND83,
	UNUSEDATTHEEND84,
	UNUSEDATTHEEND85,
	UNUSEDATTHEEND86,
	UNUSEDATTHEEND87,
	UNUSEDATTHEEND88,
	UNUSEDATTHEEND89,
	UNUSEDATTHEEND90,
	UNUSEDATTHEEND91,
	UNUSEDATTHEEND92,
	UNUSEDATTHEEND93,
	UNUSEDATTHEEND94,
	UNUSEDATTHEEND95,
	UNUSEDATTHEEND96,
	UNUSEDATTHEEND97,
	UNUSEDATTHEEND98,
	UNUSEDATTHEEND99,
	UNUSEDATTHEEND100,
	UNUSEDATTHEEND101,
	UNUSEDATTHEEND102,
	UNUSEDATTHEEND103,
	UNUSEDATTHEEND104,
	UNUSEDATTHEEND105,
	UNUSEDATTHEEND106,
	UNUSEDATTHEEND107,
	UNUSEDATTHEEND108,
	UNUSEDATTHEEND109,
	UNUSEDATTHEEND110,
	UNUSEDATTHEEND111,
	UNUSEDATTHEEND112,
	UNUSEDATTHEEND113,
	UNUSEDATTHEEND114,
	UNUSEDATTHEEND115,
	UNUSEDATTHEEND116,
	UNUSEDATTHEEND117,
	UNUSEDATTHEEND118,
	UNUSEDATTHEEND119,
	UNUSEDATTHEEND120,
	UNUSEDATTHEEND121,
	UNUSEDATTHEEND122,
	UNUSEDATTHEEND123,
	UNUSEDATTHEEND124,
	UNUSEDATTHEEND125,
	UNUSEDATTHEEND126,
	UNUSEDATTHEEND127,
	UNUSEDATTHEEND128,
	UNUSEDATTHEEND129,
	UNUSEDATTHEEND130,
	UNUSEDATTHEEND131,
	UNUSEDATTHEEND132,
	UNUSEDATTHEEND133,
	UNUSEDATTHEEND134,
	};
}
