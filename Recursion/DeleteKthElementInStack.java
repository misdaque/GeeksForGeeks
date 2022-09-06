import java.util.Stack;

class DeleteKthElementInStack{
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    stack.push(12);
    stack.push(6);
    stack.push(2);
    stack.push(1);
    stack.push(19);
    stack.push(25);

    deleteKthElement(stack, (stack.size() / 2) + 1);

    System.out.println("Stack after deletion is " + stack);
  }

  public static void deleteKthElement(Stack<Integer> stack, int k){

    if(stack.size() == k){
        stack.pop();
        return;
    }

    int temp = stack.pop();

    deleteKthElement(stack, k);

    stack.push(temp);
  }

}
