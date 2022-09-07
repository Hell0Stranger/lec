
package com.lec.ch4.arr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreCalcArr {

	public static void main(String[] args) throws IOException {

		int[] kors = new int[3];
		int total =0;
		float avg;
		Scanner sc = new Scanner(System.in);

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
			int menu = sc.nextInt();

			switch (menu) {
//			======================성적 입력========================
			case 1: {
				System.out.println("┌────────────────────────┐");
				System.out.println("│     성적입력 ₍ᐢ..ᐢ₎⊹       │");
				System.out.println("└────────────────────────┘");
				
				for (int i=0; i<3; i++) 
					do {
						System.out.print("kor"+(i+1)+": ");
						kors[i] = sc.nextInt();
							if (kors[i] < 0 || kors[i] > 100)
								System.out.println("성적의 범위(0~100)를 벗어났습니다!");
					} while (kors[i] < 0 || kors[i] > 100);
				
			}
				break;

//			======================성적 출력========================
			case 2: {

				System.out.println("┌────────────────────────┐");
				System.out.println("│     성적출력 ₍ᐢ..ᐢ₎♡       │");
				System.out.println("└────────────────────────┘");
				
				for(int i=0; i<3; i++) {
					System.out.printf("국어"+(i+1)+"  :%d\n", kors[i]);
					total += kors[i];
				}
			
				
				avg = total/3.0f;
				System.out.printf("총점 : %d\n", total);				
				System.out.printf("평균 : %.2f\n", avg);
			     }
				break;
				
//			======================성적 읽기========================
			case 3:
			{
				System.out.println();
				System.out.println("\t성적을 읽습니다... ");
				
				FileInputStream fis = new FileInputStream("res/inout.csv");
				Scanner fscan = new Scanner(fis);
				
				
				for (int i=0; i<3; i++) {
				kors[i]=Integer.parseInt(fscan.nextLine());
				System.out.print("kor"+(i+1)+":"+kors[i]);
				System.out.println();
				}

				fscan.close();
				fis.close();
				
				
			}
				  break;	
				
//			======================성적 저장========================
			
			case 4:	
			{
				System.out.println("\t성적을 저장합니다. ");		
				FileOutputStream fos = new FileOutputStream("res/inout.csv"); 				
				PrintStream ps = new PrintStream(fos);				
			
				for(int i=0; i<3; i++)
				 ps.printf("%d\n",kors[i]);
					
				
				ps.close();
				fos.close();		
			}
			break;
//			======================프로그램 종료========================
			case 5: 
				
				System.out.println();
				System.out.println("\t프로그램을 종료합니다! ");
				System.out.println("\t  안뇽 ₍ᐢ..ᐢ₎♡  ");
			
		
				break EXIT;
				
			default:
				System.out.println("\n\t 1~5사이의 값을 입력!");
					break;
			
			} //end of switch
		
		} // end of while

	}// end of main
} // end of class
