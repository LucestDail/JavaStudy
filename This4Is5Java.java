
public class This4Is5Java {

	public static void main(String[] args) {
		for(int i = 0;i<=10;i++) {
			for(int j = 0; j <= 10; j++) {
				int result = 0;
				int conclusion = 60;
				result = 4*i + 5*j;
				if(result == conclusion) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}
}
