package Polymorphism;

public class EmployeeDetails {
	public void fetchDetails(int id) {
		System.out.println(id);
	}
		public void fetchDetails(String empname) {
			System.out.println(empname);
		}
		
		public void fetchDetails(long phoneno) {
			System.out.println(phoneno);
	}
	 public static void main(String[] args) {
		 EmployeeDetails emp1 = new EmployeeDetails();
		 emp1.fetchDetails(123);
		 emp1.fetchDetails("ram");
		 emp1.fetchDetails(896325412);
				 
	}
}
