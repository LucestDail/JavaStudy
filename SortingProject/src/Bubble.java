
public class Bubble {

	public static int[] sort(int[] testArray) {
		int temp = 0;
		int[] resultArray = testArray.clone();
		for (int i = 0; i < resultArray.length; i++) {
			for (int j = 1; j < resultArray.length - i; j++) {
				if (resultArray[j] < resultArray[j - 1]) {
					temp = resultArray[j - 1];
					resultArray[j - 1] = resultArray[j];
					resultArray[j] = temp;
				}
			}
		}
		return resultArray;

	}

}
