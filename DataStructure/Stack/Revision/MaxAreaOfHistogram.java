import java.util.Stack;

class MaxAreaOfHistogram{
  public static void main(String[] args) {
    int[] arr = new int[]{6, 2, 5, 4, 5, 1, 6};

    int[] nsrIndex = findNSR(arr);
    int[] nslIndex = findNSL(arr);

    int greatest = 0;

    for(int i = 0; i < arr.length ; i++){
      int area = ((nsrIndex[i] - nslIndex[i]) - 1) * arr[i];

      greatest = area > greatest ? area : greatest;
    }

    System.out.println("Greatest area is " + greatest);
  }

  private static int[] findNSR(int[] arr){
    int[] nsrIndex = new int[arr.length];

    Stack<Integer> stack = new Stack<>();
    for(int i = arr.length - 1; i >= 0; i--){

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

  private static int[] findNSL(int[] arr){
    int[] nslIndex = new int[arr.length];

    Stack<Integer> stack = new Stack<>();

    for(int i = 0; i < arr.length; i++){

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
}
