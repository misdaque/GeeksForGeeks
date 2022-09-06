import java.util.Stack;

class ValidExpression{
  public static void main(String[] args) {

    String str = "(){}[]";

    Stack<Character> stack = new Stack<>();

    boolean valid = true;

    for(int i = 0 ; i < str.length() ; i++){
      char c = str.charAt(i);

      if(c == '(' || c == '{' || c == '[')
        stack.push(c);

      else if(!stack.empty()){
        if(stack.peek() != inverse(c)){
          valid = false;
          break;
        }

        stack.pop();
      }
    }

    if(!stack.empty()){
      valid = false;
    }

      System.out.println("Is Valid ? " +valid);
  }

  private static char inverse(char c){
    switch(c){
      case ')':
        return '(';
      case '}':
        return '{';
      case ']':
        return '[';
      default:
        return '?';
    }
  }
}
