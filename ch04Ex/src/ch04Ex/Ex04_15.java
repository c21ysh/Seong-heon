package ch04Ex;

import java.util.Scanner;

public class Ex04_15 {

	public static void main(String[] args) {
		int menu=0;
		int num=0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("�޴� 1");
			System.out.println("�޴� 2");
			System.out.println("�޴� 3");
			System.out.println("���ϴ� �޴� ��ȣ(1~3)�� �����ϰ� ����� 0 �� ����");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("���α׷��� ���� �մϴ�.");
				break; //while �� ����
			}
			else if (!(menu >= 1 && menu <= 3)) {
				System.out.println("�޴��� �� �� �����ϼ̽��ϴ�.");
				continue; //�ݺ��� �ٽ� ����
			}
			System.out.println("�����Ͻ� �޴���"+menu+"���Դϴ�.");
			
			
		}
		System.out.println("while �� ���Դϴ�.");
			

	}

}
