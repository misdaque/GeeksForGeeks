/*
  In this algorithm sorted and unsorted aray are maintained.
  It uses concept of shifting and placing the element where it suits.

  No Of Passes = n - 1
  No Of Comparisons = n * (n - 1) / 2
  No Of Swaps = n * (n - 1) / 2

  It is by default addaptive in nature and is also stable.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SortInsertionOptimised{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] inpt = br.readLine().trim().split(" ");

    int[] arr = new int[n];

    for(int i = 0 ; i < n ; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    for(int i = 1 ; i < n ; i++){
      int j = i - 1;
      int temp = arr[i];

      while(j >= 0 && arr[j] > temp){
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j+1] = temp;
    }

    for(int i : arr)
      System.out.print(i + " ");
    }
}
