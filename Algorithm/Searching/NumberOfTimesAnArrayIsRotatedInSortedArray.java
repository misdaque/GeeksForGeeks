class NumberOfTimesAnArrayIsRotatedInSortedArray{
  public static void main(String[] args) {
    String str= "66 72 79 86 95 104 106 110 119 123 124 129 132 136 137 142 150 2 12 14 17 26 30 36 38 46 52 60";
  //  String str = "5 10 1";
    String[] input = str.split(" ");
    int[] arr = new int[input.length];

    int i = 0;
    for(String s : input)
      arr[i++] = Integer.parseInt(s);

    int result = countMidElement(arr, arr.length);

    if(result == -1)
      System.out.println("Array Not Rotated");
    else
      System.out.println("Array Rotated by " + result);
  }

  private static int countMidElement(int[] arr,int n){
    int start = 0;
    int end = n - 1;

    System.out.println("n value is " +n );

    if(arr[start] < arr[end])
        return 0;

    while(start <= end){
        int mid = start + (end - start) / 2;

        int next = (mid + 1) % n;
        int prev = (mid - 1 + n) % n;

        if(arr[prev] > arr[mid] && arr[next] > arr[mid])
          return mid;

      if (arr[mid] <= arr[end])
         end = mid - 1;
       else if (arr[mid] >= arr[start])
         start = mid + 1;
    }

    System.out.println("Outside While Loop");

    return 0;
  }
}
