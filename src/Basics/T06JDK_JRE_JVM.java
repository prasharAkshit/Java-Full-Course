// =====================================================
//              JAVA ARCHITECTURE NOTES
// =====================================================

        /*
        Java Platform Structure

        JDK
         └── JRE
              └── JVM
        */


        /*
        -----------------------------------------------------
        1. JDK (Java Development Kit)
        -----------------------------------------------------

        JDK is the complete package used to DEVELOP Java programs.

        It includes:
        - JRE
        - Java compiler (javac)
        - Debugging tools
        - Development utilities

        Important tools in JDK:

        javac  -> converts .java file into .class (bytecode)
        java   -> runs the compiled program
        jar    -> packages Java programs
        javadoc-> generates documentation

        Example compilation process:

        T06ClassAndObject.java
                ↓ (javac)
        T06ClassAndObject.class
        */


        /*
        -----------------------------------------------------
        2. JRE (Java Runtime Environment)
        -----------------------------------------------------

        JRE is used to RUN Java programs.

        JRE includes:
        - JVM
        - Core Java Libraries

        Libraries contain commonly used classes like:

        java.lang
        java.util
        java.io
        java.net

        Example:
        System.out.println()

        'System' class comes from java.lang library.
        */


        /*
        -----------------------------------------------------
        3. JVM (Java Virtual Machine)
        -----------------------------------------------------

        JVM is the engine that EXECUTES Java bytecode.

        Java programs are not executed directly by the OS.
        They run inside the JVM.

        This is why Java is platform independent:
        "Write Once, Run Anywhere"
        */


        /*
        -----------------------------------------------------
        JVM Responsibilities
        -----------------------------------------------------

        1. Class Loader
           Loads .class files into memory.

        2. Bytecode Verifier
           Ensures code is safe and valid.

        3. Execution Engine
           Executes bytecode using:
           - Interpreter
           - JIT (Just In Time compiler)

        4. Memory Management
           JVM manages program memory automatically.

           Main areas:

           Heap        -> objects created using 'new'
           Stack       -> method calls, local variables
           Method Area -> class metadata

        Example from this program:

        calc c = new calc();

        Stack:
            c (reference variable)

        Heap:
            calc object
        */


        /*
        -----------------------------------------------------
        5. Garbage Collection
        -----------------------------------------------------

        JVM automatically removes unused objects.

        Example:

        calc c = new calc();
        c = null;

        Now object becomes eligible for garbage collection.
        */


        /*
        -----------------------------------------------------
        SUMMARY (VERY IMPORTANT FOR EXAMS)
        -----------------------------------------------------

        JDK = JRE + Development Tools
        JRE = JVM + Core Libraries
        JVM = Executes Java bytecode
        */

