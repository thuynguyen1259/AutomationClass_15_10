package day5_btvn;

import java.util.Scanner;

public class Tester extends Employee {
		int soBugPhatHien;
		@Override
		public void nhap() {
			Scanner sc =new Scanner(System.in);
			System.out.println("nhập số bug phát hiện: ");
			soBugPhatHien = sc.nextInt();
		}
		@Override
		public int tinhLuong() {
			return getLuongCoBan() + soBugPhatHien*50000;
		}
	}


