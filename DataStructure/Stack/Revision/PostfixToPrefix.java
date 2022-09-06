import java.util.Stack;

class PostfixToPrefix{
  public static void main(String[] args) {
    String formula = "ABC/-AK/L-*";

    Stack<String> stack = new Stack<>();

    for(int i = 0; i <= formula.length() - 1; i++){
      char c = formula.charAt(i);

      if((c >= 'a' && c <= 'z')
        || (c >= 'A' && c <= 'Z'))
          stack.push(c + "");

      else{
        String op1 = stack.pop();
        String op2 = stack.pop();

        String prefix = c + "" + op2 + op1;

        stack.push(prefix);
      }
    }

    System.out.println(stack.pop());
  }
}
