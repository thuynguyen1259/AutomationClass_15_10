package day4;

public class Motobike {
	// thuộc tính thuộc lớp, variable thuộc hàm
//	int x =0; // attribute
	public static String hangSX;
	public static String mauXe;
	public static String bienso;
	public static String ngayDangKy;
	
	public static void LayThongTinXe ()
	{
		System.out.println("Hãng sản xuất: " +hangSX+ '\n' +"Màu xe: " +mauXe+'\n' + "Biển số: " +bienso+'\n' + "Ngày đăng ký: "+ngayDangKy);
	}
	 

	public static void main(String[] args) {
//		int y =0// variable
		Motobike xeSH = new Motobike();
		xeSH.hangSX ="Honda";
		xeSH.mauXe="Đen";
		xeSH.bienso="30A-12345";
		xeSH.ngayDangKy="24-10-2023";
		xeSH.LayThongTinXe();
			
	}

}
