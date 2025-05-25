import java.util.Scanner;

public class Chapter3Vproject {
    public static void main(String[] args) {

        //Calculate area of a rectangle

        double length = 0;
        double breadth = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the breadth of rectangle: ");
        breadth = scanner.nextDouble();

        area = length * breadth;

        System.out.println("Area of Rectangle is: " + area + "cm");

        scanner.close();
    }
}
