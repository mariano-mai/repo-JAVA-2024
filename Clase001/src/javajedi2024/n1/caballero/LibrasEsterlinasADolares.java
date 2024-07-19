package javajedi2024.n1.caballero;

public class LibrasEsterlinasADolares {

	public static void main(String[] args) {
		
		final float TASA_DE_CAMBIO = 1.29f;
		
		int libraEsterlina = 400;
		float dolar = libraEsterlina*TASA_DE_CAMBIO;
		
		System.out.println("El que depositó "+libraEsterlina+" libras esterlinas recibirá "+dolar+" dólares.");

	}

}
