package V3;


import V3.UI.UI;
import V3.UI.UserInterface;
import V3.input.Operation.OperationInput;
import V3.input.Operation.OperationInputer;
import V3.input.shape.ShapeInput;
import V3.input.Size.SizeInputFactory;
import V3.input.shape.ShapeInputer;
import V3.instruction.ScalesSelect;
import V3.operation.OperationFactory;

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




