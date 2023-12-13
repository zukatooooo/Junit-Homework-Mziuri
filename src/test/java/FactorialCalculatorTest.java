import org.example.N3.FactorialCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    int result;

    FactorialCalculator factorialCalculator = new FactorialCalculator();

    @Test
    public void FactorialCalculatorTestN1() {
        int result = factorialCalculator.calculateFactorial(5);
        Assertions.assertEquals(120, result);
    }

    @Test()
    public void FactorialCalculatorTestN2() {
        result = factorialCalculator.calculateFactorial(0);
        Assertions.assertEquals(1, result);
    }
}
