/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package первый_раздел;

import static java.lang.Integer.min;

/**
 *
 * @author Student 2
 */
public class zadanie_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Задан одномерный массив А[1..20]. Найти максимальный элемент среди\n"
                + "отрицательных элементов.");
        int[] array32 = new int[20 + 1];
        int l = array32[0];
        for (int i = 0; i < array32.length; i++) {
            array32[i] = (int) (Math.random() * -50 + 20);
            System.out.print(array32[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i < array32.length; i++) {
            if (array32[i] < l) {
                l = array32[i];
            }
        }
        System.out.println("Максимум: " + l);
    }
}
