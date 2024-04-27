import java.lang.StrictMath;
import java.lang.Math;

import static java.lang.StrictMath.*;

public class CalculatorEngine {

    public CalculatorResult _calculatorResult = new CalculatorResult();

    /**
     * Addition method
     * **/
    public CalculatorResult add(double inputA, double inputB) {
        //preq-ENGINE-3
        double result =  (inputA + inputB);
        _calculatorResult.setResult(result);
        return _calculatorResult;

    }

    /**
     * Subtraction method
     * **/
    public CalculatorResult subtraction(double inputA, double inputB) {
        //preq-ENGINE-4
        double result = (inputA - inputB);
        _calculatorResult.setResult(result);
        return _calculatorResult;
    }

    public CalculatorResult multiplication(double inputA, double inputB) {
        //preq-ENGINE-5
        double result = (inputA * inputB);
        _calculatorResult.setResult(result);
        return _calculatorResult;
    }



    public CalculatorResult division(double inputA, double inputB) {
        //preq-ENGINE-7
        double result = (inputA / inputB);
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            _calculatorResult.setError("Cannot divide by Zero");
        }
        _calculatorResult.setResult(result);
        return _calculatorResult;
    }



    /**
     * EQUALS METHOD
     * Returns 1 when equivalent to 8 precision points. Returns 0 when not equivalent
     **/
    public int equals(double inputA, double inputB) {
        //preq-ENGINE-8
        int result;
        double tolerance = Math.pow(10, -8);
        double absoluteValueOfDifference = Math.abs(inputA - inputB);
        boolean withinTolerance = absoluteValueOfDifference <= tolerance;
        if (withinTolerance) {
            result = 1;
        }else {result = 0;}

        return result;
    }



    /** Raise To Power
     * Parameters:
     * a - the base.
     * b - the exponent.
     * Returns:
     * the value a^b
     * **/
    public CalculatorResult raiseToPower(double inputA, double inputB) {
        //preq-ENGINE-9
        double result =  Math.pow(inputA, inputB);
        _calculatorResult.setResult(result);
        return _calculatorResult;
    }




    /** Root Of Number
     * A root B
     * Returns Bth root of A
     * */
    public CalculatorResult rootOfNumber(double inputA, double inputB) {
        //preq-ENGINE-11
        double result = Math.pow(inputA, 1/inputB);
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            _calculatorResult.setError("Number cannot be Zero");
        }
        _calculatorResult.setResult(result);
        return _calculatorResult;

    }


    /** Factorial Of Number
     * A!
     * Returns A * (A-1) * (A - ...) * 2 * 1
     * */
    public double factorialOfNumber(double inputA) {
        //preq-ENGINE-12
        Double inputA_Double = inputA;
        int a = inputA_Double.intValue();
        if (a == 0) // Base case
            return 1;
        else
            return a * factorialOfNumber(a - 1); // Recursive call
    }





    /** Reciprocal of Number
     *
     * Returns (1/inputA)
     * */
    public CalculatorResult reciprocalOfA(double inputA) {
        double result = 1/inputA;
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            _calculatorResult.setError("Cannot divide by Zero");
        }
        _calculatorResult.setResult(result);
        return _calculatorResult;
    }













    /*public static void main(String[] args) {
        double a = 5.0;
        double b = 0.0;
        System.out.println(a / b);

    }*/

}//class
