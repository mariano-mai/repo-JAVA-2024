package javajedi2024.n1.caballero;

public class BitcoinsADolares {

	public static void main(String[] args) {
		
		final float TASA_DE_CAMBIO = 63508.40f;
		
		float bitcoin = 23;
		float dolares = bitcoin*TASA_DE_CAMBIO;
		
		System.out.println(bitcoin+" Bitcoins equivalen a "+dolares+" dólares.");

	}

}
