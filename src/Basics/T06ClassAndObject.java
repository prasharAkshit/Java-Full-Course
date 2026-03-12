package Basics;

class calc{
    public int add(int n1, int n2){
        int r = n1 + n2; // adds two numbers
        return r;        // returns result to the caller
    }
}

public class T06ClassAndObject {

    static void main(String arg[]){

        // =====================================================
        // OBJECT ORIENTED PROGRAMMING BASIC IDEA
        // =====================================================
        // Class  -> Blueprint/template
        // Object -> Instance of a class created using "new"
        // Methods -> Functions inside a class

        int num1 = 10;
        int num2 = 20;

        // Creating an object of class "calc"
        // new calc() creates the object in HEAP memory
        // reference variable 'c' is stored in STACK
        calc c = new calc();

        // calling method using object reference
        int result = c.add(num1, num2);

        System.out.println(result); // Output = 30





    }
}
