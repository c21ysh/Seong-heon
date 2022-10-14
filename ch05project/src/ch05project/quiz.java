package ch05project;

public class quiz {

	public static void main(String[] args) {
		/*
		 	1. int x= 50; int y = 10인데 x가 y보다 큰 경우를 비교하는 조건문을 만들고 true라고 출력
		 	2. x가 y와 같은지를 비교하는 조건문을 만든다
		 	3. x와 y가 같은지를 비교하는 조건문과 그외의 경우를 처리하는 조건문을 만든다
		 	4. x와 y가 같은지 x가 y보다 큰지 아니면 기타 조건인지를 만들자
		 	5. int time=20
		 		time이 18보다 적으면 goodday를 선택하고 아니면 goodevening을 선택해서 result에 저장하는 삼항 연산식을 작성
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
