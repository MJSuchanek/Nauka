package org.example.main2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        BigInteger first = new BigInteger("123123123123123123123123");
        BigInteger secound = new BigInteger("987987987987987987987988");
        BigInteger sum = first.add(secound);
        System.out.println("Suma " + sum.toString());

        BigDecimal a = new BigDecimal("9.5");
        BigDecimal b = new BigDecimal("4");
        BigDecimal c = new BigDecimal("0.33");

        System.out.println(a.divide(b).multiply(c));
    }
}
