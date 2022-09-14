package com.lec.ch4.arr;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		int max = 3;
		int index = 0;
		int[] kors = new int[max];
		int[] engs = new int[max];
		int[] maths = new int[max];
		Scanner sc = new Scanner(System.in);
		
		EXIT:
		while(true) {
				System.out.println("┌────────────────────────┐");
				System.out.println("│    성적메뉴 ₍ᐢ- ̫-ᐢ₎‧˚   │");
				System.out.println("└────────────────────────┘");
				System.out.println("\t 1. 성적 입력");
				System.out.println("\t 2. 성적 출력");
				System.out.println("\t 3. 성적 읽기");
				System.out.println("\t 4. 성적 저장");
				System.out.println("\t 5. 프로그램종료");
				System.out.print("\t ₍ᐢᐢ₎·°선택:");
				int menu = sc.nextInt();
				
				switch(menu)
				 {
//				  ==================1. 성적입력 Start================
				 	case 1: {
				 			int kor;
				 			int eng;
				 			int math;
				 			int go = 1;
				 			
				 	  while(go==1) {
				 			
					 			do {
					 				System.out.print("국어성적 입력 >>");
					 				kor = sc.nextInt();
					 				if(kor<0||kor>100)
					 					System.out.println("성적범위내에서 입력하세요 (0~100)");
					 			}while(kor<0||kor>100);
					 			do {
					 				System.out.print("영어성적 입력 >>");
					 				eng = sc.nextInt();
					 				if(eng<0||eng>100)
					 					System.out.println("성적범위내에서 입력하세요 (0~100)");
					 			}while(eng<0||eng>100);
					 			do {
					 				System.out.print("수학성적 입력 >>");
					 				math = sc.nextInt();
					 				if(math<0||math>100)
					 					System.out.println("성적범위내에서 입력하세요 (0~100)");
					 			}while(math<0||math>100);
				 			
					 			
					 			if(index>=max) {
					 				int[] korTemp = new int[max+3];
					 				int[] engTemp = new int[max+3];
					 				int[] mathTemp = new int[max+3];
					 				
					 				for(int i =0; i<index; i++) {
					 					korTemp[i] = kors[i];
					 					engTemp[i] = engs[i];
					 					mathTemp[i] = maths[i];
					 				    }
					 					
					 				kors = korTemp;
					 				engs = engTemp;
					 				maths = mathTemp;
					 				max = max+3;
					 				
					 			     }// end of if
					 			
					 				kors[index] = kor;
					 				engs[index] = eng;
					 				maths[index] = math;
	
					 				index++;
					 			
					 			System.out.println("성적입력을 계속 하시겠습니까?");
					 			System.out.print("예: 1번, 아니오: 2번 >>");
					 			
					 			go =sc.nextInt();
					 			
					 			if(go ==2)
					 				break;
					 			
				 			}// end of go while
				 			
				 	       } // end of case 1
				 		      break;
				   
//                ===================1. 성적입력 End=================
				 				 		
				 		
//				  ===================2. 성적출력 Start===============
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
				 			} // end of case 2
				 		break;
//		          ===================2. 성적출력 End=================
				  
				 		
//				  ==================3. 성적읽기 Start================
				 	case 3: {
				 			
				 			FileInputStream fis = new FileInputStream("res/score.csv");
				 			Scanner fscan = new Scanner(fis);				 			
				 			fscan.nextLine(); // 첫줄 건너뛰는 용도 
				 			
				 			while(fscan.hasNext()) {
					 				if(index>=max) {
					 					int[] korTemp = new int[max+3];
					 					int[] engTemp = new int[max+3];
					 					int[] mathTemp = new int[max+3];
					 					
					 					for(int i =0; i<index; i++) {
					 						korTemp[i] = kors[i];
					 						engTemp[i] = engs[i];
					 						mathTemp[i] = maths[i];
					 					   }
					 					
					 					kors = korTemp;
					 					engs = engTemp;
					 					maths = mathTemp;
					 					max = max+3;
					 					
					 				  }// end of if
					 				String tokens[] = fscan.nextLine().split(",");
					 				int kor = Integer.parseInt(tokens[0]);
					 				int eng = Integer.parseInt(tokens[1]);
					 				int math = Integer.parseInt(tokens[2]);
					 			
					 				kors[index] = kor;
						 			engs[index] = eng;
				                    maths[index] = math;	
						 				
				                    index++;
					 				}// end of fscan while
			 			
				 			  fscan.close();
				 			  fis.close();
				 			  System.out.println("성적을 읽습니다!");
				 			} // end of case 3
				              break;
//		          ===================3. 성적읽기 End=================
				  	         
				         
//				  ===================4. 성적저장 Start===============
				     case 4: {
				    	 		FileOutputStream fos = new FileOutputStream("res/score.csv");
				    	 		PrintStream ps = new PrintStream(fos);
				    	 
				    	 		 ps.print("kor");
				    	 		 ps.print(",");
						    	 ps.print("eng");
						    	 ps.print(",");
						    	 ps.print("math");
						    	 ps.println();
				    	 
						    	 for (int i =0; i<index; i++) {
				    	 		   ps.print(kors[i]);
				    	 		   ps.print(",");
				    	 		   ps.print(engs[i]);
				    	 		   ps.print(",");
				    	 		   ps.print(maths[i]);
				    	 		   ps.println();
				    	 	     }
				    	 				    	
						    	 fos.close();
				    	        ps.close();
				            } // end of case 4
				          break;
//				  ===================4. 성적저장 End=================
				  
				          
				          
//				  ===================5. 프로그램 종료=================
				    case 5: {
							System.out.println("\t프로그램을 종료합니다! ");
							System.out.println("\t  안뇽 ₍ᐢ..ᐢ₎♡  ");
				            } // end of case 5
				    	      break EXIT;				
				    default:
					  System.out.println("1~5사이의 값만 입력하세요.");
					   break;
	
			     } // end of switch			
		}// end of while
	}// end of main

}//end of class
