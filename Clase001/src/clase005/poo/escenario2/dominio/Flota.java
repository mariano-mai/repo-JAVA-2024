package clase005.poo.escenario2.dominio;

import java.util.ArrayList;
import java.util.List;

public class Flota {
	
	private List<Vehiculo> vehiculos = new ArrayList<>();

	
	public Flota() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flota(List<Vehiculo> vehiculos) {
		super();
		this.vehiculos = vehiculos;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	
	public void moverVehiculos() {
		int i = 1;
		for(Vehiculo vehiculo:this.vehiculos) {
			System.out.println(i+"° vehículo:");
			informacion(vehiculo);
			vehiculo.mover();
			System.out.println("");
			i++;
		}
	}
	
	private void informacion(Vehiculo vehiculo) {
		System.out.println("Marca: "+vehiculo.marca);
		System.out.println("Modelo: "+vehiculo.modelo);
	}

}
