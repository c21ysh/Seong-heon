package ch04Ex;

import java.util.Scanner;

public class Ex04_11 {

	public static void main(String[] args) {
		
		int num=0, sum=0;
		System.out.print("숫자를 입력하세요.(예:12345)");
		
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine();
		
		num = Integer.parseInt(tmp);
		//Integer는 int를 처리하는 클래스로 wrapper클래스라 한다.(기본형을 참조형으로 변환)
		//parseInt(tmp)는 tmp가 숫자형태만 정수로 변환 가능 
		while(num != 0) {
			sum += num%10; //숫자의 1자리부터 그 숫자를 더해감
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10; //10으로 나눈 몫
		}
		
		System.out.println("각 자리수의 합 : "+ sum);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		//중첩 while문
		int i = 2;
		while(i <= 9) {
			int j = 1;
			
			while(j <= 9) {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;
			}
			i++;
		}

	}

}
