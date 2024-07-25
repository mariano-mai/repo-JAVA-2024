package javajedi2024.n1.maestro;

public class FuerzaCentrípeta {

	public static void main(String[] args) {
		
		double masa = 3.4;
		double velAng = 5;
		double radio = 7.45;
		
		double fuerza = masa*Math.pow(velAng, 2)/radio;
		
		System.out.println("La fuerza centrípeta es "+fuerza);

	}

}
