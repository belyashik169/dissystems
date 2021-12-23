public class Task10 {
  public static void main(String[] args) {
    int[] a = new int[] {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};
    int swapCount = 0;
    int lastIndex = a.length - 1;

    for(int i = lastIndex - 1; i >= 0; i--) {
      if(a[i] == 0) {
        a[i] = a[lastIndex - swapCount];
        a[lastIndex - swapCount] = 0;
        swapCount++;
      }
    }
    for(int i : a) {
      System.out.print(i + ", ");
    }
  }

}
