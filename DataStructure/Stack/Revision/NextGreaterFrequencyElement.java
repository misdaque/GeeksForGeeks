import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

class NextGreaterFrequencyElement{
  public static void main(String[] args) {
    int[] arr = {1, 1, 2, 3, 4, 2, 1};

    Map<Integer, Integer> map = new HashMap<>();

    for(int i = 0 ; i < arr.length ; i++)
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

    int[] freq = new int[arr.length];

    Stack<Integer> stack = new Stack<>();

    for(int i = arr.length - 1 ; i >= 0 ; i-- ){

      while(!stack.empty() && map.get(stack.peek()) <= map.get(arr[i]))
        stack.pop();

      if(stack.empty())
        freq[i] = -1;
      else
        freq[i] = stack.peek();

        stack.push(arr[i]);
    }

    for(int i : freq)
      System.out.print(i + ", ");
  }
}
