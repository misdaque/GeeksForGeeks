class AddingSpaceBetweenCharacter{
  public static void main(String[] args) {
      solve("", "ABC");
  }

  private static void solve(String output, String input){

    if(input.length() == 1){
      System.out.println(output + input);
      return;
    }

    String output1 = output, output2 = output;

    output1 = output + input.charAt(0);
    output2 = output + input.charAt(0) + "_";
    String input2 = input.substring(1);

    solve(output1, input2);
    solve(output2, input2);
  }
}
