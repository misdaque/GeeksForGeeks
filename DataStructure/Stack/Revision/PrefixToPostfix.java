import java.util.Stack;

class PrefixToPostfix{
  public static void main(String[] args) {
    String formula = "*-A/BC-/AKL";

    Stack<String> stack = new Stack<>();

    for(int i = formula.length() - 1 ; i >= 0 ; i--){
      char c = formula.charAt(i);

      if((c >= 'a' && c <= 'z')
        || (c >= 'A' && c <= 'Z'))
          stack.push(c+"");
      else{
        String op1 = stack.pop();
        String op2 = stack.pop();

        String postfix = op1 + op2 + c + "";

        stack.push(postfix);
      }
    }

    System.out.println(stack.pop());
  }
}
