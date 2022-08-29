
public class App0829 {

	public static void main (String [] args) {
		System.out.write(3); // binary 출력, 깨져서 출력됨(text viewr로 보았기때문). binary viewer로 보면 정상출력.
		//
		System.out.write('3'); // 문자 3 출력 (코드값)
		System.out.write('3'+1); // 4가 출력된다. (코드값이 52, 코드를 디코딩해서 보여줌 ,문자 viewer)
		//
		System.out.flush(); // buffer를 다모으기 전에 buffer를 비워주는 역할, 원하는 시점에 출력 가능.
		System.out.print(3.45); // 문자열 출력
		System.out.println(); // 문자열 출력
		
		
		int kor1, kor2, kor3 ;
		int total;
		float avg;
		
		kor1  = 50;
		kor2 = 70;
		kor3 = 95;
		
		total = kor1+kor2+kor3;
		avg = total/3.0f; // 정수와 정수의 연산 = 결과 정수 -> 3.0f 로나누면 total이 float 값으로 변한다
		//avg = (float)total/3; 직접 형변환도 OK
		
		System.out.println("┌────────────────────────┐");
		System.out.println("│     성적출력 \\^ㅇ^/   │");
		System.out.println("└────────────────────────┘");
		//System.out.println("국어 1 : "+ kor1); 도 가능은하지만 문자열 오버로드연산은 속도가 느리다.
		System.out.printf("국어 2 :%d\n",kor2);
		System.out.printf("국어 3 :%d\n",kor3);
		System.out.printf("총점 : %d\n",total);
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println('A'+0);
		System.out.println('1'+2); // 65-48
		//System.out.printf("%5.2f\n", 100.00); // minimum 5자리를 준비하겠음, 6자리여도 값 그대로 출력
	
	String greeting = new String("Hello");
    // greeting은 객체의 name , type명과 함께 선언해주어야한다.
     //기본 자료형이 아닌것들은 변수가 아니다. 	
	// 도구 file, string (도구화) 되어있는 것들의 이름은 변수가 아니라 참조
	// 변수 = 공간 vs. 참조 ≠ 공간
	// ex) ict 빌딩 (빌딩의 건물명은 공간이 아님.) 이름자체는 공간이아님
	}
	
	
}
