import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.LinkedList;


// This Class converts infix to postfix using Stacks
class InfixToPostfixConversion{

  public static void main(String[] args) throws IOException{

  BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

  String expression = br.readLine();

  char[] arr = expression.toCharArray();

  List<Character> postfix = new LinkedList<>();
  Stack<Character> stack = new Stack<>();

  for(int i = 0 ; i < arr.length ; i++){


    if((int)arr[i] >= 65 && (int)arr[i] <= 90 )
      postfix.add(arr[i]);

    else if(arr[i] == '(')
      stack.push(arr[i]);

    else if(arr[i] == ')'){
      while(!stack.empty() && (stack.peek() != '(') )
        postfix.add(stack.pop());

      stack.pop();
      }
    else{
      int priority = getPriority(arr[i]);

      while(!stack.empty()){
          if(getPriority(stack.peek()) >= priority)
            postfix.add(stack.pop());
          else
            break;
        }

      stack.push(arr[i]);

      }

    }

    while(!stack.empty())
      postfix.add(stack.pop());

    postfix.forEach(x -> System.out.print(x));
  }

  public static int getPriority(char ch){

    switch(ch){
      case '+':
      case '-':
        return 1;
      case '/':
      case '*':
        return 2;
      case '^':
        return 3;
    }
    return -1;
  }
}
