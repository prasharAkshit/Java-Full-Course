package Basics;

public class T02Stringadv {

    static void main(String arg[]){

        // =====================================================
        // STRING BASICS
        // =====================================================

        // String name = new String("Akshit"); // object created in heap
        String name = "Akshit"; // stored in String Constant Pool

        System.out.println("Hello, " + name);

        // charAt(index) → returns character at given index
        System.out.println(name.charAt(1));

        // concat() → returns a new string (original string unchanged)
        System.out.println(name.concat(" Prashar"));


        // =====================================================
        // STRING POOL COMPARISON
        // =====================================================

        String s1 = "same";
        String s2 = "same";

        // == compares references (memory address)
        // both point to same object in String Constant Pool
        System.out.println(s1 == s2);

        // String literals are stored in String Constant Pool
        // to save memory.


        // =====================================================
        // STRING IMMUTABILITY
        // =====================================================

        name = name + " Prashar";

        /*
        Strings are immutable in Java.

        name + " Prashar" creates a NEW object.
        The reference 'name' now points to the new object.

        Old object becomes eligible for Garbage Collection.
        */


        // =====================================================
        // STRINGBUFFER (MUTABLE STRING)
        // =====================================================

        StringBuffer sb = new StringBuffer("Akshit");

        // capacity() → total storage available
        // default = length + 16
        System.out.println(sb.capacity()); // 6 + 16 = 22

        // length() → number of characters currently stored
        System.out.println(sb.length());


        // append() → adds text at end
        sb.append(" Prashar");
        System.out.println(sb);


        // deleteCharAt(index) → removes character
        sb.deleteCharAt(3);
        System.out.println(sb);


        // insert(index, value) → insert text at position
        sb.insert(0, "Java ");
        System.out.println(sb);


        // setLength() → changes string length
        sb.setLength(30);

        // capacity becomes new length + 16
        System.out.println(sb.capacity()); // 30 + 16 = 46

    }
}
