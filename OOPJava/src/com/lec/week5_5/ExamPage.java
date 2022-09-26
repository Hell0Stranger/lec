package com.lec.week5_5;

import java.util.Scanner;

public class ExamPage {
	
	/*
	 * //exam.kor = 10; 이렇게 직접하면 안되는거야? //왜 kor은 private인데.. //getKor(); 이라는 함수를 굳이
	 * 만들어야하나 ? //exam.setKor(10); 만약 이 경우에 값을 증가 시키려면 //exam.kor++; 불가능하니까
	 * //exam.setKor(exam.getKor()+1); //이게 올바른가 .. ?
	 */
	 private Exam exam; // Has 관계	, 구성품, 부품, 캡슐덩어리, Dependency
	 public ExamPage() {
		 // exam = new Exam(); // Has A관계 
		 // 스스로 만들어서 고착화 시키는 방법과 외부에서 만들어서 꽂아주는 방법
		 
		 //14번 라인을 주석처리하면 이름표만 존재 실제 객체 x
		 //null pointer , 객체를 직접 생성하지 않으면.. ?
		 //객체의 기능을 사용을 못하는데 왜 여기서 객체 생성을 안했나 ?
		 //다른 방법이 존재함 --> App파일 참고
	 }
	
	
	 //오버로드 생성자 추가
	 //결합할 때 인자로 전달해서 결합 (생성자 이용)
	public ExamPage(Exam exam) {
		this.exam = exam;
	}



	//외부에서 생성해서 꽂아준 것
	public void setExam(Exam exam) {
		this.exam = exam;//객체 대입
		//ExamPage 내에서 null 이었던것을 대입해주는 작업
	}
	
	public void print() {
		System.out.println("성적 출력 -------");
		System.out.println(exam.getKor());
		System.out.println(exam.getEng());
		System.out.println(exam.getMath());
	}


	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("kor : ");
		int kor = sc.nextInt();
		System.out.print("eng : ");
		int eng = sc.nextInt();
		System.out.print("math : ");
		int math = sc.nextInt();
		//객체를 직접 쓴는 것 보다는 지역변수를 활용하는 것 연습!!
		//set 하는것이 값이 아니라 객체일 경우 -DI
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}


	
	
}
