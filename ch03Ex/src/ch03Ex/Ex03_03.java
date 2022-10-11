package ch03Ex;

public class Ex03_03 {

	public static void main(String[] args) {
		
		int i = 5, j =5;
		
		System.out.println(i++); //선처리, 후증가이므로 먼저 i값을 출력하고 1증가
		System.out.println(++j); //선증가, 후처리이므로 먼저 j를 1증가시키고 출력
		System.out.println("i = " +i+ " j = "+j); 
		
		

	}

}
