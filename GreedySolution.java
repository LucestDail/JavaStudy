class GreedySolution {
	public static int solution(int n, int[] lost, int[] reserve) {
		System.out.println("Testing Case : " + n);
		
		
		int[] CanReserve = new int[n+1];
		int answer = n;
		for (int i = 0; i < lost.length; i++) {
			//도둑 맞은 인원 자리 -1
			CanReserve[lost[i]-1]--;
		}
		for (int i = 0; i < reserve.length; i++) {
			//여분 있는 인원 자리 +1
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
			if (CanReserve[i] < 0) { // 현재 1벌 여벌 가지고 있음
				if (i == 0) { // 최초값의 경우
					if (CanReserve[i + 1] > 0) {
						CanReserve[i + 1]--;
						CanReserve[i]++;
					} else {
						answer--;
						continue;
					}
				} else if (i == CanReserve.length) { // 최후값인 경우
					if (CanReserve[i - 1] > 0) {
						CanReserve[i - 1]--;
						CanReserve[i]++;
					} else {
						answer--;
						continue;
					}
				} else { // 그 이외의 경우
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
			}else { // CanReserve 값이 0 일때, 즉 여벌 없고 도둑 안맞음, 혹은 도둑 맞았으나 여벌 있음
				continue;
			}
		}
		System.out.println("result : " + answer);
		return answer;
	}
}