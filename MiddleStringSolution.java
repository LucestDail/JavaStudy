class MiddleStringSolution {
    public static String solved(String s) {
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