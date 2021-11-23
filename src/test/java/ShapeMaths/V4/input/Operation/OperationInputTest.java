package ShapeMaths.V4.input.Operation;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class OperationInputTest {

    @Test
    public void returnAreaWhenInputArea() throws InvalidOperationException {
        OperationInput operationInput=new OperationInput();
        String input="Area";
        InputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String result=operationInput.inputOperation();
        assertEquals("Area",result);
    }
    @Test
    public void returnCircumferenceWhenInputCircumference() throws InvalidOperationException {
        OperationInput operationInput=new OperationInput();
        String input="Circumference";
        InputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        String result=operationInput.inputOperation();
        assertEquals("Circumference",result);
    }
    @Test
    public void returnErrorWhenInputOtherString() {
        OperationInput operationInput=new OperationInput();
        String input="ab";
        InputStream in=new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        boolean thrown=false;
        try{
            operationInput.inputOperation();
        }
        catch(InvalidOperationException e){
            thrown=true;

        }
        assertTrue(thrown);
//        assertThrows(InvalidOperationException.class,()->{operationInput.inputOperation();});

    }

}