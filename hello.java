public class GrassHopper {

    public static String sayHello(String name) {
      StringBuilder sb = new StringBuilder("");
      sb.append("Hello, " + name);
      String result = sb.toString();
      System.out.println(result);
        return result;
    }
}