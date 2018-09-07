package Massivi.FirstTask.secondTask.Massivi.Massivi.Massivi.Null;

import java.util.Arrays;
import java.util.Scanner;

public class CountNull {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int[] a;
        int count = 0;
        a = new int[10];
        do {
            System.out.println("Введите число");
            if (b.hasNextInt()) {
                for (int i = 0; i < a.length; i++) {
                    a[i] = b.nextInt();
                    System.out.println(a[i]);

                }
                break;
            } else {
                System.out.println("Вы ввели неверное значение");
                b.nextLine();
            }
        } while (true);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                count++;
            }

        }System.out.println(count);

    }

}

