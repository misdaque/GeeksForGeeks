import java.util.Stack;

class MinValueInStackUsingExtraSpace{

  static Stack<Integer> stack = new Stack<>();
  static Stack<Integer> supportingStack = new Stack<>();

  public static void main(String[] args) {
    int[] arr = {18, 19, 29, 15, 16};

    for(int i : arr){
        push(i);
        System.out.println("Minimum value in stack is : " + min());
    }

  }

  private static void push(int value){

    stack.push(value);

    if(supportingStack.empty()){
        supportingStack.push(value);
        return;
    }

    if(value < supportingStack.peek())
      supportingStack.push(value);
  }

  private static int pop(){
    if(stack.empty())
      return -1;

    if(stack.peek() == supportingStack.peek()){
      supportingStack.pop();
      return stack.pop();
    } else
        return stack.pop();
  }

  private static int min(){
    if(supportingStack.empty())
      return -1;

    return supportingStack.peek();
  }
}
