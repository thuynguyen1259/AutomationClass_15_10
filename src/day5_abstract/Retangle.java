package day5_abstract;

public class Retangle extends Shape {
	public int chieudai;
	@Override
	public void draw () {
		System.out.println("Vẽ hình vuông bằng màu " + super.getColor()+ " bằng đường thẳng");
	}
	

}
