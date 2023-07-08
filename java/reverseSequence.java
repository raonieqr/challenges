public class Sequence{

  public static int[] reverse(int n){
    int[] arr = new int[n];
    int j = 0;
    
    for (int i = n; i > 0; i--)
      arr[j++] = i;
    return arr;
  }

}
