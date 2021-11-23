package Shape_Maths.V4.operation.area;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CircleAreaOperationTest {

    @Test
    public void returnAreaWhenInputRadius(){
        CircleAreaOperation circleAreaOperation=new CircleAreaOperation();
        double area=circleAreaOperation.execute(new int[]{7});
        assertThat(area,is(7*7*3.14));
    }
}