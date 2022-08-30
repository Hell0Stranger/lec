import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
	
		Random rand = new Random();
		int num1 = rand.nextInt(45)+1;
		int num2 = rand.nextInt(45)+1;
		int num3 = rand.nextInt(45)+1;
		int num4 = rand.nextInt(45)+1;
		int num5 = rand.nextInt(45)+1;
		int num6 = rand.nextInt(45)+1;
		int bonus = rand.nextInt(45)+1;
		
		System.out.println(" 복권나라에 오신걸 환영합니다 \\^ㅇ^/");
		System.out.println("┌────────────────────────┐");
		System.out.println("│       행운의 복권 ♧       │");
		System.out.println("└────────────────────────┘");
		System.out.printf("이번주 로또번호는 %d,%d,%d,%d,%d,%d \nBonus번호는 %d",num1,num2,num3,num4,num5,num6,bonus);
	}

}
