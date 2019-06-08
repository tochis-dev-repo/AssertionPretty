import org.junit.Assert;

public class AssertionPretty <T> {
    T testResult;
    T expectedResult;
    String testDescription="";

    public AssertionPretty(T testResult, T expectedResult) {
        this.testResult = testResult;
        this.expectedResult = expectedResult;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

    public void assertTrue(T testResult, T expectedResult, boolean condition){
        String newLine = "\n";
        String errorMessage = testDescription + newLine + "Expected Result: " + expectedResult.toString() + newLine + "Test Result: " + testResult.toString();
        Assert.assertTrue(errorMessage, condition);
    }

    public void assertTrue(boolean condition){
        String newLine = "\n";
        String errorMessage = newLine + testDescription + newLine + "Expected Result: " + expectedResult.toString() + newLine + "Test Result: " + testResult.toString();
        Assert.assertTrue(errorMessage, condition);
    }
}

