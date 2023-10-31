package day5_btvn;
import java.util.*;

public abstract class Employee {

	private String maNV; 
	private String hoTen;
	private int luongCoBan;
	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuong(int luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public void nhap() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhập mã nhân viên: ");
		maNV= sc.nextLine();
		System.out.println("Nhập họ tên nhân viên: ");
		hoTen= sc.nextLine();
		System.out.println("Nhập lương cơ bản: ");
		luongCoBan= sc.nextInt();
	}
	public void xuat () {
		System.out.println("mã nhân viên: "+maNV);
		System.out.println("họ tên nhân viên: "+hoTen);
		System.out.println("lương cơ bản: "+luongCoBan);
	}
	public int tinhLuong() {
		return 0;
	}
	
}
