package ch05project;

public class quiz {

	public static void main(String[] args) {
		/*
		 	1. int x= 50; int y = 10�ε� x�� y���� ū ��츦 ���ϴ� ���ǹ��� ����� true��� ���
		 	2. x�� y�� �������� ���ϴ� ���ǹ��� �����
		 	3. x�� y�� �������� ���ϴ� ���ǹ��� �׿��� ��츦 ó���ϴ� ���ǹ��� �����
		 	4. x�� y�� ������ x�� y���� ū�� �ƴϸ� ��Ÿ ���������� ������
		 	5. int time=20
		 		time�� 18���� ������ goodday�� �����ϰ� �ƴϸ� goodevening�� �����ؼ� result�� �����ϴ� ���� ������� �ۼ�
		 */
		
		
		int x = 50;
		int y = 10;
		
		if(x>y) {
			System.out.println("true");
		}
		else if (x==y) {
			System.out.println("false");
		}
		else if (x!=y) {
			System.out.println("true");
		}
		else {
			
		}
		
		//5
		int time = 20;
		String result = " ";
		result = time < 18? "goodday":"goodevening";
		System.out.println(result);
		
		//6
		int day =2;
		
		switch(2){
			case 1 : 
				System.out.println("saturday");
				break;
			case 2 :
				System.out.println("sunday");
				break;
		}
		
		//7
		int i =1;
		while(i<=5) {
			System.out.print("*");
			i++;
			
		}
		System.out.println();
		//8
		int sum =0;
		for (int j = 1; j <= 100; j++) {
			sum += j;
		} 
		System.out.println(sum);
		
		//9
		String car[];
		car = new String[]{ "volvo", "bmw", "Ford"};
		
		//10
		car[2] = "hyundai";
		
		System.out.println(car[2]);
		
		//11
		System.out.println(car.length);
		
		
	}

}
