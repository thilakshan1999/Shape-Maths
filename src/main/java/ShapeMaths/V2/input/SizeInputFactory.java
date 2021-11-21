package ShapeMaths.V2.input;

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
