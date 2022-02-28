package a08.함수;

import java.util.Scanner;

/*
 * 계산기
 * 입력
 * 첫번째 수 입력
 * 사칙연산(+, -, *, /)
 * 
 * 두번째 수 입력
 * 
 * 결과를 출력
 * 
 * 정수와 실수 모두 계산 가능해야함.
 * 
 * calc()
 * 
 */

public class MethodOverloading2 {
	
	public static String calc(String num1, String num2, char operator) {
		String result = null;
		
		if(operator == '+') {
			result = Double.toString(Double.parseDouble(num1) + Double
		}else if(operator == '-') {	
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num1 = null, num = null;
		char operator = ' ';
		
		System.out.println("첫번째 수 입력:");
		num1 = scanner.next();
		
		System.out.println();
		
		
		
		
		첫번째 수 입력 : 10
		연산할 기호를 선택하세요: +
		두번째 수 입력 : 30
		
	}

}
