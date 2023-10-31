package day2;
import java.util.*;

public class thuchanh {

//	public void largenumber(int so1 , int so2) {
//		System.out.println(so1 + so2);

	///\ thực hành: so sánh 2 số lơn hơn
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//yc1
		int a=1123, b= 6745,c=500;
		int ketqua= (a*b)/c;
		System.out.println("ket qua la: "+ketqua);
		
		System.out.println("---------------");
		// yc 2
		Scanner sc = new Scanner(System.in); // tạo scanner
		System.out.println("Nhap so 1: ");
		double so1 = sc.nextDouble();
		System.out.println("Nhap so 2: ");
		double so2 = sc.nextDouble();
		if (so1 > so2) {
			System.out.println("So lon la: "+so1);
		} else {
			System.out.println("so lon la: "+so2);
		}
		Scanner sc1 = new Scanner(System.in);
		
	}

}


