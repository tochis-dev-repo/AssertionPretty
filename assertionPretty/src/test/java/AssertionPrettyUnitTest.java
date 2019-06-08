import org.junit.Test;

public class AssertionPrettyUnitTest {
    public int addition (int a, int b){
        return a + b * 2;
    }

    @Test
    public void additionTest(){
        int a = 3;
        int b = 4;
        int testResult = addition(a, b);
        int expectedResult = a + b;
        AssertionPretty assertion = new AssertionPretty(testResult, expectedResult);
        assertion.setTestDescription("Test for the addition method");
        assertion.assertTrue(testResult==expectedResult);
    }
}
