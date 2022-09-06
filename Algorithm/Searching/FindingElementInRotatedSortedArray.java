class FindingElementInRotatedSortedArray{
  public static void main(String[] args) {
    String str= "66 72 79 86 95 104 106 110 119 123 124 129 132 136 137 142 150 2 12 14 17 26 30 36 38 46 52 60";
  //  String str = "11 12 15 18 2 3 4 5";
    String[] input = str.split(" ");
    int[] arr = new int[input.length];

    int i = 0;
    for(String s : input)
      arr[i++] = Integer.parseInt(s);

    int n = arr.length;
    int found = -1;
    int element = 72;

    int smallest = findSmallestElement(arr, n);

    if(arr[0] == smallest)
        found = findElement(arr, element, 0, n - 1);
    else if(element >= arr[smallest] &&
              element < arr[0])
        found = findElement(arr, element, smallest, n - 1);
    else
        found = findElement(arr, element, 0, smallest - 1);

    System.out.println("Element found at location " +found);

  }

  private static int findSmallestElement(int[] arr, int n){
    int start = 0;
    int end = n - 1;

    if(arr[0] < arr[n - 1])
      return 0;

    while(start <= end){
      int mid = start + (end - start) / 2;

      int prev = (mid - 1 + n) % n;
      int next = (mid + 1) % n;

      if(arr[prev] > arr[mid] && arr[next] > arr[mid])
        return mid;

      // if(arr[mid] >= arr[start])
      //   start = mid + 1;
      // else if(arr[mid] <= arr[end])
      //   end = mid - 1;

      if (arr[mid] <= arr[end])
         end = mid - 1;
       else if (arr[mid] >= arr[start])
         start = mid + 1;
    }

    return -1;
  }

  private static int findElement(int[] arr,int element, int start, int end){

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(element == arr[mid])
        return mid;

      if(element < arr[mid])
        end = mid - 1;
      else
        start = mid + 1;
    }

    return -1;
  }
}
