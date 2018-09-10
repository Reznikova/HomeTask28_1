package DveStrokiKontains;

public class Dve {
    public static void main(String[] args) {
        String a = "Самый длинный день в году 1";
        String b = "Вторая строка";
        int summa = 1;
        if (a.contains(b)) {
            System.out.println("Содержит");
        } else {
            System.out.println("Не содержит");
        } //Решение задачи 3

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                summa++; // Я предположила что после последнего слова пробела не ставят, поэтому int summa =1;
            }
        }
        System.out.println("Количество слов в строке:" + summa);

        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(i)) {
        String a2 = a.toUpperCase();
        System.out.println(a2);
        String a3 = a.toLowerCase();
        System.out.println(a3); //Задание 5: Проверка на то что символ является буквой.
                                // Но буквой любой, а не только латинской.
                // По другому не знаю как сделать используя пройденный материал.
    }}
}}
