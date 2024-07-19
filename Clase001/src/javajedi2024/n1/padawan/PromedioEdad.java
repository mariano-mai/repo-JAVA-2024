package javajedi2024.n1.padawan;

public class PromedioEdad {

	public static void main(String[] args) {
		
		String nom1 = "Mariano";
		String nom2 = "Agustín";
		String nom3 = "Francisco";
		
		int edad1 = 36;
		int edad2 = 34;
		int edad3 = 33;
		
		int promedio = (edad1+edad2+edad3)/3;
		double promedio2 = (edad1+edad2+edad3)/3;
		
		System.out.println("Nombre: "+nom1+"; Edad: "+edad1);
		System.out.println("Nombre: "+nom2+"; Edad: "+edad2);
		System.out.println("Nombre: "+nom3+"; Edad: "+edad3);
		
		System.out.println("Promedio de edad: "+promedio);
		System.out.println("Promedio de edad el double: "+promedio2);

	}

}
