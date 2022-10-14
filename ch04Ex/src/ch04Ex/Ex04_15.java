package ch04Ex;

import java.util.Scanner;

public class Ex04_15 {

	public static void main(String[] args) {
		int menu=0;
		int num=0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴 1");
			System.out.println("메뉴 2");
			System.out.println("메뉴 3");
			System.out.println("원하는 메뉴 번호(1~3)을 선택하고 종료는 0 을 선택");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료 합니다.");
				break; //while 문 나옴
			}
			else if (!(menu >= 1 && menu <= 3)) {
				System.out.println("메뉴를 잘 못 선택하셨습니다.");
				continue; //반복문 다시 시작
			}
			System.out.println("선택하신 메뉴는"+menu+"번입니다.");
			
			
		}
		System.out.println("while 문 밖입니다.");
			

	}

}
