package org.example.N1;

public class Calculator{

    private float answer;
    public float addition(float x1, float x2) {
        answer = x1 + x2;
        return answer;
    }

    public float subtraction(float x1, float x2) {
        answer = x1 - x2;
        return answer;
    }

    public float multiplication(float x1, float x2) {
        answer = x1 * x2;
        return answer;
    }

    public float division(float x1, float x2) {
        if (x2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        answer = x1 / x2;
        return answer;
    }

}
