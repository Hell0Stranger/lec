package com.lec.test;

public class App{
	public static void main(String args[]) {
	
		String name1, name2, name3, name4, name5, name6, name7,name8,name9,name10,
		name11,name12,name13,name14,name15,name16,name17,name18,name19,name20,name21,
		name22,name23,name24,name25,name26, emptySeat;
		
		String group1_1, group1_2, group1_3, group1_4, group1_5,
		 group2_1, group2_2, group2_3, group2_4, group2_5, group2_6,
		 group3_1, group3_2, group3_3, group3_4, group3_5,
		 group4_1, group4_2, group4_3, group4_4, group4_5,
		 group5_1, group5_2, group5_3, group5_4, group5_5;
		
		
		name1 = "황보샘";
		name2 = "박철준";
		name3 = "허진욱";
		name4 = "윤가람";
		name5 = "노민철";
		name6 = "황지숙";
		name7 = "최민규";
		name8 = "양석희";
		name9 = "이은샘";
		name10 = "제갈상";
		name11 = "박경완";
		name12 = "강미정";
		name13 = "이유리";
		name14 = "임요환";
		name15 = "김지성";
		name16 = "이민준";
		name17 = "박하은";
		name18 = "문여진";
		name19 = "표지은";
		name20 = "송민정";
		name21 = "장민욱";
		name22 = "신가영";
		name23 = "설유리";
		name24 = " 김숙 ";
		name25 = "문소리";
		name26 = "심경택";
		emptySeat = "   X  ";
		
		group1_1 = name1; group1_2 = name2; group1_3 = name3; group1_4 = name9; group1_5 = name8;
		group2_1 = name7; group2_2 = name12; group2_3 = name13; group2_4 = name14; group2_5 = name18; group2_6 = name19;
		group3_1 = name20; group3_2 = name23; group3_3 = name24; group3_4 = name25; group3_5 = name26; 
		group4_1 = name4; group4_2 = name5; group4_3 = name6; group4_4 = name10; group4_5 = name11; 
		group5_1 = name15; group5_2 = name16; group5_3 = name17; group5_4 = name21; group5_5 = name22; 

		
/*		
		실행 시 두 개의 섹션으로 나뉨
		첫번째 섹션에서는 각 조별 인원들을 출력
		두번째 섹션에서는 강의실 자리 배치를 출력
*/		
		
		
/*
 * 		첫번째와 두번째 섹션에서 출력되는 셀의 크기를 결정
 * 		┌─────────────────┐		
 * 		│      (이름)	  │
 * 		├─────────────────┤
 * 		└─────────────────┘
 */		
		
		String upperBound =      new String("┌─────────────────┐");
		String middleLeftBound = new String("│    ");
		String middleRightBound = new String("     │");
		String middleCrossBound = new String("├─────────────────┤");
		String lowerBound =      new String("└─────────────────┘");
		

//		두번째 섹션에서, 같은 줄에 있는 자리들의 간격		
		String seatSpace = new String(" ");
		
		
//		첫번째 섹션에서, 각 조별 인원들을 출력하는 왼쪽 간격
		String section1_leftSpace = new String("               ");

		
//      두번째 섹션에서, 강의실 전체 자리 배치를 출력하는 왼쪽 간격
		String section2_leftSpace = new String("     ");

		
		
		
		System.out.println();
		System.out.println("┌─┐───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┌─┐");
		System.out.println("│─┼───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┼─│");
		System.out.println("│ │                                                                                                                                               │ │");
		System.out.println("│ │                                  * 자리배치 (자바개발자 - C / 오전 09:30 ~ / 한국ICT인재개발원 - B1 4강의실) *                                │ │");
		System.out.println("│ │                                                                                                                                               │ │");
		System.out.println("│─┼───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┼─│");
		System.out.println("└─┘───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────└─┘");
		System.out.println();

		System.out.println("------------------------------------------------------------- 변경된 조는 다음과 같습니다 ----------------------------------------------------------");
		System.out.println();

		

		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", upperBound, seatSpace, section1_leftSpace);
		System.out.printf("%9$s %1$s %4$s%2$s %3$s %1$s %5$s%2$s %3$s %1$s %6$s%2$s %3$s %1$s %7$s%2$s %3$s %1$s %8$s%2$s %3$s\n", 
				middleLeftBound, middleRightBound,seatSpace, "- 1조 -", "- 2조 -", "- 3조 -", "- 4조 -", "- 5조 -", section1_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace, section1_leftSpace);
		System.out.printf("%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n", 
				middleLeftBound, middleRightBound,seatSpace, group1_1, group2_1, group3_1, group4_1, group5_1, section1_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace, section1_leftSpace);
		System.out.printf("%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n", 
				middleLeftBound, middleRightBound,seatSpace, group1_2, group2_2, group3_2, group4_2, group5_2, section1_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace, section1_leftSpace);
		System.out.printf("%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n", 
				middleLeftBound, middleRightBound,seatSpace, group1_3, group2_3, group3_3, group4_3, group5_3, section1_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace, section1_leftSpace);
		System.out.printf("%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n", 
				middleLeftBound, middleRightBound,seatSpace, group1_4, group2_4, group3_4, group4_4, group5_4, section1_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace, section1_leftSpace);
		System.out.printf("%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n", 
				middleLeftBound, middleRightBound,seatSpace, group1_5, group2_5, group3_5, group4_5, group5_5, section1_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", middleCrossBound, seatSpace, section1_leftSpace);
		System.out.printf("%9$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s\n", 
				middleLeftBound, middleRightBound,seatSpace, emptySeat, group2_6, emptySeat, emptySeat, emptySeat, section1_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s %2$s %1$s\n", lowerBound, seatSpace, section1_leftSpace);
		
		

		
		System.out.println();
		System.out.println();

		
		System.out.println("---------------------------------------------------------- 변경 후 좌석 배치는 다음과 같습니다 -----------------------------------------------------");

		
		
		System.out.println();
		System.out.println();

		
		System.out.printf("%s │                    │                               │                                                   │           │                │ \n", section2_leftSpace);
		System.out.printf("%s │      출입문        │                               │                   스크린                          │           │      교탁      │ \n", section2_leftSpace);
		System.out.printf("%s │                    │                               │                                                   │           │                │ \n", section2_leftSpace);
		
		System.out.println();
		System.out.println();


		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", upperBound, seatSpace, section2_leftSpace);
		System.out.printf("%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n", 
				middleLeftBound, middleRightBound,seatSpace, group1_1, group1_2, group1_3, group4_1, group4_2, group4_3, section2_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", lowerBound, seatSpace, section2_leftSpace);

		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", upperBound, seatSpace, section2_leftSpace);
		System.out.printf("%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n", 
				middleLeftBound, middleRightBound,seatSpace, group2_1, group1_5, group1_4, group4_4, group4_5, emptySeat, section2_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", lowerBound, seatSpace, section2_leftSpace);
		
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", upperBound, seatSpace, section2_leftSpace);
		System.out.printf("%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n", 
				middleLeftBound, middleRightBound,seatSpace, group2_2, group2_3, group2_4, group5_1, group5_2, group5_3, section2_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", lowerBound, seatSpace, section2_leftSpace);
		
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", upperBound, seatSpace, section2_leftSpace);
		System.out.printf("%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n", 
				middleLeftBound, middleRightBound,seatSpace, group2_5, group2_6, group3_1, group5_4, group5_5, emptySeat, section2_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", lowerBound, seatSpace, section2_leftSpace);
		
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", upperBound, seatSpace, section2_leftSpace);
		System.out.printf("%10$s %1$s %4$s %2$s %3$s %1$s %5$s %2$s %3$s %1$s %6$s %2$s %3$s %3$s %3$s %3$s %1$s %7$s %2$s %3$s %1$s %8$s %2$s %3$s %1$s %9$s %2$s \n", 
				middleLeftBound, middleRightBound,seatSpace, group3_2, group3_3, group3_4, group3_5, emptySeat, emptySeat, section2_leftSpace);
		System.out.printf("%3$s %1$s %2$s %1$s %2$s %1$s %2$s %2$s %2$s %2$s %1$s %2$s %1$s %2$s %1$s \n", lowerBound, seatSpace, section2_leftSpace);

		
	}
		
	}
		