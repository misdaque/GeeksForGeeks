import java.util.Stack;

class SmallerToRight{
  public static void main(String[] args) {
    int[] arr = new int[]{4, 5, 2, 10, 8};

    Stack<Integer> stack = new Stack<>();

    for(int i = arr.length - 1 ; i >= 0 ; i--){
      int temp = 0;
      while(!stack.empty() && arr[i] <= stack.peek())
        stack.pop();

      temp = arr[i];

      if(stack.empty())
        arr[i] = -1;
      else
        arr[i] = stack.peek();

      stack.push(temp);
    }

    for(int i : arr)
      System.out.print( i + " " );
  }
}
