class GreedySolution {
	public static int solution(int n, int[] lost, int[] reserve) {
		System.out.println("Testing Case : " + n);
		
		
		int[] CanReserve = new int[n+1];
		int answer = n;
		for (int i = 0; i < lost.length; i++) {
			//���� ���� �ο� �ڸ� -1
			CanReserve[lost[i]-1]--;
		}
		for (int i = 0; i < reserve.length; i++) {
			//���� �ִ� �ο� �ڸ� +1
			CanReserve[reserve[i]-1]++;
		}
		for (int i = 0; i < CanReserve.length; i++) {
			System.out.print(CanReserve[i] + "");
		}
		System.out.println();
		for (int i = 0; i <= CanReserve.length-1; i++) {
			System.out.println("this n : " + n +
					" , this i : " + i +
					", this array value : " + CanReserve[i]+
					" , this array size : " + CanReserve.length);
			if (CanReserve[i] < 0) { // ���� 1�� ���� ������ ����
				if (i == 0) { // ���ʰ��� ���
					if (CanReserve[i + 1] > 0) {
						CanReserve[i + 1]--;
						CanReserve[i]++;
					} else {
						answer--;
						continue;
					}
				} else if (i == CanReserve.length) { // ���İ��� ���
					if (CanReserve[i - 1] > 0) {
						CanReserve[i - 1]--;
						CanReserve[i]++;
					} else {
						answer--;
						continue;
					}
				} else { // �� �̿��� ���
					if (CanReserve[i - 1] > 0) {
						CanReserve[i - 1]--;
						CanReserve[i]++;
					} else if (CanReserve[i + 1] > 0) {
						CanReserve[i + 1]--;
						CanReserve[i]++;
					} else {
						answer--;
						continue;
					}
				}
			}else { // CanReserve ���� 0 �϶�, �� ���� ���� ���� �ȸ���, Ȥ�� ���� �¾����� ���� ����
				continue;
			}
		}
		System.out.println("result : " + answer);
		return answer;
	}
}