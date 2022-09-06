import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


//This approach has time complexity of O(n)
class StockSpanProblem2{
  public static void main(String[] args) throws IOException{
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String[] input = br.readLine().trim().split(" ");
    int[] arr = new int[input.length];
    for(int i = 0 ; i < input.length; i++){
      arr[i] = Integer.parseInt(input[i]);
    }

    Stack<Integer> stack = new Stack<>();
    int[] span = new int[arr.length];

    stack.push(0);
    span[0] = 1;

    for(int i = 1 ; i < arr.length ; i++){
      while(!stack.empty() && arr[i] > arr[stack.peek()])
        stack.pop();

      span[i] = stack.empty() ? (i + 1) : (i - stack.peek());

      stack.push(i);
    }

    for(int i : span)
      System.out.print(i + " ");
  }
}
