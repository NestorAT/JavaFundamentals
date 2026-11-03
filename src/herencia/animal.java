package herencia;

public class animal {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
    }

    public void eat() {
        System.out.println(name + " Esta comiendo.");
    }
}
