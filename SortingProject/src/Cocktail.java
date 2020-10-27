
public class Cocktail {

	public static int[] sort(int[] testArray) {
		int[] resultArray = testArray.clone();
		boolean swap = true;
		int i = 0;
		int j = resultArray.length - 1;
		while (i < j && swap) {
			swap = false;
			for (int k = i; k < j; k++) {
				if (resultArray[k] > resultArray[k + 1]) {
					int temp = resultArray[k];
					resultArray[k] = resultArray[k + 1];
					resultArray[k + 1] = temp;
					swap = true;
				}
			}
			j--;
			if (swap) {
				swap = false;
				for (int k = j; k > i; k--) {
					if (resultArray[k] < resultArray[k - 1]) {
						int temp = resultArray[k];
						resultArray[k] = resultArray[k - 1];
						resultArray[k - 1] = temp;
						swap = true;
					}
				}
			}
			i++;
		}
		return resultArray;
	}
}
