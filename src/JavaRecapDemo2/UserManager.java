package JavaRecapDemo2;

public class UserManager {
	
	public void add(User user) {
		
		System.out.println("adý ve soyadý : " + user.getFirstName() + " " + user.getLastName());
		System.out.println("email ve sifre : " + user.getEmail() + " " + user.getPassword());
		
	}
	
	public void login(User user) {
		
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		
	} 
	
	public void list(User[] users) {
		for (User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
	}
	
	public void addList(User... users) {
		for (User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " sisteme eklendi");
		}
	}
}
