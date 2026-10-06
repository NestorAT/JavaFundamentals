package basics.operators;

public class ConditionalTest3 {
    public static void main(String[] args) {

        float money = 30f;

        if (money >= 1000000) {
            System.out.println("Dinero");
        }

        else if (money < 1000000 && money > 500000) {
            System.out.println("Money");
        }

        else if (money <= 5000000 && money > 1000000) {
            System.out.println("Money");
        }
    }
}