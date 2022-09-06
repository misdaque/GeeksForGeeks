class FindElementInMountainArray{
  public static void main(String[] args) {
    int[] arr = new int[]{15, 32, 28, 27, 22, 20, 18};
    int element = 10;

    int peek = findPeekElement(arr, arr.length);

    if(element == arr[peek])
      System.out.println("Element found at " + peek + " index");
    else{

      int found = findInAscend(arr, element, peek - 1);

      if(found == -1)
        found = findInDescend(arr, element, peek + 1);

      System.out.println("Element found at "+ found + " index");
    }


  }

  private static int findPeekElement(int[] arr, int n){
    int start = 0;
    int end = n - 1;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(mid > 0 && mid < n - 1 && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
        return mid;

      if(arr[mid + 1] > arr[mid])
        start = mid + 1;
      else
        end = mid - 1;
    }

    return -1;
  }

  private static int findInAscend(int[] arr,int element, int end){
    int start = 0;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(arr[mid] == element)
        return mid;

      if(element < arr[mid])
        end = mid - 1;
      else
        start = mid + 1;
    }

    return -1;
  }

  private static int findInDescend(int[] arr, int element, int start){
    int end = arr.length - 1;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(element == arr[mid])
        return mid;

      if(element < arr[mid])
        start = mid + 1;
      else
        end = mid - 1;
    }

    return -1;
  }
}
