package ShapeMaths.V4.operation;

import ShapeMaths.V4.operation.area.CircleAreaOperation;
import ShapeMaths.V4.operation.area.RectangleAreaOperation;
import ShapeMaths.V4.operation.area.SqureAreaOperation;
import ShapeMaths.V4.operation.circumference.CircleCircumferenceOperation;
import ShapeMaths.V4.operation.circumference.RectangleCircumferenceOperation;
import ShapeMaths.V4.operation.circumference.SquareCircumferenceOperation;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OperationFactoryTest {

    @Test
    public void returnSquareAreaOperationWhenArgumentSquareArea(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.operationSelect("Area","Square");
        assertThat(operation,instanceOf(SqureAreaOperation.class));
    }
    @Test
    public void returnCircleAreaOperationWhenArgumentCircleArea(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.operationSelect("Area","Circle");
        assertThat(operation,instanceOf(CircleAreaOperation.class));
    }
    @Test
    public void returnRectangleAreaOperationWhenArgumentRectangleArea(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.operationSelect("Area","Rectangle");
        assertThat(operation,instanceOf(RectangleAreaOperation.class));
    }
    @Test
    public void returnSquareCircumferenceOperationWhenArgumentSquareCircumference(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.operationSelect("Circumference","Square");
        assertThat(operation,instanceOf(SquareCircumferenceOperation.class));
    }
    @Test
    public void returnRectangleCircumferenceOperationWhenArgumentRectangleCircumference(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.operationSelect("Circumference","Rectangle");
        assertThat(operation,instanceOf(RectangleCircumferenceOperation.class));
    }
    @Test
    public void returnCircleCircumferenceOperationWhenArgumentCircleCircumference(){
        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.operationSelect("Circumference","Circle");
        assertThat(operation,instanceOf(CircleCircumferenceOperation.class));
    }


}