class BinarySearchAtFirstOccurance{
  public static void main(String[] args) {
      int[] arr = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10};
      int element = 1;
      System.out.println("First Occurance of element " + element + " is " + binarySearchAtFirstOccurance(arr, element));
  }

  private static int binarySearchAtFirstOccurance(int[] arr, int element){

    int start = 0;
    int end = arr.length - 1;
    int result = -1;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(arr[mid] == element){
          result = mid;
          end = mid - 1;
        }
      else if(element < arr[mid])
        end = mid - 1;
      else
       start = mid + 1;
    }

    return result;
  }
}
