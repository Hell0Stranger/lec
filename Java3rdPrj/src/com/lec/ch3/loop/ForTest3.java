package com.lec.ch3.loop;

public class ForTest3 {

	public static void main(String[] args) {
		// 10번째마다
		// 1,2,3,4,5,6,7 =n (일반식)
		// 1,11,21,31,41,51 =an (1..........11........21........31.... 기다렸다가 증가, 반복할때마다
		// 증가가아닌 별도의 반복이있어야함)
		// c = 맥박이 다른 변수 새로운 규칙을 만드는 것
		// an=1+(n-1)*10
		for (int n = 1, c = 1; n <= 100; n++) { // 들어올때 딱 한번만 실행
			int an = 1 + (c - 1) * 10; // int 여기에 넣으면 매번 실행

			if (n == an) {
				System.out.printf("%c", '○');
				c++;
			}

			else
				System.out.printf("%c", '┼');

			if ((n % 10) == 0)
				System.out.println();
		}
		// ===============================
		System.out.println("============이중For문시작=============");
		for (int y = 1; y <=10; y++) { // y축
			
			for (int x = 1; x <=10; x++) {
				
				if (x==1)
					System.out.printf("%c", '○');
				
				
				
				else
					System.out.printf("%c", '┼');
				
				
			}
			
			System.out.println();
		}
	}
}
