package ch02Ex;

public class Ex02_00 {
	static int X;
	//메소드 밖의 변수는 클래스 내의 어디서나 사용 가능
	//기본적인 초기값을 가진다 (초기화 할 필요 없음)
	public static void main(String[] args) {
		//메소드 안에서 선언한 변수는 메소드 안에서만 사용 가능 하다 : 지역변수(local변수)
		
		int x = 100;	//int형 변수 x를 선언하고 초기값 100 대입
		double pi = 3.14;	//double형 변수 pi를 선언함과 동시에 초기값 3.14 대입
		char ch = 'a';	//char형 값은 ''안에 넣는다(""에러남)
		String str = "abc";	//참조형인 String클래스의 변수를 선언하고 값은 초기화
		
		//참조형 변수 str에는 abc가 저장된것이 아니고 abc가 저장된 곳의 주소가 저장됨
		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(X);
		
	}
}
