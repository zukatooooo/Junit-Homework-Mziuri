package org.example.N3;

public class FactorialCalculator {
    public int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not for negative numbers");
        }

        else if (n == 0 || n == 1) {
            return 1;
        }

        else {
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
