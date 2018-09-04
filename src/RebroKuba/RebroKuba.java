package RebroKuba;

import java.util.Scanner;

public class RebroKuba {
    public static void main(String[] args) {
        System.out.println("Введите длину ребра");
        Scanner a = new Scanner(System.in);
        int rebro = a.nextInt();
        int V = 3;
        int S = 2;
        System.out.println("Объем куба: "+Math.pow(rebro, V));
        System.out.println("Площадь боковой поверхности куба: " + Math.pow(rebro, S));
    }
}
