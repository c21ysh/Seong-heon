package ch02PrintEx;

public class PrintEx {

	public static void main(String[] args) {
		//문자열은 꼭 ""안에 넣어주기
		System.out.println("문자열");//줄바꿈
		System.out.print("print ");//줄안바꿈
		System.out.print("print ");
		System.out.print("print ");
		
		//계산식 처리
		System.out.println("\n"+2*3);
		System.out.println(2+3);
		
		//문자열 + 변수명
		int x =15;
		System.out.println("문자열 = " + x);//+기호는 더하기 연산이 아니라 문자결합연산
		
		
		
	}

}
