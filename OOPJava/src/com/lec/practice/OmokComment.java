package com.lec.practice;

import java.util.Scanner;


public class OmokComment {
	
public static void main(String[] args) {
		
		//객체지향 프로그래밍
		
		Board board = new Board();
		Omok omok = new Omok();
	
		//board.width = 20; 처럼 Board의 속성을 직접 초기화
		//하지 않도록 하기위해서 init(); 을 만듬
		System.out.println(board.width);
		//error 발생하지 않는다.
		//오목판의 크기를 초기화 시킨다
		board.init();
		//오목판을 출력한다
		board.print();
		//사용자로부터 오목을 입력 받는다
		omok.input();
		//오목판에 오목을 둔다
		board.put(omok);
		//오목판을 출력한다
		board.print();
		
//		Board.print();  불가능
//		Board.printa(); 가능
		
		


	}


}
