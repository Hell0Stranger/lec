package com.lec.ch3.loop;

public class ForAssignment1 {

	public static void main(String[] args) {

		System.out.println("====삼각형그리기====");
		for (int y = 1; y <= 11; y++) { // y축

			for (int x = 1; x <= 11; x++) {
				
				if (y >= x && -y + 12 <= x)
					System.out.printf("%c", '●');

				else
					System.out.printf("%c", '┼');

			}

			System.out.println();
		}
	}
}
