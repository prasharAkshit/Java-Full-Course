package Basics;

public class T02String {

    static void main(String[] args) {

        /* =====================================================
           1. CHAR TYPE AND INCREMENT
           ===================================================== */

        char s = 'A';

        // ++ increases ASCII value of the character
        // 'A' = 65 → ++ makes it 'B' = 66
        System.out.println(s + "++ = " + ++s);



        /* =====================================================
           2. JVM MEMORY CONCEPT
           ===================================================== */

        // JVM mainly uses:
        // 1. Stack  → stores primitive variables and references
        // 2. Heap   → stores objects

        int int1 = 1; // Primitive variable stored in STACK

        // Object created in HEAP, reference stored in STACK
        T02String obj1 = new T02String();



        /* =====================================================
           3. STRING POOL (IMPORTANT INTERVIEW / EXAM TOPIC)
           ===================================================== */

        // String literals are stored in the STRING POOL inside HEAP

        String srt1 = "Akshit";   // Goes to String Pool
        String srt2 = "Akshit";   // Reuses same object from pool
        String srt3 = new String("Akshit"); // Creates new object in heap (not pooled)

        // == compares memory references (addresses)
        System.out.println(srt1 == srt2);  // true  → same pooled reference
        System.out.println(srt1 == srt3);  // false → different objects

        // .equals() compares actual string values
        System.out.println(srt1.equals(srt3)); // true → same content



        /* =====================================================
           4. STRING IMMUTABILITY
           ===================================================== */

        // Strings in Java are IMMUTABLE (cannot be modified)

        String lower = "akshit";

        lower.toUpperCase();  // Creates new string but does NOT change original

        System.out.println(lower); // Still prints "akshit"



        /* =====================================================
           5. MODIFYING STRING BY STORING RESULT
           ===================================================== */

        // Must store returned value if we want the change

        String upper = lower.toUpperCase();

        System.out.println(upper); // Prints "AKSHIT"



        /* =====================================================
           6. COMMON STRING METHODS
           ===================================================== */

        String text = "Akshit Prashar";

        // length() → returns number of characters
        System.out.println(text.length());

        // charAt(index) → returns character at given index
        // Index starts from 0
        System.out.println(text.charAt(2));

        // substring(start, end)
        // start = inclusive
        // end   = exclusive
        System.out.println(text.substring(0, 6));



        /* =====================================================
           7. SEARCH METHODS
           ===================================================== */

        // contains() → checks if substring exists
        System.out.println(text.contains("shar"));

        // startsWith() → checks prefix
        System.out.println(text.startsWith("akshit"));

        // endsWith() → checks suffix
        System.out.println(text.endsWith("Prashar"));



        /* =====================================================
           8. REPLACE METHOD
           ===================================================== */

        // replace(old, new) → returns new modified string

        String newtext = text.replace("Akshit", "Angel");

        System.out.println(newtext);

    }
}
