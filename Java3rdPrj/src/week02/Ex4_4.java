package week02;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요. (예: 12345)>");
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.nextLine();
		num = Integer.parseInt(tmp);
		
		System.out.println(num);
		
		while(num!=0)
		{
			sum += num%10;
			System.out.printf("sum=%3d num%d%n",sum,num);
			num/= 10;
		}

	}
}
