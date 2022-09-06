class BubbleSort{
  public static void main(String[] args) {
    //int[] arr = new int[]{7, 23, 87, 9, 13, 76, 10, 4};
    int[] arr = new int[]{1, 2, 4, 5, 7, 9, 10, 12};

    boolean flag = true;
    int counter = 0;

    for(int i = 0 ; i < arr.length - 1; i++){

      for(int j = 0; j < arr.length - i - 1; j++ ){
        counter++;
        if(arr[j] > arr[j + 1]){

          arr[j] = arr[j] ^ arr[j + 1];
          arr[j + 1] = arr[j] ^ arr[j + 1];
          arr[j] = arr[j] ^ arr[j + 1];

          flag = false;
        }
      }

      if(flag)
        break;
    }

    System.out.println("Number of times comparisons done " + counter);

    for(int i : arr)
      System.out.print(i + " ");
  }
}
