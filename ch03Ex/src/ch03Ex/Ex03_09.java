package ch03Ex;

public class Ex03_09 {

	public static void main(String[] args) {
		int a = 1_000_000; //1,000,000처럼 자리 구분시 _로 구분한다.
		int b = 2_000_000; //2,000,000
		
		long c = a*b;	//2,000,000,000,000
		// a*b는 int*int = int이여야 하는 계산결과가 int 의 범위(21억)을 초과하여 엉뚱한 값이 나옴 (long)로 캐스팅 해주면 됨
		System.out.println(c);
		

	}

}
