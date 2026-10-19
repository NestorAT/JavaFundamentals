
package basics.oopomodeling;

/**
 * @createdNéstor
 * @created08/10/2026
 */
public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle(2);
        Circle c2 = new Circle();
        Circle c3 = new Circle();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1.circumference());
        System.out.println(c2.circumference());
        System.out.println(c3.circumference());

        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c3.area());

        Book b1 = new Book("Nestor", 12);
        
        System.out.println(b1.category);
         b1.category ="Hola";	
         System.out.println(b1.category);
    }
}
