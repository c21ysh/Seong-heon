package ch03Ex;

import java.util.Scanner; //import�� ��Ű���� �ٸ� �ܺ��� Ŭ������ ���⿡�� ����ϵ��� ������

public class Ex03_15 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���.>");
				
		String input = scanner.nextLine(); 
		//nextLine()�� �����Է��� ���ͽñ��� ����ϴٰ� ���͸� ġ�� �Է��� ����� ��ȯ
		//nextLine()�޼ҵ�� ����� String���� ��ȯ
		
		ch = input.charAt(0); //���ڿ� input���� 0��(��ó��)�� ���ڸ� ��ȯ 
		
//		System.out.println((int)ch);
		
		if('0' <= ch && ch <= '9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		
		else if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�.");
			
		}else {
			System.out.println("�Է��Ͻ� ���ڴ� �����ڵ� �ƴϰ� ���ڵ� �ƴմϴ�.");
		}
		
		
			
		
		
		
		
		
		
		
	}

}
