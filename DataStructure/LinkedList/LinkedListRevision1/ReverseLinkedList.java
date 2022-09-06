class ReverseLinkedList{
  public static void main(String[] args) {

    LinkedList list = new LinkedList();

    list.insert(12);
    list.insert(13);
    list.insert(14);
    list.insert(15);
    list.insert(16);

    System.out.println("Before Reverse List is:");
    list.show();

    System.out.println();

    list.reverse();

    System.out.println("After Reverse");

    list.show();
  }
}
