package com.lec.week5_1;

public class OmokApp {

	public static void main(String[] args) {
		
		//오목판을 출력한다
//		printBoard();
		//사용자로부터 오목을 입력 받는다
//		Omok omok = inputOmok();
//		//오목판에 오목을 둔다
//		putOmokonBoard (?, omok);
		//오목판을 출력한다
		
		//2. 객체 지향 방법
		
		Board board = new Board();
		Omok omok = new Omok();
		//오목판을 출력한다
		//print(board); 가 아닌

		board.print();
		//사용자로부터 오목을 입력 받는다
		omok.input();
		//오목판에 오목을 둔다
		board.put(omok);
		//오목판을 출력한다
		board.print();
//		Board.printa();  이건가능
	}

}
