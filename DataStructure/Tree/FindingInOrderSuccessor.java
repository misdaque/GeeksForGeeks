class FindingInOrderSuccessor{
  public static void main(String[] args) {
    Node root = new Node(30);

    root.left = new Node(20);
    root.left.left = new Node(10);
    root.left.right = new Node(25);

    root.right = new Node(40);
    root.right.left = new Node(35);
    root.right.right = new Node(50);

    Node.inOrder(root);

    System.out.println("In Order Successor " + inOrderSuccessor(root.right).data);
  }

  private static Node inOrderSuccessor(Node n){
    if(n.left == null)
      return n;

    return inOrderSuccessor(n.left);
  }
}
