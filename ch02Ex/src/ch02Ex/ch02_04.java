package ch02Ex;

import java.util.*;

public class ch02_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		
		String input = sc.nextLine();//입력시까지 대기, 입력받은 내용은 문자열
		
		//숫자형 문자열을 정수로 변경
		int num = Integer.parseInt(input);
		System.out.println("입력내용"+input);
		System.out.printf("num= %d%n",num);
		
		
	}

}
