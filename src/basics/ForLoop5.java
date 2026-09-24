package basics;

public class ForLoop5 {

	public static void main(String[] args) {

		double tmp = 35.5;

		boolean fan;

		if (tmp > 35.5) {

			fan = true;

			System.out.println("tmp: " + tmp + " ºC");
			System.out.println("El ventilador está encendido");

		} else {

			fan = false;

			System.out.println("tmp: " + tmp + " ºC");
			System.out.println("El ventilador está apagado");
		}
	}
}