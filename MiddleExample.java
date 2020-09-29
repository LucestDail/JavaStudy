class MiddleExample {
	public static String getMiddle(String word) {

		String s = word;
		// Code goes here!
		StringBuilder sb = new StringBuilder("");
        if(s.length() == 1 || s.length() == 2){
        	sb.append(s);
        }else if((s.length()%2) == 0){
        	sb.append(s.substring(s.length()/2-1,s.length()/2+1));
        }else{
            sb.append(s.substring(s.length()/2,s.length()/2+1));
        }
        String answer = sb.toString();
        return answer;
	}
}