package ch05project;

import java.util.Arrays;

public class Ex05_03 {

	public static void main(String[] args) {
		
		int score[] = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i =1; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			else if (score[i] < min) {
				min = score[i];
			}
			
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

		int max1 = 0;
		int min1 = 0;
		for (int i = 0; i < score.length; i++) {
			
			max1 = Math.max(max, score[i]);
			min1 = Math.min(min, score[i]);
			
			
		}
		System.out.println(max1);
		System.out.println(min1);
	
	
		
		
		
		
		
	}
	


}
