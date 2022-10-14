package ch05project;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		
		int[] iArr1 = new int[10]; //iArr1은 int형 배열이고 크기가 10이다.
		int[] iArr2 = new int[10];
		int[] iArr3 = {100,95,80,70,60,}; //배열값 표시는 {   }안에 ,로 구분하여 넣어준다.
		
		char[] chArr = {'a', 'b', 'c', 'd'}; //char형 배열로 선언시에 값을 줌
		
		//배열의 각 원소에 값을 넣어줌
		for(int i=0; i < iArr1.length; i++) { //length속성은 배열의 크기(원소개수)를 반환
			iArr1[i] = i + 1;
			
		}
		//배열의 각 원소에 값을 넣어줌
		for(int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
			
		}
		//배열의 각원소의 값을 빼냄
		for(int i=0; i< iArr1.length; i++) {
			System.out.println(iArr1[i]);
		}
		System.out.println();
		
		System.out.println(Arrays.toString(iArr2)); 
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(iArr3); //번지 값
		System.out.println(chArr); //문자열 형태로 
		
		
		
		
		
	}

}
