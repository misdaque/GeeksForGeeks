import java.util.Stack;

class StackSort{
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(5);
    stack.push(3);
    stack.push(8);
    stack.push(14);
    stack.push(15);
    stack.push(10);
    stack.push(10);

    sort(stack);

    System.out.println("Sorted stack is " + stack);
  }

  private static void sort(Stack<Integer> stack){

    if(stack.size() == 1 || stack.isEmpty())
      return;

    int temp = stack.pop();

    sort(stack);

    insert(stack, temp);
  }

  private static void insert(Stack<Integer> stack, int temp){

    if(stack.size() == 0 || stack.peek() <= temp){
      stack.push(temp);
      return;
    }

    int temp2 = stack.pop();

    insert(stack, temp);

    stack.push(temp2);
  }
}
