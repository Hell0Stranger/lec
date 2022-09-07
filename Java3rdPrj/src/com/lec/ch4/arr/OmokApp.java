package com.lec.ch4.arr;

public class OmokApp {

	public static void main(String[] args) {
		final int WIDTH = 21;
	    final int HEIGHT = 21;
	   
	      for (int y=1; y <= HEIGHT; y++) {
	         for (int x=1; x <= WIDTH; x++)
	            if (x == 1 && y == 1)
	               System.out.printf("%c",'┌');
	            else if (x == WIDTH && y == 1)
	               System.out.printf("%c",'┐');
	            else if (x ==1 && y == HEIGHT)
	               System.out.printf("%c",'└');
	            else if (x ==WIDTH && y == HEIGHT)
	               System.out.printf("%c",'┘');
	            else if (x<WIDTH && y==1)
	               System.out.printf("%c",'┬');
	            else if (x==1)
	               System.out.printf("%c",'├');
	            else if (y == HEIGHT)
	               System.out.printf("%c",'┴');
	            else if (x == WIDTH)
	               System.out.printf("%c",'┤');
	            else
	               System.out.printf("%c",'┼');
	         System.out.println();
	      }
	      
	      System.out.println("================보드 생성================");
	      
	     char[][] board = new char[HEIGHT][WIDTH];
	      //너비는 소대원..! 소대원을 지목하는 순간 값만 채우면됨.
	     
	     //전체를 + 로깔고 바꿀 것만 바꿔도 ok.
	     //색칠을 먼저하고 덧칠로 가장자리를 수정하는 식의 프로그래밍도 자주
	  
	     //1. '┼' 문자 채우기
	     for(int j =0; j<HEIGHT; j++) {
	    	 for(int i=0; i<WIDTH; i++)
	    		 board[j][i] ='┼';
	    	 System.out.println(board[j]);
	     }
	     
	     //2. 상단 '┬' 외벽채우기
	     	for (int i=0; i<WIDTH; i++) 
	     		board[0][i] ='┬';
	     	
	     	 
	     //3. 하단 '┴' 외벽채우기
	     	for (int i=0; i<WIDTH; i++) 
	     		board[20][i] ='┴';
	     	
	     	
	     //4. 좌측 '├' & 우측 '┤' 외벽 채우기
	     	for (int j=0; j<HEIGHT; j++)
	     		board[j][0] = '├';
	     	
	    	for (int j=0; j<HEIGHT; j++)
	     		board[j][20] = '┤';
	    	
	     //5. 꼭지점 채우기
	    	//00 2020
	    	//020 200
	    	//if (board)
	    	board[0][0] = '┌';
	    	board[0][20] = '┐';
	    	board[20][0] = '└';
	    	board[20][20] ='┘';
	    			
	    	
	    	System.out.println("최종출력--------");
	    	for (int y=0; y<HEIGHT; y++) {
	    		for(int x=0; x<WIDTH; x++)
	    			System.out.print(board[y][x]);
	    			System.out.println();
	    	}
	}

}
