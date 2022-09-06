class PermutationWithCase{
  public static void main(String[] args) {
    solve("abc", "");
  }

  private static void solve(String input, String output){
    if(input.length() == 0){
      System.out.println(output);
      return;
    }

    String output1 = output + input.charAt(0);
    String output2 = output + (input.charAt(0) + "" ).toUpperCase();

    input = input.substring(1);

    solve(input, output1);
    solve(input, output2);
  }
}
