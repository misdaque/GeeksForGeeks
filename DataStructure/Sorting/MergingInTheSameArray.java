/*
  In this we merge in the same array.
  We will consider the left and right of the middle element are already sorted.

  We will take a new array for this but then copy the sorted and merged array in one array
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class MergingInTheSameArray{
 public static void main(String[] args) throws IOException{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   int n = Integer.parseInt(br.readLine().trim());

   int[] arr = new int[n];

   String inpt[] = br.readLine().trim().split(" ");

   for(int i = 0 ; i < n ; i++)
    arr[i] = Integer.parseInt(inpt[i]);

  merge(arr, 0 , n - 1);

  for(int i : arr)
    System.out.print(i + " ");

 }

 private static void merge(int[] arr, int low, int high){
   int mid = high / 2;

   int[] newArray = new int[high + 1];

   int i = low;
   int j = mid + 1;
   int k = low;

   while(i <= mid && j <= high){
     if(arr[i] < arr[j])
      newArray[k++] = arr[i++];

    else
      newArray[k++] = arr[j++];
   }

   for( ; i <= mid ; i++)
    newArray[k++] = arr[i];

  for( ; j <= high ; j++)
    newArray[k++]  = arr[j];

  for(int n = 0 ; n <= high ; n++){
    arr[n] = newArray[n];
  }
 }
}
