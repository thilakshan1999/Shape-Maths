package ShapeMaths.V2;


import ShapeMaths.V2.input.OperationInput;
import ShapeMaths.V2.input.ShapeInput;
import ShapeMaths.V2.input.SizeInput;
import ShapeMaths.V2.input.SizeInputFactory;
import ShapeMaths.V2.instruction.Welcome;
import ShapeMaths.V2.operation.Operation;
import ShapeMaths.V2.operation.OperationFactory;

public class Main {
    public static void main(String[] args) {

        Welcome welcome=new Welcome();
        System.out.println(welcome.print());

        ShapeInput shapeInput=new ShapeInput();
        String selectShape= shapeInput.inputShape();

        OperationInput operationInput=new OperationInput();
        String selectOperation=operationInput.inputOperation();

        SizeInputFactory sizeInputFactory=new SizeInputFactory();
        SizeInput sizeInput=sizeInputFactory.inputSize(selectShape);
        int[] size= sizeInput.size();

        OperationFactory operationFactory=new OperationFactory();
        Operation operation=operationFactory.operationSelect(selectOperation,selectShape);

        double result=operation.execute(size);
        UI ui=new UI();
        ui.print("result is:"+result);

    }
}




