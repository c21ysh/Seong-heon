package ch03Ex;

public class Ex03_12 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		int r = x % y; //r�� ������ ���ϱ� ���� %�� ��
		int mok = x / y; //
		
		System.out.printf("%d�� %d�� ������, %n", x, y);
		System.out.printf("���� %d�̰�, �������� %d�Դϴ� , %n", mok, r);
		System.out.println(0.1 == 0.1f);
		System.out.println(10.0 == 10.0f);
		
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1 == str2); //��ü�� ���ϱ⶧���� �������� �޶� false
		System.out.println(str1.equals(str2)); //�ܼ� ���� ���ϴ°Ŷ� true(.equals())
		
		
		
	}

}
