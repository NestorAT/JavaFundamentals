package herencia;

public class cat extends mammal {

    private String eyeColor;

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void showEyeColor() {
        System.out.println("Color Ojos: " + eyeColor);
    }

    public void miau() {
        System.out.println("Miau!");
    }
}