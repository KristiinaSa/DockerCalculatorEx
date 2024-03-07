package org.example;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("3 - 2 = " + calc.subtract(3, 2));
        System.out.println("2 * 3 = " + calc.multiply(2, 3));
        System.out.println("6 / 3 = " + calc.divide(6, 3));
    }
}
