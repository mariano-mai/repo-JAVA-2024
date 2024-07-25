package javajedi2024.n1.maestro;

public class VelocidadFinal {

	public static void main(String[] args) {
		
		double v_i = 0;
		double grav = 9.81;
		double tiempo = 3.4;
		
		double v_f = v_i + grav*tiempo;
		
		System.out.println("La velocidad final alcanzada es "+v_f);

	}

}
