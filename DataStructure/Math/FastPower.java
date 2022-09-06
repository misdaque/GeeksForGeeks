class FastPower{
  public static void main(String[] args){
      System.out.println(power(2,30, 1000000007));
  }

  public static long power(long a, long b, long n){

    long result = 1;
    while(b > 0){

      if((b&1) != 0)
        result = (result % n  * a % n) % n;

      a = (a % n * a % n) % n;
      b = b >> 1;
    }

    return result;
  }
}
