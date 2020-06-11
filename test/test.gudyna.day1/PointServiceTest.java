package test.gudyna.day1;

import com.gudyna.day1.entity.UserPoint;
import com.gudyna.day1.exception.TaskException;
import com.gudyna.day1.service.PointService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class PointServiceTest {
    private PointService pointService = new PointService();
    @Test
    public void testCloserPoint(){
        UserPoint userPoint = new UserPoint(1,1);
        UserPoint userPoint1 = new UserPoint(1.0,1.0);
        UserPoint expected = new UserPoint(1,1.0);
        try {
            UserPoint actual = pointService.defineCloserPoint(userPoint1,userPoint);
            assertEquals(actual, expected);
        } catch (TaskException e) {
            fail(e.getMessage());
        }
    }

}
