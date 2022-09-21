package com.lec.practice;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		ExamList list = new ExamList();
		// 초기값을 대입하고있음 => 초기화 함수를 ExamList 에서 제공하도록하자
		// Exam[] exams1을 사용하는 code가 사라짐 - > error clear
		list.init();
		int menu;
		boolean keepLoop = true;

		while (keepLoop) {

			menu = inputMenu();

			switch (menu) {
			case 1:

				list.input();
				break;
			case 2:
				list.print();
				break;
			case 3:
				System.out.println("Bye");
				keepLoop = false;
				break;
			default:
				System.out.println("1~3 까지 입력");
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

}
