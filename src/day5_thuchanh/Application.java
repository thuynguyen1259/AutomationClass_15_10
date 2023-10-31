package day5_thuchanh;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HinhTron c =new HinhTron();
		c.banKinh=4;
		c.tinhDienTich();
		HinhChuNhat cn=new HinhChuNhat();
		cn.chieuDai=5;
		cn.chieuRong=6;
		cn.tinhDienTich();
		System.out.println("dien tich hinh cn: "+ c.tinhDienTich());
		System.out.println("dien tich hinh cn: "+ cn.tinhDienTich());
	}

}
