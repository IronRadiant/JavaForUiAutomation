import java.util.Scanner;

public class Chapter8Conditionals {
    public static void main(String[] args) {
        /*
        Syntax of if statement"
            if(boolean expression T or F) {
                body
            } else {
                do this
            }
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Salary: ");
        int salary = scanner.nextInt();

         if (salary > 10000) {
            int newSalary = salary + 2000;
            System.out.println("Your Salary is: " + newSalary);
        }
        else if (salary > 15000){
            int newSalary = salary + 4000;
            System.out.println("Your Salary is: " + newSalary);
        } else {
            int newSalary = salary + 6000;
            System.out.println("Your Salary is: " + newSalary);
            }
//        int newSalary;
//        if (salary >10000) {
//            newSalary = salary + 2000;
//        } else {
//            newSalary = salary + 1000;
//        }
//        System.out.println("Your Salary is: " + newSalary);
    }
}
