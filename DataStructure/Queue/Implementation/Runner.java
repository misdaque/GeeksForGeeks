class Runner{
  public static void main(String[] args) {

    Queue queue = new Queue();

    queue.enQueue(10);
    queue.enQueue(20);
    queue.enQueue(40);
    queue.enQueue(50);
    queue.enQueue(60);

    queue.enQueue(60);

    //queue.show();

    //queue.deQueue();

    //queue.enQueue(70);

    //queue.show();

    System.out.println("Is Empty? " + queue.isEmpty());
    System.out.println("Is Full? " + queue.isFull());

    System.out.println("Size = " + queue.getSize());

    // java.util.Queue<Integer> q = new java.util.LinkedList<Integer>();
    //
    // q.add(12);
    // q.add(15);
    //
    // System.out.println(q);
  }
}
