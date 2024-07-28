package clase005.poo.tareadiagramadeclases;

import java.time.LocalDate;

import clase005.poo.tareadiagramadeclases.dominio.Persona;
import clase005.poo.tareadiagramadeclases.dominio.Vehiculo;

public class App {

	public static void main(String[] args) {
		
		Persona pers1 = new Persona();
		LocalDate fecha = LocalDate.of(1988, 4, 27);
		Vehiculo auto1 = new Vehiculo("Ford",4,"20","200",false);
		pers1.setVehiculo(auto1);
		pers1.setFechaDeNacimiento(fecha);
		pers1.setNombre("Mariano");
		pers1.getVehiculo().mostrarPorPantallaMarca();
		
		System.out.println("Me llamo "+pers1.getNombre()+", nací el "+pers1.getFechaDeNacimiento().getDayOfMonth()+" de "+pers1.getFechaDeNacimiento().getMonth()+" de "+pers1.getFechaDeNacimiento().getYear());

	}

}
