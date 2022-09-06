import java.util.Set;
import java.util.HashSet;

class FindingSubArray{
  public static void main(String[] args) {
    int[] arr = new int[]{10, 15, -5, 15, -10, 5};
    int sum = 5;

    Set<Integer> set = new HashSet<>();

    for(int i : arr)
      set.add(i);

      System.out.println(set);

    for(int i : arr){
      int x = 0;
      x = sum - i;

      if(set.contains(x) && set.contains(i)){
        System.out.println("(" + i + "," + x + ")");
        set.remove(x);
        set.remove(i);
      }
    }
  }
}
