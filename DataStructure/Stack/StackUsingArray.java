class StackUsingArray implements Stack{

  int[] stack = new int[5];
  int top = -1;

  public void push(int data){
    stack[++top] = data;
  }

  public void show(){

    for(int i = top ; i >= 0 ; i--)
      System.out.println(stack[i]);
  }

  public int pop(){
    int value = stack[top];
    if(top >= 0)
        stack[top--] = 0;
    return value;
  }

  public int peek(){
    return stack[top];
  }
}
