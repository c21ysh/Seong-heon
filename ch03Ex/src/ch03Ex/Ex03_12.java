package ch03Ex;

public class Ex03_12 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		int r = x % y; //r은 나머지 구하기 연산 %를 함
		int mok = x / y; //
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다 , %n", mok, r);
		System.out.println(0.1 == 0.1f);
		System.out.println(10.0 == 10.0f);
		
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1 == str2); //객체로 비교하기때문에 번지수가 달라서 false
		System.out.println(str1.equals(str2)); //단순 값만 비교하는거라서 true(.equals())
		
		
		
	}

}
