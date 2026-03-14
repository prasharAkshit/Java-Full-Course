package Basics;

// =====================================================
// MOBILE CLASS
// =====================================================
class Mobile {

    // Instance variables (each object gets its own copy)
    String brand;
    int price;
    String name;

    // Static variable → shared between all objects of this class
    static String var;


    // =====================================================
    // STATIC BLOCK
    // =====================================================
    // Runs only once when the class is loaded into JVM

    static {
        var = "Value initialized";
        System.out.println("In Static Block");
    }


    // =====================================================
    // CONSTRUCTOR
    // =====================================================
    // Runs every time an object is created

    public Mobile() {

        brand = "Default";
        price = 200;
        name = "Phone";

        System.out.println("In Constructor Block");
    }


    // =====================================================
    // INSTANCE METHOD
    // =====================================================
    // Can access both instance variables and static variables

    public void show() {

        System.out.print(brand + " ");
        System.out.print(name + ": ");
        System.out.println(price);

        // Accessing static variable
        System.out.println(var);
    }


    // =====================================================
    // STATIC METHOD
    // =====================================================
    // Static methods belong to the class, not objects
    // They cannot directly access instance variables
    // unless an object reference is passed

    public static void show1(Mobile obj) {

        System.out.println("In Static Method");

        System.out.print(obj.brand + " ");
        System.out.print(obj.name + ": ");
        System.out.println(obj.price);

        // Static variables can be accessed directly
        System.out.println(var);
    }
}



// =====================================================
// MAIN CLASS
// =====================================================
public class T09Static {

    public static void main(String arg[]) throws ClassNotFoundException {

        // =====================================================
        // OBJECT 1
        // =====================================================

        Mobile obj1 = new Mobile();

        obj1.brand = "Apple";
        obj1.price = 89000;
        obj1.name = "iphone 17";

        // Accessing static variable through object (not recommended)
        obj1.var = "Some value";


        // =====================================================
        // OBJECT 2
        // =====================================================

        Mobile obj2 = new Mobile();

        // Static variable changed again
        obj2.var = "Value changed";


        // Correct way to access static variable → using class name
        Mobile.var = "Final value.";


        // =====================================================
        // CALLING INSTANCE METHODS
        // =====================================================

        obj1.show();
        obj2.show();

        System.out.println("You will see that value for static is changed for both.");


        // =====================================================
        // CLASS LOADING
        // =====================================================

        /*
        If no object is created:
        - Constructor will NOT run
        - Static block may not load automatically

        Class.forName() forces JVM to load the class.
        This triggers the static block.
        */

        Class.forName("Basics.Mobile");


        // =====================================================
        // CALLING STATIC METHOD
        // =====================================================

        // Static methods should be called using class name
        Mobile.show1(obj1);
    }
}
