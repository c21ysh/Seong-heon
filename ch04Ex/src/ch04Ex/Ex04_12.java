package ch04Ex;

import java.util.Scanner;

public class Ex04_12 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요>.");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해 보세요");
			}
			else if (input < answer) {
				System.out.println("더 큰수로 다시 시도해 보세요");
			}
			else {
				System.out.println("정답입니다!");
			}
		}while(input != answer); 
		
		
	}

}
