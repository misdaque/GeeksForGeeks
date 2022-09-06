/*Find maximum value of Sum( i*arr[i])
  with only rotations on given array allowed*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

  class MaximumSum{
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());

      String[] inpt = br.readLine().split(" ");

      int[] arr = new int[n];

      for(int i = 0 ; i < n ; i++)
        arr[i] = Integer.parseInt(inpt[i]);

      int greatestSum = sumOfArrays(arr,n);

      int sum = 0 ;
      for(int i = 1 ; i < n  ; i++){
        rotateByOne(arr, n);
        sum = sumOfArrays(arr, n);
        
        greatestSum = sum >= greatestSum ? sum : greatestSum;
      }

      System.out.println(greatestSum);

    }

    private static void rotateByOne(int[] arr, int n){
      int temp = arr[0];

      for(int i = 1 ; i < n ; i++)
        arr[i - 1] = arr[i];

      arr[n - 1] = temp;

    }

    private static int sumOfArrays(int[] arr,int n){
      int sum = 0 ;

      for(int i = 1 ; i < n ; i++)
        sum += (arr[i] * i);

      return sum;

    }


  }
