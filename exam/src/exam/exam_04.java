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
			 System.out.println("��");
		 }else if(bmi>=25) {
			 System.out.println("��ü��");
		 }else if(bmi>=18.5) {
			 System.out.println("����");
		 }else if(bmi<18.5){
			 System.out.println("��ü��"); 
		 }
	        
	 }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double weight = input.nextDouble();
		double tall = input.nextDouble();
		double bmi = calculateBMI(weight, tall);
		printBMIClassification(bmi);//�޼ҵ� ȣ��
		System.out.println("bmi = "+bmi);
	}

}
