import java.util.Random;
import java.util.Scanner;

public class task_11_69 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите количество элементов массива:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("Введите числа a и b через пробел(b>a): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;


        System.out.println(String.format("Элементы принадлежащие промежутку от %d до %d : ", a, b));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a && array[i] < b) {
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.println();

        System.out.println(String.format("Количество элементов принадлежащих промежутку от %d до %d равно %d", a, b, count));
    }
}
