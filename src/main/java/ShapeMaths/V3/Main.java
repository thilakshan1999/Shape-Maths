package ShapeMaths.V3;


import ShapeMaths.V3.UI.UI;
import ShapeMaths.V3.UI.UserInterface;
import ShapeMaths.V3.input.Operation.OperationInput;
import ShapeMaths.V3.input.Operation.OperationInputer;
import ShapeMaths.V3.input.shape.ShapeInput;
import ShapeMaths.V3.input.Size.SizeInputFactory;
import ShapeMaths.V3.input.shape.ShapeInputer;
import ShapeMaths.V3.instruction.ScalesSelect;
import ShapeMaths.V3.operation.OperationFactory;

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




