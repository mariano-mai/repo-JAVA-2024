package javajedi2024.n1.maestro;

public class HipotenusaDeTriangulo {

	public static void main(String[] args) {
		
		double ladoA = 4;
		double ladoB = 5;
		double hipotenusa = Math.sqrt(Math.pow(ladoA, 2)+Math.pow(ladoB, 2));
		
		System.out.println("La hipotenusa de un triángulo de lados "+ladoA+" y "+ladoB+" es: "+hipotenusa);

	}

}
