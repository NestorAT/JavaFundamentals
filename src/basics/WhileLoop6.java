package basics;

public class WhileLoop6 {

	public static void main(String[] args) {

		int distance = 20;
		int hp = 234;
		final int MAX_HP = 23423;

		boolean isRunning = true;

		while (isRunning) {

			if (distance < 20) {

				if (hp >= MAX_HP / 2) {
					System.out.println("attack");
				}

			} else {
				System.out.println("No attack");
			}

			break;
		}
	}
}