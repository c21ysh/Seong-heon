package ch03Ex;

public class Ex03_14 {

	public static void main(String[] args) {
		String str1 = "abc"; //���������� String�� ������ ������ ���� (�⺻�� ���� �ƴ�!)
		String str2 = new String("abc"); //new������(������ ȣ��)�� String�����ڸ� �̿��� �������� ����
		String str3 = "ABC";
		
		System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
		//  \-->�� ���ڿ� �ȿ��� ū����ǥ�� ��Ÿ��  ("\"abc\")  ---> "abc"
		//  							     "abc"    --->  abc	
//		System.out.printf("\"str1\" == \"str2\" ? %b%n", str1 == str2);      //��ü�� �� �ּҰ��� �޶� false
//		System.out.printf("\"str1\" == \"str2\" ? %b%n", str1.equals(str2)); //�ܼ� �� �� ���� true
//		
//		System.out.println("java");
//		System.out.println("\"java\""); // �����򰥸�
		
		System.out.println("str1�� abc?" + str1.equals("abc"));
		System.out.println("str1�� str2�� ?" + str1.equals(str2));
		System.out.println("str1�� str3�� ?" + str1.equals(str3));
		
		//��ҹ��� ���о��� ��
		System.out.println("str1�� str3�� ?" + str1.equalsIgnoreCase(str3));
		//equalsIgnoreCase() ��ҹ��� ���о��� �� 
		
		
		
	}

}
