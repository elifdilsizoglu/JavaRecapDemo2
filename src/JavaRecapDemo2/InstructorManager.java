package JavaRecapDemo2;

public class InstructorManager extends UserManager {

	@Override
	public void addList(User... users) {
		super.addList(users);
	}

	@Override
	public void add(User ýnstructor) {
		super.add(ýnstructor);
		System.out.println("eðitmen eklendi");

	}

	@Override
	public void login(User ýnstructor) {
		super.login(ýnstructor);
		System.out.println("eðitmen giriþ yaptý");
	}

	@Override
	public void list(User[] users) {
		super.list(users);
		System.out.println("eðitmen  listelendi");
	}

	public void addDepartment(User ýnstructor) {
		System.out.println("eðitmen bölümü eklendi");
	}

}
