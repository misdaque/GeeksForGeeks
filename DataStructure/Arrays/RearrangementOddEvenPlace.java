/*Rearrange array such that arr[i] >= arr[j]
  if i is even and arr[i]<=arr[j] if i is odd and j < i
  url: https://www.geeksforgeeks.org/rearrange-array-arri-arrj-even-arri/
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class RearrangementOddEvenPlace{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] inpt = br.readLine().split(" ");

    int[] arr = new int[n];

    for(int i = 0 ; i < n ; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    Arrays.sort(arr);

    int[] newArr = new int[n];

    int evenLength = (n % 2 == 0 ) ? (n / 2) : (n / 2) + 1 ;

    for(int i = 0 , j = (evenLength - 1)*2 ; i < evenLength ; i++){
      newArr[j] = arr[i];
      j -= 2;
    }

    int oddLength = n / 2;

    for(int i = (n - oddLength) , j = 1 ; i < n ; i++){
      newArr[j] = arr[i];
      j += 2;
    }

    for(int i : newArr)
      System.out.print(i + " ");
  }
}
