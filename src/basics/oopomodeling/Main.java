package basics.oopomodeling;

import javax.management.JMRuntimeException;

/**
 * @createdNéstor
 * @created08/10/2026
 */
public class Main { new*

    public static void main(String[]args) {
        Circle c1 = new Circle(radius:2);
        Circle c2 = new Circle();

        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
    }
}
