package ch03Ex;

public class Ex03_12 {

	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		int r = x % y; //r�� ������ ���ϱ� ���� %�� ��
		int mok = x / y; //
		
		System.out.printf("%d�� %d�� ������, %n", x, y);
		System.out.printf("���� %d�̰�, �������� %d�Դϴ� , %n", mok, r);
		

	}

}
/* 
	quiz1
		1. Ŭ���� �̸��� MyClass�� Ŭ������ ����
		2. MyClass�ȿ� main �޼ҵ带 ����
		3. main�żҵ� �ȿ� Hellow�� �ܼ�â�� ��� �ϵ��� ��
		4. ���� 1000�� �����
		5. main�޼ҵ� �ȿ��� ����� ���������� �����
			4����Ʈ ���� ���� myNum�� ����� �ʱⰪ�� 5
			4����Ʈ �Ǽ� ���� myFloatNum�� ����� �ʱⰪ�� 5.99
			2����Ʈ ���� ���� myLetter�� ����� �ʱⰪ�� D
			�Ҹ��� ������ myBool�� ����� �ʱⰪ�� true
			���ڿ��� ���� myText�� ����� �ʱⰪ�� I love you
*/