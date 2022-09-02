/*
 * 변수는 행위명x, 변수선언의 위치는 최대한 변수를 쓰는 공간 안에서 반복문 울타리 내에서 변수를 선언하면 반복될 때 마다 만들어지는 것이
 * 아닌가? 선언, 연산 두 가지 코드가 있음. (메모리 구조) 변수를 선언한 것은 연산을 한 것이 아니기 때문에 반복적으로 연산되지 않는다.
 * int menu (선언은 반복x, 울타리를 실행하기 전 확인하게 되어있음) sc.nextInt(); -> 이부분은 연산 ⭕
 */
package week01;

import java.io.IOException;
import java.util.Scanner;

public class App0830 {

	public static void main(String[] args) throws IOException {

		int kor, eng, math;
		int total;
		float avg;
		// Scanner는 java에서 만든 utility, 이름확장, 식별을 위해, 패키지명
		// System.in -= 객체 , Scanner = (종류명) 종류명 앞에 붙은것은 패키지
		Scanner sc = new Scanner(System.in);
		// next = string 50을 5,0 으로 담는다
		// label을 먼저 띄워줘야함
		
//   ========================성적 메뉴 부분 =========================	
		while (true) {
			System.out.println("┌────────────────────────┐");
			System.out.println("│       성적메뉴 ₍ᐢ- ̫-ᐢ₎‧˚   │");
			System.out.println("└────────────────────────┘");
			System.out.println("\t 1. 성적 입력");
			System.out.println("\t 2. 성적 출력");
			System.out.print("\t ₍ᐢᐢ₎·°선택:");
			//선언(반복x)   연산(반복O)
			int menu = sc.nextInt();

			switch (menu) {
//   ========================성적 입력 부분 =========================	
			case 1:
			{
				System.out.println("┌────────────────────────┐");
				System.out.println("│     성적입력 ₍ᐢ..ᐢ₎⊹       │");
				System.out.println("└────────────────────────┘");
				// 코드가 반복되는데 , 입력 받고 검사 하지말고 (흐름을 거꾸로 할수가 없어서 코드가 while 문내에 반복됨)
				// => 처리한걸 검사해보고 아니면 다시 흐름을 갖게한다 (do while)
				do {
					System.out.print("kor: ");
					kor = sc.nextInt();
					System.out.print("eng: ");
					eng = sc.nextInt();
					System.out.print("math: ");
					math = sc.nextInt();
					if (kor < 0 || kor > 100)
						System.out.println("성적의 범위(0~100)를 벗어났습니다!");
				} while (kor < 0 || kor > 100);
				break;
			}

// ===========================성적출력부분=======================
//			case 2: 
//			{
//				total = kor + eng + math;
//				avg = total / 3.0f;
//
//				System.out.println("┌────────────────────────┐");
//				System.out.println("│     성적출력 \\^ㅇ^/       │");
//				System.out.println("└────────────────────────┘");
//
//				int i = 0;
//				while (i < 3) {
//
//					System.out.printf("국어  :%d\n", kor);
//					System.out.printf("영어  :%d\n", eng);
//					System.out.printf("수학  :%d\n", math);
//					System.out.printf("총점 : %d\n", total);
//					System.out.printf("평균 : %.2f\n", avg);
//				}
//				// break;
//			}
			}
		}
	}
}

//		
//		do
//		
//		
//	
//		System.out.println("\t 국어: ");
//		System.out.println("\t 영어: ");
//		System.out.println("\t 수학: ");
//		
//		
//		
//		

//		{
//			// 50을 입력하면
//			int code = System.in.read();
//			// 53 , read()는 한글자씩 받아옴. '5' 한글자만 읽음, 숫자키워드를 눌러서 입력했지만
//			// 실제로 버퍼에는 5에 해당하는 키코드가 들어감 5에해당하는 코드값 = 53(인코딩), println이므로 문자열 출력
//			System.out.println(code);
//			// 5 , 53에 해당하는 코드값 (디코딩)문자 5 출력
//			System.out.write(code);
//			System.out.flush();
//		}
