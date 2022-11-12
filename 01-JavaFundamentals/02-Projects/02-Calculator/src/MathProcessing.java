public interface MathProcessing {
    static final String SEPERATOR = " ";
    String getCommandCode(); // add
    char getCommandSymbol(); // +
    double doCalculation(double leftVal, double rightVal);
}
