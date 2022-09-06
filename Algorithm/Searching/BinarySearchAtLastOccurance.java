class BinarySearchAtLastOccurance{
  public static void main(String[] args) {
    int[] arr = new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
    int element = 9;

    System.out.println("Last Occurance of element found at location " + elementAtLastOccurance(arr, element));
  }

  private static int elementAtLastOccurance(int[] arr, int element){
    int start = 0 ;
    int end = arr.length - 1;
    int result = -1;

    while(start <= end ){
      int mid = start + (end - start) / 2;

      if(arr[mid] == element){
        result = mid;
        start = mid + 1;
      }
      else if(element < arr[mid])
        end = mid - 1;
      else
        start = mid + 1;
    }

    return result;
  }
}
