import java.util.Stack;

class InfixToPrefix{
  public static void main(String[] args) {
    String formula = "(A - B/C) * (A/K-L)";

    Stack<Character> stack = new Stack<>();
    String prefix = "";

    for(int i = formula.length() - 1; i >=0 ; i--){
        char c = formula.charAt(i);

        if(c == ' ');

        else if((c >= 'a' && c <= 'z')
          || (c >= 'A' && c <= 'Z'))
            prefix += c + "";

        else if(c == ')')
          stack.push(c);

        else if(c == '('){
            while(stack.peek() != ')')
              prefix += stack.pop() + "";

            stack.pop();
        }

        else{
          if(stack.empty() || stack.peek() == ')' || precedence(c) >= precedence(stack.peek()))
            stack.push(c);
          else{
            while(!stack.empty() && precedence(c) < precedence(stack.peek())){
              prefix += stack.pop() + "";
            }
            stack.push(c);
          }
        }
    }

    while(!stack.empty())
      prefix += stack.pop() + "";

    String finalPrefix = "";

    for(int i = prefix.length() - 1 ; i >= 0 ; i--)
      finalPrefix += prefix.charAt(i)+"";

    System.out.println(finalPrefix);
  }

  private static int precedence(char c){
    int pre = 0;

    if(c == '-')
      pre = 1;

    else if(c == '+')
      pre = 2;

    else if(c == '/')
     pre = 3;

    else if(c == '*')
     pre = 4;

    else if(c == '^')
     pre = 5;

    return pre;
  }
}
