/*
  Simple creation of a Node and its usage

*/

class Node{
  int key;
  String name;

  Node leftChild, rightChild;

  public Node(int key, String name){
    this.key = key;
    this.name = name;

    leftChild = rightChild = null;
  }

  public String toString(){
    return name + " has a key " +key;
  }
}
