package day2;
import java.util.*;

public class btvnd2 {

	public static void main(String[] args) {
		
// Đề bài: nhập vào một mảng từ bàn phím, tính tổng các giá trị của mảng đó và in ra kết quả
		
		System.out.println("nhập số phần tử trong mảng:");
		Scanner sc= new Scanner (System.in); // tạo scanner, lấy đầu vào
		int n = sc.nextInt(); // read user input
		// khai báo mảng để lưu trữ giá trị mảng
		int [] array = new int [n];
		int sum = 0;
		for (int i =0; i<n; i++) {
			System.out.println("nhập giá trị phần tử" +(i+1) + ":");
			array [i]= sc.nextInt();
			sum = sum + array[i];

	}
// in ra mảng vừa nhập
//		System.out.println("mảng đã nhập: {");
//		for (int i=0; i<n; i++) {
//			System.out.println(array[i]);
//			if (i<n-1) {
//			System.out.println(",");
//			}
//				
//		}
//		System.out.println("}");
		//tính tổng mảng nhập
		System.out.println("tổng giá trị của mảng là:" + sum);
	}
}

