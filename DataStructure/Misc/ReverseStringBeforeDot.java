class ReverseStringBeforeDot{
  public static void main(String[] args){

    String str = "I.like.String.Question";

    String[] word = str.split("\\.");
    StringBuilder newWord = new StringBuilder();
    for(int i = 0; i < word.length ; i++){

      if(i != word.length - 1)
        newWord.append(reverse(word[i]) + ".");
        else
          newWord.append(reverse(word[i]));
    }

    System.out.println(newWord);
  }

  private static String reverse(String word){

    char[] arr = word.toCharArray();

    char c;
    int i = 0, j = arr.length - 1;

    while(i < j){
      c = arr[i];
      arr[i] = arr[j];
      arr[j] = c;

      i++; j--;
    }
    return new String(arr);
  }
}

//79042738
