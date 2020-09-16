class ProgrammersSolution {
	public static int[] solved(int[] numbers) {
		int count = 0;

		// 배열 선언, 최대 배열 크기 상정 및 numbers 범위 이외 값으로 초기화하여 배열값 비교 대비
		int[] box = new int[((numbers.length) * (numbers.length - 1)) / 2];
		for (int i = 0; i < box.length; i++) {
			box[i] = 101;
		}
		// product all condition =
		for (int item1 : numbers) {
			for (int item2 : numbers) {
				int itemProduction = item1 + item2;
				for (int boxItem : box) {
					if (boxItem == 101) {// 현재 확인한 박스 배열값이 101인 경우, 즉 초기화 상태인 경우
						box[count] = itemProduction;
						count++;
						System.out.println("item has been added");
						break;
					} else {// 현재 확인한 박스 배열값이 101이 아닌 경우, 즉 현재 박스값이 있는 경우
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