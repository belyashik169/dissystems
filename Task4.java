import java.util.Scanner;
public class Task4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите трехзначное число: ");
    int num = in.nextInt();
    if (num > 0) {
      num +=1;
      System.out.println(num);
    } else {
      if (num == 0) {
        num = 10;
        System.out.println(num);
      }
      if (num < 0) {
        System.out.println(num - 2);
      }
    }
    in.close();
  }
}
