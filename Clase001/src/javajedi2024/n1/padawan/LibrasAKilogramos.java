package javajedi2024.n1.padawan;

public class LibrasAKilogramos {

	public static void main(String[] args) {
		
		final double CONSTANTE_LIBRA_A_KILOGRAMO = 0.453592;
		
		double libras = 177;
		double kilogramos = libras*CONSTANTE_LIBRA_A_KILOGRAMO;
		
		System.out.println(libras+" libras son "+kilogramos+" kilogramos.");

	}

}
