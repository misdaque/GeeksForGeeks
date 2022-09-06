import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class RotateArray{
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

      for(int i: arr)
        System.out.print(i+" ");

      System.out.println();
    }
    br.close();
  }

  public static void rotateByOne(int[] arr, int n){
    int temp = arr[0];

    for(int i = 1 ; i < n ; i++)
      arr[i-1] = arr[i];

    arr[n-1] = temp;
  }

  public static void leftRotate(int[] arr, int d, int n){
    for(int i = 0 ; i < d ; i++)
      rotateByOne(arr, n);
  }
}
