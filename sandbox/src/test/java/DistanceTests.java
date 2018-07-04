import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

@Test
    public void testDistance() {

        Point p1 = new Point(5,7);

        Point p2 = new Point(4444,222);

        Assert.assertEquals(p1.distance(p2),96.4779767615387);

    }
}
