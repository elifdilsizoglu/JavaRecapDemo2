package JavaRecapDemo2;

public class Student extends User {
	private String address;
	private String course;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String email, String password, String address, String lesson) {
		super(id,firstName,lastName,email,password);
		this.address = address;
		this.course = lesson;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String lesson) {
		this.course = lesson;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
