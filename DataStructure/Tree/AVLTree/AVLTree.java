class AVLTree{
  static class Node{
    Node left;
    Node right;
    int height;
    int data;

    Node(){}

    Node(int data){
      this.left = null;
      this.right = null;

      this.data = data;
    }
  }

  Node root = null;

  public void insert(int data){
    root = insert(root, data);
  }

  private Node LLRotation(Node p){
    Node pl = p.left;
    Node plr = pl.right;

    //Steps performed:
    // 1. separate Plr.
    // 2. Pl.right = P.
    // 3. P.left = Plr

    //Note: step 1 can be ignored but for understanding I have left it there

    pl.right = null;
    pl.right = p;
    p.left = plr;

    //Now modify the height as well

    p.height = height(p) + 1;
    pl.height = height(pl) + 1;

    return pl;
  }

  private Node RRRotation(Node p){
    Node pr = p.right;
    Node prl = pr.left;

    pr.left = p;
    p.right = prl;

    p.height = height(p) + 1;
    pr.height = height(pr) + 1;

    return pr;
  }

  private Node insert(Node n, int data){

    if(n == null){
      Node node = new Node(data);
      node.height = 1;
      System.out.println("Null) Node is " + node.data +" and height is " +node.height);
      return node;
    }

    if(data < n.data)
      n.left = insert(n.left, data);
    else if(data > n.data)
      n.right = insert(n.right, data);
    else
      return n;

    n.height = height(n);

    System.out.println("Node is " + n.data +" and height is " +n.height);

    int balance = getBalance(n);

    if(balance == 2 && getBalance(n.left) == 1){
        System.out.println("Time to rotate");
        return LLRotation(n);
      }

    else if(balance == -2 && getBalance(n.right) == -1)
      return RRRotation(n);

    else if(balance == 2 && getBalance(n.left) == -1){
      n.left = RRRotation(n.left);
      return LLRotation(n);
    }

    else if(balance == -2 && getBalance(n.right) == 1){
      n.right = LLRotation(n.right);
      return RRRotation(n);
    }

    return n;
  }

  public int height(){
    return height(root);
  }

  private int height(Node n){
      int left = 0, right = 0;

      if(n == null)
        return 0;

      left = height(n.left);
      right = height(n.right);

      return left > right ? left + 1 : right + 1;
    }

  public void inOrder(){
      inOrderRec(root);
      System.out.println();
    }

  public void postOrder(){
    postOrder(root);
    System.out.println();
  }

  private void postOrder(Node n){
    if(n == null)
      return;

    postOrder(n.left);
    postOrder(n.right);
    System.out.print(n.data + " ");
  }

  private int getBalance(Node n){
      if(n.left == null && n.right == null)
        return 0;

      else if(n.left == null && n.right != null)
        return 0 - n.right.height;

      else if (n.right == null && n.left != null)
        return n.left.height;

      else
        return n.left.height - n.right.height;
    }

  private void inOrderRec(Node n){
      if(n == null)
        return;

      inOrderRec(n.left);
      System.out.print(n.data + " ");
      inOrderRec(n.right);
    }

  public static void main(String[] args){
      AVLTree tree = new AVLTree();

      tree.insert(10);
      tree.insert(15);

      tree.insert(12);
      // tree.insert(5);
      // tree.insert(6);
      // tree.insert(15);
      // tree.insert(40);
      //tree.insert(4);
      // tree.insert(3);

      // tree.insert(10);
      // tree.insert(5);
      // tree.insert(4);

      tree.inOrder();
      tree.postOrder();

      System.out.println("Root value is " + tree.root.data);
    }
}
