package ch03Ex;

public class Ex03_05 {

	public static void main(String[] args) {
		
		double d = 85.4;//8바이트 실수형, 자바에서 소수점이 있는 숫자는 기본이 double
		int score = (int)d; //소수점 있는 실수를 int형으로 하면 소수점을 생략한 정수만 나옴
		
		System.out.println("score = "+ score);
		System.out.println("d = "+ d);
		

	}

}
