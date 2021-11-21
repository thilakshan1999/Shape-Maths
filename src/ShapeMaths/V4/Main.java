package V4;


import V4.UI.UI;
import V4.UI.UserInterface;
import V4.input.Operation.OperationInput;
import V4.input.Operation.OperationInputer;
import V4.input.Size.SizeInputFactory;
import V4.input.shape.ShapeInput;
import V4.input.shape.ShapeInputer;
import V4.instruction.ScalesSelect;
import V4.operation.OperationFactory;

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




