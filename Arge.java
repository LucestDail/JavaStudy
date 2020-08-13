class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
      int count = 0;
      double curp = (double)p0;
      double daug = (double)aug;
      double endp = (double)p;
      do{
        count++;
        curp = curp * (1 + percent/100) + daug;
         }while(curp<endp);
      return count;
    }
}