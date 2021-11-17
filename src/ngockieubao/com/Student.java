package ngockieubao.com;

public class Student extends Person{
	public int score;

	// GETTER
	public int getScore() {
		return score;
	}
	// SETTER
	public void setScore(int score) {
		this.score = score;
	}
	
	// CONSTRUCTORS
	
	// Constructor default
	public Student(){
		super();
	}
	// Constructor full
	public Student(String sName, int sBirthday, String sAddress, String sGender, int sScore) {
		super(sName, sBirthday, sAddress, sGender);
		this.score = sScore;
	}

	// show score
	public void showInfo() {
		super.showInfo();
		System.out.println("Student's score: " + score);
	}
	
}
