import java.util.Scanner;public class Task1 {  public static void main(String[] args) {    Scanner s = new Scanner(System.in);    System.out.println("Введите число");    int a = s.nextInt();    System.out.println("Последняя цифра числа: " + a % 10);  }}