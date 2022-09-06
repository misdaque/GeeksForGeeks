import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


//This method will have time complexity of O(n^2)
class StockSpanProblem{
  public static void main(String[] args) throws IOException{
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");
    int[] price = new int[input.length];
    for(int i = 0 ; i < input.length; i++){
      price[i] = Integer.parseInt(input[i]);
    }

    int[] span = new int[price.length];
    int highest = 1;
    span[0] = 1;
    Stack<Integer> stack = new Stack<>();
    stack.push(arr[0]);

    for(int i = 1 ; i < price.length; i++){
      if(price[i] < stack.peek()){
        span[i] = 1;
        stack.push(arr[i]);
      }
      else{
        while(!stack.empty() && price[i] > stack.peek() ){
          highest++;
          stack.pop();
          }
        stack.push(arr[i]);
        span[i] = highest;
      }
    }

    for(int i : span)
      System.out.print(i + " ");
  }
}
