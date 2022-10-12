package ch03Ex;

import java.util.Scanner; //import는 패키지가 다른 외부의 클래스를 여기에서 사용하도록 가져옴

public class Ex03_15 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
				
		String input = scanner.nextLine(); 
		//nextLine()은 문자입력후 엔터시까지 대기하다가 엔터를 치면 입력한 결과를 반환
		//nextLine()메소드는 결과를 String으로 반환
		
		ch = input.charAt(0); //문자열 input에서 0번(맨처음)번 문자를 반환 
		
//		System.out.println((int)ch);
		
		if('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		
		else if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
			
		}else {
			System.out.println("입력하신 문자는 영문자도 아니고 숫자도 아닙니다.");
		}
		
		
			
		
		
		
		
		
		
		
	}

}
