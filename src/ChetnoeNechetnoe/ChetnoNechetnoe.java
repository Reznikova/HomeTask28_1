package ChetnoeNechetnoe;

import java.util.Scanner;

public class ChetnoNechetnoe {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner a = new Scanner(System.in);
        int c = a.nextInt();
        if (c % 2 == 0) {
            System.out.println(c + 2);
        } else {
            System.out.println(c + 1);
        }
    }
}
