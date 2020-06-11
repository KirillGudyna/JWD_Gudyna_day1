package test.gudyna.day1;

import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.service.ArithmeticService;
import org.testng.annotations.Test;

import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ArithmeticServiceTest {
    private ArithmeticService arithmeticService = new ArithmeticService();

    @Test
    public void testFunctionWithTwoBranches() {
        int x = 3;
        double expected = 9;
        try {
            double actual = arithmeticService.arithmeticFunctionWithTwoBranches(x);
            assertEquals(expected, actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testCustomFunction() {
        int x = 3;
        double expected = Math.tan(x);
        try {
            double actual = arithmeticService.customFunction(x);
            assertEquals(expected, actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testFunctionOnSegmentWithStep() {
        double x = 3;
        double expected = Math.tan(x);
        try {
            double[]arrayArgument = arithmeticService.makeArrayOfArgumentsWithStep(0, 5 , 0.1);
            Map<Double, Double> result = arithmeticService.makeArrayValuesFunctionOnSegmentWithStep(arrayArgument);
            double actual = result.get(x);
            assertEquals(expected, actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }

    }
}
