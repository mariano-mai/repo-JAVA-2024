package javajedi2024.n1.caballero;

public class PesosAEuros {

	public static void main(String[] args) {
		
		final float TASA_DE_CAMBIO = 0.00099f;
		
		int pesos = 400000;
		float euros = pesos*TASA_DE_CAMBIO;
		
		System.out.println("El que depositó "+pesos+" pesos recibirá "+euros+" euros.");

	}

}
