package a05_입력;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		/**
		 * username(아이디)
		 * password(비밀번호)
		 * year(년도)
		 * month(월)
		 * day(일)
		 * name(이름)
		 * address(주소) 경남 창원시 진해구 청안동
		 * import 단축키 Ctrl + Shift + o 혹은 Scan입력후 Ctrl + SPACE로 자동완성
		 */
		Scanner in = new Scanner(System.in);
		String username = in.next();
	    String password = in.next();
	    int year = in.nextInt();
	    int month = in.nextInt();
	    int day = in.nextInt();
	    String name = in.next();
	    in.nextLine();
	    String address = in.nextLine();
		
	    System.out.println("아이디: " + username);
	    System.out.println("비밀번호:" + password);
	    System.out.println("생년월일:" + year + "/" + month + "/" + day);
	    System.out.println("이름:" +name);
	    System.out.println("주소:" + address);
	    }

}
