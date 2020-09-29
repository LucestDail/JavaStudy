import java.util.Arrays;

class ProgrammersSolution {
	public static int[] solved(int[] numbers) {
		int count = 0;

		// 배열 선언, 최대 배열 크기 상정 및 numbers 범위 이외 값으로 초기화하여 배열값 비교 대비
		int[] wholeBox = new int[(numbers.length) * (numbers.length -1 )];
		int[] box = new int[((numbers.length) * (numbers.length - 1))];
		for (int i = 0; i < box.length; i++) {
			box[i] = -1;
		}

		// 모든 배열 속성들 합한후 배열 대입 -> wholeBox[]
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

		// 중복되는 배열 요소 101로 구분점 생성 -> box[]
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

		// 최종 결과 반환 배열 생성, 할당 -> result[]
		System.out.println("****** result list ******");
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = box[i];
		}
		for (int item : result) {
			System.out.println(item);
		}
		// 오름차순 정렬

		System.out.println("****** result sorting list ******");
		Arrays.sort(result);
		for (int item : result) {
			System.out.println(item);
		}

		// 결과 반환
		return result;
	}
}