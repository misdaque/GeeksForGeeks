//This algorithm will be simple one usig Recusrion.
//Time complexity would be O(n)

class PowUsingRecursion{
  public static void main(String[] args){
    int num = 3;
    int exp = 10;

    System.out.println(power(num , exp));
  }

  public static int power(int num, int exp){
    if(exp == 0)
      return 1;
    else
      return (num * power(num , exp - 1));
  }
}
