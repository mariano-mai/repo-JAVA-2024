package escenario02.dominio;

public class Recurso {
	
	private String nombre;
	private String descripcion;
	
	public Recurso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recurso(String nombre, String descripcion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
