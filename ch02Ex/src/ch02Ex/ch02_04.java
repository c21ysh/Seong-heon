package ch02Ex;

import java.util.*;

public class ch02_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		
		String input = sc.nextLine();//�Է½ñ��� ���, �Է¹��� ������ ���ڿ�
		
		//������ ���ڿ��� ������ ����
		int num = Integer.parseInt(input);
		System.out.println("�Է³���"+input);
		System.out.printf("num= %d%n",num);
		
		
	}

}
