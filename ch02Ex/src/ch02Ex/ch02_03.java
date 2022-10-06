package ch02Ex;

public class ch02_03 {

	public static void main(String[] args) {
		
		String url = "www.codechobo.com";
		float f1 = .10f; //실수 기본형은 double 이기때문에 float로 캐스팅 해줘야함 (double형이 아닌 4바이트 실수형 0.10, 1.0e-1)
		float f2 = 1e1f; //e는 지수방식 (e=10 이고 뒤에숫자는 제곱이다) 즉 10.0 
		float f3 = 3.14e3f;  //3.14*10^3=3140.0
		double d = 1.23456789;
		
		System.out.printf("f1 = %f,%e,%g%n",f1,f1,f1);
		System.out.printf("f2 = %f,%e,%g%n",f2,f2,f2);
		System.out.printf("f3 = %f,%e,%g%n",f3,f3,f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);//소수점 10자리 채우기위해 없는 부분은 0으로 공백을 채움, 정수 부분은 공백으로 비워둠
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
		
		

		
		
		

	}

}
