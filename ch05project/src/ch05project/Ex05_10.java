package ch05project;

import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		
		String[][] words = {	//3�� 2���� 2���� �迭
				{"chair", "����"},
				{"computer", "��ǻ��"},
				{"Integer", "����"}
		};
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0;i < words.length; i++) {
			System.out.printf("Q%d, %s�� ����?%n", i+1, words[i][0]);
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ� ������ : " + words[i][1]);
			}
		}
		
		
		

	}

}
