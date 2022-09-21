package com.lec.week5_2;

import java.util.Scanner;

public class Exam {
	
	private int kor;
	private int eng;
	private int math;
	


	public void input() {
		System.out.println("성적을 입력합니다");
		Scanner sc = new Scanner(System.in);
		System.out.print("국어>>");
		kor = sc.nextInt();
		System.out.print("영어>>");
		eng = sc.nextInt();
		System.out.print("수학>>");
		math = sc.nextInt();
	}


	public void print() {
		int total = kor + eng + math;
		float avg = total/3.0f;
		System.out.println("성적을 출력합니다");
		System.out.printf("kor :%d\n",kor);
		System.out.printf("eng :%d\n",eng);
		System.out.printf("math :%d\n",math);
		System.out.printf("total :%d\n",total);
		System.out.printf("avg :%d\n",avg);

	}

}
