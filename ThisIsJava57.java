
public class ThisIsJava57 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		max = array[0];
		for(int item : array) {
			if(max < item) {
				max = item;
			}
		}
		System.out.println("max : " + max);
	}
}
