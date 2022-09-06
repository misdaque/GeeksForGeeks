import java.util.Stack;

class NextLargestElement{
  public static void main(String[] args) {
    int[] input = new int[]{6, 8, 0, 1, 3};

    Stack<Integer> stack = new Stack<>();

    int[] arr = new int[input.length];

    for(int i = input.length - 1 ; i >= 0 ; i--){

      while(!stack.empty() && input[i] >= stack.peek()){
        stack.pop();
      }

      if(stack.empty())
        arr[i] = -1;
      else
        arr[i] = stack.peek();

      stack.push(input[i]);
    }

    for(int i : arr)
      System.out.print(i+ " ");
  }
}
