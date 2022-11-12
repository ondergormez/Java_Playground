public class CalculateHelper {
    private double leftValue;
    private double rightValue;

    // TODO: camel or pascal case?
    private enum CommandCodes {
        Add,
        Subtract,
        Multiply,
        Divide,
    }

    CommandCode command;

    public void process(String statement) throws InvalidStatementException {
        // add 5.0 4.0
        String[] fields = statement.split(" ");
        if (fields.length != 3)
            throw new InvalidStatementException("Incorrect number of fields", statement);

        String commandString = fields[0]; // add

        try {
            leftValue = Double.parseDouble(fields[1]); // 5.0
            rightValue = Double.parseDouble(fields[2]); // 4.0
        }
        catch (NumberFormatException ex) {
            throw new InvalidStatementException("Non-numeric data", statement, ex);
        }

        // TODO:
        // setCommandFromString(command);
        if (command == null)
            throw new InvalidStatementException("Invalid command", statement);

        CalculatorBase calculator = null;
        switch (command) {
            case Add:
                calculator = new Adder(leftValue, rightValue);
                break;
            case Subtract:
                calculator = new Subracter(leftValue, rightValue);
                break;
            case Multiply:
                calculator = new Multiplier(leftValue, rightValue);
                break;
            case Divide:
                calculator = new Calculator(leftValue, rightValue);
                break;
        }

    }
}
