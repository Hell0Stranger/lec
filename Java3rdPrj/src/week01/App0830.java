package week01;
import java.io.IOException;
import java.util.Scanner;

public class App0830 {

	public static void main(String[] args) throws IOException {
		
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		//Scanner는 java에서 만든 utility, 이름확장, 식별을 위해, 패키지명
		//System.in -= 객체 , Scanner = (종류명) 종류명 앞에 붙은것은 패키지
		Scanner sc = new Scanner(System.in);
		//next = string 50을 5,0 으로 담는다 
		//label을 먼저 띄워줘야함
		System.out.println("┌────────────────────────┐");
		System.out.println("│     성적입력 \\^ㅇ^/       │");
		System.out.println("└────────────────────────┘");
		System.out.print("kor1: ");
		kor1 = sc.nextInt();
		System.out.print("kor2: ");
		kor2 = sc.nextInt();
		System.out.print("kor3: ");
		kor3 = sc.nextInt();

		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;

		System.out.println("┌────────────────────────┐");
		System.out.println("│     성적출력 \\^ㅇ^/       │");
		System.out.println("└────────────────────────┘");
		System.out.printf("국어 1 :%d\n", kor1);
		System.out.printf("국어 2 :%d\n", kor2);
		System.out.printf("국어 3 :%d\n", kor3);
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.2f\n", avg);

		{
			// 50을 입력하면
			int code = System.in.read();
			// 53 , read()는 한글자씩 받아옴. '5' 한글자만 읽음, 숫자키워드를 눌러서 입력했지만
			// 실제로 버퍼에는 5에 해당하는 키코드가 들어감 5에해당하는 코드값 = 53(인코딩), println이므로 문자열 출력
			System.out.println(code);
			// 5 , 53에 해당하는 코드값 (디코딩)문자 5 출력
			System.out.write(code);
			System.out.flush();
		}

	}

}
