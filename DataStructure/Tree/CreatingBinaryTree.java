import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CreatingBinaryTree{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] str = br.readLine().trim().split(" ");

    int[] input = new int[str.length];

    for(int i = 0 ; i < str.length; i++)
      input[i] = Integer.parseInt(str[i]);

    Node root = createBST(input);

    Node.inOrder(root);
  }


  private static Node createBST(int[] arr){
    Node root = null;

    for(int a : arr){
      Node temp = new Node(a);

        if(root == null)
          root = temp;
        else{
          Node n = root;
          Node prev = n;
          while(n != null){

              prev = n;

              if(a < n.data)
                n = n.left;
              else
                n = n.right;
          }

          if(a < prev.data)
            prev.left = temp;
          else
            prev.right = temp;
        }
    }
    return root;
  }

}
