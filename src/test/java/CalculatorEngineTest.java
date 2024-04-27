import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorEngineTest {

    private CalculatorEngine _calculator;
    private ICalculatorResult _result;

    @BeforeEach
    void setUp() {
        //arrange
        _calculator = new CalculatorEngine();
        _result = new CalculatorResult();
    }

    @AfterEach
    void tearDown() {
        _calculator = null;
        _result = null;
    }


//===========================================================================================
    /** Addition */
//===========================================================================================

    /**
     * Adding Positive number to Negative number, expect to return a Positive Number
     **/
    @Test
    public void add_PositivePlusNegativeNumber_ReturnsPositiveNumber() {
        //preq-UNIT-TEST-2

        //arrange
        double a = 5.5;
        double b = -3.15;
        double expected = 2.35;
        //act
        _result = _calculator.add(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }


    /**
     * Adding irrational Numbers, expected to return irrational numbers
     **/
    @Test
    public void add_IrrationalNumbers_ReturnsSumOfValues() {
        //arrange
        double a = 1.333333;
        double b = 3.016516516;
        double expected = 4.349849516;
        //act
        _result = _calculator.add(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }

    /**
     * Adding Negative numbers, expect to return a Negative Number
     **/
    @Test
    public void add_TwoNegativeNumbers_ReturnsNegativeNumber() {
        //arrange
        double a = -400;
        double b = -300;
        double expected = -700;
        //act
        _result = _calculator.add(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }

//===========================================================================================
    /** Subtraction */
//===========================================================================================

    /**
     * Subtracting two positive numbers, expect result to be positive when a > b
     **/
    @Test
    public void subtraction_TwoPositiveNumbers_ResultPositive() {
        //preq-UNIT-TEST-3

        //arrange
        double a = 27.93;
        double b = 4;
        double expected = 23.93;
        //act
        _result = _calculator.subtraction(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }

    /**
     * Subtracting positive and negative number, expect result to be positive
     **/
    @Test
    public void subtraction_PositiveMinusNegativeNumber_ResultPositive() {

        //arrange
        double a = 10.0;
        double b = -4;
        double expected = 14;
        //act
        _result = _calculator.subtraction(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }

//===========================================================================================
    /** Multiplication */
//===========================================================================================

    /**
     * Multiplication of two positive numbers, result is Positive
     **/
    @Test
    public void multiplication_TwoPositiveNumbers_ResultPositive() {
        //preq-UNIT-TEST-4

        //arrange
        double a = 5;
        double b = 7.1;
        double expected = 35.5;
        //act
        _result = _calculator.multiplication(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }

    /**
     * Multiplication of two Negative numbers, result is Positive
     **/
    @Test
    public void multiplication_TwoNegativeNumbers_ResultPositive() {

        //arrange
        double a = -5.95;
        double b = -8.325;
        double expected = 49.53375;
        //act
        _result = _calculator.multiplication(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }



//===========================================================================================
    /** Division */
//===========================================================================================

    /**
     * Dividing rational numbers returns repeating decimal number
     **/
    @Test
    public void division_Fractions_ReturnsIrrationalNumber() {
        //preq-UNIT-TEST-5

        //arrange
        double a = 1.0;
        double b = 3.0;
        double expected = 0.3333333333333333;
        //act
        _result = _calculator.division(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }


    /**
     * Divide by zero Test, Expect IntelliJ to return Infinity, which is undefined
     **/
    @Test
    public void division_DivideByZero_ReturnsInfinity() {
        //preq-UNIT-TEST-6

        //arrange
        double a = 20.0;
        double b = 0.0;
        double expected = Double.POSITIVE_INFINITY;
        //act
        _result = _calculator.division(a, b);
        double actual = _result.getResult();
        //assert
        System.out.println(_result.getError());
        assertEquals(expected, actual);
    }




     /**
     * Dividing two different irrational numbers expected to return an irrational number
     **/
    @Test
    public void division_IrrationalNumbers_ReturnsIrrationalNumber() {
        //arrange
        double a = 5.65241521;
        double b = 0.76243515;
        double expected = 7.413634077599911;
        //act
        _result = _calculator.division(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }



    /**
     * Divide two negative numbers. Expect Result to be positive
     **/
    @Test
    public void division_TwoNegativeInputs_ReturnsPositive() {
        //arrange
        double a = -5.0;
        double b = -4.0;
        double expected = 1.25;
        //act
        _result = _calculator.division(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }

    /**
     * Divide zero by a number. Expect Result to be zero
     **/
    @Test
    public void division_DividingZero_ReturnsZero() {
        //arrange
        double a = 0.0;
        double b = 4.0;
        double expected = 0;
        //act
        _result = _calculator.division(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }

    /**
     * Divide negative number by positive number. Expect Result to be negative
     **/
    @Test
    public void division_NegativeDividedByPositive_ReturnsNegative() {
        //arrange
        double a = -5.0;
        double b = 4.0;
        double expected = -1.25;
        //act
        _result = _calculator.division(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }


    //===========================================================================================
    /** Equals */
//===========================================================================================

    /**
     * Equals
     **/
    @Test
    public void equals_EightPrecisionPoints_ResultsOne() {
        //preq-UNIT-TEST-7

        //arrange
        double a = 0.333333331;
        double b = 0.333333332;
        int expected = 1;
        //act
        int actual = _calculator.equals(a, b);
        //assert
        assertEquals(expected, actual);
    }



//===========================================================================================
    /** Raise To Power */
//===========================================================================================

    /**
     * Raise to Power
     **/
    @Test
    public void raiseToPower_PositiveBaseNegativeExponent_ReturnsPositiveNumber() {
        //preq-UNIT-TEST-8

        //arrange
        double a = 5.0;
        double b = -3.0;
        double expected = 0.008;
        //act
        _result = _calculator.raiseToPower(a, b);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }


//===========================================================================================
    /** Root Of Number */
//===========================================================================================

    /**
     * Root Of Number
     **/
    @Test
    public void rootOfNumber_EightRootThree_ResultTwo() {
        //preq-UNIT-TEST-12

        //arrange
        double a = 8.0;
        double b = 3.0;
        double expected = 2;
        //act
        _result = _calculator.rootOfNumber(a, b);
        double actual = _result.getResult();
        //assert

        assertEquals(expected, actual);
    }


    /**
     * Root Of Number error Test
     **/
    @Test
    public void rootOfNumber_InputZero_ResultError() {
        //preq-UNIT-TEST-13

        //arrange
        double a = 8.0;
        double b = 0.0;
        double expected = Double.POSITIVE_INFINITY;
        //act
        _result = _calculator.rootOfNumber(a, b);
        double actual = _result.getResult();
        //assert
        System.out.println(_result.getError());
        assertEquals(expected, actual);
    }






//===========================================================================================
    /** Reciprocal Of Number */
//===========================================================================================

    /**
     * Reciprocal Of Number
     **/
    @Test
    public void reciprocalOfA_Test() {
        //preq-UNIT-TEST-19

        //arrange
        double a = 8;

        //double expected = Double.POSITIVE_INFINITY;
        double expected = 0.125;
        //act
        _result = _calculator.reciprocalOfA(a);
        double actual = _result.getResult();
        //assert
        assertEquals(expected, actual);
    }

    /**
     * Reciprocal input zero
     **/
    @Test
    public void reciprocalOfA_InputZero_ResultError() {
        //preq-UNIT-TEST-20

        //arrange
        double a = 0;

        //double expected = Double.POSITIVE_INFINITY;
        double expected = Double.POSITIVE_INFINITY;
        //act
        _result = _calculator.reciprocalOfA(a);
        double actual = _result.getResult();
        //assert
        System.out.println(_result.getError());
        assertEquals(expected, actual);
    }


//===========================================================================================
    /** Factorial Of Number */
//===========================================================================================

    /**
     * factorialOfNumber
     **/
    @Test
    public void factorialOfNumber_Test() {
        //preq-UNIT-TEST-14

        //arrange
        double a = 5.0;

        double expected = 120;
        //act
        double actual = _calculator.factorialOfNumber(a);
        //assert
        assertEquals(expected, actual);
    }

}//class