package exam;

import java.util.Scanner;

public class exam_03 {

	public static String getRole(int age) {
		if(age>=18) {
			System.out.println("���� �Դϴ�.");		
		}else if(age>=13) {
			System.out.println("û�ҳ� �Դϴ�.");
		}else if(age>=6) {
			System.out.println("��� �Դϴ�.");
		}			
				
		return "���� �Դϴ�.";
	}
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int age = input.nextInt();
	     String role = getRole(age);
	     System.out.println(role);

	}

}
