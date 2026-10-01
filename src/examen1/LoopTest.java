package examen1;

public class LoopTest {

    public static void main(String[] args) {
        int contadorPares = 0;
        int paso = 0;
        int acumulador = 10;

        for (int i = 1; i < 6; i++) {
            paso++;

            if (i % 2 == 0) {
                contadorPares++;
            }

            acumulador += i;
        }

  
    }
}