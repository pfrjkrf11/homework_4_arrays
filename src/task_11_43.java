import java.util.Random;

public class task_11_43 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] precipitation = new int[30];
//        int[] no precipitation = new int[30];

        System.out.println("Данные по осадкам за месяц:");
        for (int i = 0; i < precipitation.length; i++) {
            precipitation[i] = random.nextInt(0, 20 + 1);
            System.out.print(precipitation[i] + " ");
        }
        System.out.println();

        System.out.println("В эти дни осадков не было:");
        for (int i = 0; i < precipitation.length; i++) {
            if (precipitation[i] == 0) {
                System.out.print(i + 1 + " ");
            }
        }

    }
}
