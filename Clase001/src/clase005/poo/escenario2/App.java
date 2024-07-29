package clase005.poo.escenario2;

import java.util.ArrayList;
import java.util.List;

import clase005.poo.escenario2.dominio.Coche;
import clase005.poo.escenario2.dominio.Flota;
import clase005.poo.escenario2.dominio.Moto;
import clase005.poo.escenario2.dominio.Vehiculo;

public class App {

	public static void main(String[] args) {
		
		Flota flota1 = new Flota();
		
		List<Vehiculo> vehiculos = new ArrayList<>();
		Coche auto1 = new Coche("Audi", "A3", flota1, false);
		Coche auto2 = new Coche("Ford", "Fiesta", flota1, true);
		Coche auto3 = new Coche("Chevrolet", "Camaro",flota1, true);
		Moto moto1 = new Moto("Honda", "Bis",flota1, "negro");
		Moto moto2 = new Moto("Zanella", "Ceccato",flota1, "verde");
		
		vehiculos.add(auto1);
		vehiculos.add(moto2);
		vehiculos.add(auto3);
		vehiculos.add(moto1);
		vehiculos.add(auto2);
		
		
		flota1.setVehiculos(vehiculos);
		
		flota1.moverVehiculos();

	}

}
