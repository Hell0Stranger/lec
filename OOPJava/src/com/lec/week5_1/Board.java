package com.lec.week5_1;

public class Board {

	// board 객체명
	//Board 클래스 명
	
	int width;
	int height;
	char[][] buf;
	// 위의 세 가지 속성은 건물을 짓기위한 청사진 일뿐
	// 
	public void init() {
	//	board.width = 20; //구조체가 아니라 board는 행위를 가진 구성요소
	//	board.height = 20;// 행위를 노출 해도되지만 속성을 노출하면 안됨
	//  board.buf = new char[board.height][board.width];	
	this.width = 20;
	this.height = 20;
	this.buf = new char[this.height][this.width];
		
	//this는 묵시적으로 생략이 가능
	
	}
		public void print() {
		
	}

	public void put(Omok omok) {
		// TODO Auto-generated method stub
		
	}
	static void printa() {
		
	}

}
