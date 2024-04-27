public interface ICalculatorResult {
    double getResult();

    void setResult(double result);

    boolean getIsSuccess();

    void setIsSuccess(boolean isSuccess);

    String getOperation();

    // Operation Example: "6.0 * 3.0 = "
    void setOperation(String operation);

    String getError();

    // Error Example: "Cannot divide by zero" or "Not A Number"
    void setError(String error);
}
