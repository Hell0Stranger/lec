package com.lec.week4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoApp {

	public static void main(String[] args) {

		Lottos lotto = new Lottos();
//		lotto.comArr = new int[6];
		lotto.comArr = new int[45];
//		lotto.comArr2 = new int [45];
		lotto.myArr = new int[6];
		
		comLotto(lotto);
//		printCom(lotto);
		inputLotto(lotto);
		printLotto(lotto);
		compareLotto(lotto);
	}



	 static void printCom(Lottos lotto) {
		System.out.println(Arrays.toString(lotto.comArr));
	}



	static void inputLotto(Lottos lotto) {
		Scanner sc = new Scanner(System.in);
		System.out.println("로또번호를 입력하세용 6개");
		System.out.println("범위는 1~45 정수 값");

		for (int i = 0; i < lotto.myArr.length; i++) {

			System.out.print((i + 1) + "번째 번호>>");
			do {
				lotto.myArr[i] = sc.nextInt();
				if (lotto.myArr[i] < 1 || lotto.myArr[i] > 45)
					System.out.println("1~45 범위내에서 입력하세요");
					for (int j = 0; j < i; j++) {
						if (lotto.myArr[i] == lotto.myArr[j]) {
							i--;
							System.out.println("중복값 존재! 다시 입력하세요");
					     }
				       }
			} while (lotto.myArr[i] < 1 || lotto.myArr[i] > 45);
		}
	}

	static void comLotto(Lottos lotto) {
//		방법 1. == 랜덤값을 발생 > 중복을 제거하여 배열에 채워넣기==
//		Random rand = new Random();		
//		for (int i = 0; i < 6; i++) {
//			lotto.comArr[i] = (rand.nextInt(45) + 1);
//			for (int j = 0; j < i; j++) {
//				if (lotto.comArr[i] == lotto.comArr[j]) 
//					i--;		
//			}
//		}
		
//		방법 2. ==1-45 을 모두 채워넣고 섞어서 출력
		int tmp =0; // 값을 바꾸기위한 임시 변수
		int j = 0;  // 임의의 값을 저장할 변수
		
		for(int i =0; i<lotto.comArr.length; i++ ) 
			lotto.comArr[i] = i+1;
		
		for(int k =0; k< lotto.comArr.length; k++) {
			j = (int)(Math.random()*45);
			tmp = lotto.comArr[k];
			lotto.comArr[k] = lotto.comArr[j];
			lotto.comArr[j] = tmp;
		}
	}
	
	static void printLotto(Lottos lotto) {
		System.out.println("로또번호 입니당!  ₍ᐢ..ᐢ₎⊹");
		System.out.println("사용자가 입력한 로또");
		
		for (int i = 0; i < lotto.myArr.length; i++)
			System.out.printf("%d ", lotto.myArr[i]);
		System.out.println();
		
		System.out.println("컴퓨터가 만든 로또");
//      방법 1
//		for (int i = 0; i < lotto.comArr.length; i++)
//			System.out.printf("%d ", lotto.comArr[i]);
//      방법 2
		for (int i =0; i<6; i++)
			System.out.printf("comArr[%d]=%d%n", i, lotto.comArr[i]);

		
	};

	static void compareLotto(Lottos lotto) {
		System.out.println("로또 번호를 비교합니다 ^0^");
		int win = 0;
//		방법 1
//		for(int i =0; i<lotto.comArr.length; i++) {
//		if(lotto.comArr[i]==lotto.myArr[i]) 
//			win ++;
//		}
//		방법 2
		for(int i =0; i<6; i++) {
		if(lotto.comArr[i]==lotto.myArr[i]) 
			win ++;
		}
		
		switch(win) {
		case 3:
			System.out.println(" 5등 당첨!");
			 break;
		case 4:
			System.out.println(" 4등 당첨!");
			break;
		case 5:
			System.out.println(" 3등 당첨!");
			break;
		case 6:
			System.out.println(" 1등 당첨!");
			break;
		default:
			System.out.println("꽝입니다 T0T 다음기회에");
			break;
		}
	}	 
	 
	 
}