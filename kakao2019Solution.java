class Kakao2019Solution {
    public static int solved() {
        
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int [] moves = {1,5,3,5,1,2,1,4};
        //basic set, don't copy
        //Selecting and pushing stack algorithm
        int[] stack = new int[moves.length+1];
        int count = 1;
        int boom = 0;
        for(int select : moves) {
        	System.out.println("moves to " + select);
        	for(int deepth = 0; deepth < board.length;deepth++) {
        		if(board[deepth][select-1] == 0) {
        			continue;
        		}else { // 0 이 아닌 값 만날 경우
        			if( stack[count-1] == board[deepth][select-1]) {//이전 스택값과 동일할 경우
        				stack[count-1] = board[deepth][select-1] = 0;
        				count--;
        				boom += 2;
        				System.out.println("boom!");
        				break;
        			}else { // 이전 스택값이랑 다를 경우
        				stack[count] = board[deepth][select-1];
            			board[deepth][select-1] = 0;
            			System.out.println("taking : " + stack[count]);
            			count++;
            			break;
        			}
        		}
        	}
        }
        
        for(int i = 0; i < stack.length;i++) {
        	System.out.println(i + ":" + stack[i]);
        }

        
        return boom;
    }
}