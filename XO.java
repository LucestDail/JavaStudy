public class XO {
  
  public static boolean getXO (String str) {
    int countO = 0;
    int countX = 0;
    boolean resultXO = false;
    String[] arrayStr = str.split("");
    System.out.println(arrayStr.length);
    for(int i = 0;i<arrayStr.length;i++){
      System.out.println(arrayStr[i]);
      if(arrayStr[i].equals("o") || arrayStr[i].equals("O"))
        {
        countO++;
      }else if(arrayStr[i].equals("x") || arrayStr[i].equals("X")){
        countX++;
      }else
        continue;
    }
    System.out.println(countO);
    System.out.println(countX);
    if(countO == countX){
      resultXO = true;
    }
    System.out.println(resultXO);
    return resultXO;
  }
}