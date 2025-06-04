import java.util.Scanner;

public class Chapter9Loops {
    public static void main(String[] args) {

        /* Syntax of For Loop
            for(initialization; condition; increment / decrement) {
                body
            }
         */
        // Question: Print numbers from 1 to 5
//        int i = 0;
//        for(; i<5; i++) {
               /*
               writing i in start is giving the error of "not a statement", so either write like above or just
               write int i = 0 inside the for loop
               Working:
               It first initializes it, i.e. It starts with i = 0
               Then it checks the condition, i.e. i is less than 5 [0<5 True]
               Then it goes inside body and do the code, i.e. printed for us in our case

                  ihdahihoj]=-[d]
               Then it incremented / decremented, it i has value 1 [Incremented in our case]
                */

//            System.out.println("The Value of i is: " + i);
//        }

        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number from where you want to start counting: ");
//        int start = scanner.nextInt();
//        System.out.print("Enter the number where you want to end counting: ");
//        int end = scanner.nextInt();
//        for (;start < end; end++)
//            System.out.println("Counting: " + start);

        // Question: Print numbers from 1 to n
//        int i = 1;
//        System.out.print("Enter the number where counting will stop: ");
//        int n = scanner.nextInt();
//        for (i=1; i<=n; i++) {      //or it can be written as for (int i = 1...... instead of writing 2 methods
//            System.out.println("Counting: " + i);
//        }


        // Java understood the initialization variable as start because it was the one being used in condition





        /* Syntax of For Loop
            while(condition) {
                body and increment /decrement
            }
         */
        // Question: Print numbers from 1 to 5
//        int i = 1;
//        while (i <=  5) {
//            System.out.println("Counting: " + i);
//            i++;
//        }

        /* Syntax of Do While  Loop
            do {
                body
                increment / decrement
            }while(condition) {
                body
            }
         */

        int i = 1;
        do {
            System.out.println("Counting::::" + i);
            i++;
        } while (i != 4);


    }
}

