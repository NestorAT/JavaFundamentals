
package basics.oopomodeling;

/**
 * @createdNéstor
 * @created08/10/2026
 */

public class Circle {
    //main properties or attributes of the objects of a class
    private float radius;

    public final float PI = 3.14f;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public float area () {
        return PI * radius * radius;
    }

    public float circumference() {
        return 2 * PI * radius;
    }

}