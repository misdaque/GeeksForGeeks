
class TrappingRain{
  public static void main(String[] args) {
    int[] arr = {3,0,0,2,0,4};

    int[] maxL = maxL(arr);
    int[] maxR = maxR(arr);

    int waterTrapped = 0;

    for(int i = 0 ; i < arr.length ; i++){
      waterTrapped += Math.min(maxL[i], maxR[i]) - arr[i];
    }

    System.out.println("Water Trapped Between the buildings are " + waterTrapped);
  }

  private static int[] maxL(int arr[]){
    int[] maxL = new int[arr.length];

    maxL[0] = arr[0];
    for(int i = 1 ; i < arr.length ; i++)
      maxL[i] = maxL[ i - 1 ] > arr[i] ? maxL[ i - 1] : arr[i];

    return maxL;
  }

  private static int[] maxR(int arr[]){
    int[] maxR = new int[arr.length];

    maxR[arr.length - 1] = arr[arr.length - 1];

    for(int i = arr.length - 2 ; i >= 0 ; i--)
      maxR[i] = maxR[i + 1] > arr[i] ? maxR[i + 1] : arr[i];

    return maxR;
  }
}
