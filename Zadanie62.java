package chaika.nikita.pkg13._1RAZ;

public class Zadanie62 {
    public static void main(String[] args) {
        int[] prices = {100, 250, 50, 300, 150, 400, 200, 350, 120, 220,
                        180, 500, 90, 330, 410, 230, 160, 470, 80, 290};

        int minPrice = prices[0];
        int maxPrice = prices[0];
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];

            if (prices[i] < minPrice) {
                minPrice = prices[i];
                minIndex = i;
            }

            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                maxIndex = i;
            }
        }

        double average = (double) sum / prices.length;

        System.out.println("а) Самая дешевая цена: " + minPrice + ", номер товара: " + (minIndex + 1));
        System.out.println("б) Самая дорогая цена: " + maxPrice + ", номер товара: " + (maxIndex + 1));
        System.out.println("в) Номера товаров, цена которых превышает среднее значение:");
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > average) {
                System.out.println("Товар №" + (i + 1) + " - цена: " + prices[i]);
            }
        }
    }
}