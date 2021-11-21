package V2.input;

import java.util.Scanner;

public class OperationInput {


    public String inputOperation()
    {
        System.out.println("Select what do you want calculate:");
        Scanner scanner=new Scanner(System.in);
        String operation=scanner.nextLine();
        return operation;
    }
}
