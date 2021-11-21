package ShapeMaths.V4;


import ShapeMaths.V4.UI.UI;
import ShapeMaths.V4.UI.UserInterface;
import ShapeMaths.V4.input.Operation.OperationInput;
import ShapeMaths.V4.input.Operation.OperationInputer;
import ShapeMaths.V4.input.Size.SizeInputFactory;
import ShapeMaths.V4.input.shape.ShapeInput;
import ShapeMaths.V4.input.shape.ShapeInputer;
import ShapeMaths.V4.instruction.ScalesSelect;
import ShapeMaths.V4.operation.OperationFactory;

public class Main {
    public static void main(String[] args) {

        UI userInterface=new UserInterface();
        ShapeInputer shapeInputer=new ShapeInput();
        OperationInputer operationInputer=new OperationInput();
        ScalesSelect scalesSelector=new ScalesSelect();
        SizeInputFactory sizeInputFactory=new SizeInputFactory();
        OperationFactory operationFactory=new OperationFactory();
        ShapeMathsApp app=new ShapeMathsApp(userInterface,shapeInputer,operationInputer,scalesSelector,
                sizeInputFactory,operationFactory);
        app.execute();
    }
}




