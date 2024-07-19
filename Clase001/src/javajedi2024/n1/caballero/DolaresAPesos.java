package javajedi2024.n1.caballero;

public class DolaresAPesos {

	public static void main(String[] args) {
		
		final int TASA_DE_CAMBIO = 1500;
		
		int dolares = 400;
		int pesos = dolares*TASA_DE_CAMBIO;
		
		System.out.println("El que depositó "+dolares+" dólares recibirá "+pesos+" pesos.");

	}

}
