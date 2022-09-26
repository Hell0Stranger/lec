package com.lec.week5_4;

public class App {
	public static void main(String[] args) {
		//private BoardConsole console
		// App() {
		// BoardConsole console = new BoardConsole();
		// } 이 경우에는 has 상속이 맞지만
		//특정한 함수가 다른클래스객체를 내부적으로
		//사용한다고해서 상속관계라고 보진 않는다
		//App을 구성하는 요소로서 다른 클래스의 인자가 들어와야함
		BoardConsole console = new BoardConsole();
		
		while(true) {
		console.inputOmok();
		console.print();//board의 모양을 화면에 그대로 출력하겠다
		console.test();
		console.print();
		}
	}
}
