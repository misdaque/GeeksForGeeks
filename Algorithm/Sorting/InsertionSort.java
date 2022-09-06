class InsertionSort{
  public static void main(String[] args) {
    int[] arr = new int[]{23, 34, 7, 9, 19, 10, 15, 2};

    for(int i = 1; i < arr.length; i++){

      int j = i - 1;
      int temp = arr[i];

      while(j >= 0 && arr[j] > temp){
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = temp;

      // for(int j = (i - 1); j >= 0; j--){
      //   if(arr[j + 1] < arr[j]){
      //
      //     arr[j] = arr[j] ^ arr[j + 1];
      //     arr[j + 1] = arr[j] ^ arr[j + 1];
      //     arr[j] = arr[j] ^ arr[j + 1];
      //   }else
      //     break;
      }

    for(int i : arr)
      System.out.print(i + " ");
  }
}
