//Asked in Amdocs Oct
//Find the sum of even numbers in between given range
//We will use formulas to calcuate This

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class SumOfNTerms{
  public static void main(String[] args) throws IOException{
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");

    int l = Integer.parseInt(input[0]);
    int h = Integer.parseInt(input[1]);

    l = l + (l%2);
    h = h - (h%2);

    int n = ((h - l)/2) + 1;

    int sum = ((h + l)*n)/2;

    System.out.println("Sum is "+sum);
  }
}
