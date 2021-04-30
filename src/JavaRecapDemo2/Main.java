package JavaRecapDemo2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "elif", "bir", "e@gmail.com", "12345", "tokat", "C#");
		Student student2 = new Student(2, "nehir", "iki", "n@gmail.com", "12345", "istanbul", "Java");
		Student student3 = new Student(3, "rahim", "üç", "r@gmail.com", "12345", "manisa", "c#");
		Student student4 = new Student(4, "gökhan", "beş", "g@gmail.com", "12345", "sakarya", "database");

		Instructor instructor1 = new Instructor(1, "xxx1", "bir", "x@gmail.com", "12345", "programing");
		Instructor instructor2 = new Instructor(1, "xxx2", "iki", "c@gmail.com", "12345", "Java");
		Instructor instructor3 = new Instructor(1, "xxx3", "üç", "v@gmail.com", "12345", "C#");

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addDepartment(instructor1);

		User[] students = { student1, student2, student3 };
		studentManager.list(students);
		
		User[] instructors = { instructor1, instructor2, instructor3 };
		instructorManager.list(instructors);
		
		studentManager.addList(student1,student2,student3,student4);
		instructorManager.addList(instructor1, instructor2, instructor3);
	}
}
