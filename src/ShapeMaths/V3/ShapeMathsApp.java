package V3;

import V3.UI.UI;
import V3.input.Operation.OperationInputer;
import V3.input.Size.SizeInputFactory;
import V3.input.Size.sizeInput.SizeInput;
import V3.input.shape.ShapeInputer;
import V3.instruction.ScalesSelect;
import V3.operation.Operation;
import V3.operation.OperationFactory;

public class ShapeMathsApp {

    UI userInterface;
    ShapeInputer shapeInputer;
    OperationInputer operationInputer;
    ScalesSelect scalesSelector;
    SizeInputFactory sizeInputFactory;
    OperationFactory operationFactory;

    ShapeMathsApp(UI userInterface,ShapeInputer shapeInputer,OperationInputer operationInputer,
                  ScalesSelect scalesSelector,SizeInputFactory sizeInputFactory,OperationFactory operationFactory){
        this.userInterface=userInterface;
        this.shapeInputer=shapeInputer;
        this.operationInputer=operationInputer;
        this.scalesSelector=scalesSelector;
        this.sizeInputFactory=sizeInputFactory;
        this.operationFactory=operationFactory;

    }
    public void execute(){
        userInterface.print("Welcome to Shape Maths");
        userInterface.print("Select the shape:");
        String selectShape= shapeInputer.inputShape();
        userInterface.print("Select what do you want calculate:");
        String selectOperation=operationInputer.inputOperation();
        userInterface.print(scalesSelector.selectScale(selectShape));
        SizeInput sizeInput=sizeInputFactory.inputSize(selectShape);
        int[] size= sizeInput.size();
        Operation operation=operationFactory.operationSelect(selectOperation,selectShape);
        double result=operation.execute(size);
        userInterface.print("result is:"+result);
    }
}
