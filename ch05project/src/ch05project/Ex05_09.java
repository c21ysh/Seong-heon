package ch05project;

public class Ex05_09 {
		public static void main(String[] args) {
			int[][]score = { 		//�迭÷��[]�� �ΰ� �̹Ƿ� 2���� �迭�̴�.
					{100,100,100}, //0�� �迭���� ������ ��
					{20,20,20,},   //1�� �迭
					{30,30,30,},   //2�� �迭
					{40,40,40,}    //3�� �迭
			};
			/*
			 int[][] score = new int[][] {  
			        {100,100,100}, //0�� �迭���� ������ ��
					{20,20,20,},   //1�� �迭
					{30,30,30,},   //2�� �迭
					{40,40,40,}    //3�� �迭
			  }: 
			 */
			
			int sum = 0;
			
			for(int i = 0; i < score.length; i++) {
				for(int j = 0; j < score[i].length; j++) { //score[i].length�� ���� ����
					System.out.printf("score[%d][%d] = %d%n" ,i, j, score[i][j]);
					
					sum += score[i][j];
					
				}
			}
			System.out.println("sum : " + sum);
			
		
	}
}
