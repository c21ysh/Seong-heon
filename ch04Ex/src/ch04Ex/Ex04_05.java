package ch04Ex;

import java.util.Scanner;

public class Ex04_05 {

	public static void main(String[] args) {
		int score = 0; //���ú����� ����� �⺻������ �ʱ�ȭ �� �ϴ� �� �ǰ�(���ڴ� 0)
		String grade = " "; //char���� �ʱⰪ space ---> ' '
		
		System.out.print("������ �Է��ϼ��� : ");
		
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		
		System.out.printf("����� ������ %d���Դϴ� %n", score);
		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) {
//				grade = grade+"+";
				grade += "+"; //���մ��� ������ ��� �ǰ�
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
		
		System.out.println("����� ������ :" + grade + "�Դϴ�.");
		

		
	}

}
