/*
  This is merge sort.
  The only comparison sort which utilises n+log n extra memory.
  Time complexity of this sort algo is O(nlog n).
  Below code is written in recusion merge sort because I find it easy to visualise.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SortMerge{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine().trim());
    String inpt[] = br.readLine().trim().split(" ");

    br.close();

    int[] arr = new int[n];

    for(int i = 0 ; i < n ; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    mergeSort(arr, 0, n - 1);

    for(int i : arr)
      System.out.print(i + " ");

  }

private static void mergeSort(int[] arr, int low, int high){

  int mid;
  if(low < high){
    mid = (low + high) / 2;

    mergeSort(arr, low , mid);
    mergeSort(arr, mid + 1 , high);
    merge(arr, low, mid, high);
  }
}

  private static void merge(int[] arr, int low , int mid, int high){
    int i = low;
    int j = mid + 1;
    int k = low;

    int[] newArray = new int[high + 1];

    while(i <= mid && j <= high){
      if(arr[i] < arr[j])
        newArray[k++] = arr[i++];
      else
        newArray[k++] = arr[j++];
    }

    for( ; i <= mid; i++)
      newArray[k++] = arr[i];

    for( ; j <= high ; j++)
      newArray[k++] = arr[j];

    for(i = low ; i <= high ; i++)
      arr[i] = newArray[i];
  }
}
