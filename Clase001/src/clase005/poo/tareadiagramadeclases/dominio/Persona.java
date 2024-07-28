package clase005.poo.tareadiagramadeclases.dominio;

import java.time.LocalDate;

public class Persona {
	
	private Long dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private Vehiculo vehiculo;
	private boolean licencia;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(Long dni, String nombre, boolean licencia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.licencia = licencia;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public boolean isLicencia() {
		return licencia;
	}

	public void setLicencia(boolean licencia) {
		this.licencia = licencia;
	}
	
	

}
