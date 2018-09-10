package Massivi.FirstTask.secondTask.Massivi.Massivi.IndexOff;

public class IndexOff {
    public static void main(String[] args) {
        String hi = "Длинное слово";
        int index1 = hi.indexOf("л");
        int index2 = hi.indexOf("слово", 88);
        int index3 = hi.indexOf("слово", -2);
        System.out.print(index1+" "+index2+" "+index3);
    }
}
