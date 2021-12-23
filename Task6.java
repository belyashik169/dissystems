import java.util.Scanner;
public class Task6 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите число: ");
    int num = in.nextInt();
    if (num > 0) {
      if (num % 2 == 0){
        System.out.printf("Положительное четное число");
      }else{
        System.out.printf("Положительное нечетное число");
      }
    }
    if (num < 0) {
      if (num % 2 == 0){
        System.out.printf("Отрицательное четное число");
      }else{
        System.out.printf("Отрицательное нечетное число");
      }
    }
    if (num == 0) {
      System.out.printf("Нулевое число");
    }
  }
}
