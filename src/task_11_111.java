import java.util.Random;

public class task_11_111 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] results = new int[25];
        System.out.println("Результаты спортсменов: ");
        for (int i = 0; i < results.length; i++) {
            results[i] = random.nextInt(0, 50);
            System.out.print(results[i] + " ");
        }
        System.out.println();

        int minResult = results[0];
        int index = 0;

        for (int i = 0; i < results.length; i++) {
            if (minResult > results[i]) {
                minResult = results[i];
                index = i;
            }
        }
        System.out.println(String.format("Победитель гонки № %d . Результат его равен: %d", (index + 1), minResult));
    }
}
