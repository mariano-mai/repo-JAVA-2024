package javajedi2024.n1.maestro;

public class EnergiaCinetica {

	public static void main(String[] args) {
		
		double masa = 34.5;
		double velocidad = 123.45;
		double energiaCinetica = 0.5*masa*Math.pow(velocidad, 2);
		
		System.out.println("La energía cinética de un objeto de masa "+masa+" que se mueve a una velocidad de "+velocidad+" es "+energiaCinetica);

	}

}
