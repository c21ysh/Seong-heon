package ch03Ex;

public class Ex03_02 {

	public static void main(String[] args) {
		int i = 5, j=0;//���ٿ� ���� �����ϸ� �ʱ�ȭ
		
		j = i++;//++�� �ǿ����� i �ڿ� �����Ƿ� ���� ���� ������
		System.out.println("j = i++������ , i=" + i + ",j = " + j);
		
		i = 5;
		j = 0;
		
		j = ++i;//������ �� ó��				
		System.out.println("j = ++i������ , i=" + i + ",j = " + j);
		

	}

}
