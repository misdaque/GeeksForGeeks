import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SortQuick2{

  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());

      String[] inpt = br.readLine().trim().split(" ");

      int[] arr = new int[n+1];

      for(int i = 0 ; i < n ; i++)
        arr[i] = Integer.parseInt(inpt[i]);


        /*


        Incomplete



        */

    }
}
