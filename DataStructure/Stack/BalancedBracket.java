import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class BalancedBracket{
  public static void main(String[] args) throws IOException{
    BufferedReader br =
     new BufferedReader(new InputStreamReader(System.in));

    String input = br.readLine().trim();
    char[] arr = new char[input.length()];

    for(int i = 0 ; i < arr.length ; i++)
      arr[i] = input.charAt(i);

    Stack<Character> stack = new Stack<>();
    for(int i = 0 ; i < arr.length; i++){
      if(arr[i] == '[' || arr[i] == '{' || arr[i] == '(')
        stack.push(arr[i]);
      else{
       if(arr[i] == ']'){
        if(stack.peek() == '[')
          stack.pop();
        else
          break;
        }
      else if(arr[i] == '}'){
        if(stack.peek() == '{')
          stack.pop();
        else
          break;
      }
      else if(arr[i] == ')'){
        if(stack.peek() == '(')
          stack.pop();
        else
          break;
      }
    }
    }

    if(stack.empty())
          System.out.println("Balanced Expression");
    else
          System.out.println("Unbalanced Expression ");

  }
}
