public class NumberFun {
  public static long findNextSquare(long sq) {
    System.out.println(sq);
    if(sq>0){
      double sqResult = Math.sqrt(sq);
      double sqCompare = Math.ceil(sqResult);
      if(sqCompare == sqResult){
        return (long)((sqCompare+1) * (sqCompare+1)); // range of number is very huge... type casting as long
      }else
        return -1;
    }else
      return -1; 
  }
}