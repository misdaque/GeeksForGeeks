class Node{

  Node left;
  Node right;
  int data;

  Node(int data){
    this.data = data;
    left = right = null;
  }

  Node(){
    left = right = null;
  }

  public static void inOrder(Node n){

    if(n == null)
      return;
      
    inOrder(n.left);
    System.out.print(n.data + " ");
    inOrder(n.right);
  }
}
