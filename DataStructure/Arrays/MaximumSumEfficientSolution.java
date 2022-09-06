/*Find maximum value of Sum( i*arr[i])
  with only rotations on given array allowed.
  This is using algorithm
  See: https://www.geeksforgeeks.org/find-maximum-value-of-sum-iarri-with-only-rotations-on-given-array-allowed/
  */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MaximumSumEfficentSolution{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];

    String[] inpt = br.readLine().split(" ");

    for(int i = 0 ; i < n; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    int[] results = new int[n];

    results[0] = maximumSumOfArray(arr, n);
    int sum = sumOfArray(arr , n);
    for(int i = 1 ; i < n ; i++)
      results[i] = results[i-1] - (sum - n * arr[i-1]);

    int maximumSum = results[0];

    for(int i = 1 ; i < n ; i++)
      maximumSum = results[i] >= maximumSum ? results[i] : maximumSum;

    System.out.println(maximumSum);
  }

  private static int maximumSumOfArray(int[] arr,int n){
    int sum = 0;

    for(int i = 1 ; i < n;i++ )
      sum += arr[i]*i;

    return sum;
  }

  private static int sumOfArray(int[] arr, int n){
    int sum = 0 ;
    for(int i = 0 ; i < n ; i++)
      sum += arr[i];

    return sum;
  }
}
