public class ValidatePinSolution {
    public static boolean validatePin(String pin) {
    	char temp;
    	boolean pinCompare = true;
    	if(pin.length() == 4 || pin.length() == 6) {
    		for(int i = 0; i<pin.length();i++) {
    			temp = pin.charAt(i);
    			if(Character.isDigit(temp) == false) {
    				pinCompare = false;
    			}
    		}
    	}else{
    		pinCompare = false;
    	}
        return pinCompare;
    }
}