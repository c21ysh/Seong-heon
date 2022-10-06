package ch02Ex;

public class Ex02_02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int tmp = x;
		x = y;  //x에 y값을 대입 -- x는 원래값 10에서 대입된 y값 5를 갖게됨
		y = tmp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
	}
}
