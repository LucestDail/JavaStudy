public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    char[] CheckVowelsList = {'a','e','i','o','u'};
    char[] StringToCharArray = str.toCharArray();
    for(int i = 0; i < StringToCharArray.length; i++) {
    	for(int j = 0; j < CheckVowelsList.length; j++) {
    		if(StringToCharArray[i] == CheckVowelsList[j]) {
    			vowelsCount++;
    		}else {
    			continue;
    		}	
    	}
    }
    return vowelsCount;
  }
}