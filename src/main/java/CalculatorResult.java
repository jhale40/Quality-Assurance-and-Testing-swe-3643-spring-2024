public class CalculatorResult implements ICalculatorResult {
    private double result;
    private boolean isSuccess;
    private String operation;
    private String error;

    @Override
    public double getResult() {
        return result;
    }

    @Override
    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public boolean getIsSuccess() {
        return isSuccess;
    }

    @Override
    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    public String getOperation() {
        return operation;
    }

    // for example, "1.25 + 3.8 ="
    @Override
    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String getError() {
        return error;
    }

    // for example, "" or "Not A Number"
    @Override
    public void setError(String error) {
        this.error = error;
    }

}//class
