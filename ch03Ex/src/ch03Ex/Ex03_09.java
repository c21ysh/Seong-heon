package ch03Ex;

public class Ex03_09 {

	public static void main(String[] args) {
		int a = 1_000_000; //1,000,000ó�� �ڸ� ���н� _�� �����Ѵ�.
		int b = 2_000_000; //2,000,000
		
		long c = a*b;	//2,000,000,000,000
		// a*b�� int*int = int�̿��� �ϴ� ������� int �� ����(21��)�� �ʰ��Ͽ� ������ ���� ���� (long)�� ĳ���� ���ָ� ��
		System.out.println(c);
		

	}

}
