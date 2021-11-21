package ShapeMaths.V4.input.Operation;

import java.util.Scanner;

public class OperationInput implements OperationInputer {


    public String inputOperation () throws InvalidOperationException {

        Scanner scanner=new Scanner(System.in);
        String operation=scanner.nextLine();
        if(!(operation.equals("Area")||operation.equals("Circumference")))
        {
            throw new InvalidOperationException("Type 'Area' or 'Circumference'");
        }
        return operation;
    }
}
