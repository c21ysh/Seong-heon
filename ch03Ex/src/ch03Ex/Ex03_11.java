package ch03Ex;

public class Ex03_11 {

	public static void main(String[] args) {
		double pi = 3.141592;
		long piL = Math.round(pi);//round메소드는 결과를 long형으로 반환 (소수점 첫째자리에서 반올림한 정수)
		System.out.println("piL : " + piL);
		
		long first = Math.round(pi * 1000);  // 3142
		double second = first / 1000.0; //long/double ---> 큰걸로 반환(double로 반환) 
		System.out.println("second : " + second);
		
		double shortpi = Math.round(pi*1000) / 1000.0; //위에거 짧은 version

		System.out.println("short pr : " + shortpi);
		

	}

}
