package V2;

import java.util.Scanner;

public class Rectangle {
    public static double rectangle() {
        System.out.println("Type the length");
        Scanner scanner=new Scanner(System.in);
        int length= scanner.nextInt();
        System.out.println("Type the width");
        int width= scanner.nextInt();
        System.out.println("Select what do you want calculate:");
        scanner.nextLine();
        String select=scanner.nextLine();
        switch(select)
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
}
