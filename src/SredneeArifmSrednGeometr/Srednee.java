package SredneeArifmSrednGeometr;

import java.util.Scanner;

public class Srednee {
    public static void main(String[] args) {
        System.out.println("Введите два действительных положительных числа");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        if (a.hasNextInt()&b.hasNextInt()) {
            int chisloOne = a.nextInt();
            int chisloTwo = b.nextInt();
            if(chisloOne>0&chisloTwo>0)
            System.out.println("Среднее арифметическое: "+ ((chisloOne+chisloTwo)/2) +
                    " Среднее геометрическое: " +(Math.sqrt(chisloOne*chisloTwo)));
            else {System.out.println("Вы ввели данные некорректно");}
        }
        else {
            System.out.println("Вы ввели данные некорректно");
        }

    }
}
