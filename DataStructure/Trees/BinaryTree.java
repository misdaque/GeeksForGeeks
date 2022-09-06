/*
  This class will create a binaryTree
*/

class BinaryTree{
  Node root;

  public void addNode(int key, String name){
    Node newNode = new Node(key, name);

    //If there is no node yet and a new node has to be created
    if(root == null){
      root = newNode;
    }
    //If there are nodes
    else{
      Node focusNode = root;

      Node parent;
      while(true){
        parent = focusNode;

        if(key < parent.key){
          focusNode = parent.leftChild;

          if(focusNode == null){
            parent.leftChild = newNode;
            return;
          }
        }else{
          focusNode = parent.rightChild;

          if(focusNode == null){
            parent.rightChild = newNode;
            return;
          }
        }
      }
    }
  }

  public void inOrderTreeTraverse(Node focusNode){

    if(focusNode != null){
      inOrderTreeTraverse(focusNode.leftChild);
      System.out.println(focusNode);
      inOrderTreeTraverse(focusNode.rightChild);
    }
  }
public void preOrderTreeTraverse(Node focusNode){

  if(focusNode != null){
    System.out.println(focusNode);
    preOrderTreeTraverse(focusNode.leftChild);
    preOrderTreeTraverse(focusNode.rightChild);
  }
}

public void postOrderTreeTraverse(Node focusNode){

  if(focusNode != null){
    postOrderTreeTraverse(focusNode.leftChild);
    postOrderTreeTraverse(focusNode.rightChild);
    System.out.println(focusNode);
  }
}

public Node findNode(int key){
  Node focusNode = root;

  while(focusNode.key != key){
    if(key < focusNode.key)
      focusNode = focusNode.leftChild;
    else
      focusNode = focusNode.rightChild;
  }

  if(focusNode == null)
    return null;

  return focusNode;
}

  public static void main(String[] args){
    BinaryTree theTree = new BinaryTree();

    theTree.addNode(50, "Parent");
    theTree.addNode(25, "Left Child");
    theTree.addNode(30, "Right Child to the left Child");
    theTree.addNode(75, "Right Child");
    theTree.addNode(15, "Left Child to the Left child");
    theTree.addNode(80, "Right Child to the Right Child");

    theTree.postOrderTreeTraverse(theTree.root);

    System.out.println("Searching...");
    System.out.println(theTree.findNode(40));

  }
}
