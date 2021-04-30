package JavaRecapDemo2;

public class StudentManager extends UserManager {

	@Override
	public void addList(User... users) {
		super.addList(users);
	}

	@Override
	public void add(User student) {
		super.add(student);
		System.out.println("��renci eklendi");
	}

	@Override
	public void login(User student) {
		super.login(student);
		System.out.println("��renci giri� yapt�");
	}

	public void addAddress(User student) {
		System.out.println("��rencinin adresi eklendi");
	}

	@Override
	public void list(User[] users) {
		super.list(users);
		System.out.println("��renciler listelendi");
	}
}
