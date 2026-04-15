package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.*;

public class NewIntCalculatorTest {
    private NewIntCalculator calc;

    @BeforeEach
    public void setup() {
        calc = new NewIntCalculator().init();
    }

    @Test
    public void testAdd() {
        calc.add(5).add(3);
        Assertions.assertEquals(8, calc.state);
    }


    @Test
    public void testSubtract() {
        calc.add(10);
        calc.subtract(4);
        Assertions.assertEquals(6, calc.state);
    }


    @Test
    public void testMultiply() {
        calc.add(4);
        calc.multiply(5);
        Assertions.assertEquals(20, calc.state);
    }



    @Test
    public void testMultiplyBy0() {
        calc.add(99);
        calc.multiply(0);
        Assertions.assertEquals(0, calc.state);
    }

    @Test
    public void testDivide() {
        calc.add(10);
        calc.divide(2);
        Assertions.assertEquals(5, calc.state);
    }

    @Test
    public void testDivideBy0() {
        calc.add(10);
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.divide(0);
        });
    }

    @AfterEach
    public void tearDown() {
        calc = null;
    }
}