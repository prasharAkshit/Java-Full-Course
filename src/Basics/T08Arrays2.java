package Basics;

public class T08Arrays2 {

    static void main(String arr[]) {

        // =====================================================
        // JAGGED ARRAY
        // =====================================================
        // Jagged array = rows with different column sizes

        int nums[][] = new int[3][];  // 3 rows, columns not fixed yet

        nums[0] = new int[3]; // row 0 → 3 columns
        nums[1] = new int[4]; // row 1 → 4 columns
        nums[2] = new int[2]; // row 2 → 2 columns


        // Filling array with random numbers (0–99)
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                nums[i][j] = (int)(Math.random() * 100);
            }
        }


        // Printing jagged array using enhanced for loop
        for (int n[] : nums) {   // each row
            for (int m : n) {    // each element in row
                System.out.print(m + " ");
            }
            System.out.println();
        }



        //========//========//========//========//



        // =====================================================
        // 3-DIMENSIONAL ARRAY
        // =====================================================
        // Think of it as a cube: rows → columns → depth

        int d3array[][][] = new int[3][3][3];


        // Filling with random values
        for (int i = 0; i < d3array.length; i++) {
            for (int j = 0; j < d3array[i].length; j++) {
                for (int k = 0; k < d3array[i][j].length; k++) {

                    d3array[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }


        // Printing 3D array
        for (int a[][] : d3array) {
            for (int b[] : a) {
                for (int c : b) {

                    System.out.print(c + " ");
                }
                System.out.println();
            }
            System.out.println();
        }



        // =====================================================
        // DRAWBACKS OF ARRAYS
        // =====================================================

        /*
        1. Arrays are objects in Java → stored in HEAP memory.

        2. Size is FIXED once created.
           You cannot expand or shrink it later.

        3. Insertion and deletion operations are slow
           because elements must be shifted.

        4. Arrays store only ONE data type.
           Example: int[] cannot store String or double.
        */

    }
}
