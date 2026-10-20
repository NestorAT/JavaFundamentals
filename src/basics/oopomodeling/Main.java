
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

        // Libro 1: constructor por defecto
        Book b1 = new Book();
        b1.category = "Terror";

        // Libro 2: constructor con 2 parametros
        Book b2 = new Book("El Quijote", 12);
        b2.category = "Novela Histórica";

        // Libro 3: constructor completo
        Book b3 = new Book("El mundo de Sofia", "Jostein Gaarder",
                new java.util.Date(), 500, 13, "Filosofía");

        // Mostrar las categorias
        System.out.println("Categoría del libro 1: " + b1.category);
        System.out.println("Categoría del libro 2: " + b2.category);
        System.out.println("Categoría del libro 3: " + b3.category);
    }
}
   