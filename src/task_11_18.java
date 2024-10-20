import java.util.Random;
import java.util.Scanner;

public class task_11_18 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100 + 1);
        }

        System.out.println("Исходный массив:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Массив, в котором каждый элемент уменьшен на 20:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] - 20 + " ");
        }
        System.out.println();

        System.out.println("Массив, в котором каждый элемент умножен на последний элемент:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * array[array.length - 1] + " ");
        }
        System.out.println();

        System.out.print("Введите число В: ");
        int b = scanner.nextInt();

        System.out.println("Массив, в котором каждый элемент умножен на последний элемент:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + b + " ");
        }
        System.out.println();

        System.out.println("Исходный массив(он не изменен!):");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();


        //Если нам нужно именно каждый элемент изменить, и чтобы потом массив был изменен то код следующий будет
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] - 20;
//        }
//        System.out.println();

    }
}
