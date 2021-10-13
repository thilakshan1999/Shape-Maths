package V2.shapes;

import V2.input.OperationInput;
import V2.input.SizeInput;

import java.util.Scanner;

public class Square {
    public static double square() {

        SizeInput sizeInput=new SizeInput();
        int length=sizeInput.inputSize();


        OperationInput operationInput=new OperationInput();
        String operation=operationInput.inputOperation();

        //Operation fac
        switch(operation)
        {
            case "Area":
                return (double)length*length;
            case "Cicumference":
                return (double)length*4;
            default:
                System.out.println("Invalid");
                return 0.0;
        }
    }
}
