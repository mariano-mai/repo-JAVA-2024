package javajedi2024.n1.caballero;

public class EurosADolares {

	public static void main(String[] args) {
		
		final float TASA_DE_CAMBIO = 1.09f;
		
		int euros = 400;
		float dolares = euros*TASA_DE_CAMBIO;
		
		System.out.println("El que depositó "+euros+" euros recibirá "+dolares+" dólares.");

	}

}
