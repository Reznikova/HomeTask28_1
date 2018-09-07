package Massivi.FirstTask.secondTask.Massivi.Massivi.SredneeArifm;

import java.util.Arrays;
import java.util.Scanner;

public class SredneeArifm {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        int[] a;
        double m = 0;
        /*int dlina = 0;*/
        double result = 0;
        a = new int[10];
        do {System.out.println("Введите число");
            if (b.hasNextInt()) {
                for (int i = 0; i < a.length; i++) {
                    a[i] = b.nextInt();

                } break;
            } else {
                System.out.println("Вы ввели неверное значение");
                b.nextLine();
            }
        } while (true);
        for (int i = 0; i < a.length; i++) {
            m+=a[i];
            /*dlina=a.length;*/
            result = m/a.length;
        }

        //System.out.println(Arrays.toString(a));
        System.out.println(result);
    }
    }

