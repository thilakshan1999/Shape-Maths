package ShapeMaths.V4.input.Size;



import ShapeMaths.V4.input.Size.sizeInput.SizeInput;
import ShapeMaths.V4.input.Size.sizeInput.SizeInputCircle;
import ShapeMaths.V4.input.Size.sizeInput.SizeInputRectangle;
import ShapeMaths.V4.input.Size.sizeInput.SizeInputSquare;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import static org.junit.Assert.*;

public class SizeInputFactoryTest {

    @Test
    public void returnSquareObjectWhenArgumentSquare(){
        SizeInputFactory sizeInputFactory=new SizeInputFactory();
        SizeInput sizeInput=sizeInputFactory.inputSize("Square");
        assertThat(sizeInput,instanceOf(SizeInputSquare.class));
    }
    @Test
    public void returnCircleObjectWhenArgumentCircle(){
        SizeInputFactory sizeInputFactory=new SizeInputFactory();
        SizeInput sizeInput=sizeInputFactory.inputSize("Circle");
        assertThat(sizeInput,instanceOf(SizeInputCircle.class));
    }
    @Test
    public void returnRectangleObjectWhenArgumentRectangle(){
        SizeInputFactory sizeInputFactory=new SizeInputFactory();
        SizeInput sizeInput=sizeInputFactory.inputSize("Rectangle");
        assertThat(sizeInput,instanceOf(SizeInputRectangle.class));

    }

}