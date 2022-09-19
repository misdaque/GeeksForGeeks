class HeapImplementation{
  public static void main(String[] args) {
      int[] arr = new int[]{10, 20, 30, 25, 5, 40, 35};

      System.out.print("Original Array is: ");
      for(int i : arr)
        System.out.print(i + " ");

      System.out.println();

      for(int i = 1; i < arr.length ; i++)
        maxHeapInsert(arr, i);

      System.out.print("Max Heap is: ");

      for(int i : arr)
        System.out.print(i + " ");

  }

  private static void maxHeapInsert(int[] arr, int i){
    int temp = arr[i];
    int prev = i;

    while(i >=0){
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
}
