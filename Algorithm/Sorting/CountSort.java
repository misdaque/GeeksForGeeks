import java.util.Random;

class CountSort{
  public static void main(String[] args) {
    Random random = new Random();

    int n = 10;
    int[] arr = new int[n];

    System.out.print("Array Before Sorted: ");
    for(int i = 0 ; i < n ; i++){
      arr[i] = random.nextInt(100);
      System.out.print(arr[i] + " ");
    }

    System.out.println();

    System.out.print("Array after Sort: ");

    countSort(arr, n);

    for(int i : arr)
      System.out.print(i + " ");

  }

  private static void countSort(int[] arr, int n){
    int[] count = new int[max(arr, n) + 1];

    for(int i = 0 ; i < n; i++){
      count[arr[i]]++;
    }

    int i = 0;
    int j = 0;
    while(i < count.length){
      if(count[i] != 0){
        arr[j++] = i;
        count[i]--;
      } else
          i++;
    }
  }

  private static int max(int[] arr, int n){
    int max = arr[0];

    for(int i = 1; i < n ; i++){
      if(arr[i] > max)
        max = arr[i];
    }

    return max;
  }
}
