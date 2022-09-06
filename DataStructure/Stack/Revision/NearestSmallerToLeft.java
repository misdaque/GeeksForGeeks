import java.util.Stack;

class NearestSmallerToLeft{
  public static void main(String[] args) {
    int[] arr = new int[]{4,5,2,10,8};

    Stack<Integer> stack = new Stack<>();

    int[] newArr = new int[arr.length];

    for(int i = 0 ; i < arr.length; i++){

      while(!stack.empty() && arr[i] <= stack.peek())
        stack.pop();

      if(stack.empty())
        newArr[i] = -1;
      else
        newArr[i] = stack.peek();

      stack.push(arr[i]);
    }

    for(int i : newArr)
      System.out.print(i + " ");
  }
}
