import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


class HighestCommonFactor{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");

    int num1 = Integer.parseInt(input[0]);
    int num2 = Integer.parseInt(input[1]);

    System.out.println(GCD(num1, num2));
  }

  public static int GCD(int num1, int num2){
    if(num1 == 0 || num2 == 0)
      return num1 + num2;

    int r = num2 % num1;
    int q = num2 / num1;

    return GCD(r, num1);
  }
}
