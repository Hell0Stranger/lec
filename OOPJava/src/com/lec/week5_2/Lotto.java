package com.lec.week5_2;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	
	
	private int[] lottos;
	public void input() {
		System.out.println("번호 입력을 시작합니다.");
		Scanner sc = new Scanner(System.in);
		lottos = new int[6];
		for(int i=0; i<6; i++) {
			System.out.print(i+"번째>>");
			lottos[i] = sc.nextInt();
			System.out.print("");
		}
	}	

	public void print() {
		System.out.println(Arrays.toString(lottos));
	}

	public void sort() {
		System.out.println("정렬을 시작합니다");
//		 int size = lottos.length;
//		 for(int i =1; i<lottos.length; i++)
//		 {
//			 int target = lottos[i];
//			 int j = i -1;
//			 
//			 while(j>=0 && target < lottos[j]) {
//				 lottos[j+1] =lottos[j];
//				 j--;
//			 }
//			 
//			 lottos[j+1] = target;
//		 }
	}

}
 