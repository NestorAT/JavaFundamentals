package basics;

/**
 * 
 * 11 sept 2026
 * Néstor
 * 
 */

public class VariableTest {

    public static void main(String[] args) {

        // The structure of the declaration of a variable:
        // type of the variable + name of the variable;
        // = is the assignment operator

        String name = "Guille";

        System.out.println(name);

        // Declaration of an integer variable
        // An integer has 4 bytes
        // 1 byte = 8 bits

        System.out.println(1223123);

        System.out.println("Hola java");

        name = "Asier";

        System.out.println(name);

        int age = 23432432;

        long weight = 234324234324L; // a long variable has 8 bytes

        float height = 23.3f; // a float variable holds 4 bytes

        double b = 324.24234234; // a double has 8 bytes

        byte a = -127; // a byte has only one byte of capacity

        // Increase the value of "age" by 10

        age = age + 10;

        System.out.println(age);

        age = age * 10; // * multiplication operator

        System.out.println(age);

        weight = weight - 1000000;

        System.out.println(weight);

        height = height / 100; // division

        System.out.println(height);

        a = 3;

        b = 4;

        System.out.println("the square of a = " + a * a);

        System.out.println("the square of b = " + b * b);

        System.out.println("the square of c = " + (a * a + b * b));

        final long speed_of_light = 30000000000L;

        float mass = 2 - 5f;

        // Speed_of_light = 234; 

        a = 4;

        b = 6;
    }
}