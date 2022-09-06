//Find Odd or even of a number using bit

class FindOddOrEven{
  public static void main(String[] args){

    int num = 6;

    if((num & 1) == 0 )
      System.out.println(num + ": Even Number");
    else
      System.out.println(num + ": Odd Number");
  }
}
