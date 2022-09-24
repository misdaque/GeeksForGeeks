class HeapImplementation{
  public static void main(String[] args) {
      int[] arr = new int[]{10, 20, 30, 25, 5, 40, 35};

      System.out.print("Original Array is: ");
      for(int i : arr)
        System.out.print(i + " ");

      System.out.println();

      // for(int i = 1; i < arr.length ; i++)
      //   maxHeapInsertRevision(arr, i);

      heapifyInsert(arr);

      System.out.print("Max Heap is: ");

      for(int i : arr)
        System.out.print(i + " ");

      System.out.println();

      System.out.print("Sorted Array is: ");

      heapSort(arr);

      for(int i : arr)
        System.out.print(i + " ");

      // delete(arr, arr.length - 1);
      //
      // System.out.println();
      //
      // System.out.print("Max Heap is: ");
      //
      // for(int i : arr)
      //   System.out.print(i + " ");

  }

  private static void heapSort(int[] arr){
    for(int i = 1; i < arr.length; i++)
      maxHeapInsert(arr, i);

    for(int i = arr.length - 1; i >=0; i--)
      delete(arr, i);
  }

  private static void maxHeapInsert(int[] arr, int i){
    int temp = arr[i];
    int prev = i;

    while(i >= 0){
      i = i % 2 == 0 ? (i - 1) / 2 : (i - 2) / 2;

      if(temp > arr[i]){
        arr[prev] = arr[i];
        arr[i] = temp;
        prev = i;
      } else{
        break;
      }
    }
  }

  private static void maxHeapInsertRevision(int[] arr, int i){
    int temp = arr[i];
    int prev = i;

    while(i >= 0){

      i = (i & 1) != 0 ? (i - 2) / 2 : (i - 1) / 2;

      if(temp > arr[i]){
        arr[prev] = arr[i];
        arr[i] = temp;
      } else
        break;

        prev = i;
    }
  }

  private static void heapifyInsert(int arr[]){
    // int i = arr.length - 1;
    for(int i = arr.length - 1; i >= 0; i--){
      int lc;
      int rc;
      int j = i;
      int greaterIndex = -1;

      while(true){
        lc = (j << 1) + 1;
        rc = lc + 1;

        if(rc < arr.length){
          greaterIndex = arr[rc] > arr[lc] ? rc : lc;
        }
        else if(lc < arr.length){
          greaterIndex = lc;
        }
        else
          break;

        System.out.println();
        System.out.println("Greater Index " + greaterIndex);

        if(arr[j] < arr[greaterIndex]){
          arr[j] = arr[j] ^ arr[greaterIndex];
          arr[greaterIndex] = arr[j] ^ arr[greaterIndex];
          arr[j] = arr[j] ^ arr[greaterIndex];
        } else
            break;

          j = greaterIndex;
          greaterIndex = -1;
      }
    }
  }

  private static void delete(int[] arr, int h){
    int i = 0;
    int deleted = arr[0];

    arr[0] = arr[h];
    arr[h] = deleted;

    h--;

    int lc = 2 * i + 1;
    int rc = lc + 1;

    int greaterIndex = -1;

    while(true){
      if(rc <= h)
        greaterIndex = arr[rc] > arr[lc] ? rc : lc;
      else if(lc <= h)
        greaterIndex = lc;
      else
        return;

      if(arr[greaterIndex] > arr[i]){
        arr[greaterIndex] = arr[greaterIndex] ^ arr[i];
        arr[i] = arr[greaterIndex] ^ arr[i];
        arr[greaterIndex] = arr[greaterIndex] ^ arr[i];
      }
      else
        return;

      i = greaterIndex;

      lc = 2 * i + 1;
      rc = lc + 1;
    }
  }
}
