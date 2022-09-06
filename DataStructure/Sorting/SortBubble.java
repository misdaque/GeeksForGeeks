/*
  Url: https://www.geeksforgeeks.org/bubble-sort/
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SortBubble{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] inpt = br.readLine().split(" ");

    int[] arr = new int[n];

    for(int i = 0 ; i < n ; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    for(int i = 1 ; i < n ; i++)
      for(int j = 1 ; j < n ; j++){
        if(arr[j-1] > arr[j]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
      }

      for(int i : arr)
        System.out.print(i+ " ");

  }
}
