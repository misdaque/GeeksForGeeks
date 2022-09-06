import java.util.Stack;
import java.util.Random;

class ReverseStack{
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();

    Random rand = new Random();

    for(int i = 0; i < 10 ; i++){
      stack.push(rand.nextInt(100));
    }

    System.out.println("Original Stack is " + stack);

    reverse(stack);

    System.out.println("Reversed Stack is " + stack);
  }

  private static void reverse(Stack<Integer> stack){

    if(stack.size() == 1 || stack.isEmpty())
      return;

    int temp = stack.pop();

    reverse(stack);

    insert(stack, temp);
  }

  private static void insert(Stack<Integer> stack, int e){

    if(stack.isEmpty()){
      stack.push(e);
      return;
    }

    int temp = stack.pop();

    insert(stack, e);

    stack.push(temp);
  }
}
