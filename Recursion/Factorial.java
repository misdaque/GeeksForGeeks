class Factorial{
  public static void main(String[] args) {

    int n = 6;
    System.out.println(n +  "! = " +factorial(n));
  }

  private static int factorial(int n){
    if(n == 0)
      return 1;

    return (n * factorial(n - 1));
  }
}
