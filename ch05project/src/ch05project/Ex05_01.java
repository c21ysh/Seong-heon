package ch05project;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10]; //iArr1�� int�� �迭�̰� ũ�Ⱑ 10�̴�.
		int[] iArr2 = new int[10];
		int[] iArr3 = {100,95,80,70,60,}; //�迭�� ǥ�ô� {   }�ȿ� ,�� �����Ͽ� �־��ش�.
		
		char[] chArr = {'a', 'b', 'c', 'd'}; //char�� �迭�� ����ÿ� ���� ��
		
		//�迭�� �� ���ҿ� ���� �־���
		for(int i=0; i < iArr1.length; i++) { //length�Ӽ��� �迭�� ũ��(���Ұ���)�� ��ȯ
			iArr1[i] = i + 1;
			
		}
		//�迭�� �� ���ҿ� ���� �־���
		for(int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
			
		}
		//�迭�� �������� ���� ����
		for(int i=0; i< iArr1.length; i++) {
			System.out.println(iArr1[i]);
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2)); 
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3); //���� ��
		System.out.println(chArr); //���ڿ� ���·� 
		
		
		
		
		
	}

}
