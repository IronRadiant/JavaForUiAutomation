import java.util.Scanner;

public class Chapter3UserInputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your Name: ");
//        String name = scanner.nextLine();
//        System.out.println("Enter your SurName  " + scanner.nextLine());
//        System.out.println(name);

        String nameWithSpacesBefore = scanner.next();
        System.out.print("Enter your Name With Spaces: " + nameWithSpacesBefore);
        String nameWithSpacesAfter = scanner.next();
        System.out.print("Enter your Name With Spaces: " + nameWithSpacesAfter);

//        System.out.print("Enter your Age: ");
//        int age = scanner.nextInt ();

//        System.out.print("What is your GPA?: ");
//        double gpa = scanner.nextDouble();

//        System.out.print("Are you a Student?: ");
//        boolean isStudent = scanner.nextBoolean();

//        System.out.println("My name is " + name);
//        System.out.println("My name is " + nameWithSpaces);
//        System.out.print("My age is " + age);
//        System.out.println("My GPA is " + gpa);

//        if(isStudent){
//            System.out.println("He is a Student");
//        }
//        else{
//            System.out.println("He is NOT a Student");
//        }

//        COMMON ISSUE
//        System.out.print("What is our age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();  // Remove this line to see the issue
//
//        System.out.print("What is your Name: ");
//        String name = scanner.nextLine();
//
//        System.out.println("My age is: " + age);
//        System.out.println("My Name is: " + name);

        scanner.close();

    }
}
