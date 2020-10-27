
public class Selection {

	public static int[] sort(int[] testArray) {
		int[] resultArray = testArray.clone();
		int minValue, minIndex;
		for (int i = 0; i < resultArray.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < resultArray.length; j++) {
				if (resultArray[j] < resultArray[minIndex]) {
					minIndex = j;
				}
			}
			minValue = resultArray[minIndex];
			resultArray[minIndex] = resultArray[i];
			resultArray[i] = minValue;
		}

		return resultArray;

	}

}
