public class Main {
    public static void main(String[] args) {
        String[] statements  = {
                "add 78.0 12.0", // 78.0 + 12.0 = 90.0
        };

        DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
                new Adder()
        });

        for (String statement : statements) {
            String output = helper.process(statement);
            System.out.println(output);
        }
    }
}