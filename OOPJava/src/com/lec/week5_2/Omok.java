package com.lec.week5_2;

import java.util.Scanner;

public class Omok {
	
	 private int ox;
	 private int oy;
    final char BLACK_ROCK = '●';
    final char WHITE_ROCK = '○';
   
	public void input(Board board) {
		Scanner sc = new Scanner(System.in);
		 int turn=0;
		    
//		    while (true) {
//		   		 
		   		 System.out.println("오목 둘 값을 입력하세요");
		   		 System.out.println("좌표의 범위는 1~20 입니다");
		   		 System.out.print("x y> ");
		   		 ox = sc.nextInt();
		   		 oy = sc.nextInt();
		   		 
		   		 if((ox<=0||oy<=0)||(ox>=21||oy>=21)) 
		   			 System.out.println("범위를 초과하였습니다. 다시입력하세요.");
		   		 else if(board.buf[oy][ox] ==BLACK_ROCK || board.buf[oy][ox] ==WHITE_ROCK) 
		   			 System.out.println("중복은 안돼. 돌아가. 바꿔줄 생각 없어.");
		   		 else {
		   			 if(turn%2==0) 
		   				board.buf[oy][ox] =BLACK_ROCK;    
		   			 else 
		   				board.buf[oy][ox] =WHITE_ROCK;	 
		   			 turn++;
		   		     }
		   		 
		   		 
		   		 

		   		 

		   		 

		   		 
//		   	 
//		    }
		
	}

}
