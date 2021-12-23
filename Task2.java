import java.util.Scanner;
public class Task2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите трехзначное число: ");
    int num = in.nextInt();
    int number1 = num / 100;
    int number3 = num % 10;
    int number2 = (num % 100 - number3) / 10;
    int sum = number1 + number2 + number3;
    System.out.printf("Сумма цмфр трехзначного числа равна: %d \n", sum);
    in.close();
  }
}
