import java.util.Random;

class MergeSortRecursively{

  static int woof = 0;

  public static void main(String[] args) {
    Random random = new Random();

    int n = 10;
    int[] arr = new int[n];

    System.out.print("Array Before Sorted: ");
    for(int i = 0 ; i < n ; i++){
      arr[i] = random.nextInt(100);
      System.out.print(arr[i] + " ");
    }

    System.out.println();

    mergeSort(arr);

    System.out.print("Array after merge: ");

    for(int i : arr)
      System.out.print(i + " ");
  }

  private static void mergeSort(int[] arr){
    if(arr.length < 2)
      return;

    int length = arr.length;
    int mid = length / 2;

    int[] leftArray = new int[mid];
    int[] rightArray = new int[length - mid];

    for(int i = 0 ; i < mid; i++)
      leftArray[i] = arr[i];

    for(int i = mid; i < length; i++)
      rightArray[i - mid] = arr[i];

    mergeSort(leftArray);
    mergeSort(rightArray);

    System.out.print("Merged Call "+ ++woof + " : ");
    merge(arr, leftArray, rightArray);

  }

  private static void merge(int[] arr, int[] leftArray, int[] rightArray){
    int i = 0, j = 0, k = 0;

    int leftLength = leftArray.length;
    int rightLength = rightArray.length;

    int[] mergedArray = new int[leftLength + rightLength];

    while(i < leftLength && j < rightLength){

      if(leftArray[i] < rightArray[j])
          mergedArray[k++] = leftArray[i++];
      else
          mergedArray[k++] = rightArray[j++];
    }


    while(i < leftLength)
      mergedArray[k++] = leftArray[i++];

    while(j < rightLength)
      mergedArray[k++] = rightArray[j++];

    for(k = 0 ; k < mergedArray.length; k++){
      arr[k] = mergedArray[k];
    }

    for(k = 0 ; k < arr.length; k++)
      System.out.print(arr[k] + " ");

    System.out.println();
  }
}
