package ngockieubao.com;

import java.util.Calendar;

public class Person {
	public String name;
	public int birthday;
	public String address;
	public String gender;
	
	// SETTER
	public void setName(String pName) {
		this.name = pName;
	}
	public void setBirthday(int pBirthday) {
		this.birthday = pBirthday;
	}
	public void setAddress(String pAddress) {
		this.address = pAddress;
	}
	public void setGender(String pGender) {
		this.gender = pGender;
	}
	
	// GETTER
	public String getName() {
		return this.name;
	}
	public int getBirthday() {
		return this.birthday;
	}
	public int getAge() {
		int age;
		Calendar now = Calendar.getInstance();
		age = now.get(Calendar.YEAR) - this.getBirthday();
		return age;
	}
	public String getAddress() {
		return this.address;
	}
	public String getGender() {
		return this.gender;
	}
	
	// CONSTRUCTORS
	
	// Constructor default
	public Person(){
		this.name = null;
		this.birthday = 0;
		this.address = null;
		this.gender = null;
		System.out.println("This is default constructor.\n");
	}
	
	// Constructor full
	public Person(String pName, int pBirthday, String pAddress, String pGender) {
		this.name = pName;
		this.birthday = pBirthday;
		this.address = pAddress;
		this.gender = pGender;
		System.out.println("This is fully constructor.\n");
	}
	
	// show info
	public void showInfo() {
		System.out.println("---------------------------");
		System.out.println("Person info:");
		System.out.println("- Name \t\t: " + this.getName());
		System.out.println("- Birthday \t: " + this.getBirthday());
		System.out.println("- Address \t: " + this.getAddress());
		System.out.println("- Gender \t: " + this.getGender());
		System.out.println("- Age \t\t: " + this.getAge());
		System.out.println();
	}
	
}
