class DeleteNodeInBST{
  public static void main(String[] args) {
    Node root = new Node(30);

    root.left = new Node(20);
    root.left.left = new Node(10);
    root.left.right = new Node(25);
    root.left.right.left = new Node(22);

    root.right = new Node(40);
    root.right.left = new Node(35);
    root.right.right = new Node(50);

    Node.inOrder(root);

    delete(root, 30, null);

    System.out.println();

    Node.inOrder(root);
    System.out.println("Root Element is " + root.data);
  }

  private static void delete(Node n, int key, Node prev){
      if(n == null)
        return ;

      if(key < n.data)
        delete(n.left, key, n);
      else if(key > n.data)
        delete(n.right, key, n);
      else{
        if(n.left == null && n.right == null)
          deleteLeafNode(prev, key);

        else if(height(n.left) > height(n.right)){
          Node temp = inOrderSucc(n.left);
          n.data = temp.data;
          delete(n.left, temp.data, n);
        }
        else{
          Node temp = inOrderPred(n.right);
          n.data = temp.data;
          delete(n.right, temp.data, n);
        }
      }

      // return prev;
  }

  private static void deleteLeafNode(Node prev, int key){
    if(prev.right != null && key == prev.right.data)
      prev.right = null;
    else
      prev.left = null;
  }

  private static Node inOrderSucc(Node n){

    if(n.right == null)
      return n;

    return inOrderSucc(n.right);
  }

  private static Node inOrderPred(Node n){

    if(n.left == null)
      return n;

    return inOrderPred(n.left);
  }

  private static int height(Node n){
    int x = 0, y = 0;

    if(n == null)
      return 0;

    x = height(n.left);
    y = height(n.right);

    return x > y ? x + 1 : y + 1;
  }

}
