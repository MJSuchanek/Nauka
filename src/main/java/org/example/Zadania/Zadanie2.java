package org.example.Zadania;

public class Zadanie2 {
    public static void main(String[] args) {
        String a = "Witaj ";
        String b = "Piękny ";
        String c = "Świecie ";
        String przywitanie = a + b + c;
        System.out.println(przywitanie);
        String d = przywitanie.substring(0, 12);
        System.out.println(d);

    }
}
