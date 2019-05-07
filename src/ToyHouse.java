
public class ToyHouse implements Toy {
	double price;
	String color;

	public void setPrice(double price) {
		this.price = price;
		
	}

	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public String toString() {
		return "ToyHouse [price=" + price + ", color=" + color + "]";
	}	
	
}
