
public class This4Is4Java {

	public static void main(String[] args) {
		int userRandomDiceSum = 0;
		do {
			userRandomDiceSum = 0;
			int userRandomDice1 = (int)(Math.random()*6)+1;
			int userRandomDice2 = (int)(Math.random()*6)+1;
			userRandomDiceSum = userRandomDice1 + userRandomDice2;
			System.out.println("(" + userRandomDice1 + ", " + userRandomDice2 + ")");
		}while(userRandomDiceSum != 5);
		
	}

}
