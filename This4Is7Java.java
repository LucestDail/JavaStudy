
import java.util.*;

public class This4Is7Java {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("-------------------------------");
			System.out.print("���� > ");
			int selection = scan.nextInt();
			System.out.println("");
			switch(selection) {
			case 1:
				System.out.print("���ݾ� > ");
				balance += scan.nextInt();
				break;
			case 2:
				System.out.print("��ݾ� > ");
				balance -= scan.nextInt();
				break;
			case 3:
				System.out.println("�ܰ� > " + balance);
				break;
			case 4:
				run = false;
			}
		}
		System.out.println("���α׷� ����");
		scan.close();
	}
}
