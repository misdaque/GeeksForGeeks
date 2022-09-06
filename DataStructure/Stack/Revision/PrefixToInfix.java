import java.util.Stack;

class PrefixToInfix{
  public static void main(String[] args) {
    String formula = "*-A/BC-/AKL";

    Stack<String> stack = new Stack<>();

    String infix = "";

    for(int i = formula.length() - 1 ; i >= 0 ; i--){
      char c = formula.charAt(i);

      if(c != ' '){
        if((c >= 'a' && c <= 'z')
          ||(c >= 'A' && c <= 'Z'))
            stack.push(c + "");

        else{
          String op1 = stack.pop();
          String op2 = stack.pop();

          infix = "(" + op1 + c + "" + op2 + ")";

          stack.push(infix);
        }
      }
    }

    System.out.println(stack.pop());
  }
}
