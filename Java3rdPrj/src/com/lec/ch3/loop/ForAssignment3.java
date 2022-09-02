package com.lec.ch3.loop;

public class ForAssignment3 {

	public static void main(String[] args) {
		for(int y =1; y<=13; y++) {
			if(y==1)
				System.out.printf("%s", "┌┬┬┬┬┬┬┬┬┐");
			else if (y==13)
				System.out.printf("%s", "└┴┴┴┴┴┴┴┴┘");
			else
				System.out.printf("%s", "├┼┼┼┼┼┼┼┼┤");
				System.out.println();
				
		}
	}

}
