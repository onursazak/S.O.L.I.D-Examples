package highlevel;

public class ElectricPowerSwitch implements Switch {
	
	public Switchable client;
	public boolean on;
	public ElectricPowerSwitch(Switchable client) {
		// TODO Auto-generated constructor stub
		this.client = client;
		this.on = false;
	}
	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return this.on;
	}
	
	@Override
	public void press() {
		// TODO Auto-generated method stub
		boolean checkOn = isOn();
		if(checkOn)
		{
			client.turnOff();
			this.on = false;
		}
		else
		{
			client.turnOn();
			this.on = true;
		}
	}
}
