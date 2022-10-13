package ch04Ex;

public class Ex04_07 {

	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 0; i<=5; i++) {
			num = (int)(Math.random() * 6) + 1;
			//Math.random()은 double형 0.0에서 0.999999까지 나온다
			//Math.random()에 어떤 수를 곱하면 그 숫자보다 1적은 수를 구한다
			//num은 0부터 6까지의 정수가 된다 0.0<=Math.random<1.0
			System.out.println(num);
		}

	}

}
