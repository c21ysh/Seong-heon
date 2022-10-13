package ch04Ex;

public class Ex04_08 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		for(int i =1; i <=5; i++) {
			System.out.print(i);
		}
		
		int sum = 0;
		for(int i =1; i<=100; i++) {
			sum += i;
			System.out.println("1부터 100까지의 합은 : " + sum);
		}
	}

}
