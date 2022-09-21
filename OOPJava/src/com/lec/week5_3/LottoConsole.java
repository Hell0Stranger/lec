package com.lec.week5_3;

import java.util.Scanner;

public class LottoConsole {

//	private Lotto lotto = new Lotto();
			
   private Lotto lotto;
	
	LottoConsole(){
		lotto = new Lotto();
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("로또번호를 6개 입력하세요.");
		System.out.println("한줄에 입력하세요! 구분은 space입니다.");
		System.out.print("입력 >> ");
		for(int i = 0; i<6; i++)
		lotto.set(i,sc.nextInt());
		
	}
	
	public void print() {
		lotto.sort();
		System.out.println();
		System.out.println("로또번호를 출력합니다.");
		System.out.println();
		for(int i=1; i<=6; i++) {
		lotto.get(i);
		System.out.printf("%d ",lotto.get(i));
		
		}
		//get으로 6번 반복 해서 출력
	}



}
