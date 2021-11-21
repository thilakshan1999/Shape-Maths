package V4.input.Size;

import V4.input.Size.sizeInput.SizeInput;
import V4.input.Size.sizeInput.SizeInputCircle;
import V4.input.Size.sizeInput.SizeInputRectangle;
import V4.input.Size.sizeInput.SizeInputSquare;

public class SizeInputFactory {
    public SizeInput inputSize(String selectShape)
    {
        SizeInput sizeInput=null;
        switch(selectShape) {
            case "Square":
                sizeInput=new SizeInputSquare();
                break;
            case "Circle":
                sizeInput=new SizeInputCircle();
                break;
            case "Rectangle":
                sizeInput=new SizeInputRectangle();
                break;
        }
        return sizeInput;
    }
}
