package V1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Shape Maths");
        System.out.println("Select the shape:");
        Scanner scanner=new Scanner(System.in);
        String shape=scanner.nextLine();
        switch(shape){
            case "Square":
                System.out.println(Main.square());
                break;
            case "Rectangle":
                System.out.println(Main.Rectangle());
                break;
            case "Circle":
                System.out.println(Main.circle());
                break;
            default:
                System.out.println("Write the correct shape");
                break;
        }

    }
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
    public static double Rectangle() {
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

