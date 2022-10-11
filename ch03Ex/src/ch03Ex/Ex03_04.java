package ch03Ex;

public class Ex03_04 {

	public static void main(String[] args) {
		int i = -10; //부호가 -인 숫자를 사용 
		i = +i; //+는 부호를 변경하지 않음 
		System.out.println(i); //결과값 그대로 -10
		
		i = -10;
		i = -i;
		System.out.println(i);
		
	}

}
