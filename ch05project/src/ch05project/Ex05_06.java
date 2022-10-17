package ch05project;

public class Ex05_06 {

	public static void main(String[] args) {
		String[] names = {"kim", "park", "lee"};
		
		for (int i = 0; i < names.length; i++) { //블록안에 문장이 한줄이면{}생략 가능
			System.out.println("names[" + i + "] :" + names[i]);
			
			String tmp = names[2];
			System.out.println("tmp :" + tmp);
			
			names[0] = "yu";
			
		}
		
		for(String str : names) {
			System.out.println(str);
		}
		
		String[] strArr = new String[3];
		//str Arr = {"kim", "lee", "park};
		//직접 값 입력 방식은 선언시 초기화할시만 가능하다
		//String strArr = new String[3]{"kim", "lee", "park};
		strArr[0] = "kim";
		strArr[1] = "lee";
		strArr[2] = "park";
	}

}
