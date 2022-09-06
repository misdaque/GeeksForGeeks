import java.util.Set;
import java.util.HashSet;

class CountCommonElementsInTwoArrays{
  public static void main(String[] args) {
    int[] arr1 = new int[]{5, 10, 15, 5, 10};
    int[] arr2 = new int[]{1, 2, 3};

    Set<Integer> set = new HashSet<Integer>();

    int count = 0;

    for(int i : arr1)
      set.add(i);

    for(int i : arr2){
      if(set.contains(i)){
        count++;
        set.remove(i);
      }
    }

    System.out.println("Number of common Elements " + count);
  }
}
