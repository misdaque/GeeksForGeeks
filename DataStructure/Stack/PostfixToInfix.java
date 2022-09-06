import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class PostfixToInfix{
  public static void main(String[] args) throws IOException{
    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String exp = br.readLine();

    Stack<String> stack = new Stack<>();

    String infix = "";

    for(int i = 0 ; i < exp.length() ; i++){
      char c = exp.charAt(i);

      if(Character.isLetterOrDigit(c))
        stack.push(c+"");

      else if(!Character.isLetterOrDigit(c)){
        String sym2 = stack.pop();
        String sym1 = stack.pop();

        stack.push("("+sym1 + c + sym2 +")");
      }
    }

    infix = stack.pop();
    stack = null;

    System.out.print(infix.substring(1,infix.length() - 1));
  }
}
