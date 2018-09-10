package Massivi.FirstTask.secondTask.Massivi.Massivi.SlychainoeMaxChislo;

public class MaxChislo {
    public static void main(String[] args) {
        int a[] = new int [12];
        int max = -16;
        int index = 0;

        for (int i = 0; i<a.length; i++) {
            a [i] = (int)(Math.random()*32)-15;
            if(max<=a[i]) {
                max = a[i];
                index = i;

            }
            System.out.println(a[i]);

        }System.out.println("Индекс: " + index+ " , Значение: " + max);

    }
}
