package com.lec.ch3.loop;

public class ForTest1 {

	public static void main(String[] args) {
		// 10번째마다
		for (int n = 0; n < 100; n++) {

			if ((n % 10) == 0) 
				System.out.printf("%c", '○');

			else
				System.out.printf("%c", '┼');
			
			if(((n+1)%10)== 0)
				System.out.println();
		}
	}

}
