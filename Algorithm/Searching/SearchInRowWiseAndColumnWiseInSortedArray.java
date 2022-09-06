import java.util.List;
import java.util.LinkedList;

class SearchInRowWiseAndColumnWiseInSortedArray{
  public static void main(String[] args) {
    int[][] arr = new int[][]{{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
    int key = 31;
    int mid = -1;

    int row = 4;
    int column = 4;

    int i = 0, j = column - 1;
    int counter = 0;

    List<Integer> list = new LinkedList<>();

    while(i < row && j >= 0){
      counter++;
      mid = arr[i][j];

      if(mid == key){
        list.add(i);
        list.add(j);

        break;
      }

      if(key > mid)
        i++;
      else if(key < mid)
        j--;
    }

    if(!list.isEmpty())
      System.out.println("Found Element "+ key +" at arr[" + list.get(0) +"]["+ list.get(1) +"]");
    else
      System.out.println("Element not found");

    System.out.println("Counter = " + counter);
  }
}
