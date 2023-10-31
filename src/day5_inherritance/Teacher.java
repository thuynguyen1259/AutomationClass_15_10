package day5_inherritance;

public class Teacher extends Person{

	public String chuNhiemLop;
	@Override
	public void diChoi() {
		System.out.println("Giáo viên "+getName()+ "," +getPhone()+ "," +chuNhiemLop+ "đi dạy auto rồi đi chơi");
	}
	public void diDay() {
		System.out.println("giao vien chu nhiem " +chuNhiemLop+ " di day 3 buoi sang/tuan");
	}
}
