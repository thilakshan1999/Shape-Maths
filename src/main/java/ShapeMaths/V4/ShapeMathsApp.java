package ShapeMaths.V4;

import ShapeMaths.V4.UI.UI;
import ShapeMaths.V4.input.Operation.InvalidOperationException;
import ShapeMaths.V4.input.Operation.OperationInputer;
import ShapeMaths.V4.input.Size.InvalidInputException;
import ShapeMaths.V4.input.Size.SizeInputFactory;
import ShapeMaths.V4.input.Size.sizeInput.SizeInput;
import ShapeMaths.V4.input.shape.InvalidShapeException;
import ShapeMaths.V4.input.shape.ShapeInputer;
import ShapeMaths.V4.instruction.ScalesSelect;
import ShapeMaths.V4.operation.Operation;
import ShapeMaths.V4.operation.OperationFactory;

import java.util.InputMismatchException;

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
            userInterface.print("Error Occurred "+e.getMessage());
        }
        catch (InputMismatchException e){
            userInterface.print("Error Occurred Type int value");
        }

    }
}
