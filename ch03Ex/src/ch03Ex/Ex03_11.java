package ch03Ex;

public class Ex03_11 {

	public static void main(String[] args) {
		double pi = 3.141592;
		long piL = Math.round(pi);//round�޼ҵ�� ����� long������ ��ȯ (�Ҽ��� ù°�ڸ����� �ݿø��� ����)
		System.out.println("piL : " + piL);
		
		long first = Math.round(pi * 1000);  // 3142
		double second = first / 1000.0; //long/double ---> ū�ɷ� ��ȯ(double�� ��ȯ) 
		System.out.println("second : " + second);
		
		double shortpi = Math.round(pi*1000) / 1000.0; //������ ª�� version

		System.out.println("short pr : " + shortpi);
		

	}

}
