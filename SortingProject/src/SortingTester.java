
public class SortingTester {
	public static void main(String[] args) {

		final int TEST_MAX = 100000;
		int[] testArray = new int[TEST_MAX];
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = (int) (Math.random() * TEST_MAX);
		}

		long start = System.currentTimeMillis();

		/*
		 * before testing sorting big o time spending, make your testing case scope ->
		 * TEST_MAX Choose your sorting testing array
		 * 
		 */
//		testArray = Bubble.sort(testArray);
//		testArray = Insertion.sort(testArray);
		testArray = Shell.sort(testArray);
//		testArray = Selection.sort(testArray);

		System.out.println("testing case : " + testArray.length);
		System.out.println("Total Time spend : " + (long) (System.currentTimeMillis() - start));
		System.out.print("checking sorting...");
		for (int i = 0; i < testArray.length - 1; i++) {
			if (testArray[i] > testArray[i + 1]) {
				System.out.println("sorting fail");
				return;
			}
		}
		System.out.println("sorting perfect, test end");
	}

}
