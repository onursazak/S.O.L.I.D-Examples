package highlevel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import lowlevel.Fan;
import lowlevel.LightBulb;
class ElectricPowerSwitchTest {
	
	@Test
	public void testPress() throws Exception
	{
		Switchable switchableBulb = new LightBulb();
		Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();
		
		Switchable switchableFan = new Fan();
		Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
		fanPowerSwitch.press();
		fanPowerSwitch.press();
		
	}
}
