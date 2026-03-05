package in.scalive.beans;

public class Student {
	private int roll;
	private String name;
	public Student() {
		System.out.println("Student bean created..");
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		System.out.println("setRoll called...");
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName called...");
		this.name = name;
	}

	
	

}
