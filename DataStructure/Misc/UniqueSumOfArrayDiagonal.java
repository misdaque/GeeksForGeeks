//Asked in Amdocs Oct 2021
//Make a n*m matrix to square if it is not a square matrix by appending 1
//Then add the diagonals if the elemnts of diagonals are not present in any other location
//If present in anyither location then take the diagonal as 0

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

class UniqueSumOfArrayDiagonal{
  public static void main(String[] args) throws IOException{
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");

    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);

    input = br.readLine().trim().split(" ");

    int[][] arr = new int[n][m];
    for(int i = 0, k = 0 ; i < n ; i++)
      for(int j = 0 ; j < m ; j++)
        arr[i][j] = Integer.parseInt(input[k++]);

      int sum = convertMatrixToSquareAndSum(arr, n, m);

      System.out.println(sum);
  }

  private static int convertMatrixToSquareAndSum(int[][] arr, int n, int m){
      int sum = 0;
      int r = n;
      int c = m;

      Map<Integer, Integer> diagonals = new HashMap<>();
      Map<Integer, Integer> nonDiagonals = new HashMap<>();

      r = n > m ? n : m;
      c = r;

      int[][] newArray = new int[r][c];

      for(int i = 0 ; i < r ; i++){
        for(int j = 0 ; j < c ; j++){
            if(i >= n || j >= m)
              newArray[i][j] = 1;
            else
              newArray[i][j] = arr[i][j];

              if(i == j)
                diagonals.put(newArray[i][j], diagonals.getOrDefault(newArray[i][j], 0) + newArray[i][j]);
              else
                nonDiagonals.put(newArray[i][j], newArray[i][j]);
          }
        }

      // for(int x : diagonals){
      //   if(!nonDiagonals.contains(x))
      //     sum += x;
      // }

      for(Integer key : diagonals.keySet()){
          if(!nonDiagonals.containsKey(key))
            sum += diagonals.get(key);
      }
      return sum;
  }
}
