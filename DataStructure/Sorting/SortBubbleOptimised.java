/*
  In this algorith the elements are checked constatnly next to each other
  and then swapped.

  In this algorith we take care of the adaptive criteria i.e. if the array is
  already sorted then nothng should be done.

  no of passes = n-1;
  no of comparison = n*(n - 1) / 2
  max swap = n * (n - 1) / 2

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SortBubbleOptimised{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] inpt = br.readLine().trim().split(" ");

    int[] arr = new int[n];

    for(int i = 0 ; i < n ; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    for(int i = 0 ; i < n - 1 ; i++){
      boolean flag = true;
      for(int j = 1 ; j < n - i ; j++){
        if(arr[j - 1] > arr[j]){
          arr[j - 1] = arr[j - 1] + arr[j];
          arr[j] = arr[j - 1] - arr[j];
          arr[j - 1] = arr[j - 1] - arr[j];

          flag = false;
        }
      }
      if(flag)
        break;
    }

    for(int i : arr)
      System.out.print(i +" ");
  }
}
