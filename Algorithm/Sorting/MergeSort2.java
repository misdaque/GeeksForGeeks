import java.util.Random;

class MergeSort2{
  public static void main(String[] args) {
    Random random = new Random();

    int n = 13;
    int[] arr = new int[n];

    System.out.print("Array Before Sorted: ");
    for(int i = 0 ; i < n ; i++){
      arr[i] = random.nextInt(100);
      System.out.print(arr[i] + " ");
    }

    System.out.println();

    // int[] arr2 = new int[]{4, 6, 5, 11, 12, 2, 8, 15, 7, 9};
    //
    // merge(arr2, 5, 9, 7);

    int p = 2;
    for(p = 1; p < n; p = p * 2){
      for(int i = 0; i + p <= n; i = 2 * p){
          int low = i;
          int high = i + p - 1;
          int mid = low + (high - low) / 2;

          merge(arr, low, high, mid);

          if((n - 1) - high == 1)
            merge(arr, 0, n - 1, high);
      }
      // break;
    }

    if( p/2 < n )
      merge(arr, 0, n - 1, p/2 - 1);

    System.out.print("Array after merge: ");

    for(int i : arr)
      System.out.print(i + " ");

  }

  private static void merge(int[] arr, int low, int high, int mid){
    int i = low;
    int j = mid + 1;

    int[] mergedArray = new int[high - low + 1];
    int k = 0;

    while(i <= mid && j <= high){
      if(arr[i] < arr[j])
        mergedArray[k++] = arr[i++];
      else
        mergedArray[k++] = arr[j++];
    }

    while(i <= mid)
      mergedArray[k++] = arr[i++];

    while(j <= high)
      mergedArray[k++] = arr[j++];

    for(k = 0 ; k < mergedArray.length; k++)
      arr[low++] = mergedArray[k];

    // for(int a : arr)
    //   System.out.print(a + " ");
  }
}
