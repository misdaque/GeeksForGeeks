class StringSubSet{

  static int count = 0 ;

  public static void main(String[] args) {
    String str = "123";

    String op = "";
    String ip = str;

    printSubset(op, ip);
  }

  private static void printSubset(String op, String ip){
    if(ip.length() == 0){
      System.out.println(++count +". "+ op);
      return;
    }

    String op1 = op;
    String op2 = op;

    op2 = op + ip.charAt(0);
    ip = ip.substring(1);

    printSubset(op1, ip);
    printSubset(op2, ip);
  }
}
