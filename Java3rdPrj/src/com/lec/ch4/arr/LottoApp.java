package com.lec.ch4.arr;

import java.util.Arrays;
import java.util.Random;

public class LottoApp {

	public static void main(String[] args) {

		// 정수 배열 Lotto를 생성 및 선언해주시고
		int[] lotto = new int[6];

		// 랜덤 값 6 개를 넣어주세요 . 값의 범위는 1~45 입니다.

		Random rand = new Random();

		// 배열의 값 출력하기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = rand.nextInt(45) + 1;
			System.out.printf("%d", lotto[i]);
			System.out.print(" ");
		}
		// [] 안에있는 숫자는 입구에서 부터 몇 칸 갈 것인가 이동하지 않고 자른 공간이라 0 .
		// 배열에서 1번째와 2번째 값 바꾸기

		// 1. 임시 공간을 마련한다.
		int tmp; 
		// 2. 임시 공간에 1번째 값을 담는다.
		tmp = lotto[0];
		// 3. 2번째 값을 1번째 값을 담는다.
		lotto[0] = lotto[1];
		// 4. 임시 공간의 값을 두번째 값을 담는다.
		lotto[1] = tmp;

		System.out.print("바꾼값은");
		System.out.printf("%d ", lotto[0]);

		System.out.print("입니다.");

		
		// 오름차순 정렬해보기
//		for (int i = 0; i < lotto.length; i++) {
//			for (int j = i + 1; j < lotto.length; j++) {
//				if (lotto[i] > lotto[j]) { 
//					int tmp2 = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = tmp2;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(lotto));
		
		
		
		
		

		
		
		
		
		
		

		
		
	}
}
