package org.example.Zadania;

public class Zadanie3 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        System.out.println((a + b) * c);
        System.out.println(a - b / c);

        a++;
        b++;
        c++;

        System.out.println("Czy a + b > c? " + ((a + b) > c));
        System.out.println("Czy a = b " + (a == b));

    }
}
