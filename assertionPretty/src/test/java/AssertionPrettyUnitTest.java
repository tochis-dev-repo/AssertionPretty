import org.junit.Test;

public class AssertionPrettyUnitTest {
    public int badAddition(int a, int b){
        return a + b * 2;
    }

    public String getText(){
        return "Pigs In Space - Muppet Show";
    }

    @Test
    public void additionTest(){
        int a = 3;
        int b = 4;
        int testResult = badAddition(a, b);
        int expectedResult = a + b;
        boolean testCondition = testResult==expectedResult;
        AssertionPretty assertion = new AssertionPretty(testResult, expectedResult);
        assertion.setTestDescription("Test for the badAddition method");
        assertion.assertTrue(testCondition);
    }

    @Test
    public void getTextTest(){
        String testResult = getText();
        String expectedResult = "Pigs In Space:- Muppet Show";
        boolean testCondition = testResult.equals(expectedResult);
        AssertionPretty assertion = new AssertionPretty(testResult, expectedResult);
        assertion.setTestDescription("Test the Muppet Show Title");
        assertion.assertTrue(testCondition);
    }
}
