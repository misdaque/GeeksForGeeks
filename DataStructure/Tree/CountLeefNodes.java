class CountLeefNodes{
  public static void main(String[] args) {
    Node root = new Node(10);

    root.left = new Node(12);
    root.right = new Node(26);
    root.left.left = new Node(13);
    root.left.right = new Node (17);
    root.left.left.left = new Node(27);

    System.out.println("Number of Leef Node is " + count(root));
  }

  private static int count(Node n){
    if(n == null)
      return 0;

    int left = count(n.left);
    int right = count(n.right);

    if(n.left == null && n.right == null)
      return 1;
    else
      return left + right;
  }
}
