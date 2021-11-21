package V4;

import V4.UI.UI;
import V4.input.Operation.InvalidOperationException;
import V4.input.Operation.OperationInputer;
import V4.input.Size.InvalidInputException;
import V4.input.Size.SizeInputFactory;
import V4.input.Size.sizeInput.SizeInput;
import V4.input.shape.InvalidShapeException;
import V4.input.shape.ShapeInputer;
import V4.instruction.ScalesSelect;
import V4.operation.Operation;
import V4.operation.OperationFactory;

public class ShapeMathsApp {

    private final UI userInterface;
    private final ShapeInputer shapeInputer;
    private final OperationInputer operationInputer;
    private final ScalesSelect scalesSelector;
    private final SizeInputFactory sizeInputFactory;
    private final OperationFactory operationFactory;

    ShapeMathsApp(UI userInterface, ShapeInputer shapeInputer, OperationInputer operationInputer,
                  ScalesSelect scalesSelector, SizeInputFactory sizeInputFactory, OperationFactory operationFactory){
        this.userInterface=userInterface;
        this.shapeInputer=shapeInputer;
        this.operationInputer=operationInputer;
        this.scalesSelector=scalesSelector;
        this.sizeInputFactory=sizeInputFactory;
        this.operationFactory=operationFactory;

    }
    public void execute(){

        try {
            userInterface.print("Welcome to Shape Maths");
            userInterface.print("Select the shape:");
            String selectShape = shapeInputer.inputShape();
            userInterface.print("Select what do you want calculate:");
            String selectOperation = operationInputer.inputOperation();
            userInterface.print(scalesSelector.selectScale(selectShape));
            SizeInput sizeInput=sizeInputFactory.inputSize(selectShape);
            int[] size=  sizeInput.size();
            Operation operation=operationFactory.operationSelect(selectOperation,selectShape);
            double result=operation.execute(size);
            userInterface.print("result is:"+result);
        } catch (InvalidShapeException| InvalidOperationException |InvalidInputException e) {
            userInterface.print("Error Occurred"+e.getMessage());
        }


    }
}
