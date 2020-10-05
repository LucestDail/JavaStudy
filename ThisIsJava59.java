
import java.util.*;

public class ThisIsJava59 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택 >>");
			int select = scanner.nextInt();
			System.out.println();
			switch(select) {
			case 1:
				System.out.print("학생수 >> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
			case 2:
				for(int i = 0; i < scores.length;i++) {
					System.out.printf("scores[%d] : ",i);
					int inputscores = scanner.nextInt();
					scores[i] = inputscores;
					System.out.println();
				}
				break;
			case 3:
				for(int i = 0; i < scores.length; i ++) {
					System.out.printf("scores[%d] : %d",i,scores[i]);
					System.out.println();
				}
				break;
			case 4:
				int sum = 0;
				int max = 0;
				for(int i = 0; i < scores.length;i++) {
					sum += scores[i];
					if(max < scores[i])
						max = scores[i];
					else
						continue;
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + (double)(sum/scores.length));
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
	}
}
