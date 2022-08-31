package week01;
import java.util.Random;

public class Operator {

	public static void main(String[] args) {

		{
			int num;
			Random rand = new Random();
			num = rand.nextInt(45) + 1;
			// rand.nextInt(45) 45개의 범위 , 즉 0~44의 숫자값 생성
			// 1~45의 범위가 나오고싶다면 +1을 해주면 된다.
			System.out.println(num);
			num = rand.nextInt();
			System.out.println(num);
		}
		{
			//랜덤값이 홀수인지
			int num;
			Random rand = new Random();
			num = rand.nextInt(100)+1;
			boolean b = num%2==1;
			System.out.printf("%d : %b\n",num,b);
		}
		{ 
			//랜덤값이 3,6,9,12.. 범위 1~100
			int num;
			Random rand = new Random();
			num = rand.nextInt(100)+1;
			boolean b = num%3==0;
			System.out.printf("%d : %b\n",num,b);
		}
		{
			//랜덤값이 1,4,7,10..범위 1~100
			int num;
			Random rand = new Random();
			num = rand.nextInt(100)+1;
			boolean b = num%3==1;
			System.out.printf("%d : %b\n",num,b);
		}
		{
			//랜덤값이 1,4,7,10..범위 1~100
			int num;
			Random rand = new Random();
			num = rand.nextInt(100)+1;
			
		}
		{
			//삼항연산자 - 짝수, 홀수 판별
			int num;
			Random rand = new Random();
			num = rand.nextInt(100)+1;
			String result = num%2==1? "홀수": "짝수";
			System.out.printf("숫자는 %d \n결과는 %s입니다.",num,result);
		}
	}

}
