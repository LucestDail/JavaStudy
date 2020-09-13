public class MinMax {
  public static String highAndLow(String numbers) {
	  StringBuilder sb = new StringBuilder("");
	  String[] numbersStringArray = numbers.split(" ");
	  int min = Integer.parseInt(numbersStringArray[0]);
	  int max = Integer.parseInt(numbersStringArray[0]);
	  int target;
	  for(int i = 0; i < numbersStringArray.length;i++) {
		  target = Integer.parseInt(numbersStringArray[i]);
		  if(target < min)
			  min = target;
		  if(target > max)
			  max = target;
	  }
	  System.out.println(max + " " + min);
	  sb.append(max + " " + min);
	  String result = sb.toString();
	  return result;
  }
}