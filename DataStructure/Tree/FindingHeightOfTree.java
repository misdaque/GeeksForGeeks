class FindingHeightOfTree{
  public static void main(String[] args) {
    Node root = new Node(30);

    root.left = new Node(20);
    root.left.left = new Node(10);
    root.left.right = new Node(25);
    //root.left.left.left = new Node(7);

    root.right = new Node(40);
    root.right.left = new Node(35);
    root.right.right = new Node(50);

    Node.inOrder(root);

    System.out.println("Height of Tree is " + height(root));
  }

  private static int height(Node n){
    int left = 0, right = 0;

    if(n == null)
      return 0;

    left = height(n.left);
    right = height(n.right);

    return left > right ? left + 1 : right + 1;
  }
}
