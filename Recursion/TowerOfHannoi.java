class TowerOfHannoi{
  public static void main(String[] args) {
      solve(3, 'A', 'B', 'C');
  }

  private static void solve(int n, char A, char B, char C){
    if(n == 0)
      return;

    solve(n - 1, A, C, B);
    System.out.println("Move " + n + " from " + A + " to " + C + " using " + B);
    solve(n - 1, B, A, C);
  }
}
