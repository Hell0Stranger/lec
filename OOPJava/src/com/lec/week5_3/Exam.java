package com.lec.week5_3;

public class Exam {
	private int kor;
	private int eng;
	private int math;
//	
//	public void init() {
//		
//		kor = 100;
//		eng = 100;
//		math = 100;
//	}
//	
	public Exam(int kor, int eng, int math) {
		this.kor= kor;
		this.eng= eng;
		this.math= math;
		
	}
	
	public Exam() {
		kor = 0;
		eng = 0;
		math = 0;
	}

	public int add() {
		return 0;
	}
	
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public String toString() {
		return "Exam [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}


	public void input() {
		kor = 20;
		eng = 30;
	}




	
}
