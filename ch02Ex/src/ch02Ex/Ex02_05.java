package ch02Ex;

public class Ex02_05 {

	public static void main(String[] args) {
		String str = "3";
		
		System.out.println(str.charAt(0) - '0');
		//charAt(int index) �޼ҵ� String class �� �����ִ�, ���ι�ȣ��0������ ����
		//'3'-'0' ���ڰ� ��Ÿ���� ��ȣ ���̷� 3
		System.out.println('3' - '0' + 1); 
		
		System.out.println(Integer.parseInt("3") + 1);
		//parseInt(���� ���ڿ�)�� ���ڿ��� int�� ����
		System.out.println("3"+1);//���ڿ�+���ڴ� ���ڿ� + ������ ���ڿ�
		System.out.println(3 + '0');//���� 3 �� ����'0'�� ���ϸ� ���� '0'���� 3ū�� �� ����
		System.out.println((char)('0'+3));//���� 0���� 3ū ���ڴ� '3'
		
		System.out.println((char)('0')+1);
		
	}

}
