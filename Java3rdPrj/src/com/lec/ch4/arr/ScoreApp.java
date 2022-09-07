
package com.lec.ch4.arr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ScoreApp {

	public static void main(String[] args) throws IOException {
		
		int capacity = 3;
		int[] kors = new int[capacity];
		int[] engs = new int[capacity];
		int[] maths = new int[capacity];
		Scanner sc = new Scanner(System.in);
		// 1. 성적입력로직 실행
		System.out.println("┌────────────────────────┐");
		System.out.println("│     성적입력 ₍ᐢ..ᐢ₎⊹    │");
		System.out.println("└────────────────────────┘");

		int go =0;
		int index = 0; // 몇개가 담겨져있는가 ? index의 값을말하면됨
     		do {
     			//국어성적 입력
     			int kor; // 한번이 아니라 두번이상쓰면 지역변수화해서 쓸 것.
     			System.out.println("인덱스는"+index);
     			do {
     					System.out.println("국어성적 입력");
     					kor = sc.nextInt();
     					if (kor < 0 || kor > 100)
						 System.out.println("성적의 범위(0~100)를 벗어났습니다!");
     			 } while (kor < 0 || kor > 100);
     			
     			//공간을 먼저 확인하고, 공간이 모자라면 늘려주는 작업을 해야한다!
     			
     			if(index>=capacity) {
     				//늘려야함. 여기서는 공간을 3만큼 늘리기로한다.
     				int[] temp = new int[capacity+3];
     				
     				for(int i=0; i<capacity; i++) 
     					temp[i] = kors[i];	
     					
     				kors= temp;
     				capacity = capacity+3;
     			  }
     			
     			kors[index] = kor;
     			index++;// 몇개가 담겨져있는가 ? index의 값을말하면됨
     			
     			//더 할거니?
     			
     			System.out.println("계속입력하시겠습니까");
     			System.out.println("YES : 1번 / NO : 2번");
     			go = sc.nextInt();
     			
     			if(go==2)
     				System.exit(0);
     			
     		}while(go==1);
     		
     		
     		
     		
		//1-1. 더입력할래 ?
		// yes-> 더입력
		// no -> 
		//2. 출력 -> 프로그램 종료

	}// end of main
} // end of class

//영어성적 입력
//     			do{
//     	     		
//    				System.out.println("영어성적 입력");
//    				engs[0] = sc.nextInt();
//    					if (engs[0] < 0 || engs[0] > 100)
//    						System.out.println("성적의 범위(0~100)를 벗어났습니다!");
//    			} while (engs[0] < 0 || engs[0] > 100);
//     			//수학성적 입력
//     			do{
//     	     		
//    				System.out.println("수학성적 입력");
//    				maths[0] = sc.nextInt();
//    					if (maths[0] < 0 || maths[0] > 100)
//    						System.out.println("성적의 범위(0~100)를 벗어났습니다!");
//    			} while (maths[0] < 0 || maths[0] > 100);