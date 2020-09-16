import java.util.Arrays;

class ProgrammersSolution {
	public static int[] solved(int[] numbers) {
		int count = 0;

		// �迭 ����, �ִ� �迭 ũ�� ���� �� numbers ���� �̿� ������ �ʱ�ȭ�Ͽ� �迭�� �� ���
		int[] wholeBox = new int[(numbers.length) * (numbers.length -1 )];
		int[] box = new int[((numbers.length) * (numbers.length - 1))];
		for (int i = 0; i < box.length; i++) {
			box[i] = -1;
		}

		// ��� �迭 �Ӽ��� ������ �迭 ���� -> wholeBox[]
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j) {
					wholeBox[count] = numbers[i] + numbers[j];
					count++;
				}
			}
		}
		count = 0;
		System.out.println("****** wholeBox list ******");
		for (int item : wholeBox) {
			System.out.println(item);
		}

		// �ߺ��Ǵ� �迭 ��� 101�� ������ ���� -> box[]
		for (int i = 0; i < wholeBox.length; i++) {
			int target = wholeBox[i];
			for (int j = i + 1; j < wholeBox.length; j++) {
				if (target == wholeBox[j]) {
					wholeBox[j] = -1;
				} else
					continue;
			}
		}
		for (int item : wholeBox) {
			if (item != -1) {
				box[count] = item;
				count++;
			}
		}
		System.out.println("box counting : " + count);

		// ���� ��� ��ȯ �迭 ����, �Ҵ� -> result[]
		System.out.println("****** result list ******");
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = box[i];
		}
		for (int item : result) {
			System.out.println(item);
		}
		// �������� ����

		System.out.println("****** result sorting list ******");
		Arrays.sort(result);
		for (int item : result) {
			System.out.println(item);
		}

		// ��� ��ȯ
		return result;
	}
}