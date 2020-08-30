public class Prime {
  public static boolean isPrime(int num) {
	  boolean Result = true;
	  if(num <= 1) {
		  System.out.println("input number is " + num + " not prime");
		  Result = false;
		  return Result;
		  }
	  else if(num == 2) {
		  System.out.println("input number is " + num + " prime");
		  return Result;
	  }
	  else
	  {
		  for(int i = 2; i <= Math.sqrt(num); i++) {
			  if(num % i == 0) {
				  Result = false;
				  break;
				  }
			  }
		  }
	  if(Result){
		  System.out.println("input number is " + num + " prime");
		  return Result;
		  }
	  else {
		  System.out.println("input number is " + num + " not prime");
		  return Result;
		  }
	  }
  }

