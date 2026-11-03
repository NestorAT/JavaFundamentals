package herencia;

public class mammal extends animal {

    private String furColor;

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void showFurColor() {
        System.out.println("Color Pelo " + furColor);
    }
}
