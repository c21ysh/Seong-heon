package ch05project;

public class Ex05_09 {
		public static void main(String[] args) {
			int[][]score = { 		//배열첨자[]가 두개 이므로 2차원 배열이다.
					{100,100,100}, //0행 배열안의 값들은 행
					{20,20,20,},   //1행 배열
					{30,30,30,},   //2행 배열
					{40,40,40,}    //3행 배열
			};
			/*
			 int[][] score = new int[][] {  
			        {100,100,100}, //0행 배열안의 값들은 행
					{20,20,20,},   //1행 배열
					{30,30,30,},   //2행 배열
					{40,40,40,}    //3행 배열
			  }: 
			 */
			
			int sum = 0;
			
			for(int i = 0; i < score.length; i++) {
				for(int j = 0; j < score[i].length; j++) { //score[i].length는 열의 갯수
					System.out.printf("score[%d][%d] = %d%n" ,i, j, score[i][j]);
					
					sum += score[i][j];
					
				}
			}
			System.out.println("sum : " + sum);
			
		
	}
}
