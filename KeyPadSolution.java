
class KeyPadSolution {
	public static String solution(int[] numbers, String hand) {

		StringBuilder sb = new StringBuilder("");

		final int HEIGHT_MAX = 4;
		final int WIDTH_MAX = 3;
		final int NOW_POSITION = 1;

		// 숫자배프 가상으로 2차원 배열 구성
		String[][] keyPadArray = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" }, { "*", "0", "#" } };

		int rightHeight = 3;
		int rightWidth = 0;
		int leftHeight = 3;
		int leftWidth = 2;

		// 왼손 초기화 윙 치키
		int[][] leftHandArray = new int[HEIGHT_MAX][WIDTH_MAX];
		leftHandArray[rightHeight][rightWidth] = NOW_POSITION;

		// 오른손 초기화 윙 치키
		int[][] rightHandArray = new int[HEIGHT_MAX][WIDTH_MAX];
		rightHandArray[leftHeight][leftWidth] = NOW_POSITION;

		// 탐색
		for (int i = 0; i < numbers.length; i++) {
			int targetHeight = 0;
			int targetWidth = 0;

			// number i 번째 숫자가 keypad 어디에 위치해있는지 확인
			for (int keyHeightIndex = 0; keyHeightIndex < keyPadArray.length; keyHeightIndex++) {
				for (int keyWidthIndex = 0; keyWidthIndex < keyPadArray[keyHeightIndex].length; keyWidthIndex++) {
					if (Integer.toString(numbers[i]).equals(keyPadArray[keyHeightIndex][keyWidthIndex])) {

						targetHeight = keyHeightIndex;
						targetWidth = keyWidthIndex;
					}
				}
			}

			// 좌측 우선 숫자인지 확인
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				// 좌측 우선 숫자인지 확인
				sb.append("L");
				// 손 위치가 좌측 패드로 이동
				leftHeight = targetHeight;
				leftWidth = targetWidth;
				continue;
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				// 아니면 우측 우선 숫자인지 확인
				sb.append("R");
				// 손 위치가 우측 패드로 이동
				rightHeight = targetHeight;
				rightWidth = targetWidth;
				continue;
			} else {
				int rightDiffCheck = Math.abs(targetHeight - rightHeight) + Math.abs(targetWidth - rightWidth);
				int leftDiffCheck = Math.abs(targetHeight - leftHeight) + Math.abs(targetWidth - leftWidth);
				if (rightDiffCheck < leftDiffCheck) {
					sb.append("R");
					// 손 위치가 우측 패드로 이동
					rightHeight = targetHeight;
					rightWidth = targetWidth;
					continue;
				} else if (rightDiffCheck > leftDiffCheck) {
					sb.append("L");
					// 손 위치가 좌측 패드로 이동
					leftHeight = targetHeight;
					leftWidth = targetWidth;
					continue;
				} else if (rightDiffCheck == leftDiffCheck) {
					if (hand.equals("right")) {
						sb.append("R");
						// 손 위치가 우측 패드로 이동
						rightHeight = targetHeight;
						rightWidth = targetWidth;
						continue;
					} else if (hand.equals("left")) {
						sb.append("L");
						// 손 위치가 좌측 패드로 이동
						leftHeight = targetHeight;
						leftWidth = targetWidth;
						continue;
					}
				}
			}
		}

		String answer = sb.toString();
		return answer;
	}
}