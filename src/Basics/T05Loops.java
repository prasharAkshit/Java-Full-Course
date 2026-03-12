package Basics;

// 2:18:00
public class T05Loops {

    static void main(String arg[]) {

        // ===== WHILE LOOP =====
        // Runs while condition is true

        int i = 1;

        while (i <= 5) {
            System.out.println("Hi " + i);

            // Nested while loop
            int j = 1;
            while (j < 4) {
                System.out.println("Hello " + j);
                j++; // increment
            }

            i++; // increment outer loop
        }

        System.out.println(i); // prints 6 (loop ended)



        // ===== DO-WHILE LOOP =====
        // Runs at least once before checking condition

        i = 20;

        do {
            System.out.println("hello " + i);
            i++;
        } while (i < 5); // condition checked after execution



        // ===== FOR LOOP =====
        // Best when number of iterations is known

        for (i = 5; i > 0; i--) {
            System.out.println("Hello " + i);
        }



        // ===== NESTED FOR LOOP =====
        // Example: Day schedule

        for (i = 1; i < 6; i++) {

            System.out.println("Day: " + i);

            for (int j = 9; j < 18; j++) {
                System.out.println("    " + j + "-" + (j + 1) + ":");
            }
        }

        // Basics finished

    }
}