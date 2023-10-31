package day5_abstract;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rect = new Retangle();
		rect.setColor("Green");
		rect.draw();
		
		
	
		Shape circle = new Circle();
		circle.setColor("Orange");
		circle.draw();

	}

}
