
import java.util.*;

public class This4Is7Java {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택 > ");
			int selection = scan.nextInt();
			System.out.println("");
			switch(selection) {
			case 1:
				System.out.print("예금액 > ");
				balance += scan.nextInt();
				break;
			case 2:
				System.out.print("출금액 > ");
				balance -= scan.nextInt();
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}
