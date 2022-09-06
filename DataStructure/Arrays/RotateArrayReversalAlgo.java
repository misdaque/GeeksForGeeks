import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class RotateArrayReversalAlgo{

  public static void reverse(int[] arr,int lowIndex, int highIndex){
     for(; lowIndex < highIndex ; lowIndex++, highIndex--){
       arr[lowIndex] = arr[lowIndex] + arr[highIndex];
       arr[highIndex] = arr[lowIndex] - arr[highIndex];
       arr[lowIndex] = arr[lowIndex] - arr[highIndex];
     }
     System.out.println("Reverse array is :");

     for(int a : arr)
       System.out.print(a+" ");

      System.out.println();
  }

  public static void leftRotate(int[] arr, int d, int n){
    d = d % n;

    if(d == 0)
      return;

    reverse(arr, 0 , d-1);
    reverse(arr, d, n-1);
    reverse(arr, 0, n-1);
  }

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());
    while(t-- > 0){
      String[] inpt = br.readLine().split(" ");

      int n = Integer.parseInt(inpt[0]);
      int d = Integer.parseInt(inpt[1]);

      inpt = br.readLine().split(" ");

      int[] arr = new int[n];

      for(int i = 0 ; i < n ; i++){
        arr[i] = Integer.parseInt(inpt[i]);
      }

      leftRotate(arr, d, n);

      for(int a : arr)
        System.out.print(a+" ");

      System.out.println();

    }
  }
}
