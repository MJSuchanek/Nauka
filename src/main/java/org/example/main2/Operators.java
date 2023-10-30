package org.example.main2;

public class Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        boolean result1 = a > b;
        boolean result2 = a < b;
        boolean result3 = a == b;
        boolean koniunkcja1 = result1 && result3;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(koniunkcja1);
    }
}