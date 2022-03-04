package a11_상속.User;

public class UserTest {

	public static void main(String[] args) {
		User user = new PersonalUser();
		user.setUsername("seonhyeop");
		user.setPassword("1234");
		
		System.out.println(user.login("seonhyeop", "1234"));

	}

}
