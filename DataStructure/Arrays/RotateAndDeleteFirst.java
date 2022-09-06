import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class RotateAndDeleteFirst{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    String[] str = br.readLine().split(" ");

    int[] arr = new int[n];

    for(int i = 0 ; i < n ; i++)
      arr[i] = Integer.parseInt(str[i]);

    int temp = 0 ;
    for(int i = 0; i < n - 1; i++){
      temp = arr[i];
      for(int j = i + 1 ; j < n ; j++){
        arr[j - 1] = arr[j];
      }
      arr[n - 1] = temp;
    }

    System.out.println(arr[n - 1]);
  }
}
