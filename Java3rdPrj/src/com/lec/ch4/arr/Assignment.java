package com.lec.ch4.arr;

import java.util.Arrays;
import java.util.Random;

public class Assignment {

	public static void main(String[] args) {
		
		// =========== 문제 1. 시작=============
			int sum = 0;
			int arr[] = {1,2,3,4,5,6,7,8,9,10};
			
			for (int i=0; i<10; i++)
				sum += arr[i];
			
			System.out.printf("배열의 총 합은 %d",sum);
			System.out.println();
		
		// =========== 문제 1. 끝  =============
		
		
		
		// =========== 문제 2. 시작=============
		
		System.out.println("-----2단------");
			
		for(int i=1 ; i<=9 ; i++) 
			System.out.println("2 X "+i+" = "+2*i);
		
			
			
		// =========== 문제 2. 끝  =============
		
		
		// =========== 문제 3. 시작=============
		
		//1. 배열 생성 및 초기화
		int[] randomArr= {4,1,3,10,5,7,6,2,9,8};
		
		//2. 정렬 시작 (양끝값 기준으로 스위치)
		for (int j=0; j<9; j++)
			for (int i =0; i<9-j; i++) {
				int tmp;
				tmp = randomArr[i];
				randomArr[i]= randomArr[i+1];
				randomArr[i+1]= tmp;
			}
		
		
		//3. 출력시작
		for (int i =0; i<10; i++)
		System.out.printf("%d ", randomArr[i]);
		//줄바꿈용
		System.out.println();
		
		
		
		// =========== 문제 3. 끝  =============
		
		
		
		// =========== 문제 4. 시작=============
		
		for (int j=0; j<5; j++) {	
			for (int i=1; i<6; i++) 
				System.out.printf("%d", i+j);		
		 System.out.println();
		}
		
		// =========== 문제 4. 끝  =============
		
		
	 }	
}

