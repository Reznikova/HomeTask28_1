package Massivi.FirstTask.secondTask.Massivi.Second;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int[] a;
        a = new int[10];
        do {System.out.println("Введите число");
            if (b.hasNextInt()) {
                for (int i = 0; i < a.length; i++) {
                    a[i] = b.nextInt();
                    System.out.println(a[i]);

                } break;
            } else {
                System.out.println("Вы ввели неверное значение");
                b.nextLine();
            }
        } while (true);
        System.out.println(Arrays.toString(a));
    }
}
