package ch04Ex;

public class Ex04_10 {

	public static void main(String[] args) {
		
		int i = 5;
		
		while(i-- != 0) {	//i--는 선처리 후감소이므로 i가 5부터 시작하나 출력시에는 4로 됨
			System.out.println(i + " - I can do it.");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		int sum = 0;
		int j = 0;
		
		while(sum <= 100) {
			System.out.printf("%d - %d%n", j, sum);
			sum += ++j;
			
		}
		
		
	}

}
