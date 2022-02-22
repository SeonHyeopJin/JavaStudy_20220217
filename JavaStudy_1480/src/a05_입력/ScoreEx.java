package a05_입력;

import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		/**
		 * int score 입력
		 * score 마이너스 점수이거나 100점을 넘으면 X출력
		 * 90이상 A
		 * 80이상 B
		 * 70이상 C
		 * 60이상 D
		 * 그외   F
		 * 성적을 입력해 주세요 : 85
		 * 학생의 평점은 B입니다.
		 */
		
		Scanner sc = new Scanner(system.in);
		int score = 85;
		String grade = null;
		
		System.out.println("성적을 입력해 주세요: ");
		score = sc.nextInt();
		grade = score > -1 && score < 101 ? "A" : "오류";
				score > 89 ? 'A':
						score > 79 ? 'B':
								score > 69 ? 'C':
										score > 59 ? 'D':
												score > -1 ? 'F';
								System.out.println("학생의 평점은 " + grade + " 등급입니다");				
			
	}

}
