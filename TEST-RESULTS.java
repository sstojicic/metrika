public class CalculatorTest {

    public static void main(String[] args) {
        testRunMethod();
        testEvaluateExpressionMethod();
        testCalculateMethod();
    }

    public static void testRunMethod() {
        System.out.println("Testing Run method...");

        // Test 1
        String expression1 = "2+3*4";
        String expectedResult1 = "14.0";
        String result1 = Calculator.Run(expression1);
        assert result1.equals(expectedResult1) : "Test 1 failed";

        // Test 2
        String expression2 = "-5+8/2";
        String expectedResult2 = "1.0";
        String result2 = Calculator.Run(expression2);
        assert result2.equals(expectedResult2) : "Test 2 failed";

        System.out.println("All Run method tests passed!");
        System.out.println();
    }

    public static void testEvaluateExpressionMethod() {
        System.out.println("Testing evaluateExpression method...");

        // Test 1
        String expression1 = "2+3*4";
        String expectedResult1 = "14.0";
        String result1 = Calculator.evaluateExpression(expression1);
        assert result1.equals(expectedResult1) : "Test 1 failed";

        // Test 2
        String expression2 = "-5+8/2";
        String expectedResult2 = "1.0";
        String result2 = Calculator.evaluateExpression(expression2);
        assert result2.equals(expectedResult2) : "Test 2 failed";

        System.out.println("All evaluateExpression method tests passed!");
        System.out.println();
    }

    public static void testCalculateMethod() {
        System.out.println("Testing Calculate method...");

        // Test 1
        List<Float> numbers1 = new ArrayList<>(Arrays.asList(2.0f, 3.0f, 4.0f));
        List<String> operations1 = new ArrayList<>(Arrays.asList("+", "*"));
        Calculator.Calculate(numbers1, operations1);
        float expectedResult1 = 14.0f;
        float result1 = Calculator.finalResult;
        assert result1 == expectedResult1 : "Test 1 failed";

        // Test 2
        List<Float> numbers2 = new ArrayList<>(Arrays.asList(-5.0f, 8.0f, 2.0f));
        List<String> operations2 = new ArrayList<>(Arrays.asList("+", "/"));
        Calculator.Calculate(numbers2, operations2);
        float expectedResult2 = 1.0f;
        float result2 = Calculator.finalResult;
        assert result2 == expectedResult2 : "Test 2 failed";

        System.out.println("All Calculate method tests passed!");
        System.out.println();
    }
}
public class CalculatorBlackBoxTest {

    public static void main(String[] args) {
        testRunMethod();
    }

    public static void testRunMethod() {
        System.out.println("Testing Run method (Black Box)...\n");

        // Test 1: Addition
        String expression1 = "2+3";
        String expectedResult1 = "5.0";
        testExpression(expression1, expectedResult1);

        // Test 2: Subtraction
        String expression2 = "7-4";
        String expectedResult2 = "3.0";
        testExpression(expression2, expectedResult2);

        // Test 3: Multiplication
        String expression3 = "5*2";
        String expectedResult3 = "10.0";
        testExpression(expression3, expectedResult3);

        // Test 4: Division
        String expression4 = "10/2";
        String expectedResult4 = "5.0";
        testExpression(expression4, expectedResult4);

        // Test 5: Combination of operations
        String expression5 = "2+3*4-10/2";
        String expectedResult5 = "11.0";
        testExpression(expression5, expectedResult5);

        // Test 6: Expression starting with addition
        String expression6 = "+5+3";
        String expectedResult6 = "8.0";
        testExpression(expression6, expectedResult6);

        // Test 7: Expression starting with subtraction
        String expression7 = "-5+3";
        String expectedResult7 = "-2.0";
        testExpression(expression7, expectedResult7);

        // Test 8: Expression with decimal numbers
        String expression8 = "3.5*2.5";
        String expectedResult8 = "8.75";
        testExpression(expression8, expectedResult8);

        // Test 9: Expression with negative result
        String expression9 = "2-5";
        String expectedResult9 = "-3.0";
        testExpression(expression9, expectedResult9);

        // Test 10: Expression with division by zero
        String expression10 = "5/0";
        String expectedResult10 = "Infinity";
        testExpression(expression10, expectedResult10);

        System.out.println("All Run method (Black Box) tests passed!");
    }

    private static void testExpression(String expression, String expectedResult) {
        String result = Calculator.Run(expression);
        assert result.equals(expectedResult) : "Test failed: Expression: " + expression + ", Expected: " + expectedResult + ", Actual: " + result;
        System.out.println("Test passed: Expression: " + expression + ", Result: " + result);
    }
}
