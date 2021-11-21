package V3.input.Operation;

import java.util.Scanner;

public class OperationInput implements OperationInputer{


    public String inputOperation()
    {

        Scanner scanner=new Scanner(System.in);
        String operation=scanner.nextLine();
        return operation;
    }
}
