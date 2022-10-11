package ch03Ex;

public class Ex03_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n",a,b,a+b);
		System.out.printf("%d - %d = %d%n",a,b,a-b);
		System.out.printf("%d * %d = %d%n",a,b,a*b);
		System.out.printf("%d / %d = %d%n",a,b,a/b);// int/int 는 결과도 int 그래서 2.5인데 0.5날려버리고 2가 return됨
		System.out.printf("%d / %f = %f%n",a,(float)b,a/(float)b); // int/float 는 float로 return
		
		
		

	}

}
