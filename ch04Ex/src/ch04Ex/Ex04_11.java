package ch04Ex;

import java.util.Scanner;

public class Ex04_11 {

	public static void main(String[] args) {
		
		int num=0, sum=0;
		System.out.print("���ڸ� �Է��ϼ���.(��:12345)");
		
		Scanner scanner = new Scanner(System.in);
		
		String tmp = scanner.nextLine();
		
		num = Integer.parseInt(tmp);
		//Integer�� int�� ó���ϴ� Ŭ������ wrapperŬ������ �Ѵ�.(�⺻���� ���������� ��ȯ)
		//parseInt(tmp)�� tmp�� �������¸� ������ ��ȯ ���� 
		while(num != 0) {
			sum += num%10; //������ 1�ڸ����� �� ���ڸ� ���ذ�
			System.out.printf("sum=%3d num=%d%n", sum, num);
			num /= 10; //10���� ���� ��
		}
		
		System.out.println("�� �ڸ����� �� : "+ sum);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		//��ø while��
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
