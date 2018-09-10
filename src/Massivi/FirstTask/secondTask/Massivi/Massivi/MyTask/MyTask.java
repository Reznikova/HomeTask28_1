package Massivi.FirstTask.secondTask.Massivi.Massivi.MyTask;

public class MyTask {
    public static void main(String[] args) {
        int[] some = new int[10];
        for (int i = 0; i >= some.length; i++) {
            some[i] = (int) (Math.random() * 20);
            System.out.println("результат "+some[i]);
        }

    }
}
