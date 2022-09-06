class LetterCaseTransformationPermutation{
  public static void main(String[] args) {
      solve("a1b2", "");
  }

  public static void solve(String input, String output){

    if(input.length() == 0){
      System.out.println(output);
      return;
    }

    char c = input.charAt(0);

    if(c >= '0' && c <= '9'){
      output += c;
      input = input.substring(1);

      solve(input, output);
    } else {
      String output1 = output + (c + "").toLowerCase();
      String output2 = output + (c + "").toUpperCase();

      input = input.substring(1);

      solve(input, output1);
      solve(input, output2);
    }
  }
}
