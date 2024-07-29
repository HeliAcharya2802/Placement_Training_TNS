import java.util.Scanner;
class Employee{

	private String name,email,designation,salary;
	public void setname(String name){
		this.name = name;
	}
	public String getname(){
		return name;
	}
	public void setemail(String email){
		this.email = email;
	}
	public String getemail(){
		return email;
	}
	public void setdesignation(String designation){
		this.designation = designation;
	}
	public String getdesignation(){
		return designation;
	}
	public void setsalary(String salary){
		this.salary = salary;
	}
	public String getsalary(){
		return salary;
	}
	public String toString(){
		return "Employee[name,email,designation,salary]";
	}	
}
class ArrayOfEmployee{

	public void CreateArrayOfEmp(){
		Scanner sc = new Scanner(System.in);
		int[] no = new int[12];
		Employee[] emp = new Employee[10];
		for(int i=0;i<3;i++){
			emp[i] = new Employee();
		}
		for(int i=0;i<3;i++){
			System.out.println("Enter Name");
			emp[i].setname(sc.nextLine());
			System.out.println("Enter Your Designation");
			emp[i].setdesignation(sc.nextLine());
		}
		for(int i=0;i<3;i++){
			System.out.println(emp[i]);
		}
		

	}
}

class TestArrayOfObject{
	public static void main(String args[]){
	ArrayOfEmployee arr = new ArrayOfEmployee();
	arr.CreateArrayOfEmp();
	}

}