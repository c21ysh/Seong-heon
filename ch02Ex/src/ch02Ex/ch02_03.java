package ch02Ex;

public class ch02_03 {

	public static void main(String[] args) {
		
		String url = "www.codechobo.com";
		float f1 = .10f; //�Ǽ� �⺻���� double �̱⶧���� float�� ĳ���� ������� (double���� �ƴ� 4����Ʈ �Ǽ��� 0.10, 1.0e-1)
		float f2 = 1e1f; //e�� ������� (e=10 �̰� �ڿ����ڴ� �����̴�) �� 10.0 
		float f3 = 3.14e3f;  //3.14*10^3=3140.0
		double d = 1.23456789;
		
		System.out.printf("f1 = %f,%e,%g%n",f1,f1,f1);
		System.out.printf("f2 = %f,%e,%g%n",f2,f2,f2);
		System.out.printf("f3 = %f,%e,%g%n",f3,f3,f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);//�Ҽ��� 10�ڸ� ä������� ���� �κ��� 0���� ������ ä��, ���� �κ��� �������� �����
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
		
		

		
		
		

	}

}
