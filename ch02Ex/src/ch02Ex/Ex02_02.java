package ch02Ex;

public class Ex02_02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		int tmp = x;
		x = y;  //x�� y���� ���� -- x�� ������ 10���� ���Ե� y�� 5�� ���Ե�
		y = tmp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		
	}
}
