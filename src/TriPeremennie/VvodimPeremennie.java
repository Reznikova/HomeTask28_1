package TriPeremennie;

import java.util.Scanner;

public class VvodimPeremennie {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float result1 = 6;
        float result2 = 6;
        float result3 = 6;

        do {
            System.out.println("Введите первое число: ");
            result1 = a.nextFloat();
            if (result1 % 1 == 0)
                do {
                    System.out.println("Введите второе число: ");
                    result2 = a.nextFloat();
                    if (result2 % 1 == 0)
                        do {
                            System.out.println("Введите третье число: ");
                            result3 = a.nextFloat();
                            if (result3 % 1 == 0) {
                                System.out.println("Good");
                            }
                        }
                        while (result3 % 1 != 0);
                }
                while (result2 % 1 != 0);

        }
        while (result1 % 1 != 0);


    }
}
