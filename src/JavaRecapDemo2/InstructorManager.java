package JavaRecapDemo2;

public class InstructorManager extends UserManager {

	@Override
	public void addList(User... users) {
		super.addList(users);
	}

	@Override
	public void add(User �nstructor) {
		super.add(�nstructor);
		System.out.println("e�itmen eklendi");

	}

	@Override
	public void login(User �nstructor) {
		super.login(�nstructor);
		System.out.println("e�itmen giri� yapt�");
	}

	@Override
	public void list(User[] users) {
		super.list(users);
		System.out.println("e�itmen  listelendi");
	}

	public void addDepartment(User �nstructor) {
		System.out.println("e�itmen b�l�m� eklendi");
	}

}
