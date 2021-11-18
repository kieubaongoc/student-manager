package ngockieubao.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static Student studentObj = null;
	static ArrayList<Student> listStudent = new ArrayList<Student>();

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
					infoStudent();
					break;
				case 6:
				default:
					System.out.println("Exit.");
					flag = false;
					break;
			}
		} while (flag == true);
		
		scanner.close();
	
	}
	public static void showMenu() {
		System.out.println("---------------- STUDENT MANAGER ----------------");
		System.out.println("1. Add ");
		System.out.println("2. Edit ");
		System.out.println("3. Delete ");
		System.out.println("4. Find ");
		System.out.println("5. Show Info ");
		System.out.println("6. Exit ");
		System.out.print("Your choice[1-6]: ");
	}
	public static void addStudent() {
		Scanner scanner = new Scanner(System.in);
		String id 		= "";
		String name 	= "";
		int birthday 	= 0;
		String address 	= "";
		String gender 	= "";
		int score = 0;
		
		System.out.print("ID: ");
		id = scanner.next();
		
		System.out.print("Name: ");
		name = scanner.next();
		
		System.out.print("Birthday: ");
		birthday = scanner.nextInt();
		
		System.out.print("Address: ");
		address = scanner.next();
		
		System.out.print("Gender: ");
		gender = scanner.next();
		
		System.out.print("Score: ");
		score = scanner.nextInt();
		
		studentObj = new Student(id, name, birthday, address, gender, score);
		listStudent.add(studentObj);
//		scanner.close();
		
	}
	public static void editStudent() {
		if(studentObj != null) {
			String idStudent;
			Scanner scanner = new Scanner(System.in);
			do {
				System.out.println("Enter ID student: ");
				idStudent = scanner.next();
			} while (idStudent.equals(studentObj.id) == false);
				
			if(idStudent.equals(studentObj.id) == true)
			{
				String address 	= "";
				int score = 0;
				
				System.out.println("Address: ");
				address = scanner.next();
				
				System.out.println("Score: ");
				score = scanner.nextInt();
				
				studentObj.setAddress(address);
				studentObj.setScore(score);
			}
			
		} else {
				System.out.println("Student is not exist.");
			}
	}
	public static void delStudent() {
//		if(studentObj != null) {
			System.out.println("\nIn progressing . . .\n");
//			String idStudent;
//			Scanner scanner = new Scanner(System.in);
//			do {
//				System.out.println("Enter ID student: ");
//				idStudent = scanner.next();
//			} while (idStudent.equals(studentObj.id) == false);
//				
//				if(idStudent.equals(studentObj.id) == true)
//				{
////					System.out.println("Are you sure to delete?");
////					String options;
////					options = scanner.next();
////					if(options.equals("y"))
////					{
//						int numberDel;
//						System.out.print("Enter the last number of student ID: ");
//						numberDel = scanner.nextInt();
////						listStudent.remove(numberDel);
////						boolean isRemoved = listStudent.remove(Integer.valueOf(1));
//						Student remove = listStudent.remove(numberDel-1);
//						System.out.println("Remove successful.");
//					}
//					else{
//						System.out.println("Remove failed.");
//					}
//				}	
//			
//		}else{
//				System.out.println("Student is not exist.");
//			}
	}
	public static void findStudent() {
		if(studentObj != null) {
			String idStudent;
			Scanner scanner = new Scanner(System.in);
			do {
				System.out.println("Enter ID student: ");
				idStudent = scanner.next();
			} while (idStudent.equals(studentObj.id) == false);
				
			if(idStudent.contains(studentObj.id))
			{
				System.out.println("You just found: ");
				studentObj.showInfo();
				
			}else{
				System.out.println("Not found.");
			}
			
		}else{
				System.out.println("Student is not exist.");
			}
	}

	public static void infoStudent() {
		if(studentObj != null) {
			for (Student student : listStudent) {
				System.out.println();
	            student.showInfo();
	        }
		}else{
				System.out.println("Student is not exist.");
			}
	}
}
