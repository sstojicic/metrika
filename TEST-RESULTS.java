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
