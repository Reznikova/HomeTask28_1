package SlogenieStrok;

import java.util.Scanner;

public class Stroki {
    public static void main(String[] args) {

        String a = "Пусто";
        String b = "Пусто";

        String v = new String ("Пусто");
        String y = new String ("Пусто");

        System.out.println(a==b); //для сравнения ссылок на объект
        System.out.println(v==y); //для сравнения ссылок на объект
        System.out.println(y.equals(y)); //Для сравнения объектов используется equels
        //System.out.println(a.charAt(2));
        //System.out.println(a.length());
        //String result = a+b;
        //System.out.println(result);
    }
}
