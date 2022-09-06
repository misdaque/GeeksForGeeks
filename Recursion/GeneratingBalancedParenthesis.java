import java.util.List;
import java.util.LinkedList;

class GeneratingBalancedParenthesis{
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();

    solve(3, 3, "", list);

    System.out.println(list);
  }

  private static void solve(int open, int close, String output, List<String> list){
    if(open == 0 && close == 0){
      list.add(output);
      return;
    }

    if(open == 0){
      output = output + ")";
      close--;
      solve(open, close, output, list);
    }else{
      if(open == close){
        output = output + "(";
        open--;
        solve(open, close, output, list);
      }else{
        String output1 = output;
        String output2 = output;

        output1 = output + "(";
        output2 = output + ")";

        solve(open - 1, close, output1, list);
        solve(open, close - 1, output2, list);
      }
    }
  }
}
