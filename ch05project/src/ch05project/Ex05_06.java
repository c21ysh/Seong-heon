package ch05project;

public class Ex05_06 {

	public static void main(String[] args) {
		String[] names = {"kim", "park", "lee"};
		
		for (int i = 0; i < names.length; i++) { //��Ͼȿ� ������ �����̸�{}���� ����
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
		//���� �� �Է� ����� ����� �ʱ�ȭ�ҽø� �����ϴ�
		//String strArr = new String[3]{"kim", "lee", "park};
		strArr[0] = "kim";
		strArr[1] = "lee";
		strArr[2] = "park";
	}

}
