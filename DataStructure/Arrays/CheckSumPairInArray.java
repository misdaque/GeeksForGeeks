import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.io.IOException;

class CheckSumPairInArray{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String inpt[] = br.readLine().split(" ");
    int n = Integer.parseInt(inpt[0]);
    int x = Integer.parseInt(inpt[1]);

    inpt = br.readLine().split(" ");

    int[] arr = new int[n];

    for(int i = 0 ; i < n; i++)
      arr[i] = Integer.parseInt(inpt[i]);

    HashSet<Integer> set = new HashSet<>();

    for(int i = 0 ; i < n ; i++){
      int temp = x - arr[i];
      if(set.contains(temp))
        System.out.println("Yes " + temp+ " " +i);

      set.add(arr[i]);

    }
  }


}
