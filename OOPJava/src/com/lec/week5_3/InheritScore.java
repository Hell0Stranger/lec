package com.lec.week5_3;

public class InheritScore {

	public static void main(String[] args) {
		
		Exam exam = new Exam();
		Exam exam1 = new Exam();
		
		ExamPage page = new ExamPage();
		
		System.out.println(exam.toString());
		System.out.println(exam1.toString());
	}

}
//exam 객체 생성 -> kor, eng, math 0으로 초기화
//다른 값(-100)으로  초기화 하고 싶다면?

//		exam.init(); // 100이 출력이 되긴하지만
//100이라는 값을 가지고 태어나는 것은 아님(초기화x)

//**그렇다면, 정확한 초기화의 조건은 어떻게 되는가? **
//1. 태어나면서 가지고 있도록 해야함
//2. 초기 값은 태어날 때만 할당할 수 있어야함.
//위에서 init()을 시키고 exam.init(); 다시 호출 -> 리셋일뿐


////Exam exam = new Exam()
////page.setExam(exam); -결합형
//ExamPage page = new ExamPage();
//page.input();
//page.print();
