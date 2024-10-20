import java.util.Random;
import java.util.Scanner;

public class task_11_19 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100 + 1);
        }

        System.out.println("Исходный массив:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            amount += array[i];
        }
        System.out.println("Сумма всех элементов массива равна: " + amount);

        long multiplication = 1;

        for (int i = 0; i < array.length; i++) {
            multiplication *= array[i];
        }
        System.out.println("Произведение всех элементов массива равна: " + multiplication);

        long amountOfPows = 0;

        for (int i = 0; i < array.length; i++) {
            amountOfPows += (int) Math.pow(array[i], 2);
        }
        System.out.println("Сумма квадратов всех элементов массива равна: " + amountOfPows);

        int amountOfSixElements = 0;
        int j = 0;

        while (j < array.length) {
            if (j == 6) {
                break;
            }
            amountOfSixElements += array[j];
            j++;
        }

        System.out.println("Сумма первых шести элементов массива равна: " + amountOfSixElements);

        System.out.print("Введите k1 и k2 через пробел (k2>k1): ");
        int firstLimit = scanner.nextInt();
        int secondLimit = scanner.nextInt();
        int sum = 0;

        int k = 0;

        for (int i = firstLimit - 1; i < secondLimit; i++) {
            sum += array[i];
            k++;
        }
        System.out.println(String.format("Сумма элементов с %d элемента по %d элемент равна: %d", firstLimit, secondLimit, sum));

        int arithmeticMean = amount / n;
        System.out.println(String.format("Среднее арифметическое всех элементов равно %d", arithmeticMean));

        int arithmeticMeanSecond = sum / k;
        System.out.println(String.format("Среднее арифметическое элементов с %d элемента по %d элемент равно: %d", firstLimit, secondLimit, arithmeticMeanSecond));


    }
}
