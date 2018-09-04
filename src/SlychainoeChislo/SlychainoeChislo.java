package SlychainoeChislo;

import java.util.Scanner;

public class SlychainoeChislo {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int i = 0;
        System.out.println("Введи любое число от 0 до 20:");

        do {
            i++;
            if (a.hasNextInt()) {

                int b = a.nextInt();
                if (b == 5) {
                    System.out.println("Победа");
                    break;
                } else if (b > 5) {
                    System.out.println("Много");
                    a.nextLine();
                } else if (b < 5) {
                    System.out.println("Мало");
                    a.nextLine();
                }
            } else {
                System.out.println("Вы ввели символ");
                a.nextLine();
            }
            if (i == 5) {
                System.out.println("Проигрыш");
                break;
            }

        }
        while (i < 6);
    }

}






