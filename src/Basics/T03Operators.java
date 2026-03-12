package Basics;

public class T03Operators {

    static void main(String arg[]) {

        int a = 7;
        int b = 5;

        // ===== Arithmetic Operators =====
        System.out.println(a + b); // Addition
        System.out.println(a - b); // Subtraction
        System.out.println(a * b); // Multiplication
        System.out.println(a / b); // Division (integer division)
        System.out.println(a % b); // Modulus (remainder)



        // ===== Assignment Operators =====
        a += 2;  // a = a + 2
        a -= 3;  // a = a - 3
        a *= 10; // a = a * 10
        a /= 5;  // a = a / 5
        System.out.println(a);



        // ===== Increment Operators =====
        System.out.println(b);
        System.out.println(b++); // Post-increment → print first, then increase
        System.out.println(++b); // Pre-increment  → increase first, then print



        // ===== Relational Operators =====
        int x = 10;
        int y = 20;

        System.out.println(x < y);  // less than
        System.out.println(x > y);  // greater than
        System.out.println(x == y); // equal to
        System.out.println(x != y); // not equal



        // ===== Logical Operators =====
        System.out.println(x > y && a > b); // AND → both must be true
        System.out.println(x > y || a > b); // OR  → one must be true
        System.out.println(!true);  // NOT → reverses boolean
        System.out.println(!false);

    }
}