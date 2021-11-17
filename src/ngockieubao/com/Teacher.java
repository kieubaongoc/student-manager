package ngockieubao.com;

public class Teacher extends Person{
	public double salary;

	// GETTER
	public double getSalary() {
		return this.salary;
	}
	// SETTER
	public void setSalary(double tSalary) {
		this.salary = tSalary;
	}
	
	// CONSTRUCTORS
	
	// Constructor default
	public Teacher() {
		super();
	}
	//Constructor full
	public Teacher(String tName, int tBirthday, String tAddress, String tGender, double tSalary) {
		super(tName, tBirthday, tAddress, tGender);
		this.salary = tSalary;
	}
	
	// show salary
	public void showInfo() {
		super.showInfo();
		System.out.println("Teacher's salary: " + getSalary() + "$");
	}
}
