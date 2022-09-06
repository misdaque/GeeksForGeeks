import java.util.ArrayList;

class NumberSubset{
  public static void main(String[] args) {
    ArrayList<Integer> input = new ArrayList<>();

    input.add(1);
    input.add(2);
    // input.add(3);

    ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
    ArrayList<Integer> output = new ArrayList<>();

    solve(input, output, finalList);

    System.out.println(finalList);
  }

  private static void solve(ArrayList<Integer> input, ArrayList<Integer> output, ArrayList<ArrayList<Integer>> finalList){

    if(input.isEmpty()){
      finalList.add(output);
      return;
    }

    ArrayList<Integer> output2 = new ArrayList<>(output);
    output2.add(input.get(0));

    ArrayList<Integer> input2 = new ArrayList<>(input);
    input2.remove(0);

    //output = new ArrayList<>();

    solve(input2, output2, finalList);
    solve(input2, output, finalList);
  }
}
