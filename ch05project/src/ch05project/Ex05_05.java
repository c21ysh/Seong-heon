package ch05project;

import java.util.Iterator;

public class Ex05_05 {

	public static void main(String[] args) {
		int []ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) { //i�� �ݺ������̸鼭 ���ι�ȣ�� ��Ÿ��
			ball[i] = i+1;
		}
		
		int tmp = 0; //��ȯ �� ����� �ӽ� ����
		int j = 0; //�ζ� ��ȣ�� ������ ���ι�ȣ
		
		for (int i=0; i<6; i++) {
			j = (int)(Math.random()*45); // 0~44 ������ �� 
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;	//������ȯ�� �˰���? 
			
		}
		for(int i =0; i<6; i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}

	}
 
}
