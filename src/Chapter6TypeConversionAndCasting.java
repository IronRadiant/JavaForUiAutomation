import java.util.Scanner;

public class Chapter6TypeConversionAndCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        float num = input.nextInt();
//        System.out.println("Your provided input is: " + num);



//        // type casting
////        int num = input.nextFloat(); // It will give error
////          This will work like this
//        int num1 = (int) (num);
////        int num1 = (int) (82.30);
//        System.out.println("Your provided input is post narrowing conversion: " + num1);

        // automatic type promotion in expression
//        int a = 257;
////        byte b = a; It will give error
//        byte b = (byte) (a);
//        System.out.println(b);

        /*
        It gave the value as 1. It is because byte can handle till 256 only so what it provides is just the
        difference of provided value and maximum value it can hole. i.e. 257%256
         */

//        byte a = 40;
//        byte b = 20;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);
        /*
        Now here if we see a * b is 8000, but max value what byte can store is 256, still the results are correct
        because here java is automatically promoting the results to be temporarily stored in int
        Yes, Java does store the result temporarily during calculations — usually as int or the most appropriate type
        based on the operands involved. But you must declare or cast properly when assigning to variables of smaller
        types.

        but if we do it in byte itself then it will give some different value, the below case, as the line itself gave
        the error post writing it
         */

//        byte d = a * b / c;
//        System.out.println(d);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
//                        float + int + double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }
}
