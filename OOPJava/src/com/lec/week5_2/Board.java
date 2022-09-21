package com.lec.week5_2;

import java.util.Scanner;

import com.lec.week5_1.Omok;

public class Board {

	int width;
	int height;
	char[][] buf;
	
	
	public void init() {
	width = 20;
	height = 20;
	buf = new char[this.height][this.width];
	
	 for(int y =1; y<=height; y++) 
    	 for(int x=1; x<=width; x++)
    		 buf[y-1][x-1] ='┼';     
     
    	 for(int x=1; x<=width; x++)
    		 buf[0][x-1] ='┬';
     	
     	 
    	 for(int x=1; x<=width; x++)
    		 buf[height-1][x-1] ='┴';
 	
    	 for(int y=1; y<=height; y++) {
    		 buf[y-1][0] = '├';
    		 buf[y-1][width-1] = '┤';
    	 } 	
    	 
    	buf[0][0] = '┌';
    	buf[0][width-1] = '┐';
    	buf[height-1][0] = '└';
    	buf[height-1][width-1] ='┘';
		
	
	}
		public void print() {
			
   		 for(int y =1; y<=height; y++) {
			 for(int x=1; x<=width; x++)
				 System.out.printf("%c",buf[y-1][x-1]);
			 System.out.println();
		 }
 	
	}
//		public void put(com.lec.week5_2.Omok omok) {
//   		 
//   		 for(int y =1; y<=height; y++) {
//   			 for(int x=1; x<=width; x++)
//   				 System.out.printf("%c",buf[y-1][x-1]);
//   			 System.out.println();
//   		 }		 
//		}



}
