package Basics;

// Using static import so we can directly use println()
import static java.lang.System.out;

public class T01Datatypes {

    static void main(String[] a) {

        /* =====================================================
           1. INTEGER DATA TYPES
           ===================================================== */

        byte b = 127;        // byte  -> 1 byte  | Range: -128 to 127
        short s = 32767;     // short -> 2 bytes | Range: -32,768 to 32,767
        int i = 2147483647;  // int   -> 4 bytes | Range: -2,147,483,648 to 2,147,483,647

        // long -> 8 bytes (must add 'L' at the end to mark it as long literal)
        long l = 123456789123456789L;

        out.println(l);



        /* =====================================================
           2. FLOATING POINT DATA TYPES
           ===================================================== */

        // float -> 4 bytes (requires 'f' at end)
        float f = 1.123456f;

        // double -> 8 bytes (default decimal type in Java)
        double d = 1.12345678912345;

        out.println(f);



        /* =====================================================
           3. BOOLEAN TYPE
           ===================================================== */

        boolean is_adult = false; // Boolean stores true or false
        is_adult = true;

        out.println(is_adult);



        /* =====================================================
           4. SPECIAL NUMBER REPRESENTATIONS
           ===================================================== */

        int A = 1_00_00_000;  // Underscore (_) improves readability of big numbers

        int B = 0b101;        // Binary literal (0b prefix)
        int C = 0x7E;         // Hexadecimal literal (0x prefix)

        double N = 12E10;     // Scientific notation (12 × 10^10)

        out.println((int) N);          // Casting double → int
        out.println(C + " Hexadecimal");
        out.println(B + " Binary");
        out.println(A);

        // Type casting number → character (ASCII)
        out.println((char) 65);        // 65 = 'A' in ASCII



        /* =====================================================
           5. NARROWING CONVERSION (Explicit Casting)
           ===================================================== */

        double d_value = 1234.123456789;

        // double → float (precision loss)
        float f_value = (float) d_value;

        // float → int (decimal part removed)
        int i_value = (int) f_value;

        out.println("Double value = " + d_value);
        out.println("Float value  = " + f_value);
        out.println("Int value    = " + i_value);



        /* =====================================================
           6. ARITHMETIC OPERATORS
           ===================================================== */

        // If both operands are integers → integer division
        // Using 3.0f forces floating point division
        d = 10 / 3.0f;

        System.out.println(d);   // Output: 3.333...



        /* =====================================================
           7. TYPE CONVERSION / CASTING
           ===================================================== */

        int A1 = 257;

        // byte B1 = A1;   ❌ Not allowed (int → byte automatically)
        // Must use explicit casting

        byte B1 = (byte) A1;

        out.println(B1);

        /*
           Result = 1

           Why?
           Byte range = 256 values (-128 to 127)

           Java applies modulo operation:
           257 % 256 = 1
        */



        /* =====================================================
           8. FLOAT → INT CONVERSION
           ===================================================== */

        // int x = 5.6f; ❌ Not allowed

        float F1 = 5.6f;
        int x1 = (int) F1;   // Decimal part (.6) is lost

        out.println(x1);



        /* =====================================================
           9. TYPE PROMOTION
           ===================================================== */

        byte ten = 10;
        byte thi = 30;

        // Java promotes byte → int during arithmetic operations
        int result = ten * thi;

        out.println(result);

    }
}
