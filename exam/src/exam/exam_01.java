package exam;

import java.util.Scanner;

public class exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3�ڸ� ������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num>0) {
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("�� �ڸ��� ���� ��� : "+sum);
		sc.close();
	}
}
