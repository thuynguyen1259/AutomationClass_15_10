package day5_thuchanh;

public class HinhChuNhat extends HinhHoc {

	public int chieuDai;
	public int chieuRong;
	@Override
	public Double tinhDienTich() {
		return (double) (chieuDai*chieuRong); 
	}
	
}
