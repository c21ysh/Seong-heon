package ch03Ex;

public class Ex03_01 {

	public static void main(String[] args) {
		//자바의 시작점인 메소드로 자바 프로젝트는 여기서 시작
		//public은 접근제한자 중 어디에서나 접근이 가능한 제한자
		//static은 객체를 만들지 않고 사용가능, 즉 클래스로 접근 
		//void는 리턴타입(반환타입) 중 반환이 필요 없을시 사용
		//main은 메소드 이름
		//()는 파라메터(매개변수)를 나타냄. 매개변수도 변수처럼 데이터형 변수이름
		
		int x, y;
		
		x = y = 3;//y에 3이 저장된 후에, x에 3이 저장된다. 대입연산자는 우측에서 좌측으로 연산되며
		//제일 우선순위가 낮다.
		
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		

	}

}
