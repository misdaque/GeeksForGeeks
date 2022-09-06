class SelectionSort{
  public static void main(String[] args) {
    int[] arr = new int[]{12, 34, 5, 9, 2, 78, 99, 1, 10};

    for(int i = 0; i < arr.length; i++){
      int j = i;
      int k = i;

      while(j < arr.length){
        if(arr[j] < arr[k])
          k = j;

        j++;
      }

      if(i != k){
        arr[i] = arr[i] ^ arr[k];
        arr[k] = arr[i] ^ arr[k];
        arr[i] = arr[i] ^ arr[k];
      }
    }

    for(int i : arr)
      System.out.print(i + " ");
  }
}
