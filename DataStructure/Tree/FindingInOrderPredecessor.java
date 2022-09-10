class FindingInOrderPredecessor{
  public static void main(String[] args) {
    Node root = new Node(30);

    root.left = new Node(20);
    root.left.left = new Node(10);
    root.left.right = new Node(25);

    root.right = new Node(40);
    root.right.left = new Node(35);
    root.right.right = new Node(50);

    Node.inOrder(root);

    System.out.println("In Order Pre " + inOrderPredecessorRecursive(root.left).data);
  }

  private static Node inOrderPredecessorItterative(Node n){

    while(n != null && n.right != null){
      n = n.right;
    }

    return n;
  }

  private static Node inOrderPredecessorRecursive(Node n){    
    if(n.right == null)
      return n;

    Node f = inOrderPredecessorRecursive(n.right);

    return f;
  }
}
