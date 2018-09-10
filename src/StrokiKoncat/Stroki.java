package StrokiKoncat;

public class Stroki {
    public static void main(String[] args) {
        String s1 = "fd";
        String s2 = "sm";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        s3.replace('f','1');
        System.out.println(s3);
        //System.out.println();
    }
}
