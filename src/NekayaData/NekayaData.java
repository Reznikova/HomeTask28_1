package NekayaData;

import java.util.Scanner;

public class NekayaData {
    public static void main(String[] args) {
        Scanner mounth = new Scanner(System.in);
        System.out.println("введите дату");
        int a = mounth.nextInt();
        switch (a) {
            case 30: {
                System.out.println("Апрель, Июнь, Сентябрь, Ноябрь ");

            }
            case 31: {
                System.out.print("Январь, Маррт, Май, Июль, Август, Октябрь, Декабрь ");
                break;
            }

            default: {
                System.out.println("Дата есть в любом месяце года");
            }

        }
    }
}
