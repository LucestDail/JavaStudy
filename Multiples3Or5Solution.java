public class Multiples3Or5Solution {

  public int solution(int number) {
	  System.out.println("input number is " + number);
	  int targetNumber = number - 1;
	  int number3Count = targetNumber/3;
	  int number5Count = targetNumber/5;
	  int number15Count = targetNumber/15;
	  int number5Adding = 0, number3Adding = 0,number15Adding = 0, result=0;
	  if(number5Count > 0) {
		  for(int i = 0; i < number5Count; i++) {
			  number5Adding += 5*(i+1);
		  }
	  }
	  if(number3Count > 0) {
		  for(int i = 0; i < number3Count; i++) {
			  number3Adding += 3*(i+1);
		  }
	  }
	  if(number15Count > 0) {
		  for(int i = 0; i < number15Count; i++) {
			  number15Adding += 15*(i+1);
		  }
	  }
	  result = number5Adding + number3Adding - number15Adding;
	  System.out.println("result value is " + result);
	  return result;
  }
}
