import java.util.Scanner;
public class Task7 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Введите код города: ");
    int num = in.nextInt();
    if (num == 905) {
      System.out.printf("Москва. Стоимость разговора: 41.5");
    }
    if (num == 194) {
      System.out.printf("Ростов. Стоимость разговора: 19.8");
    }
    if (num == 491) {
      System.out.printf("Краснодар. Стоимость разговора: 26.9");
    }
    if (num == 800) {
      System.out.printf("Киров. Стоимость разговора: 50");
    }
  }
}
