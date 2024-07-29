package clase005.poo.escenario2.dominio;

public class Moto extends Vehiculo {
	
	private String color;

	public Moto(String marca, String modelo, Flota flota, String color) {
		super(marca, modelo, flota);
		this.color = color;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public void mover() {
		System.out.println("Esta moto de color "+ this.color+" se está moviendo.");
		
	}

}
