/*Reversal algorithm for right rotation of an array
  url: https://www.geeksforgeeks.org/reversal-algorithm-right-rotation-array/
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class RotateArrayUsingReverseAlgorithm{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] inpt = br.readLine().split(" ");

    int n = Integer.parseInt(inpt[0]);
    int k = Integer.parseInt(inpt[1]);

    inpt = br.readLine().split(" ");

    int[] arr = new int[n];

    for(int i = 0 ; i < n ; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    reverseArray(arr,0 , k-1);
    reverseArray(arr, k , n-1);
    reverseArray(arr, 0 , n-1);

    for(int i : arr)
      System.out.print(i + " ");
  }

  private static void reverseArray(int arr[],int low , int high){

    while(low < high ){
      arr[low] = arr[low] + arr[high];
      arr[high] = arr[low] - arr[high];
      arr[low] = arr[low] - arr[high];

      low++;
      high--;
    }
    for(int i : arr)
      System.out.print(i + " ");

    System.out.println();System.out.println();

  }
}
