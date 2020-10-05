
public class ThisIsJava58 {
	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		int count = 0;
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		for(int[] items : array) {
			for(int item : items) {
				sum += item;
				count++;
			}
		}
		avg = (double)sum / count;
		

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
