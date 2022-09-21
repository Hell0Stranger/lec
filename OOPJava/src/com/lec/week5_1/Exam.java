package com.lec.week5_1;

//데이터와 함수를 묶는 단위가 생겼다 : 캡슐 -> 프로그램의 구성이 되는 가장 중요한 단위
//완전한 모듈로 탄생!

public class Exam {
	
	private int kor;
	private int eng;
	private int math;

	//인스턴스를 이용하기는 하는데요 ? -> 이렇게 구분하지말고
	// 스태틱함수(메서드) -- JAVA가 아닌 다른언어에서는 단지 function
//	public static void input(Exam exam) {
//		exam.kor = 10;
//	}

	
	//인스턴스를 이용하는 함수, 
	//exam이 주체가 되고, exam을 통해서 사용하는 거 같다
	//인스턴스함수 O : 인스턴스 메소드, 서비스함수
	//인스턴스를 통해서 . 인스턴스를 이용하는 기능이다 exam이 제공하는 기능이다
	public void input() {
		// this.kor = 20; this 생략가능
		kor = 20;
	}

}
