package ch03Ex;

public class Ex03_08 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a*b); //byte는 -128 ~ 127이므로 범위밖의 수 300은 잘려 나간다
		
		System.out.println(c);
		

	}

}
