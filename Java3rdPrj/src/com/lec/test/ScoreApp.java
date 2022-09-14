package com.lec.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreApp {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int max = 3;
		int index = 0;
	
		int kors[] = new int[max];
		int engs[] = new int[max];
		int maths[] = new int[max];
		
		EXIT:
		while(true) {
			
			System.out.println("성적관리 프로그램 ver.1");
			System.out.println("1. 성적 입력 ");
			System.out.println("2. 성적 출력 ");
			System.out.println("3. 성적 읽기");
			System.out.println("4. 성적 저장");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴를 선택하세요 >");
			
			int menu;
			
				menu = sc.nextInt();
				
			switch(menu) {
				case 1:
				{	
					int go = 0;
					System.out.println("성적 입력 부분입니다.");
					System.out.println("국어, 영어, 수학 성적을 입력하세요");
				do {
							int kor; 
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


							if (index >= max) {
								int[] korTemp = new int[max + 3];
								int[] engTemp = new int[max + 3];
								int[] mathTemp = new int[max + 3];
								

								for (int i = 0; i < index; i++) {
									korTemp[i] = kors[i];
									engTemp[i] = engs[i];
									mathTemp[i] = maths[i];
								}

								kors = korTemp;
								engs = engTemp;
								maths = mathTemp;
								
								max = max + 3;
							}

							kors[index] = kor;
							engs[index] = eng;
							maths[index] = math;
							
							index++;
						System.out.println("입력을 계속하시겠습니까?");
						System.out.println("예>1번, 아니오>2번");
						go = sc.nextInt();
						if(go==2)
							break;
					}while(go==1);
					
				}
					break;
				
				
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
					
				case 3:{
					System.out.println();
					System.out.println("\t성적을 읽습니다... ");
					
					FileInputStream fis = new FileInputStream("res/data4.csv");
					Scanner fscan = new Scanner(fis);
					fscan.nextLine();
				while(fscan.hasNext()) {
					
					if (index >= max) {
						int[] korTemp = new int[max + 3];
						int[] engTemp = new int[max + 3];
						int[] mathTemp = new int[max + 3];
						

						for (int i = 0; i < index; i++) {
							korTemp[i] = kors[i];
							engTemp[i] = engs[i];
							mathTemp[i] = maths[i];
						}

						kors = korTemp;
						engs = engTemp;
						maths = mathTemp;
						
						max = max + 3;
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
					
				case 4:
				{
				FileOutputStream fout = new FileOutputStream("res/data4.csv");
	               PrintStream ps = new PrintStream(fout);

	               ps.print("kor");
	               ps.print(",");
	               ps.print("eng");
	               ps.print(",");
	               ps.println("math");
	               
	        
	               for(int i =0; i<index; i++) {
	                  ps.print(kors[i]);
	                  ps.print(",");
	                  ps.print(engs[i]);
	                  ps.print(",");
	                  ps.println(maths[i]);
	                  }
	               
	               fout.close();
	               ps.close();
	               System.out.println("저장이 완료되었습니다.");   
				}
					break;
				
			case 5: 
				System.out.println();
				System.out.println("\t프로그램을 종료합니다! ");
				System.out.println("\t  안뇽 ₍ᐢ..ᐢ₎♡  ");

				break EXIT;

			default:
				System.out.println("\n\t 1~5사이의 값을 입력!");
				break;
			}
			
		}
		
		
	}

}
