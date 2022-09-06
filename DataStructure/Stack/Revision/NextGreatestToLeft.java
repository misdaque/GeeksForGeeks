import java.util.Stack;

class NextGreatestToLeft{
  public static void main(String[] args) {
    int[] arr = new int[]{13, 7, 6, 12};

    int[] newArray = new int[arr.length];

    Stack<Integer> stack = new Stack<>();

    for(int i = 0 ; i < arr.length ; i++){

      while(!stack.empty() && arr[i] >= stack.peek())
        stack.pop();

      if(stack.empty())
        newArray[i] = -1;
      else
        newArray[i] = stack.peek();

      stack.push(arr[i]);
    }

    for(int i : newArray)
      System.out.print(i + " ");
  }


}
