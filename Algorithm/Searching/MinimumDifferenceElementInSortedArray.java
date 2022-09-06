class MinimumDifferenceElementInSortedArray{
  public static void main(String[] args) {
    int[] arr = new int[]{2, 3, 8, 10, 15};
    int element = 8;
    System.out.println("Minimum Difference Element is " + minimumDifference(arr, element));
  }

  private static int minimumDifference(int[] arr, int element){
        int start = 0;
        int end = arr.length - 1;

        if(element < arr[start])
          return 0;

        if(element > arr[end])
          return end;

        while(start <= end){
          int mid = start + (end - start) / 2;

          if(element == arr[mid])
            return mid;

          if(element > arr[mid])
            start = start + 1;
          else
            end = end - 1;
        }

        return Math.abs(arr[start] - element) < Math.abs(arr[end] - element) ? start : end;
  }
}
