package ShapeMaths.V4.instruction;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScalesSelectTest {

    @Test
    public void returnLenghtwhenArgumentSquare(){
        ScalesSelect scalesSelect=new ScalesSelect();
        String result=scalesSelect.selectScale("Square");
        assertEquals("Length:",result);
    }

    @Test
    public void returnRadiustwhenArgumentCircle(){
        ScalesSelect scalesSelect=new ScalesSelect();
        String result=scalesSelect.selectScale("Circle");
        assertEquals("Radius:",result);
    }

    @Test
    public void returnLenghtWidthwhenArgumentRectangle(){
        ScalesSelect scalesSelect=new ScalesSelect();
        String result=scalesSelect.selectScale("Rectangle");
        assertEquals("Length,Width:",result);
    }

}