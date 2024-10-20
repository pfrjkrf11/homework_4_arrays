import java.util.Random;

public class task_11_3 {
    public static void main(String[] args) {

        Random random = new Random();

        double[] arrayA = new double[15];

        System.out.println("Массив а: ");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextDouble(0, 1);
            System.out.print(String.format("%.3f ", arrayA[i]));
        }
        System.out.println();

        double[] arrayB = new double[15];

        System.out.println("Массив б: ");
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = random.nextDouble(22, 23);
            System.out.print(String.format("%.3f ", arrayB[i]));
        }
        System.out.println();

        double[] arrayС = new double[15];

        System.out.println("Массив с: ");
        for (int i = 0; i < arrayС.length; i++) {
            arrayС[i] = random.nextDouble(0, 10);
            System.out.print(String.format("%.3f ", arrayС[i]));
        }
        System.out.println();

        double[] arrayD = new double[15];

        System.out.println("Массив d: ");
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = random.nextDouble(-50, 50);
            System.out.print(String.format("%.3f ", arrayD[i]));
        }
        System.out.println();

        int[] arrayE = new int[15];

        System.out.println("Массив d: ");
        for (int i = 0; i < arrayE.length; i++) {
            arrayE[i] = random.nextInt(0, 10 + 1);
            System.out.print(String.format("%d ", arrayE[i]));
        }
        System.out.println();

    }
}
