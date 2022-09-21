package com.lec.week5_2;

public class OmokApp {

	public static void main(String[] args) {
		
	
		
		Board board = new Board();
		Omok omok = new Omok();
	
		board.init();
		board.print();
		

		omok.input(board);
		board.print();

//		board.put(omok);

	}

}
