class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        boolean minusCheck = false;
        
        if(s.charAt(0) == '-'){
            sb.append(s.substring(1));
            minusCheck = true;
        }else{
            sb.append(s.substring(0));
        }
        answer = Integer.parseInt(sb.toString());
        if(minusCheck){
            answer *= -1;
        }
        return answer;
    }
}