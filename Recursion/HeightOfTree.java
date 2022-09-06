class HeightOfTree{

  static class Node{
    int data;
    Node left;
    Node right;

    Node(){}

    Node(int data){
      this.data = data;
    }
  }

  private static Node createTree(){
    Node root = new Node(2);
    Node n1 = new Node(4);
    Node n2 = new Node(5);
    root.left = n1;
    root.right = n2;
    Node n3 = new Node(6);
    Node n4 = new Node(7);
    Node n5 = new Node(8);
    Node n6 = new Node(3);

    Node n7 = new Node(10);

    root.left.left = n3;
    root.left.right = n4;
    root.left.left.left = n5;
    root.left.left.left.left = n7;

    root.right.right = n6;

    return root;
  }

  public static void main(String[] args) {
    Node root = createTree();

    // Node root = new Node(2);
    // Node n1 = new Node(4);
    // Node n2 = new Node(5);
    // root.left = n1;
    // root.right = n2;
    // Node n3 = new Node(6);
    // Node n4 = new Node(7);
    // Node n5 = new Node(8);
    // Node n6 = new Node(3);
    //
    // root.left.left = n3;
    // root.left.right = n4;
    // root.left.left.left = n5;
    //
    // root.right.right = n6;

    System.out.println("Height of tree is " + height(root));
  }

  private static int height(Node root){
    if(root == null)
      return 0;

    return 1 + Math.max(height(root.left), height(root.right));
  }
}
