package org.emp;

public class Employee {
	public void empId(){
		System.out.println("empId:1234");
	}public void empName(){
		System.out.println("empname:surya");
	}
	public void empDob(){
			System.out.println("DOB:4.7.92");
	}
	public void empPhoneno()
	{
				System.out.println("9894424989");
	}
	public void empEmail(){
		System.out.println("sprabu047@gmail.com");
	}
		public void empAddress(){
			System.out.println("andipatty theni");
}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empName();
	e.empDob();
	e.empId();
	e.empEmail();
	e.empPhoneno();
	e.empAddress();
}

}