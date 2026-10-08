package basics.oopomodeling;

/**
 * @createdNéstor
 * @created08/10/2026
 */
public class Circle {

    private float radius;

    public float PI = 3.14f;

    private float area() {
        return PI * radius * radius;
    }

    public float circumference() {
        return 2 * PI * radius;

    }
}




