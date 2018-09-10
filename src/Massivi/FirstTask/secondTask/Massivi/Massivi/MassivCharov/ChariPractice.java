package Massivi.FirstTask.secondTask.Massivi.Massivi.MassivCharov;

public class ChariPractice {
    public static void main(String args[]){
        String str = "ЮЛЯ";
        char[] result = str.toCharArray();

        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++)
            System.out.println("Element [" + i + "]: " + result[i]);
    }
}
