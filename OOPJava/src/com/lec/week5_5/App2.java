package com.lec.week5_5;

public class App2 {

	public static void main(String[] args) {
		
		Exam exam1 = new Exam(10,10,10);
		Exam exam2 = new Exam(20,20,20);
		// ExamPage page = new ExamPage(); // 방법 1
		 ExamPage page = new ExamPage(Exam exam); // 방법 2, 오버로드 생성자 추가
		


		
		//page가 exam1을 setExam()에 setting 하는 것!
		//말 그대로 ExamPage와 Exam타입의 객체와의 관계인데
		//page가 exam을 이용하기 위해서 "결합"한다
		//부품을 셋팅한다 = 결합
		page.setExam(exam1); //-> exam1 출력 10,10,10 *Injection 주입 = 결합*
		//ExamPage 내에서 null 이었던것을 대입해주는 작업
		page.print();
		page.setExam(exam2); //-> exam2 출력 20,20,20
		page.print();
		
	}

}

