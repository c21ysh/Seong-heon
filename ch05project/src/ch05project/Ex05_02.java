package ch05project;

import java.util.Iterator;

public class Ex05_02 {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int [] score = {100,88,100,100,90};
		//int[] score = new int[]{100,88,100,100,90}; µµ ∞°¥¿¿∏¿¿
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum/(float)score.length;
		
		System.out.println("√—¡° : " + sum);
		System.out.println("∆Ú±’ : " + average);

	}

}
