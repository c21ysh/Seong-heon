package ch04Ex;

public class Ex04_07 {

	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 0; i<=5; i++) {
			num = (int)(Math.random() * 6) + 1;
			//Math.random()�� double�� 0.0���� 0.999999���� ���´�
			//Math.random()�� � ���� ���ϸ� �� ���ں��� 1���� ���� ���Ѵ�
			//num�� 0���� 6������ ������ �ȴ� 0.0<=Math.random<1.0
			System.out.println(num);
		}

	}

}
