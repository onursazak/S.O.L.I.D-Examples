
public class ToyPlane implements Movable,Flyable,Toy {

	double price;
    String color;
    
    public void setPrice(double price) {
        this.price = price;
    }
  
    public void setColor(String color) {
        this.color=color;
    }
  
    public void move(){
        System.out.println("ToyPlane: Start moving plane.");
    }

    public void fly(){
        System.out.println("ToyPlane: Start flying plane.");
    }

    public String toString(){
        return "ToyPlane: Moveable and flyable toy plane- Price: "+price+" Color: "+color;
    }



	
}
