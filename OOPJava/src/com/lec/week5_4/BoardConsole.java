package com.lec.week5_4;

import java.util.Scanner;

//출력하는 기능은 무조건 console에 존재해야함
//출력하는 것은 -> Board 에있는 buf[][] -> 이것을 필요로함
//∴ 상속이 필요
public class BoardConsole {
	private Board board;
	private int turn;
	//객체지향 포인트 - 역할을 잘 나누는 것
	public BoardConsole() {
		turn = 0; // 검은색 - 1: 흰색
		board = new Board();
	}

	//console에서 buf의 내용을 출력할 때, buf[][] 그대로 내보내느 방식이 아니라
	//buf의 위치에 있는 내용을 하나씩 얻어서 출력해야함
	public void print() {
		board.repaint();
		for (int y = 0; y < 20; y++) {
			for (int x = 0; x < 20; x++)
				//board야 x,y 위치값 내놩
				System.out.printf("%c", board.get(x, y));
			//내려쓰기용
			System.out.println();
		}
	}
	public void test() {
		board.rollback(null);
	}

	// 오목을 입력 받아서 보드에 넘겨주는 코드
	
	public void inputOmok() {
		Scanner sc = new Scanner(System.in);
		System.out.print("(x y) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int color = turn;
		// turn 은 0,1 계속 왔다갔다해야함
		//사용자에게 오목을 입력받았음
		//이 값을 omok에 어떻게 setting 할것인가 ?

			
			Omok omok = new Omok(x, y, color);
			board.put(omok);
			
			if (turn == 0)
				turn++;
			else
				turn--;
		}
		

//		omok.setX(x);
		// omok.set x, y color
	}

