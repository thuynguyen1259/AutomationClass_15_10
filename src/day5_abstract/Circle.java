package day5_abstract;

public class Circle extends Shape{

	@Override
	public void draw () {
		System.out.println("Vẽ hình tròn bằng màu " + super.getColor()+ " bằng đường tròn");
	}
	
}
