package ch02Ex;

public class Ex02_00 {
	static int X;
	//�޼ҵ� ���� ������ Ŭ���� ���� ��𼭳� ��� ����
	//�⺻���� �ʱⰪ�� ������ (�ʱ�ȭ �� �ʿ� ����)
	public static void main(String[] args) {
		//�޼ҵ� �ȿ��� ������ ������ �޼ҵ� �ȿ����� ��� ���� �ϴ� : ��������(local����)
		
		int x = 100;	//int�� ���� x�� �����ϰ� �ʱⰪ 100 ����
		double pi = 3.14;	//double�� ���� pi�� �����԰� ���ÿ� �ʱⰪ 3.14 ����
		char ch = 'a';	//char�� ���� ''�ȿ� �ִ´�(""������)
		String str = "abc";	//�������� StringŬ������ ������ �����ϰ� ���� �ʱ�ȭ
		
		//������ ���� str���� abc�� ����Ȱ��� �ƴϰ� abc�� ����� ���� �ּҰ� �����
		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(X);
		
	}
}
