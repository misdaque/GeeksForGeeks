//Find the next greater number in the array to every element.
//For last element or no greater element to the right the gretear element will be -1


//This approach is a very naive approach having time complexity of O(n^2)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class NextGreaterNumber{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");

    int[] arr = new int[input.length];
    for(int i = 0 ; i < arr.length ; i++)
      arr[i] = Integer.parseInt(input[i]);

    int highest = -1;

    for(int i = 0 ; i < arr.length ; i++){
      for(int j = i + 1 ; j < arr.length ; j++){
        if(arr[j] > arr[i]){
          highest = arr[j];
          break;
        }
      }
      System.out.println(arr[i]+ " --> " + highest);
      highest = -1;
    }
  }
}
