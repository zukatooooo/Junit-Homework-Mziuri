import org.example.N1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    static Calculator calculator = new Calculator();

    @Test
    public void calculatorAdditionTestN1() {
        Assertions.assertEquals(4, calculator.addition(1, 3));
    }

    @Test
    public void calculatorAdditionTestN2() {
        Assertions.assertEquals(7, calculator.addition(3, 3));
    }

    @Test
    public void calculatorSubtractionTestN1() {
        Assertions.assertEquals(5, calculator.subtraction(7, 2));
    }

    @Test
    public void calculatorSubtractionTestN2() {
        Assertions.assertEquals(3, calculator.subtraction(6, 9));
    }

    @Test
    public void calculatorMultiplicationTestN1() {
        Assertions.assertEquals(6, calculator.multiplication(2, 3));
    }

    @Test
    public void calculatorMultiplicationTestN2() {
        Assertions.assertEquals(10, calculator.multiplication(4, 5));
    }

    @Test
    public void calculatorDivisionTestN1() {
        Assertions.assertEquals(3.0, calculator.division(9, 3));
    }

    @Test
    public void calculatorDivisionTestN2() {
        Assertions.assertEquals(5.0, calculator.division(5, 3));
    }

    @Test
    public void calculatorDivisionTestN3() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.division(0, 0));
    }

}