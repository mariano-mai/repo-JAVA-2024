package clase005;

import clase005.poo.dominio.Auto;
import clase005.poo.dominio.Persona;

public class App {

	public static void main(String[] args) {
		
		Persona pers1 = new Persona();
		Auto auto1 = new Auto("Ford","Ka");
		Persona pers2 = new Persona("Mariano","Maidana",36,auto1);
		
		System.out.println("Me llamo "+pers2.getNombre()+" "+pers2.getApellido());
		System.out.println("tengo "+pers2.getEdad()+" años");
		System.out.println("Prueba: "+auto1.getModelo());
		System.out.println("y conduzco un "+pers2.getAuto().getMarca()+" "+pers2.getAuto().getModelo()+".");

	}

}
