package com.lec.ch4.arr;

import java.util.Scanner;

public class OmokApp2 {

	public static void main(String[] args) {
		// 너비와 높이는 상수값 변수로 설정하여 비교하기 쉽게 한다.
		final int WIDTH = 22;
	    final int HEIGHT = 22;
	   
// 0. 기존 오목판 방식 (배열 사용 X)	    
	    
//	      for (int y=1; y <= HEIGHT; y++) {
//	         for (int x=1; x <= WIDTH; x++)
//	            if (x == 1 && y == 1)
//	               System.out.printf("%c",'┌');
//	            else if (x == WIDTH && y == 1)
//	               System.out.printf("%c",'┐');
//	            else if (x ==1 && y == HEIGHT)
//	               System.out.printf("%c",'└');
//	            else if (x ==WIDTH && y == HEIGHT)
//	               System.out.printf("%c",'┘');
//	            else if (x<WIDTH && y==1)
//	               System.out.printf("%c",'┬');
//	            else if (x==1)
//	               System.out.printf("%c",'├');
//	            else if (y == HEIGHT)
//	               System.out.printf("%c",'┴');
//	            else if (x == WIDTH)
//	               System.out.printf("%c",'┤');
//	            else
//	               System.out.printf("%c",'┼');
//	         System.out.println();
//	      }
	      
	      System.out.println("================보드 생성================");
	      
	     char[][] board = new char[HEIGHT][WIDTH];
	      //너비는 소대원..! 소대원을 지목하는 순간 값만 채우면됨.
	     
	     //전체를 '+' 로깔고 바꿀 것만 바꿔도 ok.
	     //색칠을 먼저하고 덧칠로 가장자리를 수정하는 식의 프로그래밍 많이 사용됨.
	  
	     //1. '┼' 문자 채우기 (전면을 먼저 채운다.)
	     for(int y =1; y<=HEIGHT; y++) 
	    	 for(int x=1; x<=WIDTH; x++)
	    		 board[y-1][x-1] ='┼';     
	     
	     //2. 상단 '┬' 외벽채우기
	    	 for(int x=1; x<=WIDTH; x++)
	    		 board[0][x-1] ='┬';
	     	
	     	 
	     //3. 하단 '┴' 외벽채우기
	    	 for(int x=1; x<=WIDTH; x++)
	    		 board[HEIGHT-1][x-1] ='┴';
     	
	     //4. 좌측 '├' & 우측 '┤' 외벽 채우기
	    	 for(int y=1; y<=HEIGHT; y++) {
	    		 board[y-1][0] = '├';
	    		 board[y-1][WIDTH-1] = '┤';
	    	 } 	
	    	 
	     //5. 꼭지점 채우기
	    	board[0][0] = '┌';
	    	board[0][WIDTH-1] = '┐';
	    	board[HEIGHT-1][0] = '└';
	    	board[HEIGHT-1][WIDTH-1] ='┘';
	    	 
	    //6. 출력해보기	 
	    	
//	    	 for(int y =1; y<=HEIGHT; y++) {
//	    		 for(int x=1; x<=WIDTH; x++)
//	    			 System.out.printf("%c",board[y-1][x-1]);
//	    		 System.out.println();
//	    	 }
    	
		     //7. [3,3] 위치에 흰돌 채우기
		     // 값을 보정해줘야 함
		     // oy위치에 3을 직접 대입하면 매번 값을 수정해주어야함
		     //board[oy-1][ox-1] ='○';
		     
		     
		     //7-2. 입력 값을 받아서 오목 두기
		     Scanner sc = new Scanner(System.in);
		     System.out.println();

		     //8. 반복적으로 바둑돌 출력해보기
		     
		     int ox=0, oy=0; 
		     while(true) {
		    	
		    	 EXIT:while (true) {
		    		 
		    		 System.out.println("오목 둘 값을 입력하세요");
		    		 System.out.println("좌표의 범위는 1~20 입니다");
		    		 System.out.print("x y> ");
		    		 ox = sc.nextInt();
		    		 oy = sc.nextInt();
		    		 
		    		 // 8-1. 값 검사하기
		    		 if((ox<=0||oy<=0)||(ox>=21||oy>=21)) 
		    			 System.out.println("범위를 초과하였습니다. 다시입력하세요.");
		    		 else if(board[oy][ox] =='○') 
		    			 System.out.println("중복은 안돼. 돌아가. 바꿔줄 생각 없어.");
		    		 else 
		    			 board[oy][ox] ='○';
		    		 
		    		 
		    		 for(int y =1; y<=HEIGHT; y++) {
		    			 for(int x=1; x<=WIDTH; x++)
		    				 System.out.printf("%c",board[y-1][x-1]);
		    			 System.out.println();
		    		 }
		    		 
//		    		 if(0<ox ox) {
//		    		 		continue;
//		    		 }
		    		 
		    	// 중복위치 제거는 ?	 
		    		 

		    		 
		    	 }
		     }
		     
		     
		     
	    	 
	}
}
