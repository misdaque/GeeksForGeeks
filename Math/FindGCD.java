class FindGCD{
  public static void main(String[] args) {

    int num1 = 8;
    int num2 = 12;

    System.out.println("GCD of " + num1 + " and " + num2 + " is " + GCD(num1, num2));
  }

  private static int GCD(int num1, int num2){
    if(num2 == 0)
      return num1;

    return GCD(num2, num1 % num2);
  }
}
