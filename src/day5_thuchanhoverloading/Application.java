package day5_thuchanhoverloading;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loaiBacSi;
		tinhLuong tl = new tinhLuong();
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap loai bac si, 1 là chuyên khoa, 2 là đa khoa: ");
		loaiBacSi= sc.nextInt();
		System.out.println("luong bac si la: " +tl.tinhluong(5000000, 2, 2, loaiBacSi));
		
	}

}
