package a18_컬렉션.HashMap;

import java.util.HashMap;

public class StudentTest {

	public static void main(String[] args) {
			StudentService service = new StudentService(new HashMap<String, Student>());
		
			service.showStudentAll();
		
			service.addStudent("진선협", "aaa@gmail.com", "창원시 진해구");
			service.addStudent("진민엽", "bbb@gmail.com", "창원시 의창구");
			service.addStudent("진선엽", "ccc@gmail.com", "창원시 마산회원구");
			service.showStudentAll();
		
			service.updateStudentByName("진선협", "ddd@kakao.com", "창원시 성산구");
			service.showStudentByName("진선협");
		
			service.deleteStudentByName("진민엽");
			service.showStudentAll();
	}
		
}
