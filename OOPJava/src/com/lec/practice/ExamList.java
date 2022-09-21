package com.lec.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;

	public void input() {
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

		Exam[] exams = this.exams;
		int size = current;

		if (exams.length == size) {
			Exam[] temp = new Exam[size + 5];
			for (int i = 0; i < size; i++)
				temp[i] = exams[i];

			exams = temp;
		}

		exams[current] = exam;
		current++;

	}

	public void print() {
		this.print(this.current);
	}

	public void print(int size) {

		System.out.print("┌─────────────────────────────┐\n");
		System.out.print("│            성적 출력           │\n");
		System.out.print("└─────────────────────────────┘\n");
		Exam[] exams = this.exams;

		for (int i = 0; i < size; i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			int total = kor + eng + math;
			float avg = total / 3.0f;
			System.out.printf("kor : %d\n", exam.kor);
			System.out.printf("eng : %d\n", exam.eng);
			System.out.printf("math : %d\n", exam.math);
			System.out.printf("total : %d\n", total);
			System.out.printf("avg : %f\n", avg);
		}

	}

	public void init() {
		exams = new Exam[3];
		current = 0;

	}

}
