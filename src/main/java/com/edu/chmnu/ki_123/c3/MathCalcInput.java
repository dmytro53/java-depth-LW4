package com.edu.chmnu.ki_123.c3;

import java.util.Scanner;
import static java.lang.Math.*;

public class MathCalcInput {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            double x, a, b, c;

            System.out.print("Enter the value of x: ");
            x = scanner.nextDouble();

            System.out.print("Enter the value of a: ");
            a = scanner.nextDouble();

            System.out.print("Enter the value of b: ");
            b = scanner.nextDouble();

            System.out.print("Enter the value of c: ");
            c = scanner.nextDouble();

            double result = (exp(a * cos(x+2))) - ((exp(- sin(b * x)))/(c - cbrt(x)));

            System.out.printf("Result: %.3f\n", result);
        }
    }
}