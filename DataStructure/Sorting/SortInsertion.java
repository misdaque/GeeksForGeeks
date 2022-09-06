/*Sorting using Insertion technique*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SortInsertion{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];

    String[] inpt = br.readLine().split(" ");

    for(int i = 0 ; i < n ; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    for(int i = 1 ; i < n ; i++){
      int temp = arr[i];
      for(int j = i - 1 ; j >= 0 ; j--){
        if(temp < arr[j]){
          arr[j + 1] = arr[j];
          arr[j] = temp;
        }
      }
    }

    for(int i : arr)
      System.out.print(i + " ");
  }

}
