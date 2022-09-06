class FindingFloorElementInSortedArray{
  public static void main(String[] args) {
    String str= "2 12 14 17 26 30 36 38 46 60 52 66 72 79 86 95 104 106 110 119 123 124 129 132 136 137 142 150";
  //  String str = "5 10 1";
    String[] input = str.split(" ");
    int[] arr = new int[input.length];

    int i = 0;
    for(String s : input)
      arr[i++] = Integer.parseInt(s);

    System.out.println("Floor of the element is " + findingFloorElement(arr, arr.length, 1));
  }

  private static int findingFloorElement(int[] arr, int n, int element){
    int start = 0;
    int end = n - 1;
    int result = -1;

    if(element < arr[0])
      return result;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(arr[mid] == element)
        return mid;

      if(arr[mid] < element){
        result = mid;
        start = mid + 1;
      }
      else
        end = mid - 1;
    }

    return result;
  }
}
