class CountNodesWithDegreeOne{
  public static void main(String[] args) {
    Node root = new Node(10);

    root.left = new Node(12);
    root.right = new Node(26);
    root.left.left = new Node(13);
    root.left.right = new Node (17);
    root.left.left.left = new Node(27);
    root.right.left = new Node(19);

    System.out.println("Nodes with Degree one " + count(root));
  }

  private static int count(Node n){
    if(n == null)
      return 0;

    if(n.left == null && n.right == null)
      return 0;

    if(n.left == null || n.right == null)
      return 1;

    int left = count(n.left);
    int right = count(n.right);

    return left + right;
  }
}
