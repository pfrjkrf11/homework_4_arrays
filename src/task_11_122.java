import java.util.Random;

public class task_11_122 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] prices = new int[60];

        System.out.println("Цены на книги:");
        for (int i = 0; i < prices.length; i++) {
            prices[i] = random.nextInt(150, 250 + 1);
            System.out.print(prices[i] + " ");
        }

        int minPrice = prices[0];
        int counts = 0;

        for (int i = 0; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
                counts = 0;
            }
            if (prices[i] == minPrice) {
                counts++;
            }
        }
        System.out.println();

        System.out.println(String.format("Минимальная цена равна %d. Количество книг с минимальной ценой равно %d", minPrice, counts));
    }
}
