import java.util.Random;

class MergeSort{
  public static void main(String[] args) {
    Random random = new Random();

    int[] arr = new int[8];

    System.out.print("Array before Sort: ");
    for(int i = 0 ; i < arr.length; i++){
      arr[i] = random.nextInt(100);
      System.out.print(arr[i] + " ");
    }

    System.out.println();

    // int[] arr1 = new int[]{53, 35, 64, 88, 29, 58, 71, 86};
    //
    // merge2(arr1, 0, 1, 2);
    //
    // System.out.print("Sortd array is ");
    //
    // for(int i : arr1)
    //    System.out.print(i + " ");

    int n = arr.length;
    int p = 0;

    for(p = 2; p <= n; p = p * 2){
      for(int i = 0; i + p  < n; i = i + p){
        int l = i;
        int h = l + p - 1;
        int mid = l + (h - l) / 2;

        merge2(arr, l,mid, h, p);
      }
    }

    if(p/2 < n){
      System.out.print("inside condition");
      merge2(arr, 0, p/2 - 1, n - 1, n);
    }

    System.out.print("Sortd array is ");

    for(int i : arr)
      System.out.print(i + " ");

  }


  private static void merge(int[] arr, int l, int mid, int h){
    int[] mergedArray = new int[h + 1];

    int i = l;
    int j = mid + 1;
    int k = l;

    while(i <= mid && j <= h){

      if(arr[i] < arr[j])
        mergedArray[k++] = arr[i++];
      else
        mergedArray[k++] = arr[j++];
    }

    for(; i <= mid; i++)
      mergedArray[k++] = arr[i];

    for(; j <= h; j++)
      mergedArray[k++] = arr[j];

    for(i = l ; i <= h; i++){
      arr[i] = mergedArray[i];
    }
    System.out.println();
  }


  private static void mergeAgain(int[] arr, int n){

  }

  private static void merge2(int[] arr, int low,int mid, int high, int p){
    int[] mergedArray = new int[high + 1];

    // int mid = (low + high) / 2;
    int i = low;
    int j = mid + 1;
    int k = low;

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

    for(i = low; i <= high; i++)
      arr[i] = mergedArray[i];

  }
}
