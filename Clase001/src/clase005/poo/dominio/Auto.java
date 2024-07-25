package clase005.poo.dominio;

public class Auto {
	
	private String marca;
	private String modelo;
	
	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
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
	
	

}
