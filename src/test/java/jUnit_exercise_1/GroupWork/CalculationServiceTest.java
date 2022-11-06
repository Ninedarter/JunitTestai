package jUnit_exercise_1.GroupWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationServiceTest {

    Calculator calculator = new Calculator();
    @Test
    void sumOfTwoIntegers() {
        assertEquals(3,calculator.sum(1,2));
    }

    @Test
    void sumOfTwoIntegers_ThenBothAreNegatives() {
        assertEquals(-3,calculator.sum(-1,-2));
    }

    @Test
    void subtractOfTwoIntegers() {
        assertEquals(5,calculator.subtract(6,1));
    }

    @Test
    void multiplyTwoIntegeres() {
        assertEquals(6,calculator.multiply(6,1));
    }




    @Test
    void divide() {
        assertEquals(3,calculator.divide(6,2));
    }
    @Test
    void calculateCircleArea() {
        assertEquals(12.566370614359172, calculator.calculatgeCircleArea(2.0));
    }

}