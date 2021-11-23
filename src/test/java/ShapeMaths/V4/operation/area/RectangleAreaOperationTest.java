package Shape_Maths.V4.operation.area;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RectangleAreaOperationTest {

    @Test
    public void returnAreaWhenInputLengthWidth() {
        RectangleAreaOperation rectangleAreaOperation = new RectangleAreaOperation();
        double area = rectangleAreaOperation.execute(new int[]{6, 4});
        assertThat(area, is(6.0 * 4.0));
    }
}