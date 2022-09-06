import java.util.Stack;

class MaxAreaOfRectInBinaryMatrix{
  public static void main(String[] args) {
    int[][] input = {
      {0, 1, 1, 0},
      {1, 1, 1, 1},
      {1, 1, 1, 1},
      {1, 1, 1, 1}
    };

    int max = mah(input[0]);

    for(int i = 1; i < input.length ; i++){
      for(int j = 0; j < input[i].length; j++){

        if(input[i][j] == 1)
          input[i][j] += input[i - 1][j];
        else
          input[i][j] = 0;
      }

      int result = mah(input[i]);
      max = result > max ? result : max;
    }

    System.out.println("Maximum value is " + max);

  }

  private static int mah(int[] arr){
    int max = 0;

    int[] nslIndex = nsl(arr);
    int[] nsrIndex = nsr(arr);

    for(int i = 0 ; i < arr.length; i++){
      int area = ((nsrIndex[i] - nslIndex[i]) - 1 ) * arr[i];

      max = area > max ? area : max;
    }

    return max;

  }

  private static int[] nsl(int[] arr){

    int[] nslIndex = new int[arr.length];

    Stack<Integer> stack = new Stack<>();

    for(int i = 0 ; i < arr.length ; i++){

      while(!stack.empty() && arr[stack.peek()] >= arr[i])
        stack.pop();

      if(stack.empty())
        nslIndex[i] = -1;
      else
        nslIndex[i] = stack.peek();

      stack.push(i);
    }

    return nslIndex;
  }

  private static int[] nsr(int[] arr){
    int[] nsrIndex = new int[arr.length];

    Stack<Integer>  stack = new Stack<>();

    for(int i = arr.length - 1 ; i >= 0 ; i--){

      while(!stack.empty() && arr[stack.peek()] >= arr[i])
        stack.pop();

      if(stack.empty())
        nsrIndex[i] = arr.length;
      else
        nsrIndex[i] = stack.peek();

      stack.push(i);
    }

    return nsrIndex;
  }
}
