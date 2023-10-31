package day2;
import java.util.*;

public class practice {

	public static void main(String[] args) {
//  Bài toán: Viết chương trình nhập vào một mảng gồm n số nguyên và thực hiện các công việc sau:

// 1. Xuất các giá trị của mảng ra
//2. Tìm min, max
//3. Tìm các số nguyên tố có trong mảng
//4. Sắp xếp mảng theo thứ tự tăng dần

	//1. xuất các giá trị của mảng
		// tạo scanner
		Scanner sc = new Scanner(System.in)	;
		System.out.println("nhap so phan tu mang: ");
		int n = sc.nextInt(); // khai báo n và đọc n từ user
		// tạo mảng
		int [] arr = new int[n];
		for (int i =0; i <n; i++) {
			System.out.println("nhap gia tri mang thu " +(i+1)+":");
			arr[i]= sc.nextInt(); 
		}
		System.out.print("mang vua nhap la: {");
		for (int i=0; i< arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length-1) {
				System.out.printf(",");
			}
		}
		System.out.println("}");
		
		//2. tìm min,max 7 3 5
		int min = arr [0]; // lấy số đầu tiên của mảng làm mốc
		for (int i=0; i<n; i++) {
			if (arr[i] < min) {
				min =arr[i];
			}
				
		}	
		System.out.println("gia tri min la:" + min);
		
		int max = arr[0];
		for (int i=0; i<n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}		
		}
		System.out.println("gia tri max la:" + max);
		
		//3. tìm giá trị nguyên tố => đọc khum hỉu => hiểu kiểu boolean laf trả về 2 gtr true or false nhưng cái
		//4. sắp xếp tăng dần
		System.out.println("day so trong mang sap xep tang dan: ");
		int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
        	for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    
        }
        	}
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
}
	}
