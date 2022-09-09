
package com.lec.ch4.arr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreCalcArr3 {

	public static void main(String[] args) throws IOException {

		int capacity = 3;
		int[] kors = new int[capacity];
		int[] engs = new int[capacity];
		int[] maths = new int[capacity];
		int index = 0;
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
//			======================성적 입력========================

			case 1: {

				// 1. 성적입력로직 실행
				System.out.println("┌────────────────────────┐");
				System.out.println("│     성적입력 ₍ᐢ..ᐢ₎⊹    │");
				System.out.println("└────────────────────────┘");
				
				int go = 0;
				 // 몇개가 담겨져있는가 ? index의 값을말하면됨
				do {
					// 국어,영어,수학 입력
					int kor; // 한번이 아니라 두번이상쓰면 지역변수화해서 쓸 것.
					int eng;
					int math;
					do {
						System.out.println("국어성적 입력");
						kor = sc.nextInt();
						if (kor < 0 || kor > 100)
							System.out.println("성적의 범위(0~100)를 벗어났습니다!");
					} while (kor < 0 || kor > 100);
					do {
						System.out.println("영어성적 입력");
						eng = sc.nextInt();
						if (eng < 0 || eng > 100)
							System.out.println("성적의 범위(0~100)를 벗어났습니다!");
					} while (eng < 0 || eng > 100);
					do {
						System.out.println("수학성적 입력");
						math = sc.nextInt();
						if (math < 0 || math > 100)
							System.out.println("성적의 범위(0~100)를 벗어났습니다!");
					} while (math < 0 || math > 100);

					// 공간을 먼저 확인하고, 공간이 모자라면 늘려주는 작업을 해야한다!

					if (index >= capacity) {
						// 늘려야함. 여기서는 공간을 3만큼 늘리기로한다.
						int[] korTemp = new int[capacity + 3];
						int[] engTemp = new int[capacity + 3];
						int[] mathTemp = new int[capacity + 3];
						

						for (int i = 0; i < index; i++) {
							korTemp[i] = kors[i];
							engTemp[i] = engs[i];
							mathTemp[i] = maths[i];
						}

						kors = korTemp;
						engs = engTemp;
						maths = mathTemp;
						
						capacity = capacity + 3;
					}

					kors[index] = kor;
					engs[index] = eng;
					maths[index] = math;
					
					index++;// 몇개가 담겨져있는가 ? index의 값을말하면됨

					// 영어성적 입력

					// 더 할거니?

					System.out.println("계속입력하시겠습니까");
					System.out.println("YES : 1번 / NO : 2번");
					//1,2 만입력
					go = sc.nextInt();

					if (go == 2)
						break;

				} while (go == 1);
			}
				break;

//			======================성적 출력========================
			case 2: {

				System.out.println("┌──────────────────────────────┐");
				System.out.println("│         성적출력 ₍ᐢ..ᐢ₎♡      │");
				System.out.println("└──────────────────────────────┘");

				System.out.printf("%10s%10s%10s%10s%10s\n", "kor", "eng", "math", "total", "avg");

				for (int i = 0; i < index ; i++) {
					int total = kors[i] + engs[i] + maths[i];
					float avg = total / 3.0f;
					System.out.printf("▶"+(i+1)+"번"+"%5s%10s%10s%10d%11.2f\n", kors[i], engs[i], maths[i], total, avg);
				}

			}
				break;

//			======================성적 수정========================
			case 3: {
				System.out.println();
				System.out.println("\t성적을 수정합니다! ");
				System.out.println("\t수정할 성적을 선택하세요! ");
				System.out.printf("%10s%10s%10s%10s%10s\n", "kor", "eng", "math", "total", "avg");

				for (int i = 0; i < index; i++) {
					int total = kors[i] + engs[i] + maths[i];
					float avg = total / 3.0f;
					System.out.printf("▶"+(i+1)+"번"+"%5s%10s%10s%10d%11.2f\n", kors[i], engs[i], maths[i], total, avg);
				}
				
				int input = sc.nextInt();
				
				//입력값 유효성검사 추가 필요!
				//-> 1번 참고해서 추가할 것.
				System.out.println("국어: ");
				kors[input-1] = sc.nextInt();
				System.out.println("영어: ");
				engs[input-1] = sc.nextInt();
				System.out.println("수학: ");
				maths[input-1] = sc.nextInt();
				}

				break;

//			======================성적 삭제========================

			case 4: {
				//삭제 미구현
				System.out.println();
				System.out.println("\t성적을 삭제합니다! ");
				System.out.println("\t삭제할 성적을 선택하세요! ");
				System.out.printf("%10s%10s%10s%10s%10s\n", "kor", "eng", "math", "total", "avg");

				for (int i = 0; i < index; i++) {
					int total = kors[i] + engs[i] + maths[i];
					float avg = total / 3.0f;
					System.out.printf("▶"+(i+1)+"번"+"%5s%10s%10s%10d%11.2f\n", kors[i], engs[i], maths[i], total, avg);
				}
				
				int input = sc.nextInt();
				
				for (int i = 0; i<index; i++) {
					kors[input-1] = kors[input];
					engs[input-1] = engs[input];
					maths[input-1] = maths[input];	
					
				}
				
			}
				break;
				
//			======================성적 읽기========================
			case 5: {
				System.out.println();
				System.out.println("\t성적을 읽습니다... ");
				
				FileInputStream fis = new FileInputStream("res/data4.csv");
				Scanner fscan = new Scanner(fis);
				fscan.nextLine();
			while(fscan.hasNext()) {
				
				if (index >= capacity) {
					// 늘려야함. 여기서는 공간을 3만큼 늘리기로한다.
					int[] korTemp = new int[capacity + 3];
					int[] engTemp = new int[capacity + 3];
					int[] mathTemp = new int[capacity + 3];
					

					for (int i = 0; i < index; i++) {
						korTemp[i] = kors[i];
						engTemp[i] = engs[i];
						mathTemp[i] = maths[i];
					}

					kors = korTemp;
					engs = engTemp;
					maths = mathTemp;
					
					capacity = capacity + 3;
				}


				 String[] tokens = fscan.nextLine().split(",");
				 int kor= Integer.parseInt(tokens[0]);
				 int eng= Integer.parseInt(tokens[1]);
				 int math = Integer.parseInt(tokens[2]);
				 kors[index] = kor;
				 engs[index] = eng;
				 maths[index] = math;
				 index++;
				 			 

			   }
				fscan.close();
				fis.close();	
				
			}
			 break;
			 
//			======================성적 저장========================
			case 6: {
	               FileOutputStream fout = new FileOutputStream("res/data4.csv");
	               PrintStream fps = new PrintStream(fout);

	               fps.print("kor");
	               fps.print(",");
	               fps.print("eng");
	               fps.print(",");
	               fps.println("math");
	               
	        
	               for(int i =0; i<index; i++) {
	                  fps.print(kors[i]);
	                  fps.print(",");
	                  fps.print(engs[i]);
	                  fps.print(",");
	                  fps.println(maths[i]);
	                  }
	               
	               fout.close();
	               fps.close();
	               System.out.println("저장이 완료되었습니다.");   
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
