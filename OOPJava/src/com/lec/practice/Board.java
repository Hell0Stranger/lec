package com.lec.practice;

public class Board {

	
	int width;
	int height;
	char[][] buf;

	public void init() {
	//OK. Board라는 클래스내에서 
	//속성의 값들을 직접 초기화해야한다는 것까진 이해했음
	//이부분에서 그럼 2가지 문제를 만나게 됨
	//board.width = 20; 으로 하면되는건가? 
	//NO. "board"라는 이름을 사용할 수 없음
	//그 이유는 board 객체는 외부에서 생성 되었기때문이고
	//메인메서드 내부에서만 사용하는 지역변수이기때문에
	//내가 board를 초기화하기위해선 위의 속성을 초기화 하는 것인데	
	//위의 속성을 직접사용하는 것이 아니라
	//Board 클래스내에 정의된 속성들은 전역변수가 아님 
	//Board 를통해 생성된 객체를 통해서 -> 객체를 넘겨받아서 사용하게 되는 것
	//Board 를 만들게 될때 width height buf 라는 구조를 가지게해라 라고 정의만된 것
	//실제로 Board board = new Board(); 라는 연산을 할 때, 비로소 사용가능해짐
	//그렇다면 board라는 객체를 넘겨받을 수 있나요 ? 넵
	//board.init(); 에서는 board가 매개값으로 전달되고있는것~~
	//객체= 실체 = 인스턴스(instance)
	//넘겨받은 board를 사용할 수 있게하는 예약변수가 존재
	//"this" 라는 keyword
		this.width = 20;
		this.height = 20;
		this.buf = new char[this.height][this.width];
	//***this는 묵시적으로 생략이가능*****	
	//static 키워드가 제거된다면 반드시 this를 넘겨받는 함수여야함
	//static은 this를 넘겨받지 않는 함수
	//위 함수는 인스턴스를 통해서만 호출되는 함수 = 메서드 , 인스턴스 메서드, 서비스 함수
	//static = 스태틱 메서드 -> 다른언어에서는 단지 "function"
	//static - 그냥 울타리 내에 있는 함수를 호출하는 기능
	//호출할때 그 울타리가 어디있는지 알려주어야함 (class가 다르다면)
	//Board.printa();
	} 
	public void print() {
		
	}
	

	public void put(Omok omok) {
		
	}

//	static void printa() {
//		
//	}

}














// board 객체명
//Board 클래스 명
// 위의 세 가지 속성은 건물을 짓기위한 청사진 일뿐
// 
//this.width = 20;
//this.height = 20;
//this.buf = new char[this.height][this.width];
//
////this는 묵시적으로 생략이 가능
//	board.width = 20; //구조체가 아니라 board는 행위를 가진 구성요소
//	board.height = 20;// 행위를 노출 해도되지만 속성을 노출하면 안됨
//  board.buf = new char[board.height][board.width];	