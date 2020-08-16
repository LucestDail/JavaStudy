/* https://www.codewars.com/kata/57814d79a56c88e3e0000786/train/java
 * For building the encrypted string:
 * Take every 2nd char from the string,
 * then the other chars,
 * that are not every 2nd char,
 * and concat them as new String.
 * Do this n times!
 * Examples:
 * "This is a test!", 1 -> "hsi  etTi sats!"
 * "This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"
 * Write two methods:
 * String encrypt(final String text, final int n)
 * String decrypt(final String encryptedText, final int n)
 * For both methods:
 * If the input-string is null or empty return exactly this value!
 * If n is <= 0 then return the input text.
*/

public class Kata {

  public static String encrypt(final String text, final int n) {
    // Your code here
	  if(text == null || text.isBlank()) {
		  return text;
	  }else {
	  int count = 0;
	  String resultFinal = text;
	  while(count < n) {
	  StringBuilder encryptedStringEven = new StringBuilder("");
	  StringBuilder encryptedStringOdd = new StringBuilder("");
	  for(int i = 0; i < resultFinal.length();i++) {
		  char temp = resultFinal.charAt(i);
		  if(i % 2 == 0) {
			  encryptedStringEven.append(temp);
		  }else
			  encryptedStringOdd.append(temp);
	  }
	  encryptedStringOdd.append(encryptedStringEven);
	  String result = encryptedStringOdd.toString();
	  resultFinal = result;
	  count++;
	  }
	  return resultFinal;
	  }
  }
  
  public static String decrypt(final String encryptedText, final int n) {
    // Your code here
	  //judging which part is the half of the statement
	  if(encryptedText == null || encryptedText.isBlank()) {
		  return encryptedText;
	  }else {
	  int count = 0;
	  String resultFinal = encryptedText;
	  int checkPoint = (resultFinal.length()/2)-1;
	  int afterCheckPoint;
	  if(resultFinal.length() % 2 != 0) {
		  afterCheckPoint = checkPoint + 1;
	  }else
		  afterCheckPoint = checkPoint;
	  while(count < n) {
	  StringBuilder decryptedStringBeforeCheckPoint = new StringBuilder("");
	  StringBuilder decryptedStringAfterCheckPoint = new StringBuilder("");
	  StringBuilder decryptedString = new StringBuilder("");
	  String beforeString = "";
	  String afterString = "";
	  for(int i = 0; i < resultFinal.length();i++) {
		  char temp = resultFinal.charAt(i);
		  if(i <= checkPoint) {
			  decryptedStringBeforeCheckPoint.append(temp);
		  }else {
			  decryptedStringAfterCheckPoint.append(temp);
		  }
	  }
	  beforeString = decryptedStringBeforeCheckPoint.toString();
	  afterString = decryptedStringAfterCheckPoint.toString();
	  if(checkPoint == afterCheckPoint) {
		  for(int i=0; i <= checkPoint;i++) {
			  decryptedString.append(afterString.charAt(i));
			  decryptedString.append(beforeString.charAt(i));
		  }
	  }else {
		  for(int i = 0; i <= checkPoint; i++) {
			  decryptedString.append(afterString.charAt(i));
			  decryptedString.append(beforeString.charAt(i));
		  }
		  decryptedString.append(afterString.charAt(afterCheckPoint));
	  }
	  String result = decryptedString.toString();
	  resultFinal = result;
	  count++;
	  }
	  return resultFinal;
	  }
  }
  }