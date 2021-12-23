public class Task8 {
  public static void main(String[] args) {
    int a[] = new int[]{1, -10, 5, 6, 45, 23, 45, -34, 0, 32, 56, -1, 2, -2};
    int max = -5000000;
    int sum = 0;
    int sum_cho = 0;
    int quantity_positive_number = 0;
    double sum_arithmetic_mean = 0;
    double count_arithmetic_mean = 0;

    for (int i = 0; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.printf("Максимальное значение: %d \n", max);

    for (int i = 0; i < a.length; i++) {
      if (a[i] > 0) {
        sum += a[i];
      }
    }
    System.out.printf("Сумма положительных элементов: %d \n", sum);

    for (int i = 0; i < a.length; i++) {
      if (a[i] < 0 && a[i] % 2 == 0) {
        sum_cho += a[i];
      }
    }
    System.out.printf("Сумма четных отрицательных элементов: %d \n", sum_cho);

    for (int i = 0; i < a.length; i++) {
      if (a[i] > 0) {
        quantity_positive_number += 1;
      }
    }
    System.out.printf("Количество положительных элементов: %d \n", quantity_positive_number);

    for (int i = 0; i < a.length; i++){
      if (a[i] < 0){
        sum_arithmetic_mean += a[i];
        count_arithmetic_mean += 1;
      }
    }
    sum_arithmetic_mean = sum_arithmetic_mean / count_arithmetic_mean;
    System.out.println("Количество положительных элементов:");
    System.out.println(sum_arithmetic_mean);
  }
}
