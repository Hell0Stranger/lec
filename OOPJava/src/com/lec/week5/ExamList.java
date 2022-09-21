package com.lec.week5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;



public class ExamList {
	Exam[] exams;
	int current;

	static void printList(ExamList list) {
		printList(list, list.current);
	}
	static void printList(ExamList list, int size) {
		

		System.out.print("┌─────────────────────────────┐\n");
		System.out.print("│            성적 출력           │\n");
		System.out.print("└─────────────────────────────┘\n");
		Exam[] exams = list.exams;

		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math; 
			int total = kor+eng+math;
			float avg = total/3.0f;
			System.out.printf("kor : %d\n", exam.kor);
			System.out.printf("eng : %d\n", exam.eng);
			System.out.printf("math : %d\n", exam.math);
			System.out.printf("total : %d\n", total);
			System.out.printf("avg : %f\n", avg);
		}

	}

	
	static void inputList(ExamList list) { // 매개 x 리턴 O
		Scanner scan = new Scanner(System.in);
		
		System.out.print("┌─────────────────────────────┐\n");
		System.out.print("│            성적 입력           │\n");
		System.out.print("└─────────────────────────────┘\n");
		
		int kor, eng, math;
		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();
			
			if (kor < 0 || kor > 100)
				System.out.println("성적은 (0~100) 범위를 벗어날 수 없습니다.");
			
		} while (kor < 0 || kor > 100);
		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();
			
			if (eng < 0 || eng > 100)
				System.out.println("성적은 (0~100) 범위를 벗어날 수 없습니다.");
			
		} while (eng < 0 || eng > 100);
		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();
			
			if (math < 0 || math > 100)
				System.out.println("성적은 (0~100) 범위를 벗어날 수 없습니다.");
			
		} while (math < 0 || math > 100);
		
		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		Exam[] exams = list.exams;
		int size = list.current;
		
		if(exams.length == size){
			Exam[] temp = new Exam[size+5];
			for(int i =0; i<size; i++) 
				temp[i] = exams[i];
				
					list.exams = temp;
		}
		
		list.exams[list.current] = exam;
		list.current++;
		
	}
	
	
	public static void init(ExamList list) {
		list.exams = new Exam[3];
		list.current = 0;
		
	}

	
	
	
	
	
//	static void saveExam(ExamList ex) throws IOException {
//		FileOutputStream fos = new FileOutputStream("res/data.csv");
//		PrintStream fout = new PrintStream(fos);
//
//		fout.println("kor,eng,math");
//		fout.printf("%d,%d,%d\n", ex.kor, ex.eng, ex.math);
//
//		fout.close();
//		fos.close();
//	}
//
//	static void readExam(ExamList ex) throws IOException {
//		FileInputStream fis = new FileInputStream("res/data.csv");
//		Scanner fscan = new Scanner(fis);
//
//		String titles = fscan.nextLine(); // 필드명 행 건너뛰기
//		String[] nums = fscan.nextLine().split(",");
//		ex.kor = Integer.parseInt(nums[0]);
//		ex.eng = Integer.parseInt(nums[1]);
//		ex.math = Integer.parseInt(nums[2]);
//
//		fscan.close();
//		fis.close();
//
//	
//	}
	
}
