
public class ToyCar implements Toy,Movable {
	
	String color;
	double price;
	
	@Override
	public void move() {
		System.out.println("ToyCar is moving...");	
	}
	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price;
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public String toString() {
		return "ToyCar: Moveable Toy car- Price: "+price+" Color: "+color;
	}

	

}
