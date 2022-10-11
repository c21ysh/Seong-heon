package exam;

import java.util.Scanner;

public class exam_03 {

	public static String getRole(int age) {
		if(age>=18) {
			System.out.println("성인 입니다.");		
		}else if(age>=13) {
			System.out.println("청소년 입니다.");
		}else if(age>=6) {
			System.out.println("어린이 입니다.");
		}			
				
		return "유아 입니다.";
	}
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int age = input.nextInt();
	     String role = getRole(age);
	     System.out.println(role);

	}

}
