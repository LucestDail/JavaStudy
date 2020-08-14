public class Accumul {
    
    public static String accum(String s) {
      int temp = 0;
      String[] arrays = s.split("");
      char[] big = new char[arrays.length];
      char[] small = new char[arrays.length];
      StringBuilder statement = new StringBuilder("");
      
      //s -> big/small recognition
      for(int i = 0; i<arrays.length;i++){
        temp = (int)s.charAt(i);
        if((97 <= temp) && (temp<=122)){
          big[i] = (char)(temp - 32);
          small[i] = (char)(temp);
        }else if((65 <= temp)&&(temp<=90)){
          small[i] = (char)(temp + 32);
          big[i] = (char)(temp);
        }else
          continue;
      }
      
      //statement appending
      for(int i = 0; i < arrays.length; i++){
        statement.append(big[i]);
        for(int j = 0; j < i; j ++){
          statement.append(small[i]);
        }
        if(i < arrays.length-1){
          statement.append("-");
        }
      }
      System.out.println(statement);
      String result = statement.toString();
      return result;
    }
}