package com.lec.week5_4;

public class Board {
	private char[][] buf;
	private Omok[] omoks;
	private int index;
	
	public Board() {
		buf = new char[20][20];
		omoks = new Omok[400];
		//여기까지만 만들게되면 그냥 null문자를 20x20개를 가진형태 -> 출력을 하기전 그 값을 채워줄 작업이 필요 -> 그것을 init() 에서 해준다
		int index =0 ;
		init();
	}
	
	//public/ private 는 선택해서 사용
	public void init() {
		int height = 20;
		int width = 20;
		for (int y = 0; y < height; y++)
			for (int x = 0; x < width; x++)
				buf[y][x] = '┼';

		for (int y = 1; y <= height; y++)
			for (int x = 1; x <= width; x++)
				buf[y - 1][x - 1] = '┼';

		for (int x = 1; x <= width; x++)
			buf[0][x - 1] = '┬';

		for (int x = 1; x <= width; x++)
			buf[20 - 1][x - 1] = '┴';

		for (int y = 1; y <= height; y++) {
			buf[y - 1][0] = '├';
			buf[y - 1][20 - 1] = '┤';
		}

		buf[0][0] = '┌';
		buf[0][width - 1] = '┐';
		buf[height - 1][0] = '└';
		buf[height - 1][width - 1] = '┘';
	}

	public char get(int x, int y) {
		return buf[y][x];
	}

	public void put(Omok omok) {
		int x = omok.getX();
		int y = omok.getY();
		int color = omok.getColor();
		
		if(color==0)
		buf[y][x] = '●';
		else
		buf[y][x] = '○';
		
		omoks[index] = omok;
		index++;

	}

	public void repaint() {
		init();
		for(int i =0; i<index; i++) {
			int x = omoks[i].getX();
			int y = omoks[i].getY();
			int color = omoks[i].getColor();
			buf[y][x] = (color ==0) ? '○' : '●';
		}
	}
	public void rollback(Omok omok) {
		index --;
		omoks[index] = omok;
	}
}
