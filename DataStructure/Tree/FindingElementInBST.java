class FindingElementInBST{
  public static void main(String[] args) {
    Node root = new Node(30);

    root.left = new Node(20);
    root.left.left = new Node(10);
    root.left.right = new Node(25);

    root.right = new Node(40);
    root.right.left = new Node(35);
    root.right.right = new Node(50);

    System.out.println(findElementItteratively(root, 18));
  }

  private static int findElementRecursively(Node n, int search){
    if(n == null)
      return -1;
    if(n.data == search)
      return n.data;

    if(search < n.data)
      return findElementRecursively(n.left, search);
    else
      return findElementRecursively(n.right, search);
  }

  private static int findElementItteratively(Node n, int search){

    while(n != null){
      if(n.data == search)
        return n.data;

      if(search < n.data)
        n = n.left;
      else
        n = n.right;
    }

    return -1;
  }
}
