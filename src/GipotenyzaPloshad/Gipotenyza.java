package GipotenyzaPloshad;

import java.util.Scanner;

public class Gipotenyza {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("Введи катеты:");
        float aa = a.nextFloat();
        float bb = b.nextFloat();
        double gipotenysa=1;
        float ploshad=1;
        float summa;
        summa = aa*aa + bb*bb;
        gipotenysa = Math.sqrt(summa);
        ploshad = (aa+bb)/2;

        System.out.println("Гипотенуза: "+(gipotenysa) + " ,площадь: " + (ploshad));



        }


    }

