class Runner{
  public static void main(String[] args) {
    BinarySearchTreeImplementation tree = new BinarySearchTreeImplementation();

    tree.insert(12);
    tree.insert(10);
    tree.insert(13);
    tree.insert(14);
    tree.insert(11);
    tree.insert(9);

    tree.inOrder();
  }
}
