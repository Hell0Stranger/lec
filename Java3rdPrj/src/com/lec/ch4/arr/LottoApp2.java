package com.lec.ch4.arr;

import java.util.Arrays;
import java.util.Random;

public class LottoApp2 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		Random rand = new Random();
					
				 // 1. 배열값 채우기
				for (int i = 0; i < lotto.length; i++) {
		            lotto[i] = (rand.nextInt(45)+1);
		          // 2.중복 처리
		            for (int j = 0; j < i; j++) {
		                if (lotto[i] == lotto[j]) {
		                    // 중복이있으면 i번째로 다시 돌아가야하므로 증가시키지 않고 i--
		                    i--;
		                    }
		            	}
					}
				
				// 3. 값 출력
				System.out.println("중복 제거 완료!  ₍ᐢ..ᐢ₎⊹");
				for (int i = 0; i < lotto.length; i++)
				System.out.printf("%d ", lotto[i]);

	} // end of main
} // end of class
				
//       ==============================정렬=========================================				
				
//		 1. 큰 값을 제일 오른쪽으로 밀기 (오름차순)
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

		// 2.작은 값을 제일 오른쪽으로 밀기 (내림차순)
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

