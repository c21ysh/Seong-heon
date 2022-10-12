package ch03Ex;

public class Ex03_14 {

	public static void main(String[] args) {
		String str1 = "abc"; //데이터형이 String인 변수는 참조형 변수 (기본형 변수 아님!)
		String str2 = new String("abc"); //new연산자(생성자 호출)와 String생성자를 이용한 참조변수 설정
		String str3 = "ABC";
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
		//  \-->는 문자열 안에서 큰따옴표를 나타냄  ("\"abc\")  ---> "abc"
		//  							     "abc"    --->  abc	
//		System.out.printf("\"str1\" == \"str2\" ? %b%n", str1 == str2);      //객체비교 즉 주소값이 달라서 false
//		System.out.printf("\"str1\" == \"str2\" ? %b%n", str1.equals(str2)); //단순 값 비교 따라서 true
//		
//		System.out.println("java");
//		System.out.println("\"java\""); // ㅈㄴ헷갈림
		
		System.out.println("str1이 abc?" + str1.equals("abc"));
		System.out.println("str1과 str2비교 ?" + str1.equals(str2));
		System.out.println("str1과 str3비교 ?" + str1.equals(str3));
		
		//대소문자 구분없이 비교
		System.out.println("str1과 str3비교 ?" + str1.equalsIgnoreCase(str3));
		//equalsIgnoreCase() 대소문자 구분없이 비교 
		
		
		
	}

}
