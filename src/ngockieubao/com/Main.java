package ngockieubao.com;

import java.util.Scanner;

public class Main {
	
	private static Student studentObj = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int functionID = 0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		
		do {
			showMenu();
			functionID = scanner.nextInt();
			scanner.nextLine();

			switch (functionID) {
				case 1:
					addStudent();
					break;
				case 2:
					editStudent();
					break;
				case 3:
					delStudent();
					break;
				case 4:
					findStudent();
					break;
				case 5:
					softStudent();
					break;
				case 6:
					infoStudent();
					break;
				case 7:
				default:
					System.out.println("Exit.");
					flag = false;
					break;
			}
		} while (flag == true);
		
		scanner.close();
	
	}
	public static void showMenu() {
		System.out.println("---------------------- STUDENT MANAGER ----------------------");
		System.out.println("1. Add ");
		System.out.println("2. Edit ");
		System.out.println("3. Delete ");
		System.out.println("4. Find ");
		System.out.println("5. Sort increase ");
		System.out.println("6. Show Info ");
		System.out.println("7. Exit ");
		System.out.print("Your choice[1-7]: ");
	}
	public static void addStudent() {
		Scanner scanner = new Scanner(System.in);
		String name 	= "";
		int birthday 	= 0;
		String address 	= "";
		String gender 	= "";
		int score = 0;
		
		System.out.print("Name: ");
		name = scanner.nextLine();
		
		System.out.print("Birthday: ");
		birthday = scanner.nextInt();
		
		System.out.print("Address: ");
		address = scanner.next();
		
		System.out.print("Gender: ");
		gender = scanner.next();
		
		System.out.print("Score: ");
		score = scanner.nextInt();
		
		studentObj = new Student(name, birthday, address, gender, score);
//		scanner.close();
		
	}
	public static void editStudent() {
		if(studentObj != null) {
			Scanner scanner = new Scanner(System.in);
			String address 	= "";
			int score = 0;
			
			System.out.println("Address: ");
			address = scanner.next();
			
			System.out.println("Score: ");
			score = scanner.nextInt();
			
			studentObj.setAddress(address);
			studentObj.setScore(score);
			
		} else {
			System.out.println("Student is not exist.");
		}
		
	}
	public static void delStudent() {
		System.out.println("Main.delStudent()");
	}
	public static void findStudent() {
		System.out.println("Main.findStudent()");
	}
	public static void softStudent() {
		System.out.println("Main.softStudent()");
	}
	public static void infoStudent() {
		if(studentObj != null) {
			studentObj.showInfo();
		}else{
			System.out.println("Student is not exist.");
		}
	}
}
