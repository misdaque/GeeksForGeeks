import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ExponentialPower{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");

    int x = Integer.parseInt(input[0]);
    int n = Integer.parseInt(input[1]);

    System.out.println(x + " to the power of " +n +" is: "+ exp(x, n));
  }

  static int exp(int x, int n){
    if(n == 0)
      return 1;
    else if((n & 1) == 0){
      int y = exp(x, n/2);
      return y * y;
    }
    else
      return x * exp(x, n - 1);
  }
}
