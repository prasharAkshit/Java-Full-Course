package Basics;

// CLASS 1

class Computer {

    public void playmusic(){

        // Local variable → stored in STACK (inside this method call)
        int num1;

        System.out.println("Music Playing...");
    }

    public String Getmeapen(){

        // Method returning a value
        if (true){
            return "Pen";
        }

        return "nothing";
    }

    public void Buycrax(int ten){

        // Parameter 'ten' is also stored in STACK
        if (ten >= 10){
            System.out.println("You got crax");
            System.out.println("Your change is: " + (ten-10));
        }
        else{
            System.out.println("chal be gareeb");
        }
    }
}

//========//========//========//========//========//

// CLASS 2

class calculator {

    // Instance variable
    // This belongs to the OBJECT, not the method
    // Stored inside the OBJECT in HEAP memory
    int num = 2110;


    // Method Overloading
    // Same method name but different parameters

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public double add(double n1, int n2){
        return n1 + n2;
    }
}

// =====================================================
// MAIN CLASS
// =====================================================
public class T07Methods {

    static void main(String arg[]){

        // OBJECT CREATION

        Computer obj = new Computer();

        /*
        Memory allocation here:

        STACK
        -----
        obj  → reference variable

        HEAP
        -----
        Computer object
        */


        obj.playmusic();


        // Method returning String
        String pen = obj.Getmeapen();

        // 'pen' reference in stack, String object in heap
        System.out.println(pen);

        obj.Buycrax(9);



        // =====================================================
        // SECOND OBJECT
        // =====================================================

        calculator obj1 = new calculator();

        /*
        Memory now:

        STACK
        -----
        obj
        pen
        obj1

        HEAP
        -----
        Computer object
        calculator object
        */


        // Method calls
        double r1 = obj1.add(10, 20);
        double r2 = obj1.add(10, 20, 30);

        System.out.println(r1);
        System.out.println(r2);



        // =====================================================
        // WHERE DOES "num" LIVE?
        // =====================================================

        /*
        int num = 2110;  (inside class calculator)

        This is an INSTANCE VARIABLE.

        It belongs to the OBJECT of calculator.

        So when we do:

            calculator obj1 = new calculator();

        Memory becomes:

        STACK
        -----
        obj1  → reference variable

        HEAP
        -----
        calculator object
            num = 2110


        So:
        num lives in HEAP inside the calculator object.
        */


        // Accessing instance variable using object reference
        System.out.println(obj1.num);



        // =====================================================
        // STACK vs HEAP SUMMARY
        // =====================================================

        /*
        STACK MEMORY
        ------------
        - Method calls
        - Local variables
        - Reference variables
        - LIFO (Last In First Out)

        Example in this program:
        obj
        obj1
        pen
        r1
        r2


        HEAP MEMORY
        -----------
        - Objects created using "new"
        - Instance variables
        - Dynamic memory allocation

        Example in this program:
        Computer object
        calculator object
        num variable inside calculator
        */
    }
}
