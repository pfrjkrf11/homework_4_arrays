import java.util.Random;
import java.util.Scanner;

public class task_11_32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите грузоподъемность автомобиля: ");
        int payload = scanner.nextInt();

        int[] weights = new int[30];

        for (int i = 0; i < weights.length; i++) {
            weights[i] = random.nextInt(1, 20 + 1);
        }

        System.out.println("Масса каждого предмета: ");
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i] + " ");
        }
        System.out.println();

        int amount = 0;
        for (int i = 0; i < weights.length; i++) {
            amount += weights[i];
        }
        System.out.println("Масса всех предметов равна: " + amount);

        if(payload>=amount){
            System.out.println("Общая масса всех предметов не превышает грузоподъемность автомобиля");
            System.out.println("Поедем!");
        }else{
            System.out.println("Общая масса всех предметов превышает грузоподъемность автомобиля");
            System.out.println("не поедем(");
        }
    }
}
