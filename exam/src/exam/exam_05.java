package exam;

import java.util.Scanner;

public class exam_05 {

	
	 public static void printPay(double basePay, int hours) {
		 
		 double over = (hours-40)*basePay*1.5;
		 
		 if(basePay>=8) {
			 if(hours<=40) {
				 System.out.println(basePay*hours);}
			 else if(hours>60) {
					 System.out.println("ERROR : �ٹ��ð� �ʰ�");
			 }else if(hours>40) {
				 System.out.println(basePay*hours+over);
			 }			 
		 }
			 
	 
		 else if(basePay<8) {
			 System.out.println("ERROR : �����ñ� ������");
		 }
	    
		 
		 
		 
	    }
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double basePay = input.nextDouble();
		int hours = input.nextInt();
		
		printPay(basePay, hours);
		
		
		
	}

}
