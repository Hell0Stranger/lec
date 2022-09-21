package com.lec.week5_1;

public class ScoreApp {

	public static void main(String[] args) {
		
		
		
		// 객체지향 프로그래밍에서는 
		// 1. 구성요소 : 캡슐 ( ~은는이가 or ~을를 or ~에게 .. 등)
		//  '성적' 이라느 ㄴ개체를 객체화 하느 작업이 필요
		// 성적:  Exam 
		// 시험 성적 생성
		Exam exam = new Exam();
		
		//성적을 입력받기
//			Exam.inputexam); // 구조적 프로그래밍
			exam.input(); // 객체지향 프로그래밍
		//성적을 출력하기
		
			
//		 객체 지향의 3요소
//		 1. 캡슐화
//		 	  캡슐: 데이터와 함수를 묶어 놓은 단위
//		    why? 캡슐이 곧 프로그램의 주체가 되고 그 주체가 행위를 가지기 때문이다.
//				   캡슐의 고립화를 위해 : 캡슐은 모듈이라서 캡슐 밖의 변화에 영향을 받지 않도록 해야한다.
//		 2. 상속
//		 3. 다형성
			
	}

}
