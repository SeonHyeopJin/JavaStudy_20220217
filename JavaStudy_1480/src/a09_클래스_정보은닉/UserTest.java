package a09_클래스_정보은닉;

public class UserTest {

	public static void main(String[] args) {
		User user = new User("aaaa","1234","진선협","aaaa@gmail.com");
		

		/*
		 * 아이디: aaaa
		 * 비밀번호: 1234
		 * 이름 : 진선협
		 * 메일주소 : aaaa@gmail.com
		 */
		
		
		System.out.println("아이디: " + user.getUsername());
		System.out.println("비밀번호: " + user.getPassword());
		System.out.println("이름: " + user.getName());
		System.out.println("메일주소: " + user.getEmail());
		
	}

}
