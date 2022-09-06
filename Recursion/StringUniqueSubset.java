import java.util.Set;
import java.util.HashSet;

class StringUniqueSubset{
  public static void main(String[] args) {

    String input = "aab";

    Set<String> finalSet = new HashSet<>();

    solve(input, "", finalSet);

    System.out.println(finalSet);
  }

  private static void solve(String input, String output, Set<String> finalSet){
    if(input.length() == 0){
      finalSet.add(output);
      return;
    }

    String output2 = output + input.charAt(0);
    String input2 = input.substring(1);

    solve(input2, output, finalSet);
    solve(input2, output2, finalSet);
  }
}
