package clase005.poo.tareadiagramadeclases.dominio;

public class Vehiculo {
	
	private String marca;
	private int cantidadDeRuedas;
	private String kmMinimo;
	private String kmMaximo;
	protected boolean competicion;
	protected boolean alarma;
	
	public Vehiculo(String marca, int cantidadDeRuedas, String kmMinimo, String kmMaximo, boolean competicion) {
		super();
		this.marca = marca;
		this.cantidadDeRuedas = cantidadDeRuedas;
		this.kmMinimo = kmMinimo;
		this.kmMaximo = kmMaximo;
		this.competicion = competicion;
	}

	public Vehiculo(String marca, int cantidadDeRuedas, String kmMinimo, String kmMaximo, boolean competicion,
			boolean alarma) {
		super();
		this.marca = marca;
		this.cantidadDeRuedas = cantidadDeRuedas;
		this.kmMinimo = kmMinimo;
		this.kmMaximo = kmMaximo;
		this.competicion = competicion;
		this.alarma = alarma;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidadDeRuedas() {
		return cantidadDeRuedas;
	}

	public void setCantidadDeRuedas(int cantidadDeRuedas) {
		this.cantidadDeRuedas = cantidadDeRuedas;
	}

	public String getKmMinimo() {
		return kmMinimo;
	}

	public void setKmMinimo(String kmMinimo) {
		this.kmMinimo = kmMinimo;
	}

	public String getKmMaximo() {
		return kmMaximo;
	}

	public void setKmMaximo(String kmMaximo) {
		this.kmMaximo = kmMaximo;
	}

	public boolean isCompeticion() {
		return competicion;
	}

	public void setCompeticion(boolean competicion) {
		this.competicion = competicion;
	}

	public boolean isAlarma() {
		return alarma;
	}

	public void setAlarma(boolean alarma) {
		this.alarma = alarma;
	}
	
	public void mostrarPorPantallaMarca() {
		System.out.println(this.marca);
	}
	
	public void arrancarVehiculo() {
		System.out.println("Rum rum rum");
	}

}
