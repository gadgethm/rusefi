/*
 * @file test_2jz_vvt.cpp
 *
 *  Created on: May 10, 2020
 * @author Andrey Belomutskiy, (c) 2012-2020
 */

#include "pch.h"

TEST(sensors, test2jz) {

	EngineTestHelper eth(TOYOTA_2JZ_GTE_VVTi);
	engineConfiguration->isFasterEngineSpinUpEnabled = false;


	// this crank trigger would be easier to test, crank shape is less important for this test
	engineConfiguration->useOnlyRisingEdgeForTrigger = true;
	eth.setTriggerType(TT_ONE);

	ASSERT_EQ( 0,  Sensor::getOrZero(SensorType::Rpm)) << "test2jz RPM";
	for (int i = 0; i < 2;i++) {
		eth.fireRise(25);
		ASSERT_EQ( 0,  Sensor::getOrZero(SensorType::Rpm)) << "test2jz RPM at " << i;
	}
	eth.fireRise(25);
	// first time we have RPM
	ASSERT_EQ(2400,  Sensor::getOrZero(SensorType::Rpm)) << "test2jz RPM";


	eth.moveTimeForwardUs(MS2US(3)); // shifting VVT phase a few angles

	hwHandleVvtCamSignal(TriggerValue::FALL, getTimeNowNt(), 0);
	hwHandleVvtCamSignal(TriggerValue::RISE, getTimeNowNt(), 0);

	// currentPosition
	ASSERT_NEAR(608.2 - 720, engine->triggerCentral.currentVVTEventPosition[0][0], EPS3D);
}
