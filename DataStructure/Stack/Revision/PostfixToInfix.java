import java.util.Stack;

class PostfixToInfix {
  public static void main(String[] args) {

    String formula = "ab*c+d*e/";

    Stack<String> stack = new Stack<>();

    for(int i = 0; i < formula.length(); i++){
      char c = formula.charAt(i);

      if(isOperand(c))
        stack.push(c+"");
      else{
        String op1 = stack.pop();
        String op2 = stack.pop();

        String f = "(" + op2 + c + op1 + ")";

        stack.push(f);
      }

    }

    System.out.println(stack.pop());

  }

  private static boolean isOperand(char c){
    if((c >= 'a' && c <= 'z')
        || (c >= 'A' && c <= 'Z'))
      return true;
    else
      return false;
  }
}
