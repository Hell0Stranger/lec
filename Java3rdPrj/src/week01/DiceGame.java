package week01;
import java.util.Random;

class Dice {
	int rollValue;

	int rollTheDice() {
		Random rand = new Random();
		int rollValue = rand.nextInt(6) + 1;
		return rollValue;
	}
}

class DiceGame {
	public static void main(String[] args) {
		Dice dice = new Dice();
		int rolled1 = dice.rollTheDice();
		int rolled2 = dice.rollTheDice();
		int sum = rolled1 + rolled2;
		if (rolled1 == rolled2) {
			sum = sum * 2;
			System.out.println("Double Score '"+rolled1+"' 당첨★ " + sum);

		} else {
			System.out.println("첫번째로 던진 주사위는" + rolled1);
			System.out.println("두번째로 던진 주사위는" + rolled2);

			System.out.println("Score" + sum);

		}
	}

}
