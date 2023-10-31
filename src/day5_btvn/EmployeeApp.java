package day5_btvn;
import java.util.*;

public class EmployeeApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("nhập số nhân viên: ");
		int soNV = sc.nextInt();
		Employee [] emp =new Employee[soNV];
		
		System.out.println("nhập thông tin nhân viên ");
		for (int i = 0; i < soNV; i++) {
            System.out.println("thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.println("Nhập loại nhân viên 1 là DEV 2 là Tester: ");
            int luachon = sc.nextInt();
            if (luachon ==1) {
            	emp[i]=new Developer();
            }else if (luachon==2) {
            	emp[i]=new Tester();
            }
            emp[i].nhap();
   

		}
	}
}
