class NextAlphabetInSortedArray{
  public static void main(String[] args) {
    String str = "bcegkps";

    int n = str.length();
    char element = 'l';

    System.out.println("Next Element Found at " +nextAlphabet(str, n, 'a'));

  }

  private static int nextAlphabet(String str, int n, char element){
    int start = 0;
    int end = n - 1;

    int result = -1;

    if(element < str.charAt(start))
      return 0;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(element >= str.charAt(mid))
        start = mid + 1;
      else{
        end = mid - 1;
        result = mid;
      }
    }

    return result;
  }
}
