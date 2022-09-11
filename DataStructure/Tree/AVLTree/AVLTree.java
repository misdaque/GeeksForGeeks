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
      height = 1;
    }
  }

  
}
