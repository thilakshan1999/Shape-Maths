package V2;

import java.util.Scanner;

public class Square {
    public static double square() {
        System.out.println("Type the length");
        Scanner scanner=new Scanner(System.in);
        int length= scanner.nextInt();
        System.out.println("Select what do you want calculate:");
        scanner.nextLine();
        String select=scanner.nextLine();
        switch(select)
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
