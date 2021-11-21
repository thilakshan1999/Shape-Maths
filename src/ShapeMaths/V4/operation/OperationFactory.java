package V4.operation;

import V4.operation.area.CircleAreaOperation;
import V4.operation.area.RectangleAreaOperation;
import V4.operation.area.SqureAreaOperation;
import V4.operation.circumference.CircleCircumferenceOperation;
import V4.operation.circumference.RectangleCircumferenceOperation;
import V4.operation.circumference.SquareCircumferenceOperation;

public class OperationFactory {
    public Operation operationSelect(String selectOperation, String selectShape ) {
        Operation operation=null;
        if(selectOperation.equals("Area")&&selectShape.equals("Square")){
            operation=new SqureAreaOperation();
        }
        else if(selectOperation.equals("Area")&&selectShape.equals("Circle")){
            operation=new CircleAreaOperation();
        }
        else if(selectOperation.equals("Area")&&selectShape.equals("Rectangle")){
            operation=new RectangleAreaOperation();
        }
        else if(selectOperation.equals("Circumference")&&selectShape.equals("Square")){
            operation=new SquareCircumferenceOperation();
        }
        else if(selectOperation.equals("Circumference")&&selectShape.equals("Circle")){
            operation=new CircleCircumferenceOperation();
        }
        else if(selectOperation.equals("Circumference")&&selectShape.equals("Rectangle")){
            operation=new RectangleCircumferenceOperation();
        }
        return operation;
    }
}
