package day3;
import java.util.*;

public class btnvd3 {

	public static void main(String[] args) {
	
		// khai báo mảng nặc danh
		int [] arr = {3,4,2,7,5,10,5,3};
		int temp = arr [0];
	// YC1: sắp xếp tăng dần bubble sort
		System.out.println("day so tang dan la:");
		for (int i=0; i < arr.length-1; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if (arr [i] > arr[j]) {
					temp = arr[j];
					arr [j]=arr[i];
					arr [i] =temp;
					}	
				}
			}
		
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
           
		}
	//YC2: sắp xếp giảm dần bubble sort
		System.out.println();
		System.out.println("day so giam dan la:");
		for (int i=0; i < arr.length-1; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if (arr [j] > arr[i]) {
					temp = arr[j];
					arr [j]=arr[i];
					arr [i] =temp;
					}	
				}
			}
		
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ";");
		}
	//	YC3: Nhập vào 1 dãy số từ bàn phím, nếu gặp số nào chia hết cho cả 2 và 3 thì in ra 
	//	"Điều kiện thoát xảy ra!" và thoát chương trình dù chưa hết độ dài mảng
		System.out.println();
		System.out.println("Nhập số phan tu trong mang:");
		Scanner sc =new Scanner (System.in);
		int n = sc.nextInt();
		//khai báo mảng
		int [] arr1 = new int [n];
		for (int i =0; i< n; i++) {
			System.out.println("nhập giá trị phần tử" +(i+1) + ":");
			arr1 [i]= sc.nextInt();
	        if ((arr1[i] % 2 == 0) && (arr1[i] %3 == 0)) {
	           System.out.println(" Điều kiện thoát xảy ra!");
	             break;
	            } 

	        }
	// heapsort : vun đống
		//1,9,4,2,7
		}	
			
	}



	


