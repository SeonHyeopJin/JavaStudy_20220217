package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번 : 20220001	-> studentCode
		 * 이름 : 박현중	-> name1, name2, name3(문자) char
		 * 학년 : 1			-> studentYear(정수)	
		 * 성적 : 85.5		-> score(실수/double)
		 * 평점 : B			-> grade(문자)//char
		 * 성별 : 남성(true) //boolean	-> gender
		 */
		int studentCode = 20220001;
		int studentYear = 1;
		char name1 = '박';
		char name2 = '현';
		char name3 = '중';
		char grade = 'B';
		boolean gender = true ;
		double score = 85.5;
	
		System.out.println("학번 : " + studentCode);
		System.out.print("이름 : " );
		System.out.println(""+name1 + name2 + name3);
//		System.out.print(name2);
//		System.out.println(name3);
		System.out.println("학년 : " + studentYear);
		System.out.println("성적 : " + score);
		System.out.println("평점 : " + grade);
		System.out.println("성별 : " + gender);
		
	
	}

}
