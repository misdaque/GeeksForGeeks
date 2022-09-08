//https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle1840/1

import java.util.List;
import java.util.ArrayList;

class JosephusProblem{
  public static void main(String[] args) {

    int n = 40;

    List<Integer> list = new ArrayList<>();

    for(int i = 1 ; i <= n; i++)
      list.add(i);

    execute(list, n, 7, 0);

    System.out.println(list);
  }

  private static void execute(List<Integer> list, int n, int k, int death){

    if(n == 1)
      return;

    int kill = (death + k - 1) % n;
    list.remove(kill);

    execute(list, n - 1, k, kill);
  }
}
