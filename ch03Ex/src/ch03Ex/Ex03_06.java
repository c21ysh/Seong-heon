package ch03Ex;

public class Ex03_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n",a,b,a+b);
		System.out.printf("%d - %d = %d%n",a,b,a-b);
		System.out.printf("%d * %d = %d%n",a,b,a*b);
		System.out.printf("%d / %d = %d%n",a,b,a/b);// int/int �� ����� int �׷��� 2.5�ε� 0.5���������� 2�� return��
		System.out.printf("%d / %f = %f%n",a,(float)b,a/(float)b); // int/float �� float�� return
		
		
		

	}

}
