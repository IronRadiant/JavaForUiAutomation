public class Chapter5Arithmetic {

    public static void main(String[] args) {

            int x = 10;
            int y = 2;

        System.out.println("Initial X: " + x);

            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            int e = x%y;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

//        Augmented Assignment Operators
//            x = x + y;
            x += y;
            System.out.println("Augmented X: " + x);

//        Increment Operator [By 1]
//        x = x + 1
            x++;
        System.out.println("Increment Operator X: " + x);

//        Decrement Operator [By 1]
//        x = x + 1
        x--;
        System.out.println("Decrement  Operator X: " + x);

    }
}
