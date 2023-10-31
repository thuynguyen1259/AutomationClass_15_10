package day5_inherritance;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.maSV ="MSV001";
		st.setName("Thuy");
		st.setPhone("1234");
		st.diChoi();
		st.diHoc();
		
		Teacher tc= new Teacher();
		tc.chuNhiemLop ="auto test";
		tc.setName("Cô Hoan");
		tc.setPhone("5678");
		tc.diChoi();
		tc.diDay();
		
	}

}
