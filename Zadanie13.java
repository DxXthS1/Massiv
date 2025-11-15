package chaika.nikita.pkg13._1RAZ;

/**
 * Задача: Найти общие элементы двух массивов.
 * @author Student 2
 */
public class Zadanie13 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {4, 5, 6, 7, 8};

        System.out.print("Общие элементы: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] + " ");
                }
            }
        }
        System.out.println();
    }
}












