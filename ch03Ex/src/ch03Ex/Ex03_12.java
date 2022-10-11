package ch03Ex;

public class Ex03_12 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		int r = x % y; //r은 나머지 구하기 연산 %를 함
		int mok = x / y; //
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다 , %n", mok, r);
		

	}

}
/* 
	quiz1
		1. 클래스 이름이 MyClass인 클래스를 만듬
		2. MyClass안에 main 메소드를 만듬
		3. main매소드 안에 Hellow를 콘솔창에 출력 하도록 함
		4. 숫자 1000을 출력함
		5. main메소드 안에서 사용할 지역변수를 만들기
			4바이트 정수 변수 myNum을 만들고 초기값은 5
			4바이트 실수 변수 myFloatNum을 만들고 초기값은 5.99
			2바이트 문자 변수 myLetter를 만들고 초기값은 D
			불리언 형변수 myBool를 만들고 초기값은 true
			문자열형 변수 myText를 만들고 초기값은 I love you
*/