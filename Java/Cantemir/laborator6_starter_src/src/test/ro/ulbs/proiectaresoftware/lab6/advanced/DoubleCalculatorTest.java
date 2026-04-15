package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.*;

public class DoubleCalculatorTest {
    private DoubleCalculator calc;

    @BeforeEach
    public void setup() {
        calc = new DoubleCalculator().init();
    }

    @Test
    public void testAdd() {
        calc.add(5.0).add(3.0);
        Assertions.assertEquals(8.0, calc.state);
    }


    @Test
    public void testSubtract() {
        calc.add(10.0);
        calc.subtract(4.0);
        Assertions.assertEquals(6.0, calc.state);
    }

    @Test
    public void testMultiply() {
        calc.add(4.0);
        calc.multiply(5.0);
        Assertions.assertEquals(20.0, calc.state);
    }


    @Test
    public void testMultiplyBy0() {
        calc.add(99.0);
        calc.multiply(0.0);
        Assertions.assertEquals(0.0, calc.state);
    }

    @Test
    public void testDivide() {
        calc.add(10.0);
        calc.divide(2.0);
        Assertions.assertEquals(5.0, calc.state);
    }

    @Test
    public void testDivideBy0() {
        calc.add(10.0);
        calc.divide(0.0);
        Assertions.assertEquals(Double.POSITIVE_INFINITY, calc.state);
    }

    @AfterEach
    public void tearDown() {
        calc = null;
    }
}