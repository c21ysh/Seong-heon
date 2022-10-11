package exam;

import java.util.Scanner;

public class exam_04 {

	public static double calculateBMI(double weight, double tall) {
		double bmi = 0;
		double tall1 = Math.pow(tall/100, 2);
		bmi = weight/tall1;
		System.out.println(tall1);
		
		return bmi ;
        
    }
	 public static void printBMIClassification(double bmi) {
		 if(bmi>=30) {
			 System.out.println("비만");
		 }else if(bmi>=25) {
			 System.out.println("과체중");
		 }else if(bmi>=18.5) {
			 System.out.println("정상");
		 }else if(bmi<18.5){
			 System.out.println("저체중"); 
		 }
	        
	 }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double weight = input.nextDouble();
		double tall = input.nextDouble();
		double bmi = calculateBMI(weight, tall);
		printBMIClassification(bmi);//메소드 호출
		System.out.println("bmi = "+bmi);
	}

}
