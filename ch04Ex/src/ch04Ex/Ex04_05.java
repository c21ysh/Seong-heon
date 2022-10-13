package ch04Ex;

import java.util.Scanner;

public class Ex04_05 {

	public static void main(String[] args) {
		int score = 0; //로컬변수는 선언시 기본값으로 초기화 꼭 하는 것 권고(숫자는 0)
		String grade = " "; //char형은 초기값 space ---> ' '
		
		System.out.print("점수를 입력하세요 : ");
		
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d점입니다 %n", score);
		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) {
//				grade = grade+"+";
				grade += "+"; //복합대입 연산자 사용 권고
			}
			else if(score < 93) {
				grade += "-";
			}
		}
		else if(score >= 80) {
			grade = "B";
			if(score>=88) {
				grade += "+";
			}
			else if(score <83) {
				grade += "-";
			}
		}
		else {
			grade = "C";
			if(score>=78) {
				grade += "+";
			}
			else if(score < 73) {
				grade += "-";
			}
		}
		
		System.out.println("당신의 학점은 :" + grade + "입니다.");
		

		
	}

}
