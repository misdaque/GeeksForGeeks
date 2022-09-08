class CountNode{
  public static void main(String[] args) {
    Node root = new Node(10);

    root.left = new Node(12);
    root.right = new Node(26);
    root.left.left = new Node(13);
    root.left.right = new Node (17);
    root.left.left.left = new Node(27);

    System.out.println("Numebrs of node in the tree are " + count(root));
  }

  private static int count(Node n){
    if(n == null)
      return 0;

    int leftCount = count(n.left);
    int rightCount = count(n.right);

    return leftCount + rightCount + 1;
  }
}
