import java.util.Random;

class InversionCount{
  public static void main(String[] args) {
    Random random = new Random();

    int n = 8;
    int[] arr = new int[n];

    System.out.print("Given Array: ");
    for(int i = 0 ; i < n ; i++){
      arr[i] = random.nextInt(100);
      System.out.print(arr[i] + " ");
    }

    System.out.println("");
    divideArray(arr, n);
    System.out.println("Inversion Count: " + c);

    System.out.print("Merged Array: ");

    for(int i : arr)
      System.out.print(i + " ");

  }

  static int c = 0;

  private static void divideArray(int[] arr, int n){
    //int c;

    int mid = n / 2;

    if(n < 2)
      return;

    int[] leftArray = new int[mid];
    int[] rightArray = new int[n - mid];

    for(int i = 0; i < mid; i++)
      leftArray[i] = arr[i];

    for(int j = mid; j < n; j++)
      rightArray[j - mid] = arr[j];

    divideArray(leftArray, mid);
    divideArray(rightArray, n - mid);

    c += mergeAndCount(arr, leftArray, rightArray);
  }

  private static int mergeAndCount(int[] arr, int[] leftArray, int[] rightArray){
    int count = 0;

    int lA = leftArray.length;
    int rA = rightArray.length;

    int[] mergedArray = new int[lA + rA];

    int i = 0, j = 0, k = 0, h = rA - 1;

    while(i < lA && j < rA){
      if(rightArray[j] < leftArray[i]){
        mergedArray[k++] = rightArray[j++];
      }
      else{
        mergedArray[k++] = leftArray[i++];
      }
    }

    while(i < lA)
      mergedArray[k++] = leftArray[i++];

    while(j < rA)
      mergedArray[k++] = rightArray[j++];

    k = 0;

    for(i = 0; i < arr.length; i++)
      arr[i] = mergedArray[i];

    for(i = 0; i < lA; i++){
      int no = -1;
      int l = 0;
      h = rA - 1;

      while(l <= h){
        int mid = l + (h - l) / 2;

        if(rightArray[mid] < leftArray[i]){
          no = mid;
          l = mid + 1;
        } else
          h = mid - 1;
      }

      count += (no + 1);
    }

    return count;
  }


}
