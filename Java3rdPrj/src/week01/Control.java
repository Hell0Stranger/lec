package week01;
import java.util.Scanner;

public class Control {

	public static void main(String[] args)  {
		
		
		int kor1, kor2, kor3;
		int total;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("┌────────────────────────┐");
		System.out.println("│     성적입력 \\^ㅇ^/       │");
		System.out.println("└────────────────────────┘");
		
		while(true) {
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
		}
	
	}

}
