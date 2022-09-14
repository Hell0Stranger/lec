package com.lec.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreApp3 {

	public static void main(String[] args) throws IOException {

		int max = 3;
		int index = 0;
		int[] kors = new int[max];
		int[] engs = new int[max];
		int[] maths = new int[max];
		
		Scanner sc = new Scanner(System.in);
		
		EXIT:
		while(true) {
				System.out.println("=====================");
				System.out.println("성적관리 프로그램 v1.");
				System.out.println("=====================");
				System.out.println("메뉴를 입력하세요.");
				System.out.println("");
				System.out.println("1. 성적 입력");
				System.out.println("2. 성적 출력");
				System.out.println("3. 성적 읽기");
				System.out.println("4. 성적 저장");
				System.out.println("5. 프로그램종료");
				System.out.print("입력>");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			
//			 ===================1. 성적 입력=======================
				case 1: 
					{
						int go = 1;
						
						while(go==1) {
							
							int kor;
							int eng;
							int math;
							
							do {
								System.out.println("국어 성적을 입력하세요. 범위 (0~100)");
								kor = sc.nextInt();						
							}while(kor<0||kor>100);
							do {
								System.out.println("영어 성적을 입력하세요. 범위 (0~100)");
								eng = sc.nextInt();						
							}while(eng<0||eng>100);
							do {
								System.out.println("수학 성적을 입력하세요. 범위 (0~100)");
								math = sc.nextInt();						
							}while(math<0||math>100);
							
								if(index>=max) {
									int[] korTemp = new int[max+3];
									int[] engTemp = new int[max+3];
									int[] mathTemp = new int[max+3];
								
										for(int i = 0; i<index; i++) {			
											korTemp[i]= kors[i];
											engTemp[i] =engs[i];
											mathTemp[i]=maths[i];
										}
										
										kors = korTemp;
										engs = engTemp;
										maths = mathTemp;
										
										max=max+3;							
							    } // end of if
							
						
							kors[index] = kor;
							engs[index] = eng;
							maths[index] = math;
							
							index++;
							System.out.println("성적 입력을 계속하시겠습니까? ");
							System.out.print("yes : 1번 , no : 2번 >");
							go = sc.nextInt();
						
							if(go==2)
								break;
						}//end of while
						
					}// end of case1
					  break;
					  
//			 ===================1. 성적 입력끝=====================
					  
//			 ===================2.성적 출력========================
				case 2: 
					{
					System.out.printf("%s%10s%10s%10s%10s\n","국어","영어","수학","총점","평균");			
					for(int i =0; i<index; i++) {
						int total = kors[i]+engs[i]+maths[i];
						float avg = total/3.0f;
						System.out.printf("%d%10d%10d%10d%10.2f\n",kors[i],engs[i],maths[i],total,avg);
						}
					}
					 break;
					 
//			 ===================2.성적 출력끝======================
					 
//			 ===================3.성적 읽기========================
				case 3: 
					{	
						FileInputStream fis = new FileInputStream("rew/data1.csv");
						Scanner fscan = new Scanner(fis);
						
						fscan.nextLine();
						
						while(fscan.hasNext()) {
							if(index>=max) {
								int[] korTemp = new int[max+3];
								int[] engTemp = new int[max+3];
								int[] mathTemp = new int[max+3];
							
									for(int i = 0; i<index; i++) {			
										korTemp[i]= kors[i];
										engTemp[i] =engs[i];
										mathTemp[i]=maths[i];
									}
									
									kors = korTemp;
									engs = engTemp;
									maths = mathTemp;
									
									max=max+3;							
						    } // end of if
						
						
						String tokens[] = fscan.nextLine().split(",");
						
						int kor = Integer.parseInt(tokens[0]);
						int eng = Integer.parseInt(tokens[1]);
						int math = Integer.parseInt(tokens[2]);
						
						kors[index] = kor;
						engs[index] = eng;
						maths[index] = math;
						
						index++;
						}// end of while
						fscan.close();
						fis.close();
					} // end of case 3
					 break;
//			 ===================3.성적 읽기끝======================
					 
					 
//			 ===================4.성적 저장========================
					 
				case 4: 
					{
						FileOutputStream fos = new FileOutputStream("res/newData.csv");
						PrintStream ps = new PrintStream(fos);
						
						ps.print("kor");
						ps.print(",");
						ps.print("eng");
						ps.print(",");
						ps.print("math");
						ps.println("");
						
						for(int i =0; i<index; i++) {
							ps.print(kors[i]);
							ps.print(",");
							ps.print(engs[i]);
							ps.print(",");
							ps.print(maths[i]);
							ps.println("");
						}
						
						System.out.println("성적 저장 완료.");
					}
					 break;
//			 ===================4.성적 저장끝=======================
					 
				case 5: 
						System.out.println("성적관리 프로그램을 종료합니다.");
				        break EXIT;
				 
				 default:
					 	System.out.println("1~5사이의 값을 입력하세요");
					 	break;
					 	
			    } // end of switch
			}// end of while
		}// end of main		
	}// end of class


