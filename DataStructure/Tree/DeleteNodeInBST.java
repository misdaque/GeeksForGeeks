//ToDo: Find out a way to eleminate the node entirely which needs to be delelted

class DeleteNodeInBST{
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

    delete(root, 30, null);

    System.out.println();

    Node.inOrder(root);
  }

  private static Node delete(Node n, int key, Node prev){

      if(n == null)
        return null;

      if(n.left == null && n.right == null){
        if(prev.left != null && prev.left.data == key)
          prev.left = null;
        else if(prev.right != null && prev.right.data == key)
          prev.right = null;
        //n.data = -1;
        return null;
      }

      prev = n;
      if(key < n.data)
        n = delete(n.left, key, prev);
      else if(key > n.data)
        n = delete(n.right, key, prev);
      else{
        Node temp;
        if(height(n.left) > height(n.right)){
          temp = inOrderPre(n.left);
          n.data = temp.data;
          delete(temp, temp.data, prev);
        }
        else{
          temp = inOrderSucc(n.right);
          n.data = temp.data;
          delete(temp, temp.data, prev);
        }
      }
      return null;
}

  private static Node inOrderPre(Node n){

    while(n != null && n.right != null){
      n = n.right;
    }

    return n;
  }

  private static Node inOrderSucc(Node n){

    while(n != null && n.left != null){
      n = n.left;
    }

    return n;
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
