package V2.shapes;

import V2.input.OperationInput;
import V2.input.SizeInput;

import java.util.Scanner;

public class Circle {
    public static double circle() {

        SizeInput sizeInput=new SizeInput();
        int radius=sizeInput.inputSize();

        OperationInput operationInput=new OperationInput();
        String operation=operationInput.inputOperation();
        final double PI=3.14;
        //Operation Factory
        switch(operation)
        {
            case "Area":
                return PI*radius*radius;
            case "Cicumference":
                return PI*2*radius;
            default:
                System.out.println("Invalid");
                return 0.0;
        }

    }
}
