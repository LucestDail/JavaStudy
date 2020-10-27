
public class Shell {

	public static int[] sort(int[] testArray) {
		int[] resultArray = testArray.clone();

		for (int i = (resultArray.length / 2); i > 0; i /= 2) {
			for (int j = i; j < resultArray.length; j++) {
				int k;
				int temp = resultArray[j];

				for (k = j - i; k >= 0 && resultArray[k] > temp; k -= i) {
					resultArray[k + i] = resultArray[k];
				}
				resultArray[k + i] = temp;
			}
		}
		return resultArray;

	}

}
