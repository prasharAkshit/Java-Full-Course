package Basics;

public class T08Arrays1 {

    static void main(String arg[]) {

        // ===== 1D ARRAYS =====

        int nums[] = {3, 7, 2, 4};     // Array initialized with values
        int num1[] = new int[4];       // Array created with fixed size = 4 (default values = 0)

        // Assigning values
        num1[0] = 9;
        num1[1] = 18;
        num1[2] = 27;
        num1[3] = 36;

        // Accessing elements using index (index starts from 0)
        System.out.println(nums[2]);
        System.out.println(num1[2]);


        // ===== LOOPING THROUGH ARRAY =====

        for (int i = 0; i <= 3; i++) {   // iterating through nums[]
            System.out.println(nums[i]);
        }

        System.out.println("");

        for (int i = 0; i <= 3; i++) {   // iterating through num1[]
            System.out.println(num1[i]);
        }



        // ===== 2D ARRAY (Matrix) =====

        int[][] arrarr;           // declaring 2D array
        arrarr = new int[2][4];   // 2 rows, 4 columns


        // ===== FILLING ARRAY WITH RANDOM NUMBERS =====
        // Math.random() gives value between 0.0 and 1.0
        // multiplying by 100 → range 0–99

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {

                arrarr[i][j] = (int)(Math.random() * 100);
            }
        }



        // ===== ENHANCED FOR LOOP (FOREACH) =====
        // cleaner way to iterate arrays

        for (int n[] : arrarr) {   // each row
            for (int m : n) {      // each element in row
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}

