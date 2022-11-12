public class DynamicHelper {
    private MathProcessing[] handlers;

    public DynamicHelper(MathProcessing[] handlers) {
        this.handlers = handlers;
    }

    public String process(String statement) {
        // IN: multiply 3.0 7.0
        // OUT: 3.0 * 7.0 = 21.0

        String[] fields = statement.split(MathProcessing.SEPERATOR);
        // TODO: Execption handling like other side
        String keyword = fields[0]; // multiply

        MathProcessing theHandler = null;

        for (MathProcessing handler : handlers) {
            if (commandCode.equalsIgnoreCase(handler.getCommandCode())) {
                theHandler = handler;
                break;
            }
        }

        // TODO: null control just like the other
        double leftVal = Double.parseDouble(parts[1]); // 3.0
        double rightVal = Double.parseDouble(parts[2]); // 7.0

        double result = theHandler.doCalculation(leftVal, rightVal);

        StringBuilder sb = new StringBuilder(40);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(theHandler.getCommandSymbol());
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();
    }
}
