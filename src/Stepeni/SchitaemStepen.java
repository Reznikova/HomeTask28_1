package Stepeni;

import java.util.Scanner;

public class SchitaemStepen {
    public static void main(String[] args) {
        System.out.println("Введите любые два числа");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int n = a.nextInt();
        int sum1 = x;

        for (int i = 1; i < n; i++) {
            sum1 = sum1 * x;
            //System.out.println(sum1);//
        }


        System.out.println(x + " в степени " + n + " = " + sum1);
    }
}
