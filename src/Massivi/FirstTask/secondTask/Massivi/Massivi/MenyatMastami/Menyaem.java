package Massivi.FirstTask.secondTask.Massivi.Massivi.MenyatMastami;

import java.util.Arrays;
import java.util.Scanner;

public class Menyaem {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int[] a;
        int n =0;
        int lengs=0;
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
        lengs = a.length;
        n = a[0];
        a[0]=a[a.length-1];
        a[a.length-1]=n;
        System.out.println(Arrays.toString(a));
    }
}
