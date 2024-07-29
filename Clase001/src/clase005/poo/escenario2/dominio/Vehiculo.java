package clase005.poo.escenario2.dominio;

public abstract class Vehiculo {
	
	protected String marca;
	protected String modelo;
	private Flota flota;
	
	public Vehiculo(String marca, String modelo, Flota flota) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.flota = flota;
		
	}
	
	
	
	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

	public Flota getFlota() {
		return flota;
	}



	public void setFlota(Flota flota) {
		this.flota = flota;
	}



	public abstract void mover();

}
