package day3;
import java.util.*;

public class thuchanhd3 {

	public static void main(String[] args) {
		
	// tìm số lơn hơn, số nào là chẵn lẻ
		String chanle;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so 1: ");
		int num1 = sc.nextInt();
		System.out.println("nhap so 2: ");
		int num2 = sc.nextInt();
		if (num1>num2) {
			System.out.println("so lon hon la: " +num1);
			
		}else {
			System.out.println("so lon hon la: " +num2);
		}
		
		System.out.println("nhap so bat ky: ");
		int num3 = sc.nextInt();
		
		chanle = (num3%2 ==0)? "chan":"le";
		
		System.out.println("so "+num3+" la:" + chanle);
		
		//System.out.println("so "+num3+" la :" +((num3%2 ==0)? "so chan" : "so le")); // tính luôn
		
		
		
		
		}
	// in số chia hết cho 5, từ 1-100
		public void chiahet () {
			System.out.println("các số chia hêt cho 5 là: ");
			for (int i =100; i>=0; i-=5) {
				if (i %5 == 0)
					System.out.print(i + ";");
	}
		
	}
	// returning java
		public void compare (int number1, int number2) {
			int result;
			if (number1>number2) 
				result =number1;
			else {
				result = number2;
			}
		}
	
}
