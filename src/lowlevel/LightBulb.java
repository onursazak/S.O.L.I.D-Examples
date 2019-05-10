package lowlevel;
import highlevel.Switchable;

public class LightBulb implements Switchable{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("LightBulb : Bulb turned on..");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("LightBulb : bulb turned off..");
	}

}
