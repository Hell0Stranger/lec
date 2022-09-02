package com.lec.ch3.loop;

public class ForAssignment2 {

	public static void main(String[] args) {

		System.out.println("====오목판그리기====");
		for (int y = 1; y <= 12; y++) {

			for (int x = 1; x <= 10; x++) {

				if (y == 1) {
					if (x == 1)
						System.out.printf("%c", '┌');

					else if (x == 10 && y == 1)
						System.out.printf("%c", '┐');
					else
						System.out.printf("%c", '┬');

				} else if (2 <= y && y < 12) {
					
					if (x == 1 || x == 10)
						System.out.printf("%c", '┃');
					else
						System.out.printf("%c", '┿');
					
				} else if (y == 12) {
					
					if (x == 1)
						System.out.printf("%c", '└');
					else if (x == 10 && y == 12)
						System.out.printf("%c", '┛');
					else
						System.out.printf("%c", '┴');
					
				} else
					System.out.printf("%c", '┿');
			}

			System.out.println();
		}
	}
}
