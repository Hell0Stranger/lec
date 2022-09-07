package com.lec.ch4.arr;

import java.util.Arrays;
import java.util.Random;

public class LottoApp2 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		Random rand = new Random();

		// 랜덤 값으로 배열 채우기
		for (int i = 0; i < lotto.length; i++)
			lotto[i] = rand.nextInt(45) + 1;
		
		// 1. 큰 값을 제일 오른쪽으로 밀기 (오름차순)
		// for를 사용할 때는 index를 활용할 줄 알아야함. ( 점진적 증가나 점진적 감소)
//		for (int j = 0; j<5; j++) {
//			for (int i = 0; i <5-j; i++ ) {
//				if (lotto[i] > lotto[i + 1]) 
//				{
//					int tmp;
//					tmp = lotto[i];
//					lotto[i] = lotto[i + 1];
//					lotto[i + 1] = tmp;
//				}
//					
//			}
//		}
		
		//2.작은 값을 제일 오른쪽으로 밀기 (내림차순)
//		int sort = lotto.length-1;
//		for (int j =0; j< sort; j++) {
//			for (int i =0; i <sort-j; i++) {
//				if (lotto[i]<lotto[i+1])
//				{
//					int tmp;
//					tmp = lotto[i];
//					lotto[i] = lotto[i + 1];
//					lotto[i + 1] = tmp;
//				}
//			}
//				
//		}
		
		// 값 출력
		for (int i = 0; i < lotto.length; i++)
		System.out.printf("%d ", lotto[i]);
	}
}
