import java.util.Random;

public class task_11_115 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] maxSpeed = new int[40];

        System.out.println("Максимальные скорости автомобилей: ");
        for (int i = 0; i < maxSpeed.length; i++) {
            maxSpeed[i] = random.nextInt(250, 260 + 1);
            System.out.print(maxSpeed[i] + " ");
        }
        System.out.println();


        int maxSpeedCar = maxSpeed[0];

        for (int i = 0; i < maxSpeed.length; i++) {
            if (maxSpeed[i] > maxSpeedCar) {
                maxSpeedCar = maxSpeed[i];
            }
        }
        System.out.println("Самый быстрый автомобиль имеет скорость:" + maxSpeedCar);

        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < maxSpeed.length; i++) {
            if (maxSpeed[i] == maxSpeedCar) {
                firstIndex = i + 1;
                break;
            }
        }

        for (int i = 0; i < maxSpeed.length; i++) {
            if (maxSpeed[i] == maxSpeedCar) {
                secondIndex = i + 1;
            }
        }
        System.out.println("Номер первого из них: " + firstIndex);
        System.out.println("Номер последнего из них: " + secondIndex);
    }
}
