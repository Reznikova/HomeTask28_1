package Massivi.FirstTask.secondTask.Massivi.Massivi.IsCharovVStroky;

public class Stroka {
    public static void main(String args[]) {
        char[] chars = {'V', 'e', 'r', 't', 'e', 'x', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        String s1 = "String";
        System.out.println("String s1 before copyValueOf: 	" + s1);

        s1 = s1.copyValueOf(chars);
        System.out.println("String s1 after copyValueOf: 	" + s1);
    }
}
