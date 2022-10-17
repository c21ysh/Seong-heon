package ch05project;

import java.util.Iterator;

public class Ex05_05 {

	public static void main(String[] args) {
		int []ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) { //i는 반복변수이면서 색인번호를 나타냄
			ball[i] = i+1;
		}
		
		int tmp = 0; //교환 값 저장용 임시 변수
		int j = 0; //로또 번호로 추출할 색인번호
		
		for (int i=0; i<6; i++) {
			j = (int)(Math.random()*45); // 0~44 임의의 수 
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;	//변수교환시 알고리즘? 
			
		}
		for(int i =0; i<6; i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}

	}
 
}
