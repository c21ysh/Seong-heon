package ch03Ex;

public class Ex03_02 {

	public static void main(String[] args) {
		int i = 5, j=0;//한줄에 변수 선언하며 초기화
		
		j = i++;//++이 피연산자 i 뒤에 있으므로 후위 증가 연산자
		System.out.println("j = i++실행후 , i=" + i + ",j = " + j);
		
		i = 5;
		j = 0;
		
		j = ++i;//선증가 후 처리				
		System.out.println("j = ++i실행후 , i=" + i + ",j = " + j);
		

	}

}
