class Queue{

  int[] queue = new int[5];
  int size = 0;
  int front = 0;
  int rear = 0;

  public void enQueue(int data){
    if(!isFull()){
      queue[rear] = data;
      rear = (rear + 1) % 5;
      size++;
    } else
        System.out.println("Queue is Full");
  }

  public void deQueue(){

    if(!isEmpty()){
      int data = queue[front];
      front =  (front + 1) % 5;
      size--;
    } else
        System.out.println("Queue is Empty");
  }

  public int getSize(){
    return size;
  }

  public boolean isFull(){
    return getSize() == 5;
  }

  public boolean isEmpty(){
    return getSize() == 0;
  }

  public void show(){
    System.out.print("Elements are: ");

    for(int i = 0; i < size; i++)
      System.out.print(queue[(front + i) % 5] + " ");

    System.out.println();
  }
}
