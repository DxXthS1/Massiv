package chaika.nikita.pkg13._1RAZ;

public class Zadanie38 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int sum = 0;
        int count = 0;

        for (int num : A) {
            if (num <= 50) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            System.out.println((double) sum / count);
        } else {
            
        }
    }
}