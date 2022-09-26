package com.lec.week5_5;

public class App {

	public static void main(String[] args) {
		
		Exam exam1 = new Exam(10,10,10);
		Exam exam2 = new Exam(20,20,20);
		ExamPage page = new ExamPage();
		
//		page - 입출력 기능만하게하고 , 데이터는 외부에 있다가 그것을
//		입력하거나 출력할 때, page의 데이터를 바꿔낄 수 있게 만들고 싶다.
//		==>  객체를 스스로 생성하는 것이 아니라 만들어서 끼워주는 작업만
//		     즉, ExamPage에서 exam = new Exam(); 하는 것이 아니라
//			 다른곳에서 생성된 객체를 넘겨 받아서 사용하려고 함
		
//		객체를 바꿔끼게되면, 동일한 이름이지만 각각 다른 객체를 넘겨받아
//		다른 결과값을 볼 수 있다.
		
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

