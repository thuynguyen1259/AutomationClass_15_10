package day5_inherritance;

public class Student extends Person {

	public String maSV;
	@Override
	public void diChoi() {
		System.out.println("Sinh vien "+getName()+ "," +getPhone()+ ","+maSV+ "đi chơi sau đi hoc");
	}
	public void diHoc() {
		System.out.println("sinh vien " +maSV+ " di hoc 5 buoi sang/tuan");
	}
}
