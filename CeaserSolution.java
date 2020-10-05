class CeaserSolution {
	public static String solution(String s, int n) {
		final int ALPHA_MAX = 26;
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < s.length(); i++) {
			char target = s.charAt(i);
			if (Character.isLowerCase(target)) {
				target = (char)((target + n % ALPHA_MAX - 'a')%ALPHA_MAX + 'a');
				sb.append(target);
			} else if (Character.isUpperCase(target)) {
				target = (char)((target + n % ALPHA_MAX - 'A')%ALPHA_MAX + 'A');
				sb.append(target);
			} else {
				sb.append(target);
				continue;
			}
		}
		String answer = sb.toString();
		return answer;
	}
}