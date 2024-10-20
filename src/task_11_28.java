import java.util.Random;
import java.util.Scanner;

public class task_11_28 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100 + 1);
        }

        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            amount += array[i];
        }
        System.out.println("Сумма элементов массива равна: " + amount);


        if (amount > 0) {
            System.out.println("Сумма элементов массива есть неотрицательное число");
        } else {
            System.out.println("Сумма элементов массива есть отрицательное число");
        }
    }
}
