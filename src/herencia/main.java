package herencia;

public class main {

    public static void main(String[] args) {

        
    	dog dog = new dog();

        dog.setName("Nestor");
        dog.setAge(4);
        dog.setFurColor("Marron");
        dog.setBreed("Labrador");

        System.out.println("Perro");
        dog.showInfo();
        dog.eat();
        dog.showFurColor();
        dog.showBreed();
        dog.bark();

        System.out.println();

        cat cat = new cat();

        cat.setName("Luna");
        cat.setAge(2);
        cat.setFurColor("Blanco");
        cat.setEyeColor("Verde");

        System.out.println("Gato");
        cat.showInfo();
        cat.eat();
        cat.showFurColor();
        cat.showEyeColor();
        cat.miau();
    }
}