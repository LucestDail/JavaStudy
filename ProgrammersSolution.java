class ProgrammersSolution {
	public static int[] solved(int[] numbers) {
		int count = 0;

		// �迭 ����, �ִ� �迭 ũ�� ���� �� numbers ���� �̿� ������ �ʱ�ȭ�Ͽ� �迭�� �� ���
		int[] box = new int[((numbers.length) * (numbers.length - 1)) / 2];
		for (int i = 0; i < box.length; i++) {
			box[i] = 101;
		}
		// product all condition =
		for (int item1 : numbers) {
			for (int item2 : numbers) {
				int itemProduction = item1 + item2;
				for (int boxItem : box) {
					if (boxItem == 101) {// ���� Ȯ���� �ڽ� �迭���� 101�� ���, �� �ʱ�ȭ ������ ���
						box[count] = itemProduction;
						count++;
						System.out.println("item has been added");
						break;
					} else {// ���� Ȯ���� �ڽ� �迭���� 101�� �ƴ� ���, �� ���� �ڽ����� �ִ� ���
						if (box[count - 1] == itemProduction) {

						} else {

						}

					}
				}
			}
		}
		System.out.println(count);

		// sorting

		for (int item : box) {
			System.out.println(item);

		}
		int[] result = new int[count];

		return result;
	}
}