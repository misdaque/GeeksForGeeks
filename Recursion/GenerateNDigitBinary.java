//Print n digit binary with 0's and 1's and at all time 1's value will be greater than 0's
//Example: n = 4: '1111', '1110', '1101', '1100', '1011', '1010'

//gfg link : https://practice.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1

class GenerateNDigitBinary{
  public static void main(String[] args) {
      solve("", 0, 0, 4);
  }

  private static void solve(String output, int one, int zero, int n){

    if(n == 0){
      System.out.println(output);
      return;
    }

    if(one == zero){
      output += "1";
      one++;
      solve(output, one, zero, n - 1);
    }else {
      String output1 = output + "1";
      String output2 = output + "0";
      solve(output1, one + 1, zero, n - 1);
      solve(output2, one, zero + 1, n - 1);
    }
  }
}
