package ch04Ex;

import java.util.Scanner;

public class Ex04_06 {

	public static void main(String[] args) {
		
		System.out.print("현재 월을 입력하세요 :");
		
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		switch(month) { //()안의 조건값은 상수나 정수값, 문자열을 갖는 변수를 사용
		//case뒤에 오는 값은 변수나 상수값
		//맨처음은 조건값과 일치하는 case로이동
			case 3: //자기 case안에 break문이 없으면 맨처음 만나는 break까지 진행한다
			case 4:
			case 5:
				System.out.println("3,4,5월은 봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("6,7,8월은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("9,10,11월은 가을입니다.");
				break;
			case 1:
			case 2:
			case 12:
				System.out.println("12,1,2월은 겨울입니다.");
				break;
			default :
				System.out.println("입력을 1~12사이만 하세요");
				
				
		}
	
	}

}
