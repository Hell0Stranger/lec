package com.lec.ch4.arr;

public class StringTestApp {

	public static void main(String[] args) {
		
		//1. 문자열의 형식변환
		int x =30;
		//정수를 문자열로 변환
		String x_ = String.valueOf(x);
		//문자열을 정수로 변환
		x = Integer.parseInt(x_);
		
		System.out.println(x_.getClass().getSimpleName()); //String
		
		
		//2. 문자열 비교
		String name1 = "아이유";
		String name2 = new String("아이유"); 
		
//		 String name2 = "아이유" 로하면  name1 == name2 이유 ?
//		 같은 객체를 참조하고 있다는 것. 
//		 두번의 문자열을 사용해도 객체는 하나만 존재하게 된다.. ?
//		 new 연산자가 객체를 만든 것. ( new가 실행될때)
//		 new가 사용되지 않는 문자열은 전역객체라는 의미 (상수형객체)
//		 프로그램이 시작되자 마자 올라가있는 객체
//		 같은 문자열이 두 번 발견되면 다시 만들지 않고 한번 만들어진 
//		 전역객체를 끌어서 사용함. (미리 생성됨.)
		
		System.out.println(name1 == name2); //객체비교 (false)
		System.out.println(name1.equals(name2));//값 비교 (true)
		
		//3. 문자열 변환
		String fileName = "/menu/photo.jpg";
		//문자열은 객체 -> 객체를 사용해서 할 수 있는 일이 많다
		int index1 =fileName.indexOf('/',1); //범위를 주어서 검색이 가능함
		int index2 =fileName.indexOf('.');
	
		System.out.printf("index :%d\n",index1);
		System.out.printf("index :%d\n",index2);
		
		//원하는 문자열만 출력하려면 substring() 로 범위를 준다.
		//substringdms 앞의 것은 포함 마지막것은 포함 x
		//index1, index2 를 그대로 넣으면 /photo가 출력된다는것
		//'photo'만 출력하고 싶다면 ?
		
		String sub =fileName.substring(index1+1, index2); // photo
		String sub2 =fileName.substring(index2+1); //jpg
		System.out.println(sub);
		System.out.println(sub2);
		
		//replace()
		
	}

}
