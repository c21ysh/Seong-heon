package ch05project;

public class Ex05_07 {

	public static void main(String[] args) {
		String str = "ABCDE"; //String 은 불변의 클래스로 변경이 불가능하다
		char ch = str.charAt(3); //문자열 str의 색인번호 3번의 문자 반환
		
		System.out.println("ch : " + ch);
		
		str = "012345"; //변경이 된게 아니라 새로운 str객체가 생김 (번지수 다름)
		String substr = str.substring(1,4); //str의 색인번호 1번에서 4-1까지(1~3)의 문자열 반환
		System.out.println("substr : " + substr);
		
		System.out.println("equals : " + str.equals(substr));
		
		
		
		
		
	}

}
