package Massivi.FirstTask.secondTask;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class first {
    public static void main(String[] args) {
        int[][] a;

        a = new int[10][8];
        Random random = new Random();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(300) - 150; //диапозон от 150 до -150
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                //d = a[i] + 100; //можно выполнять математические операции
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
//Arrays.of
//Arrays.fill - ля заполнения одинаковым значением
//Arrays.toString(a) - вывести на экран массив строкой через soup
//Arrays.equels(a,b) - сравнить два массива
//Arrays.sort(a) - сортировка массива по возрастанию
//Array.to.string.a