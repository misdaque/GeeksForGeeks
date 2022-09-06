/*
  In quick sort algorithm the partitioning is done and then the elements are arranged.

  If i element is more than pivot element or j is less than or equls to pivot element then
  swapping of elemnt is done. elemnet i is swapped with j element.
  If j becomes less than i then pivot element is swapped with j
*/

//This is the algorithm which Abdul bari used

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SortQuick1{

  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());

      String[] inpt = br.readLine().trim().split(" ");

      int[] arr = new int[n+1];

      for(int i = 0 ; i < n ; i++)
        arr[i] = Integer.parseInt(inpt[i]);

      arr[n] = Integer.MAX_VALUE;

      quickSort(arr, 0 , n);

      for(int i : arr)
        System.out.print(i + " ");

  }

  private static int partition(int[] arr, int low, int high){
    int i = low;
    int j = high;
    int pivot = arr[low];
    int pivotIndex = low;

    do{
      do{i++;}while(arr[i] <= pivot);
      do{j--;}while(arr[j] > pivot);

      if(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }while( i < j);
      arr[pivotIndex] = arr[j];
      arr[j] = pivot;
      return j;
  }

  private static void quickSort(int[] arr, int low , int high){
    int j;
    if(low < high){
      j = partition(arr, low , high);
      quickSort(arr, low , j);
      quickSort(arr, j+1, high);
    }
  }
}
