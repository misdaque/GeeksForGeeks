class FindingElementInNearlySortedArray{
  public static void main(String[] args) {
    String str= "2 12 14 17 26 30 36 38 46 60 52 66 72 79 86 95 104 106 110 119 123 124 129 132 136 137 142 150";
  //  String str = "5 10 1";
    String[] input = str.split(" ");
    int[] arr = new int[input.length];

    int i = 0;
    for(String s : input)
      arr[i++] = Integer.parseInt(s);

    System.out.println("Element found at " + findElement(arr, arr.length, 1));
  }

  private static int findElement(int[] arr, int n, int element){

    int start = 0;
    int end = n - 1;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(arr[mid] == element)
        return mid;

      if((mid - 1) >= start && arr[mid - 1] == element)
        return mid - 1;

      if((mid + 1) <= end && arr[mid + 1] == element)
        return mid + 1;

      if(element <= arr[mid])
        end = mid - 2;
      else
        start = mid + 2;
    }
    return -1;
  }
}
