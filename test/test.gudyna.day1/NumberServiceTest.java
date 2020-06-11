package test.gudyna.day1;

import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.service.NumberService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberServiceTest {
    private NumberService numberService = new NumberService();

    @Test
    public void testLastDigit() {
        int number = 156;
        int expected = 6;
        try {
            int actual = numberService.calculateLastDigit(number);
            assertEquals(actual, expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }

    }

    @Test
    public void testLastDigitSquare() {
        int number = 3;
        int expected = 9;
        try {
            int actual = numberService.calculateLastDigitSquare(number);
            assertEquals(actual, expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testPerfectNumber() {
        int number = 6;
        try {
            boolean answer = numberService.isNumberPerfect(number);
            assertTrue(answer);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void test1PerfectNumber() {
        int number = 156;
        try {
            boolean answer = numberService.isNumberPerfect(number);
            assertFalse(answer);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testEvenNumber() {
        int number = 8;
        try {
            boolean answer = numberService.isEvenNumber(number);
            assertTrue(answer);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void test1EvenNumber() {
        int number = 9;
        try {
            boolean answer = numberService.isEvenNumber(number);
            assertFalse(answer);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testForTwoEvenNumber() {
        int[] numbers = {2, 2, 11, 6};
        try {
            boolean answer = numberService.checkForTwoEvenNumbers(numbers);
            assertTrue(answer);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void test1ForTwoEvenNumber() {
        int[] numbers = {2, 5, 11, 1};
        try {
            boolean answer = numberService.checkForTwoEvenNumbers(numbers);
            assertFalse(answer);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

}
