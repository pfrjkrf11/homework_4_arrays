import java.util.Random;
import java.util.Scanner;

public class task_11_45 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите количество элементов массива:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 50 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();


        System.out.println("Все элементы, стоящие на четных местах");
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Все элементы, стоящие на нечетных местах");
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
