
public class Insertion {

	public static int[] sort(int[] testArray) {
		int[] resultArray = testArray.clone();
		for (int i = 1; i < resultArray.length; i++) {

			int temp = resultArray[i];
			int before = i - 1;

			while ((before >= 0) && (resultArray[before] > temp)) {
				resultArray[before + 1] = resultArray[before];
				before--;
			}
			resultArray[before + 1] = temp;
		}
		return resultArray;
		// TODO Auto-generated method stub

	}

}
