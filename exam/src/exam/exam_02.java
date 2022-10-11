package exam;

import java.util.Scanner;

public class exam_02 {
	public static void printSquare(double x) {
		System.out.println(x*x);
	}
	public static void printTriple(int y) {
		System.out.println(y*y*y);
	}
	
	public static void main(String[] args) {
		int value = 2;
		System.out.println(value);
		printSquare(value);
		printSquare(3);
		printSquare(value*2);
		printTriple(3);
		printTriple(value);
		printTriple(value*2);
		
		
	}
}


