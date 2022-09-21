package com.lec.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class StructArrayApp2 {

	

	public static void main(String[] args) throws IOException {
		
	Exam[] exams = new Exam[3];
	int index = 0;
	
//	exams[index] = new Exam();
//	index++;
//	exams[index] = new Exam();
//	index++;
	
		
	
		EXIT: while (true) {

			int menu = inputMenu();
			switch (menu) {

			case 1:
				inputExam(exams, index);
				break;

			case 2:
				printExams(exams, index);//출력하는 애한테는 전체 다 주기
				break;

			case 3:
//				saveExam(exam);
				break;

			case 4:
//				readExam(exam);
				break;
			case 5:
				System.out.println("Bye~~~");
				break EXIT;

			default:
				System.out.println("메뉴는 1~5번만 선택할 수 있습니다.");
				break;
			}

		}
	}
	
	
	static int inputMenu() {

		System.out.print("┌─────────────────────────────┐\n");
		System.out.print("│            메인 메뉴        │\n");
		System.out.print("└─────────────────────────────┘\n");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적저장");
		System.out.println("4. 성적읽기");
		System.out.println("5. 종료");
		System.out.print(">");
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		return menu;
	}

	static void inputExam(Exam[] exams, int index) { 
		Scanner scan = new Scanner(System.in);
	
		System.out.print("┌─────────────────────────────┐\n");
		System.out.print("│            메인 입력           │\n");
		System.out.print("└─────────────────────────────┘\n");

		String[] titles = { "kor", "eng", "math" };
		int[] nums = new int[3];
		// nums 라는 이름을 가진 배열 생성 (기본형)
		
		for (int i = 0; i < 3; i++) {
			int temp;
			do {
				System.out.printf("%s:", titles[i]);
				temp = scan.nextInt();

				if (temp < 0 || temp > 100)
					System.out.println("성적은 (0~100) 범위를 벗어날 수 없습니다.");

			} while (temp < 0 || temp > 100);

			nums[i] = temp;
		}
		//exams 라는 참조이름을 3개 가지고 옴
		Exam exam = new Exam();
		//실제 객체 생성
		
		exam.kor = nums[0];
		exam.eng = nums[1];
		exam.math = nums[2];
		
		
		exams[index] = exam;
		index++;
	}

	static void printExams(Exam[] exams, int size) {

		System.out.print("┌─────────────────────────────┐\n");
		System.out.print("│            성적 출력        │\n");
		System.out.print("└─────────────────────────────┘\n");
		
			for(int i =0; i<size; i++) {
				//배열도 연산이기 때문에
				//int total = exams.kor + exams[i].eng + exams[i].math;
				//위 라인 과 같은 코드 보다는 아래 kor , eng, math 를 빼주는 것이 좋다.
				int kor = exams[i].kor;
				int eng = exams[i].eng;
				int math = exams[i].math;
				
				int total = kor + eng + math;
				float avg = total / 3.0f;
				//배열을 점진적으로 출력하기위해선 데이터가 몇개인지 알려줘야함 
				//exams.length 사용 -> 참조하지 않는 것 까지 반복하게 됨
				//index라는 변수를 증가시키도록 만들어서 데이터의 갯수 체크
				System.out.printf("kor : %d\n", kor);
				System.out.printf("eng : %d\n", eng);
				System.out.printf("math : %d\n", math);
				System.out.printf("total : %d\n", total);
				System.out.printf("avg : %f\n", avg);
			}
	}

	static void saveExam(Exam exam) throws IOException {
		FileOutputStream fos = new FileOutputStream("res/data.csv");
		PrintStream fout = new PrintStream(fos);

		fout.println("kor,eng,math");
		fout.printf("%d,%d,%d\n", exam.kor, exam.eng, exam.math);

		fout.close();
		fos.close();
	}

	static void readExam(Exam exam) throws IOException {
		FileInputStream fis = new FileInputStream("res/data.csv");
		Scanner fscan = new Scanner(fis);

		String titles = fscan.nextLine(); // 필드명 행 건너뛰기
		String[] nums = fscan.nextLine().split(",");
		exam.kor = Integer.parseInt(nums[0]);
		exam.eng = Integer.parseInt(nums[1]);
		exam.math = Integer.parseInt(nums[2]);

		fscan.close();
		fis.close();

	
	}

}