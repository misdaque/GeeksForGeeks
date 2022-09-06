import java.util.Random;

class QuickSort{
  public static void main(String[] args) {
    Random random = new Random();

    int[] arr = new int[10];

    System.out.println("Array before Sorting: ");
    for(int i = 0 ; i < arr.length ; i++){
      arr[i] = random.nextInt(1000);
      System.out.print(arr[i] + " ");
    }

  //  int[] arr = new int[]{27, 20};

    quickSort(arr, 0 , arr.length - 1);

    System.out.println();
    System.out.println("After Sorting");
    for(int i : arr)
      System.out.print(i + " ");
  }

  private static int partition(int[] arr, int l, int h){
    int pivot = arr[l];
    int i = l;
    int j = h;

    while(i < j){
      while(i <= j && arr[i] <= pivot) i++;
      while(j >= i && arr[j] > pivot) j--;

      if(i < j)
        swap(arr, i, j);
    }

    swap(arr, j, l);

    return j;
  }

  private static void quickSort(int[] arr, int l, int h){

    int j;

    if(l < h){
      j = partition(arr, l, h);
      quickSort(arr, l, j - 1);
      quickSort(arr, j + 1, h);
    }
  }


  // private static void quickSort(int[] arr, int lowIndex, int highIndex){
  //   if(lowIndex >= highIndex)
  //     return;
  //
  //   int pivot = lowIndex;
  //
  //   int start = lowIndex + 1;
  //   int end = highIndex;
  //
  //   while(start < end){
  //     while(arr[start] <= arr[pivot]) start++;
  //     while(arr[end] > arr[pivot]) end--;
  //
  //     if(start < end)
  //       swap(arr, start, end);
  //   }
  //
  //   swap(arr, pivot, end);
  //
  //   quickSort(arr, lowIndex, end - 1);
  //   quickSort(arr, end + 1, highIndex);
  //
  // }

  private static void swap(int[] arr,int index1, int index2){
    // arr[index1] = arr[index1] ^ arr[index2];
    // arr[index2] = arr[index1] ^ arr[index2];
    // arr[index1] = arr[index1] ^ arr[index2];

    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }
}
