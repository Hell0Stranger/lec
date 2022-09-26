package com.lec.week5_6;

import pac.Exam;

//IS A 상속관계
//Sonata is a car /// 자동차 - 범주, 틀 (Framework)
//소나타는 자동차 중 하나
//Sonata has a 바퀴 : 부품
//Sonata has a 본네트 : 부품
//Sonata has a 엔진 : 부품
//부품보다는 틀을 가져다 쓰려는 연습

// A is a B , A가 B중에 하나라는 것 B가 더 큰 것.

//IS A 상속관계
//부모관계 : 자식클래스 extends 부모클래스
//수직관계 : 하위클래스 extends 상위클래스
//확장관계 : 파생클래스 extends 기반클래스
public class YBMExam extends Exam{
	private int com;
	
	
	public YBMExam() {
		super();
		
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	//덮어버리면서 override , 기존의 함수를 가리면서 고쳐쓰기위한함수!
	public int total() {
		//super.getKor
//		return getKor()+getEng()+getMath()+com;
		//return this.total(); -> override된 함수 호출-> 무한루프
		return super.total()+com;
		
	}
	
//// 1번째 방법	
//	private Exam exam; // Has A 상속 ==> 부품으로 사용하는 관계
//	public int getKor() {
//		return exam.getKor();
//	}
}
