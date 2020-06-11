package test.gudyna.day1;

import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.service.ShapeService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShapeServiceTest {
    private ShapeService shapeService = new ShapeService();

    @Test
    public void testCircumference() {
        double radius = 2;
        double expected = Math.PI * 4;
        try {
           double actual = shapeService.calculateCircumference(radius);
           assertEquals(actual,expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }
    @Test
    public void testAreaCircle() {
        double radius = 2;
        double expected = Math.PI * 4;
        try {
            double actual = shapeService.calculateAreaCircle(radius);
            assertEquals(actual,expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }
    @Test
    public void testAreaOfInscribedSquare(){
        double areaOfDescribedSquare = 4;
        double expected = 2;
        try {
            double actual = shapeService.calculateAreaOfInscribedSquare(areaOfDescribedSquare);
            assertEquals(expected,actual);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }
}
