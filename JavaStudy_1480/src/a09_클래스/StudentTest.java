package a09_클래스;

/**
 * Student(클래스)
 * 속성
 * schoolName
 * studentYear
 * studentGroup
 * studentNumber
 * studentName
 * studentAddress
 * studentPhone
 * graduationFlag(boolean)
 * 
 *기능(메소드)
 *showStudentInfo()
 * 학교명 : 부산고등학교
 * 학년: 3
 * 반: 2
 * 번호: 10
 * 이름: 진선협
 * 주소: 경남 창원시 진해구
 * 연락처: 010-4316-1480
 * 졸업구분 : true(졸업), false(재학중)
 * 
 * incrementYear()
 * 학년 + 1
 * 학년 3학년을 넘어서면 graduationFlag = true;
 * 
 */
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("부산고등학교",1,2, 10, "진선협", "경남 창원시 진해구", "010-4316-1480", false);
		
		s1.incrementYear();
		s1.incrementYear();
		s1.incrementYear();
		s1.showStudentInfo();
		
		Student s2 = new Student("경남고등학교", "진선협");
	}

}
