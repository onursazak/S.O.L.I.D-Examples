package lowlevel;
import highlevel.Switchable;

public class Fan implements Switchable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Fan: Fan turned on...");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Fan : Fan turned off...");
	}

}
