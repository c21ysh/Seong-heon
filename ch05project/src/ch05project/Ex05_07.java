package ch05project;

public class Ex05_07 {

	public static void main(String[] args) {
		String str = "ABCDE"; //String �� �Һ��� Ŭ������ ������ �Ұ����ϴ�
		char ch = str.charAt(3); //���ڿ� str�� ���ι�ȣ 3���� ���� ��ȯ
		
		System.out.println("ch : " + ch);
		
		str = "012345"; //������ �Ȱ� �ƴ϶� ���ο� str��ü�� ���� (������ �ٸ�)
		String substr = str.substring(1,4); //str�� ���ι�ȣ 1������ 4-1����(1~3)�� ���ڿ� ��ȯ
		System.out.println("substr : " + substr);
		
		System.out.println("equals : " + str.equals(substr));
		
		
		
		
		
	}

}
