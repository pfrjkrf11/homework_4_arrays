import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class task_11_46 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива:");
        int n = scanner.nextInt();

        double[] array = new double[n];


        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(-50, 50 + 1);
            System.out.print(String.format("%.3f ", array[i]));
        }
        System.out.println();

        System.out.println("Массив, в котором каждый отрицательный элемент заменен на абсолютную величину:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = Math.abs(array[i]);
            }
            System.out.print(String.format("%.3f ", array[i]));
        }
        System.out.println();


        System.out.println("Массив, в котором каждый  элемент с нечетным номером заменен их квадратным корнем:");
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 2 == 1) {
                array[i] = Math.sqrt(array[i]);
            }
            System.out.print(String.format("%.3f ", array[i]));
        }


    }
}
