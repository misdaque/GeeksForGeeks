class InsertingNodeAtTheLeefInBST{
  public static void main(String[] args) {
    Node root = new Node(30);

    root.left = new Node(20);
    root.left.left = new Node(10);
    root.left.right = new Node(25);

    root.right = new Node(40);
    root.right.left = new Node(35);
    root.right.right = new Node(50);

    root = null;

  //  System.out.println("Inserted - " + insertRecursively(null, root, 20));

    if(root != null)
      System.out.println("Inserted - " + insertItteratively(root, 20));
    else
      root = new Node(30);
    Node.inOrder(root);
  }

  private static boolean insertRecursively(Node previous, Node current, int insert){
    if(current == null){
      if(previous != null){
        if(insert < previous.data)
          previous.left = new Node(insert);
        else
          previous.right = new Node(insert);

        return true;
      } else {
        current = new Node(insert);
        return true;
      }
    }

    Node temp = current;

    if(insert < current.data)
      return insertRecursively(temp, current.left, insert);
    else if(insert > current.data)
      return insertRecursively(temp, current.right, insert);
    else
      return false;
  }

  private static boolean insertItteratively(Node root, int insert){

    Node prev = null;

    while(root != null){

      prev = root;

      if(root.data == insert)
        return false;

      if(insert < root.data)
        root = root.left;
      else
        root = root.right;
    }

    if(insert < prev.data)
      prev.left = new Node(insert);
    else
      prev.right = new Node(insert);

    return true;
  }
}
