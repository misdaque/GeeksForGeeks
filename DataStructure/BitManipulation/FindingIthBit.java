// Finding Whether the ith bit is 1 or 0

class FindingIthBit{
  public static void main(String[] args){
    int num = 7;
    int i = 1;

    int mask = (1 << i);
    System.out.println(mask);
    if((mask & num) == 1)
      System.out.println("ith bit is 1");
    else
      System.out.println("ith bit is 0");
  }
}
