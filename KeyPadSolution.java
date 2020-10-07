
class KeyPadSolution {
	public static String solution(int[] numbers, String hand) {

		StringBuilder sb = new StringBuilder("");

		final int HEIGHT_MAX = 4;
		final int WIDTH_MAX = 3;
		final int NOW_POSITION = 1;

		// ���ڹ��� �������� 2���� �迭 ����
		String[][] keyPadArray = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" }, { "*", "0", "#" } };

		int rightHeight = 3;
		int rightWidth = 0;
		int leftHeight = 3;
		int leftWidth = 2;

		// �޼� �ʱ�ȭ �� ġŰ
		int[][] leftHandArray = new int[HEIGHT_MAX][WIDTH_MAX];
		leftHandArray[rightHeight][rightWidth] = NOW_POSITION;

		// ������ �ʱ�ȭ �� ġŰ
		int[][] rightHandArray = new int[HEIGHT_MAX][WIDTH_MAX];
		rightHandArray[leftHeight][leftWidth] = NOW_POSITION;

		// Ž��
		for (int i = 0; i < numbers.length; i++) {
			int targetHeight = 0;
			int targetWidth = 0;

			// number i ��° ���ڰ� keypad ��� ��ġ���ִ��� Ȯ��
			for (int keyHeightIndex = 0; keyHeightIndex < keyPadArray.length; keyHeightIndex++) {
				for (int keyWidthIndex = 0; keyWidthIndex < keyPadArray[keyHeightIndex].length; keyWidthIndex++) {
					if (Integer.toString(numbers[i]).equals(keyPadArray[keyHeightIndex][keyWidthIndex])) {

						targetHeight = keyHeightIndex;
						targetWidth = keyWidthIndex;
					}
				}
			}

			// ���� �켱 �������� Ȯ��
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				// ���� �켱 �������� Ȯ��
				sb.append("L");
				// �� ��ġ�� ���� �е�� �̵�
				leftHeight = targetHeight;
				leftWidth = targetWidth;
				continue;
			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				// �ƴϸ� ���� �켱 �������� Ȯ��
				sb.append("R");
				// �� ��ġ�� ���� �е�� �̵�
				rightHeight = targetHeight;
				rightWidth = targetWidth;
				continue;
			} else {
				int rightDiffCheck = Math.abs(targetHeight - rightHeight) + Math.abs(targetWidth - rightWidth);
				int leftDiffCheck = Math.abs(targetHeight - leftHeight) + Math.abs(targetWidth - leftWidth);
				if (rightDiffCheck < leftDiffCheck) {
					sb.append("R");
					// �� ��ġ�� ���� �е�� �̵�
					rightHeight = targetHeight;
					rightWidth = targetWidth;
					continue;
				} else if (rightDiffCheck > leftDiffCheck) {
					sb.append("L");
					// �� ��ġ�� ���� �е�� �̵�
					leftHeight = targetHeight;
					leftWidth = targetWidth;
					continue;
				} else if (rightDiffCheck == leftDiffCheck) {
					if (hand.equals("right")) {
						sb.append("R");
						// �� ��ġ�� ���� �е�� �̵�
						rightHeight = targetHeight;
						rightWidth = targetWidth;
						continue;
					} else if (hand.equals("left")) {
						sb.append("L");
						// �� ��ġ�� ���� �е�� �̵�
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