package ch04Ex;

import java.util.Scanner;

public class Ex04_12 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��ϼ���>.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��� ������");
			}
			else if (input < answer) {
				System.out.println("�� ū���� �ٽ� �õ��� ������");
			}
			else {
				System.out.println("�����Դϴ�!");
			}
		}while(input != answer); 
		
		
	}

}
