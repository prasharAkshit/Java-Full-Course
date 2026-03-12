package Basics;

public class T04ControlFlow {

    static void main(String ar[]) {

        // ===== IF / ELSE IF / ELSE =====
        int x = 10;

        if (x > 10) {
            System.out.println("Hello!!");
            System.out.println("lol");
        }
        else if (x == 10) {        // condition check
            System.out.println("A Perfect 10!!!!");
        }
        else {                     // runs if all above are false
            System.out.println("Bye");
        }



        // ===== Example: Largest of 3 numbers =====
        int a = 8;
        int b = 8;
        int c = 27;

        if (a > b && a > c) {
            System.out.println("Largest number is " + a);
        }
        else if (b > a && b > c) {
            System.out.println("Largest number is " + b);
        }
        else if (c > a && c > b) {
            System.out.println("Largest number is " + c);
        }
        else if (a == b && a > c) {
            System.out.println("A and B are equal and largest: " + a);
        }
        else if (b == c && c > a) {
            System.out.println("B and C are equal and largest: " + b);
        }
        else if (a == c && a > b) {
            System.out.println("A and C are equal and largest: " + a);
        }
        else {
            System.out.println("All numbers are equal: " + a);
        }



        // ===== TERNARY OPERATOR (Short if-else) =====
        int n = 4;

        // condition ? value_if_true : value_if_false
        String result = n % 2 == 0 ? "True" : "False";

        System.out.println(result);



        // ===== SWITCH STATEMENT =====
        int X = 0;

        switch (X) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default: // runs if no case matches
                System.out.println("Invalid number");
        }

    }
}