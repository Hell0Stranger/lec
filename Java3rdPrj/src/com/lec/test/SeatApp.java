package com.lec.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SeatApp {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int pnum = 0; //pnum = 학생수
		int max = 1; // 메뉴 2. 자동입력 부분에서 배열의 크기를 늘리기위함
		boolean auto = false;
		String[] studentsArr = new String[1];// 학생을 담을 변수 studentsArr 선언
		
		String[] group1 = new String[1]; // 1조 구성원을 담을 배열 group1
		String[] group2 = new String[1];
		String[] group3 = new String[1];
		String[] group4 = new String[1];
		String[] group5 = new String[1];
		String[] s1 = new String[max];

		EXIT: while (true) {

			System.out.println("┌────────────────────────┐");
			System.out.println("│    자리배치 ₍ᐢ- ̫-ᐢ₎‧˚   │");
			System.out.println("└────────────────────────┘");
			System.out.println("\t 1. 학생 입력");
			System.out.println("\t 2. 자동 입력");
			System.out.println("\t 3. 자리 섞기");
			System.out.println("\t 4. 엑셀 출력");
			System.out.println("\t 5. 콘솔 출력");
			System.out.println("\t 6. 종료 하기");
			System.out.print("\t ₍ᐢᐢ₎·°선택:");
			int menu = sc.nextInt();
			switch (menu) {

//================================================1. 학생입력=======================================================					
			case 1: {
				System.out.print("학생 수를 입력하세요>>");
				pnum = sc.nextInt(); // pnum = people num, 학생수
				studentsArr = new String[pnum];

				for (int i = 0; i < pnum; i++) {
					System.out.print((i + 1) + "번째학생이름>>\n");
					String name = sc.next();
					studentsArr[i] = name;
				}
			}
				break;
//================================================2. 자동입력===========================================================				
			case 2: {
				FileInputStream fis = new FileInputStream("res/list.csv");
				Scanner fscan = new Scanner(fis);

				
				System.out.println(fscan.nextLine());

				int index = 0;
				while (fscan.hasNext()) {
					if (index >= max) {
						String[] s2 = new String[max + 1];
						for (int i = 0; i < index; i++) {
							s2[i] = s1[i];
						}

						s1 = s2;
						max = max + 1;
					} // end of if

					s1[index] = fscan.nextLine();
					index++;
				auto = true;
				} // end of while

				System.out.println(Arrays.toString(s1));
				
				



			}
				break;

//================================================3. 자리섞기===========================================================				
			case 3: {
				System.out.println("자동입력했나요?"+auto);
				
				if(auto==true) {
					studentsArr = s1;
					pnum=studentsArr.length;
				}
				
				String[] randomArr = new String[pnum];
				Random rand = new Random();

				for (int i = 0; i < randomArr.length; i++) {
					randomArr[i] = Integer.toString(rand.nextInt(pnum) + 1);
					// 2.중복 처리
					for (int j = 0; j < i; j++) {
						if (randomArr[i].equals(randomArr[j])) {
							// 중복이있으면 i번째로 다시 돌아가야하므로 증가시키지 않고 i--
							i--;
						}
					}
				}

				String[][] Arr = new String[pnum][2];

				for (int i = 0; i < pnum; i++) {
					Arr[i][0] = studentsArr[i];
					Arr[i][1] = randomArr[i];
				}


				for (int j = 0; j < Arr.length - 1; j++) {
					for (int i = 0; i < Arr.length - 1 - j; i++) {
						if (Integer.parseInt(Arr[i][1]) > Integer.parseInt(Arr[i + 1][1])) {
							String tmp1;
							String tmp2;
							tmp1 = Arr[i][1];
							Arr[i][1] = Arr[i + 1][1];
							Arr[i + 1][1] = tmp1;

							tmp2 = Arr[i][0];
							Arr[i][0] = Arr[i + 1][0];
							Arr[i + 1][0] = tmp2;
						}
					}

				}
				System.out.println("1조,4조,5조는 6명");
				System.out.println("2조,3조는 4명으로 고정됩니다.");
				System.out.println("1조 인원을 입력하세요 (4,6 중 하나만)");
				int gnum1 = sc.nextInt();
				group1 = new String[gnum1];

				int count = 0;
				for (int i = 0; i < gnum1; i++) { // ex numOne 6 i는 0 1 2 3 4 5 (인덱스)
					group1[i] = Arr[count][0];
					count++;
					System.out.println(Arrays.toString(group1));
				}

				System.out.println("2조 인원을 입력하세요 (4,6 중 하나만)");

				int gnum2 = sc.nextInt();
				group2 = new String[gnum2];

				for (int i = 0; i < gnum2; i++) {
					group2[i] = Arr[count][0];
					count++;
				}
				System.out.println(Arrays.toString(group2));

				System.out.println("3조 인원을 입력하세요 (4,6 중 하나만)");
				int gnum3 = sc.nextInt();
				group3 = new String[gnum3];

				for (int i = 0; i < gnum3; i++) {
					group3[i] = Arr[count][0];
					count++;

				}
				System.out.println(Arrays.toString(group3));

				System.out.println("4조 인원을 입력하세요 (4,6 중 하나만)");
				int gnum4 = sc.nextInt();
				group4 = new String[gnum4];

				for (int i = 0; i < gnum4; i++) {
					group4[i] = Arr[count][0];
					count++;

				}
				System.out.println(Arrays.toString(group4));

				System.out.println("5조 인원을 입력하세요 (4,6 중 하나만)");

				int gnum5 = sc.nextInt();
				group5 = new String[gnum5];
				for (int i = 0; i < gnum5; i++) {
					group5[i] = Arr[count][0];
					count++;
				}
				System.out.println(Arrays.toString(group5));

			}
				break;

//================================================4. 엑셀출력===========================================================	
			case 4: {

				FileOutputStream fos = new FileOutputStream("res/seat.csv");
				PrintStream ps = new PrintStream(fos);

				ps.print("1조: ");
				for (int i = 0; i < group1.length; i++) {
					ps.print(group1[i]);
					ps.print(" ");
				}
				ps.println();
				ps.print("2조: ");
				for (int i = 0; i < group2.length; i++) {
					ps.print(group2[i]);
					ps.print(" ");
				}
				ps.println();
				ps.print("3조: ");
				for (int i = 0; i < group3.length; i++) {
					ps.print(group3[i]);
					ps.print(" ");
				}
				ps.println();
				ps.print("4조: ");
				for (int i = 0; i < group4.length; i++) {
					ps.print(group4[i]);
					ps.print(" ");
				}
				ps.println();
				ps.print("5조: ");
				for (int i = 0; i < group5.length; i++) {

					ps.print(group5[i]);
					ps.print(" ");
				}
				ps.println();

				System.out.println("엑셀파일저장");

				fos.close();
				ps.close();
			}
				break;

//================================================5. 콘솔출력===========================================================				
			case 5: {

				String emptySeat = "   X  ";
				String upperBound = new String("┌─────────────────┐");
				String middleLeftBound = new String("│    ");
				String middleRightBound = new String("     │");
				String middleCrossBound = new String("├─────────────────┤");
				String lowerBound = new String("└─────────────────┘");

//									두번째 섹션에서, 같은 줄에 있는 자리들의 간격		
				String seatSpace = new String(" ");

//									첫번째 섹션에서, 각 조별 인원들을 출력하는 왼쪽 간격
				String section1_leftSpace = new String("               ");

//							      두번째 섹션에서, 강의실 전체 자리 배치를 출력하는 왼쪽 간격
				String section2_leftSpace = new String("     ");

				System.out.println();
				System.out.println(
						"┌─┐───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┌─┐");
				System.out.println(
						"│─┼───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┼─│");
				System.out.println(
						"│ │                                                                                                                                               │ │");
				System.out.println(
						"│ │                                  * 자리배치 (자바개발자 - C / 오전 09:30 ~ / 한국ICT인재개발원 - B1 4강의실) *                                │ │");
				System.out.println(
						"│ │                                                                                                                                               │ │");
				System.out.println(
						"│─┼───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┼─│");
				System.out.println(
						"└─┘───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────└─┘");
				System.out.println();

				System.out.println(
						"------------------------------------------------------------- 변경된 조는 다음과 같습니다 ----------------------------------------------------------");
				System.out.println();

				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", upperBound, seatSpace,
						section1_leftSpace);
				System.out.printf(
						"%9$s %1$s %4$s%2$s %3$s %1$s %5$s%2$s %3$s %1$s %6$s%2$s %3$s %1$s %7$s%2$s %3$s %1$s %8$s%2$s %3$s\n",
						middleLeftBound, middleRightBound, seatSpace, "- 1조 -", "- 2조 -", "- 3조 -", "- 4조 -", "- 5조 -",
						section1_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace,
						section1_leftSpace);
				System.out.printf(
						"%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n",
						middleLeftBound, middleRightBound, seatSpace, group1[0], group2[0], group3[0], group4[0],
						group5[0], section1_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace,
						section1_leftSpace);
				System.out.printf(
						"%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n",
						middleLeftBound, middleRightBound, seatSpace, group1[1], group2[1], group3[1], group4[1],
						group5[1], section1_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace,
						section1_leftSpace);
				System.out.printf(
						"%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n",
						middleLeftBound, middleRightBound, seatSpace, group1[2], group2[2], group3[2], group4[2],
						group5[2], section1_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace,
						section1_leftSpace);
				System.out.printf(
						"%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n",
						middleLeftBound, middleRightBound, seatSpace, group1[3], group2[3], group3[3], group4[3],
						group5[3], section1_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace,
						section1_leftSpace);
				System.out.printf(
						"%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n",
						middleLeftBound, middleRightBound, seatSpace, group1[4], emptySeat, emptySeat, group4[4],
						group5[4], section1_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace,
						section1_leftSpace);
				System.out.printf(
						"%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n",
						middleLeftBound, middleRightBound, seatSpace, group1[5], emptySeat, emptySeat, group4[5],
						group5[5], section1_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", lowerBound, seatSpace,
						section1_leftSpace);

				System.out.println();
				System.out.println();

				System.out.println(
						"---------------------------------------------------------- 변경 후 좌석 배치는 다음과 같습니다 -----------------------------------------------------");

				System.out.println();
				System.out.println();

				System.out.printf(
						"%s │                    │                               │                                                   │           │                │ \n",
						section2_leftSpace);
				System.out.printf(
						"%s │      출입문        │                               │                   스크린                          │           │      교탁      │ \n",
						section2_leftSpace);
				System.out.printf(
						"%s │                    │                               │                                                   │           │                │ \n",
						section2_leftSpace);

				System.out.println();
				System.out.println();

				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						upperBound, seatSpace, section2_leftSpace);
				System.out.printf(
						"%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n",
						middleLeftBound, middleRightBound, seatSpace, group1[0], group1[1], group1[2], group4[0],
						group4[1], group4[2], section2_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						lowerBound, seatSpace, section2_leftSpace);

				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						upperBound, seatSpace, section2_leftSpace);
				System.out.printf(
						"%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n",
						middleLeftBound, middleRightBound, seatSpace, group1[3], group1[4], group1[5], group4[3],
						group4[4], group4[5], section2_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						lowerBound, seatSpace, section2_leftSpace);

				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						upperBound, seatSpace, section2_leftSpace);
				System.out.printf(
						"%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n",
						middleLeftBound, middleRightBound, seatSpace, group2[0], group2[1], group2[2], group5[0],
						group5[1], group5[2], section2_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						lowerBound, seatSpace, section2_leftSpace);

				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						upperBound, seatSpace, section2_leftSpace);
				System.out.printf(
						"%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n",
						middleLeftBound, middleRightBound, seatSpace, group3[0], group3[1], group2[3], group5[3],
						group5[4], group5[5], section2_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						lowerBound, seatSpace, section2_leftSpace);

				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						upperBound, seatSpace, section2_leftSpace);
				System.out.printf(
						"%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n",
						middleLeftBound, middleRightBound, seatSpace, emptySeat, group3[2], group3[3], "멘토쌤", "멘토쌤",
						emptySeat, section2_leftSpace);
				System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n",
						lowerBound, seatSpace, section2_leftSpace);

			}
				break;
//================================================6. 종료하기==========================================================			

			case 6:
				System.out.println("프로그램 종료");
				break EXIT;

			default:
				System.out.println("1~5사이 값만 입력하세요");
				break;
			} // end of switch
		} // end of while

	}// end of main

} // end of class
