package V2.shapes;

import V2.input.OperationInput;
import V2.input.SizeInput;

import java.util.Scanner;

public class Rectangle {
    public static double rectangle() {

        SizeInput sizeInput=new SizeInput();
        int length=sizeInput.inputSize();
        int width=sizeInput.inputSize();

        OperationInput operationInput=new OperationInput();
        String operation=operationInput.inputOperation();
        //Operation fac
        switch(operation)
        {
            case "Area":
                return (double)length*width;
            case "Cicumference":
                return (double)2*(length+width);
            default:
                System.out.println("Invalid");
                return 0.0;
        }
    }
}

