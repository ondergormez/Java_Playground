public class Adder extends CalculateBase {
    public Adder() { super(0,0); }
    public Adder(double leftVal, double rightVal) { super(leftVal, rightVal); }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }

    @Override
    public String getCommandCode() {
        return "add";
    }

    @Override
    public char getCommandSymbol() {
        return '+';
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();

        return getResult();
    }
}
