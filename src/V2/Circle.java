package V2;

import java.util.Scanner;

public class Circle {
    public static double circle() {
        System.out.println("Type the radius");
        Scanner scanner=new Scanner(System.in);
        int radius= scanner.nextInt();
        System.out.println("Select what do you want calculate:");
        scanner.nextLine();
        String select=scanner.nextLine();
        final double PI=3.14;
        switch(select)
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
