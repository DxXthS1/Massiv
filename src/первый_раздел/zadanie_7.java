/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package первый_раздел;

/**
 *
 * @author Student 2
 */
public class zadanie_7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
 int[] array7 = new int[10];
int[] a = new int[5];
int[] b = new int[5];

int sum_pol = 0;
int sum_otr = 0;
int pol = 0;
int otr = 0;

System.out.println("В заданном массиве найти среднее арифметическое положительных чисел,\n" +
"среднее арифметическое отрицательных чисел и число нулей.");
System.out.println("Исходный массив: ");
for (int i7 = 0; i7 < array7.length; i7++) {
array7[i7]=(int) (Math.random()*-50+20);
System.out.print(array7[i7]+" ");
}
System.out.println("");
for (int i7 = 0; i7 < array7.length; i7++) {
if (array7[i7]>0){
sum_pol = sum_pol + array7[i7];
pol++;
}
if (array7[i7]<0){
sum_otr = sum_otr + array7[i7];
otr++;
}
if (array7[i7] % 2 == 0){
pol++;
}
}
int sr_pol = sum_pol / pol;
int sr_otr = sum_otr / otr;
        System.out.println("Среднее положительное: "+sr_pol);
        System.out.println("Среднее отрицательное: "+sr_otr);
}
    }

