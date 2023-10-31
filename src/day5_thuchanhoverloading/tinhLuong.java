package day5_thuchanhoverloading;

public class tinhLuong {

	
	public double tinhluong(int luongCoBan, float heSoLuong, int soNamKN, int loaiBacSi) 
	{
		if (loaiBacSi ==1)
		
			return luongCoBan + luongCoBan *heSoLuong*soNamKN*0.2;
		if (loaiBacSi ==2)
			return luongCoBan + luongCoBan *heSoLuong*soNamKN*0.45;
		
		else return luongCoBan;
			
	}
	
}
