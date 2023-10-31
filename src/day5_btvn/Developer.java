package day5_btvn;
import java.util.*;

public class Developer extends Employee {
	int soGioLamThem;
	@Override
	public void nhap() {
		Scanner sc =new Scanner(System.in);
		System.out.println("nhập số giờ làm thêm: ");
		soGioLamThem = sc.nextInt();
	}
	@Override
	public int tinhLuong() {
		return getLuongCoBan() + soGioLamThem*100000;
	}
	
}
