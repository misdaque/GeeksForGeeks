class CountElementInSortedArray{
  public static void main(String[] args) {
    int[] arr = new int[]{5, 5, 5, 5,5, 5,5, 5,5, 5};
    int element = 5;

    int last = lastOccurance(arr, element);
    if(last == -1)
      System.out.println("Element Doesn't Exist");
    else{
      int first = firstOccurance(arr, element);

      System.out.println("Frequency of element is "+ ((last - first) + 1));
    }

  }

  private static int lastOccurance(int[] arr, int element){
    int start = 0;
    int last  = arr.length - 1;
    int result = -1;

    while(start <= last){
      int mid = start + (last - start) / 2;

      if(arr[mid] == element){
          result = mid;
          start = mid + 1;
      } else if(element < arr[mid])
          last = mid - 1;
      else
        start = mid + 1;
    }

    return result;
  }

  private static int firstOccurance(int[] arr, int element){
    int start = 0;
    int last = arr.length - 1;
    int result = -1;

    while(start <= last){
      int mid = start + (last - start) / 2;

      if(arr[mid] == element){
        result = mid;
        last = mid - 1;
      }
      else if(element < arr[mid])
        last = mid - 1;
      else
        start = mid + 1;
    }

    return result;
  }
}
