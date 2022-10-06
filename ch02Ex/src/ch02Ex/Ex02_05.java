package ch02Ex;

public class Ex02_05 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');
		//charAt(int index) 메소드 String class 에 속해있다, 색인번호는0번부터 시작
		//'3'-'0' 문자가 나타내는 번호 차이로 3
		System.out.println('3' - '0' + 1); 
		
		System.out.println(Integer.parseInt("3") + 1);
		//parseInt(숫자 문자열)은 문자열을 int로 변경
		System.out.println("3"+1);//문자열+숫자는 문자열 + 숫자형 문자열
		System.out.println(3 + '0');//숫자 3 을 문자'0'에 더하면 문자 '0'보다 3큰값 이 나옴
		System.out.println((char)('0'+3));//문자 0보다 3큰 문자는 '3'
		
		System.out.println((char)('0')+1);
		
	}

}
