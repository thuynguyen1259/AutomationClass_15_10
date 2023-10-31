package day4;

public class Developer {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee ();
		emp1.setEmployeeID("ID12345");
		emp1.setEmployeeName("Thuy Nguyen");
		emp1.getSalary("10.000.000 VND");
		emp2.setEmployeeID("ID67890");
		emp2.setEmployeeName("Thanh Nguyen");
		emp2.getSalary("20.000.000 VND");
		
		
		System.out.println("Mã NV 1 là: " + emp1.getEmployeeID() +','+ "Tên nhân viên 1 là: " + emp1.getEmployeeName()+','+ "Lương nhân viên 1 là: " + emp1.setSalary());
		System.out.println("Mã NV 2 là: " + emp2.getEmployeeID() +','+ "Tên nhân viên 2 là: " + emp2.getEmployeeName()+ ',' + "Lương nhân viên 2 là: " + emp2.setSalary());

	}

}
