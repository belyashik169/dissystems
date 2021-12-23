import java.util.Scanner;
public class Task3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число: ");
    int num = in.nextInt();
    if (num > 0) {
      num +=1;
      System.out.println(num);
    } else {
      System.out.println(num);
    }
    in.close();
  }
}
