package org.example.main2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MathFunctions {
    public static void main(String[] args) {
        double first = 9.0;
        int secound = 3;
        double sqrt = sqrt(first);
        double power = pow(first, secound);

        System.out.println("Pierwiastek z " + first + " wyniosi " + sqrt);
        System.out.println("Pierwiastek z " + first + " podniesiony do potęgi " + secound + " wyniosi " + power);
        System.out.println(first + Math.E);

    }
}
