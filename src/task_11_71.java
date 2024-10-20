import java.util.Random;

public class task_11_71 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] marks = new int[10];


        System.out.println("Оценки ученика:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(2, 5 + 1);
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        int countFive = 0;
        int countFour = 0;
        int countThree = 0;
        int countTwo = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == 5) {
                countFive++;
            }
            if (marks[i] == 4) {
                countFour++;
            }
            if (marks[i] == 3) {
                countThree++;
            }
            if (marks[i] == 2) {
                countTwo++;
            }
        }

        System.out.println("Колличество 2 = " + countTwo);
        System.out.println("Колличество 3 = " + countThree);
        System.out.println("Колличество 4 = " + countFour);
        System.out.println("Колличество 5 = " + countFive);
    }
}
