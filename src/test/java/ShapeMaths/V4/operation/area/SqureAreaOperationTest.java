package ShapeMaths.V4.operation.area;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqureAreaOperationTest {
    @Test
    public void returnAreaWhenInputLength() {
        SqureAreaOperation squreAreaOperation = new SqureAreaOperation();
        double area = squreAreaOperation.execute(new int[]{6});
        assertThat(area, is(6.0 * 6.0));
    }
}