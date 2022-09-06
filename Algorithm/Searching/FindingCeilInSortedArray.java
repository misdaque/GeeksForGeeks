class FindingCeilInSortedArray{
  public static void main(String[] args) {
    String str= "2 12 14 17 26 30 36 38 46 60 52 66 72 79 86 95 104 106 110 119 123 124 129 132 136 137 142 150";
  //  String str = "5 10 13 17 21 32 34 45";
    String[] input = str.split(" ");
    int[] arr = new int[input.length];

    int i = 0;
    for(String s : input)
      arr[i++] = Integer.parseInt(s);

    System.out.println("Ceil of the element is " + findingCeil(arr, arr.length, 14));
  }

  private static int findingCeil(int[] arr, int n, int element){
    int start = 0;
    int end = n - 1;
    int result = -1;

    if(element > arr[end])
      return result;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(element == arr[mid])
        return mid;

      if(element > arr[mid])
        start = mid + 1;
      else{
        result = mid;
        end = mid - 1;
      }
    }
    return result;
  }
}
