/*A program to sort a given array*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SortSelection{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] inpt = br.readLine().split(" ");

    int[] arr = new int[n];

    for(int i = 0 ; i < n ; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    selectionSort(arr , n);

    for(int i : arr)
      System.out.print(i+" ");
  }

  private static void selectionSort(int[] arr, int n){
    for(int i = 0 ; i < n ; i++){
      int lowestIndex = lowestIndex(arr, n , i);
      int temp = arr[lowestIndex];
      arr[lowestIndex] = arr[i];
      arr[i] = temp;

      // arr[i] = arr[i] + arr[lowestIndex];
      // arr[lowestIndex] = arr[i] - arr[lowestIndex];
      // arr[i] = arr[i] - arr[lowestIndex];
    }
  }

  private static int lowestIndex(int[] arr, int n, int startIndex){

    int index = 0;
    int temp = arr[startIndex];
    for(int i = startIndex; i < n ; i++){
      if(arr[i] <= temp){
        temp = arr[i];
        index = i;
      }
    }

    return index;
  }
}
