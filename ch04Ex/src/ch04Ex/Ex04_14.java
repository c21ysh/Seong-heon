package ch04Ex;

public class Ex04_14 {

	public static void main(String[] args) {
		
		for(int i = 0; i<=10;i++) {
			if(i%3 ==0) {
				continue; //���� �ݺ������� �̵� �� �����η� ��
			}
			System.out.println(i);
		}
	}

}
