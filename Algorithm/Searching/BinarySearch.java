class BinarySearch{
  public static void main(String[] args) {

    int[] arr = new int[]{1,3,5,7,9,13,16,19,27,29,31,34,36,38,40};
    int element = 19;
    System.out.println("Element " + element +" is at location " +binarySearch(arr, element));

  }

  private static int binarySearch(int[] arr, int element){
    int start = 0;
    int end = arr.length - 1;

    while(start <= end){

    int mid = start + (end - start) / 2 ;

      if(arr[mid] == element)
        return mid;

      if(element > arr[mid])
        start = mid + 1;
      else
        end = mid - 1;
    }

    return - 1;
  }
}
