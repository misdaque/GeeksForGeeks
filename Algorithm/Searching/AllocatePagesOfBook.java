class AllocatePagesOfBook{
  public static void main(String[] args) {
    int[] arr = new int[]{10, 20, 30, 40};

    int sum = 0;

    System.out.println(isValid(arr, 60, 2));

    for(int i : arr)
      sum += i;

    int result = -1;
    int start = arr[arr.length - 1];
    int end = sum;

    while(start <= end){
      int mid = start + (end - start) / 2;

      if(isValid(arr, mid, 2)){
        result = mid;
        end = mid - 1;
      }
      else{
        start = mid + 1;
      }
    }

    System.out.println("Value is " + result);

  }

  private static boolean isValid(int[] arr, int max, int k){

    boolean valid = true;

    int i = 0, sum = 0;

    while(i < arr.length && k > 0){
      sum += arr[i];

      if(sum <= max)
        i++;
      else{
        k--;
        sum = 0;
      }
    }

    if(k == 0)
      valid = false;

    return valid;
  }
}
