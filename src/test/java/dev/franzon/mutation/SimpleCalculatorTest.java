package dev.franzon.mutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleCalculatorTest {

    @Test
    void shouldAddTheNumbers() {
        SimpleCalculator calculator = new SimpleCalculator();

        assertEquals(12.4, calculator.calculate(12.0, 0.4, Operator.ADD));
    }

    @Test
    void shouldSubtractTheNumbers() {
        SimpleCalculator calculator = new SimpleCalculator();

        assertEquals(11.6, calculator.calculate(12.0, 0.4, Operator.MINUS));
    }

    @Test
    void shouldMultTheNumbers() {
        SimpleCalculator calculator = new SimpleCalculator();

        assertEquals(30, calculator.calculate(3.0, 10.0, Operator.MULT));
    }

    @Test
    void shouldDivTheNumbers() {
        SimpleCalculator calculator = new SimpleCalculator();

        assertEquals(3.0, calculator.calculate(12.0, 4.0, Operator.DIV));
    }

    @Test
    void shouldThrowException() {
        SimpleCalculator calculator = new SimpleCalculator();

        assertThrows(IllegalArgumentException.class, () -> calculator.calculate(12.0, 0.4, null));
    }
}
