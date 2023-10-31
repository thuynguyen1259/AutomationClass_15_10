package day5_abstract;

public abstract class Shape {

	private String color ="Red";
	public String getColor () {
		return color;
}
	public void setColor(String newColor) {
		this.color =newColor;
	}
	public abstract void draw();
	

}
