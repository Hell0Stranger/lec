package com.lec.week5_6;

import java.awt.Frame;

public class App {

	public static void main(String[] args) {
		//재사용한다 -> 기존 소스코드를 열어서 그대로 복사.. ? 
		//이것은 재사용이라 부를 수 없다.
		//내가 5_3에 있는 exam을 이용해서 -> 새로운 프로그램을 만들려고 한다.
		
		YBMExam exam = new YBMExam();
		//사용입장: 내가 exam을 사용할 것인데
		//내부적으로 다른 exam을 가지고 있는지 모르겠는데
		//일단 반환해줘 exam.getKor();
		
		exam.setKor(20);
		exam.setCom(20);
		exam.setEng(40);
		exam.setMath(50);
		//has A 상속-> 부품이 들어있다보니
		//항상 부품을 통해서 무언가를 요청
		System.out.println(exam.getKor());
		int total = exam.total();
		System.out.println("total is" + total);
		GameFrame win = new GameFrame();
		
		win.setVisible(false);
		win.setSize(500,400);
		
		
	}

}
