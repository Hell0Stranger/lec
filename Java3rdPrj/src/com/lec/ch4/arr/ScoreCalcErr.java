
package com.lec.ch4.arr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreCalcErr {

	public static void main(String[] args) throws IOException {

		int capacity = 3;
		int[] kors = new int[capacity];
		int[] engs = new int[capacity];
		int[] maths = new int[capacity];
		Scanner sc = new Scanner(System.in);

// 	 관리 프로그램 + 현실적 
//   + 점진적으로 추가 가능해야함
//   + 삭제, 수정 필요
//   ========================성적 메뉴 부분 =========================	

		EXIT: while (true) {
			System.out.println("┌────────────────────────┐");
			System.out.println("│    성적메뉴 ₍ᐢ- ̫-ᐢ₎‧˚   │");
			System.out.println("└────────────────────────┘");
			System.out.println("\t 1. 성적 입력");
			System.out.println("\t 2. 성적 출력");
			System.out.println("\t 3. 성적 수정");
			System.out.println("\t 4. 성적 삭제");
			System.out.println("\t 5. 성적 읽기");
			System.out.println("\t 6. 성적 저장");
			System.out.println("\t 7. 프로그램 종료");
			System.out.print("\t ₍ᐢᐢ₎·°선택:");
			int menu = sc.nextInt();

			switch (menu) {

//			======================성적 출력========================
			case 2: {

				System.out.println("┌──────────────────────────────┐");
				System.out.println("│         성적출력 ₍ᐢ..ᐢ₎♡      │");
				System.out.println("└──────────────────────────────┘");

				System.out.printf("%10s%10s%10s%10s%10s\n", "kor", "eng", "math", "total", "avg");

				for (int i = 0; i < 3; i++) {
					int total = kors[i] + engs[i] + maths[i];
					float avg = total / 3.0f;
					System.out.printf("%5s%10s%10s%10d%11.2f\n", kors[i], engs[i], maths[i], total, avg);
				}

			}
				break;

	
//			======================성적 읽기========================
			case 5: {
				System.out.println("\t성적을 읽습니다... ");
				
				FileInputStream fis = new FileInputStream("res/data4.csv");
				Scanner fscan = new Scanner(fis);
				
				fscan.nextLine();
			
			
			for(int i =0; i<4; i++) {
				 String[] tokens = fscan.nextLine().split(",");
				 int kor= Integer.parseInt(tokens[0]);
				 int eng= Integer.parseInt(tokens[1]);
				 int math = Integer.parseInt(tokens[2]);
				 
				 kors[i] = kor;
				 engs[i] = eng;
				 maths[i] = math;
			
//				 fis.close();	
//				 fscan.close();
			   }

			}
			 break;
			 

			
//			======================프로그램 종료========================
			case 7:

				System.out.println();
				System.out.println("\t프로그램을 종료합니다! ");
				System.out.println("\t  안뇽 ₍ᐢ..ᐢ₎♡  ");

				break EXIT;

			default:
				System.out.println("\n\t 1~5사이의 값을 입력!");
				break;

			} // end of switch

		} // end of while

	}// end of main
} // end of class
