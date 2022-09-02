package com.lec.ch3.loop;

public class ForTest2 {

	public static void main(String[] args) {
		// 10번째마다
		// 1,2,3,4,5,6,7 =n
		// 1,11,21,31,41,51 =an
		// an=1+(n-1)*10
		for (int n = 1; n <= 100; n++) {

			if ((n % 10) == 1) 
				System.out.printf("%c", '○');

			else
				System.out.printf("%c", '┼');
			
			if((n%10)== 0)
				System.out.println();
		}
	}

}
