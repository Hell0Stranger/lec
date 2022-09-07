
package com.lec.ch4.arr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreCalcArr2 {

	public static void main(String[] args) throws IOException {

		int[] kors = new int[3];
		int[] engs = new int[3];
		int[] maths = new int[3];

		Scanner sc = new Scanner(System.in);
// 	 관리 프로그램 + 현실적 
//   + 점진적으로 추가 가능해야함
//   + 삭제, 수정 필요
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
			case 1: 
			{
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
			case 2: 
			{

				System.out.println("┌────────────────────────┐");
				System.out.println("│     성적출력 ₍ᐢ..ᐢ₎♡    │");
				System.out.println("└────────────────────────┘");
				
				
				System.out.printf("%10s%10s%10s%10s%10s\n","kor","eng","math","total","avg");
				
				for(int i=0; i<3; i++) {
					int total = kors[i]+engs[i]+maths[i];
					float avg = total/3.0f;
					System.out.printf("%10s%10s%13s%10d%11.2f\n",kors[i],engs[i],maths[i],total,avg);
					}
				
			  }
				break;
				
//			======================성적 읽기========================
			case 3:
			{
				//문자열을 나누는 일은 빈번하게일어난다.
				//문자열이 가지고 있는 연산을 살펴보아야한다.
				
				//fsacn.nextLine() 이 실행된 결과가 한 줄 문자열
				//그문자열을 split 하겠다.
				//split할때는 기준이 필요 => "," (쉼표를 기준으로 쪼개주세요)
				//, 기준으로 나눈것을 배열로 저장. -> 배열로 참조해야함
				
				//문자열을 정수형 변수에 저장하기위해 형변환이 필요하다.
				System.out.println();
				System.out.println("\t성적을 읽습니다... ");
				
				FileInputStream fis = new FileInputStream("res/data2.csv");
				Scanner fscan = new Scanner(fis);
				
				fscan.nextLine();
			
			
			for(int i =0; i<3; i++) {
				String tokens[] = fscan.nextLine().split(",");
				int kor= Integer.parseInt(tokens[0]);
				int eng= Integer.parseInt(tokens[1]);
				int math = Integer.parseInt(tokens[2]);
				
				kors[i] = kor;
				engs[i] = eng;
				maths[i] = math;
			}


				fscan.close();
				fis.close();
				
				
			}
				  break;	
				
//			======================성적 저장========================
			
			case 4:	
			{
				System.out.println("\t성적을 저장합니다. ");		
				FileOutputStream fos = new FileOutputStream("res/data2.csv"); 				
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
