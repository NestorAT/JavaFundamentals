package herencia;

public class dog extends mammal {

    private String breed;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void showBreed() {
        System.out.println("Raza: " + breed);
    }

    public void bark() {
        System.out.println("Wuf! Wuf!");
    }
}