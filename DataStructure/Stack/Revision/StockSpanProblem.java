import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

class StockSpanProblem{
  public static void main(String[] args) {
    int[] arr = new int[]{10, 4, 5, 90, 120, 80};

    int[] span = new int[arr.length];
    //Stack<List<Integer>> stack = new Stack<>();
    //Stack<Integer[]> stack = new Stack<>();
    Stack<Integer> stack = new Stack<>();

    for(int i = 0 ; i < arr.length ; i++){
      // List<Integer> list = new ArrayList<>();
      // list.add(i);
      // list.add(arr[i]);

      //Integer[] list = new Integer[]{i, arr[i]};

      //while(!stack.empty() && stack.peek().get(1) < arr[i])
      //while(!stack.empty() && stack.peek()[1] < arr[i])
      while(!stack.empty() && arr[stack.peek()] < arr[i])
        stack.pop();

      if(stack.empty())
        span[i] = i + 1;
      else{
        //span[i] = i - stack.peek().get(0);
        //span[i] = i - stack.peek()[0];
        span[i] = i - stack.peek();
      }

      //stack.push((ArrayList<Integer>) list);
      //stack.push(list);
      stack.push(i);
    }

    for(int i : span)
      System.out.print(i+ " ");
  }
}
