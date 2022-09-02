/*
 * 변수는 행위명x, 변수선언의 위치는 최대한 변수를 쓰는 공간 안에서 반복문 울타리 내에서 변수를 선언하면 반복될 때 마다 만들어지는 것이
 * 아닌가? 선언, 연산 두 가지 코드가 있음. (메모리 구조) 변수를 선언한 것은 연산을 한 것이 아니기 때문에 반복적으로 연산되지 않는다.
 * int menu (선언은 반복x, 울타리를 실행하기 전 확인하게 되어있음) sc.nextInt(); -> 이부분은 연산 ⭕
 */
package week01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreCalc2 {

	public static void main(String[] args) throws IOException {

		int kor = 0, eng = 0, math = 0;
		int total;
		float avg;
		// Scanner는 java에서 만든 utility, 이름확장, 식별을 위해, 패키지명
		// System.in -= 객체 , Scanner = (종류명) 종류명 앞에 붙은것은 패키지
		Scanner sc = new Scanner(System.in);
		// next = string 50을 5,0 으로 담는다
		// label을 먼저 띄워줘야함

//   ========================성적 메뉴 부분 =========================	
		
		
		EXIT:
		while (true) 
		{
			System.out.println("┌────────────────────────┐");
			System.out.println("│       성적메뉴 ₍ᐢ- ̫-ᐢ₎‧˚   │");
			System.out.println("└────────────────────────┘");
			System.out.println("\t 1. 성적 입력");
			System.out.println("\t 2. 성적 출력");
			System.out.println("\t 3. 성적 읽기");
			System.out.println("\t 4. 성적 저장");
			System.out.println("\t 5. 프로그램 종료");
			System.out.print("\t ₍ᐢᐢ₎·°선택:");
			// 선언(반복x) 연산(반복O)
			int menu = sc.nextInt();

			switch (menu) {
//			======================성적 입력========================
			case 1: {
				System.out.println("┌────────────────────────┐");
				System.out.println("│     성적입력 ₍ᐢ..ᐢ₎⊹       │");
				System.out.println("└────────────────────────┘");
				// 코드가 반복되는데 , 입력 받고 검사 하지말고 (흐름을 거꾸로 할수가 없어서 코드가 while 문내에 반복됨)
				// => 처리한걸 검사해보고 아니면 다시 흐름을 갖게한다 (do while)
				do {
					System.out.print("kor: ");
					kor = sc.nextInt();
					if (kor < 0 || kor > 100)
						System.out.println("성적의 범위(0~100)를 벗어났습니다!");
				} while (kor < 0 || kor > 100);
				do {
					System.out.print("eng: ");
					eng = sc.nextInt();
					if (eng < 0 || eng > 100)
						System.out.println("성적의 범위(0~100)를 벗어났습니다!");
				} while (eng < 0 || eng > 100);
				
				do {
					System.out.print("math: ");
					math = sc.nextInt();
					if (math < 0 || math > 100)
						System.out.println("성적의 범위(0~100)를 벗어났습니다!");
				} while (math < 0 || math > 100);

			}
				break;

//			======================성적 출력========================
			case 2: {
//초기화 1. 오류값 설정(입력받은 것을 출력하고자 할 때 아래와 같이 사용) 
//				if(kor ==-1) {
//					System.out.println("성적 입력을 우선처리하세용");
//					break;
//				}
//2. 기본값	사용 =>  값을 직접 초기화 해준다
				total = kor + eng + math;
				avg = total / 3.0f;

				System.out.println("┌────────────────────────┐");
				System.out.println("│     성적출력 ₍ᐢ..ᐢ₎♡       │");
				System.out.println("└────────────────────────┘");

				System.out.printf("국어  :%d\n", kor);
				System.out.printf("영어  :%d\n", eng);
				System.out.printf("수학  :%d\n", math);
				System.out.printf("총점 : %d\n", total);
				System.out.printf("평균 : %.2f\n", avg);

			     }
				break;
				
//			======================성적 읽기========================
			// 성적 입력하지 않고 읽기를 실행해서 출력결과에 뿌려보자
			case 3:
			{
				System.out.println();
				System.out.println("\t성적을 읽습니다... ");
				// 내가 만들지 않은 것은 close 하지 않는다.
				// 내가 만든 것은 당연히 close 해주어야함!
				// 데이터를 읽을때는 문자열을 가지고와서 확인하고 숫자로 바꿔야함
				// 바로 nextInt하면 위험하다 (확인작업이 없기때문에)
				// "문자열"로 받아와서 -> 그 전체를 숫자로 바꾸는 작업을 해보자.
				// "1 0" -> 10
				
				FileInputStream fis = new FileInputStream("res/inout.csv");
				Scanner fscan = new Scanner(fis);
				
				fscan.nextLine(); //맨첫줄을 건너 뜀
				kor=Integer.parseInt(fscan.nextLine());
				eng=Integer.parseInt(fscan.nextLine());
				math=Integer.parseInt(fscan.nextLine());
				
				fscan.close();
				fis.close();
				
				
			}
				  break;	
				
//			======================성적 저장========================
			
			case 4:	
			{
				System.out.println("\t성적을 저장합니다. ");
//				FileOutputStream fos = new FileOutputStream("res/inout2.csv"); 
//				PrintStream ps = new PrintStream("res/inout.csv"); //file name을  직접 넣은경우
//				File file = new File("res/inoutnew.csv"); // 새로운 파일을 만들고 싶을때
//				FileOutputStream fos = new FileOutputStream(file);		
				
				FileOutputStream fos = new FileOutputStream("res/inout.csv"); 				
				PrintStream ps = new PrintStream(fos);
				
				
			
				ps.println();
				ps.printf("kor :%s\n",kor);
				ps.printf("eng :%s\n",eng);
				ps.printf("math :%s\n",math);
				
				
				ps.close();
				
//				
//			
//				ps.println(line1);
//				fos.close();
				
			}
			break;
//			======================프로그램 종료========================
			case 5: 
				
				System.out.println();
				System.out.println("\t프로그램을 종료합니다! ");
				System.out.println("\t  안뇽 ₍ᐢ..ᐢ₎♡  ");
			
			// while을 break 하려면?
			// break에 라벨을 붙인다.
				break EXIT;
				
			default:
				System.out.println("\n\t 1~5사이의 값을 입력!");
					break;
			
			} //end of switch
		
		} // end of while

	}// end of main
} // end of class
