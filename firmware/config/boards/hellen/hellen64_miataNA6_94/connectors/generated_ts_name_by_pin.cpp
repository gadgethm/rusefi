//DO NOT EDIT MANUALLY, let automation work hard.

// auto-generated by PinoutLogic.java based on config/boards/hellen/hellen64_miataNA6_94/connectors/main.yaml
#include "pch.h"

// see comments at declaration in pin_repository.h
const char * getBoardSpecificPinName(brain_pin_e brainPin) {
	switch(brainPin) {
		case Gpio::A1: return "2N - Temperature Sensor";
		case Gpio::A3: return "4I - PPS1";
		case Gpio::A6: return "3G - CAM";
		case Gpio::A7: return "4G - PPS2 OR TEMPERATURE SENSOR";
		case Gpio::B0: return "4H - TPS2";
		case Gpio::B1: return "3E - CRANK";
		case Gpio::C1: return "2M - Pressure Sensor";
		case Gpio::C13: return "1G - Ignition 1 & 4 (rev D)";
		case Gpio::C4: return "1V - Clutch Switch";
		case Gpio::C5: return "1Q AC Switch";
		case Gpio::C6: return "ETB EN";
		case Gpio::C7: return "ETB +";
		case Gpio::C8: return "ETB -";
		case Gpio::D10: return "3Z - Injector 4";
		case Gpio::D11: return "3Y - Injector 3";
		case Gpio::D12: return "Radiator Fan";
		case Gpio::D14: return "3W - IDLE";
		case Gpio::D9: return "3S - A/C Fan 94-95";
		case Gpio::E5: return "1H - Ignition 2 & 3";
		case Gpio::F11: return "3R - VSS";
		case Gpio::F12: return "2J - Boost Control";
		case Gpio::F14: return "2I - VVT";
		case Gpio::F3: return "2L - Flex Fuel";
		case Gpio::G12: return "Tachometer (rev D)";
		case Gpio::G2: return "Fuel Pump Relay";
		case Gpio::G7: return "3U - Injector 1";
		case Gpio::G8: return "3V - Injector 2";
		case Gpio::H13: return "1C - ST_SIG";
		case Gpio::H15: return "1J - AC Relay";
		case Gpio::I0: return "Tachometer (rev C)";
		case Gpio::I8: return "1G - Ignition 1 & 4 (rev C)";
		default: return nullptr;
	}
	return nullptr;
}
